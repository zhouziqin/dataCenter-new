<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>绘制行政区划边界</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ad21475f9a888602927cccd3b87c1d21"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <!-- 地图工具显示js
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script> --> 
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/gaode.css">
</head>
<body>
<div id="container"></div>
<div class="button-group" >
    <input id="updateMarker" class="button" type="button" value="点击高亮"/>
</div>
<div class="info-tip">
    <div id="centerCoord"></div>
    <div id="tips"></div>
</div>
<script>
$(function (){
	t=0;
	getPoint(t);
})
//获取标注点
//参数type 标注点类型0养老机构1人员
function getPoint(t){
	 $.ajax({
		 type:"post",
		url:"${pageContext.request.contextPath}/b2b/getPoint",
		 data:{type:t},
		 success: function(json){
			 initMap(eval(json))
		 }
		 
	 })
  
}
//初始化地图
function initMap(positions){
    var map = new AMap.Map('container', {
        resizeEnable: true,
        center: [121.384616,31.177397],
        zoom: 15
    }); 
    //加载行政区划插件
    AMap.service('AMap.DistrictSearch', function() {
        var opts = {
            subdistrict: 1,   //返回下一级行政区 
            extensions: 'all',  //返回行政区边界坐标组等具体信息
            level: 'city'  //查询行政级别为 市
        };
      //实例化DistrictSearch
        district = new AMap.DistrictSearch(opts);
       // district.setLevel('district');
        //行政区查询
        district.search('闵行区', function(status, result) {
            var bounds = result.districtList[0].boundaries;
            var polygons = [];
            if (bounds) {
                for (var i = 0, l = bounds.length; i < l; i++) {
                    //生成行政区划polygon
                    var polygon = new AMap.Polygon({
                        map: map,
                        strokeWeight: 1,
                        path: bounds[i],
                        fillOpacity: 0.7,
                        fillColor: '#3A5FCD',//填充色
                        strokeColor: '#CC66CC'  //边框线颜色
                    });
                    polygons.push(polygon);
                }
                //map.setFitView();//地图自适应
            }
        });
    });
    map.setMapStyle('dark');
    map.clearMap();  // 清除地图覆盖物 
    var markers = []; 
    var infoWindow = new AMap.InfoWindow({offset: new AMap.Pixel(0, -30)});
    //实例化信息窗体
     var title = '方恒假日酒店<span style="font-size:11px;color:#F00;">价格:318</span>',
     content = [];
     content.push("<img src='http://tpc.googlesyndication.com/simgad/5843493769827749134'>地址：北京市朝阳区阜通东大街6号院3号楼东北8.3公里");
     content.push("电话：010-64733333");
     content.push("<a href='http://ditu.amap.com/detail/B000A8URXB?citycode=110105'>详细信息</a>");
    for (var i = 0, marker; i < positions.length; i++) {
        marker = new AMap.Marker({
            map: map,
            icon: 'http://webapi.amap.com/theme/v1.3/markers/n/mark_b'+(i+1)+'.png',
            position: positions[i]
        });
        marker.content=createInfoWindow(title, content.join("<br/>"));
        marker.on('click', markerClick);
        markers.push(marker);
       
    }
    //监控dom 点击事件
    AMap.event.addDomListener(document.getElementById('updateMarker'), 'click', function() {
    	marker && updateMarker();
    }, false);
    //更新主标点图标效果
    function updateMarker(){
    	markers[1].setAnimation('AMAP_ANIMATION_BOUNCE');
    }
    //监控点标注点击事件
    function markerClick(e) {
        infoWindow.setContent(e.target.content);
        infoWindow.open(map, e.target.getPosition());
    }
    //构建自定义信息窗体
    function createInfoWindow(title, content) {
        var info = document.createElement("div");
        info.className = "info";

        //可以通过下面的方式修改自定义窗体的宽高
        //info.style.width = "400px";
        // 定义顶部标题
        var top = document.createElement("div");
        var titleD = document.createElement("div");
        var closeX = document.createElement("img");
        top.className = "info-top";
        titleD.innerHTML = title;
        closeX.src = "http://webapi.amap.com/images/close2.gif";
        closeX.onclick = closeInfoWindow;

        top.appendChild(titleD);
        top.appendChild(closeX);
        info.appendChild(top);

        // 定义中部内容
        var middle = document.createElement("div");
        middle.className = "info-middle";
        middle.style.backgroundColor = 'white';
        middle.innerHTML = content;
        info.appendChild(middle);

        // 定义底部内容
        var bottom = document.createElement("div");
        bottom.className = "info-bottom";
        bottom.style.position = 'relative';
        bottom.style.top = '0px';
        bottom.style.margin = '0 auto';
        var sharp = document.createElement("img");
        sharp.src = "http://webapi.amap.com/images/sharp.png";
        bottom.appendChild(sharp);
        info.appendChild(bottom);
        return info;
    }

    //关闭信息窗体
    function closeInfoWindow() {
        map.clearInfoWindow();
    }
}  
</script>
</body>
</html>				