<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
</head>

<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="height:400px"></div>
        <!-- ECharts单文件引入 -->
    <script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
        <script type="text/javascript">
        // 路径配置
       require.config({
            paths: {
                echarts: '${pageContext.request.contextPath}/echart'
            }
        });
       var myChart;
        // 使用
        require(
            [
                'echarts',
                'echarts/chart/map', // 使用柱状图就加载bar模块，按需加载
                'echarts/chart/config'
            ],
            function (ec) {
                // 基于准备好的dom，初始化echarts图表
                 myChart = ec.init(document.getElementById('main')); 
                var option = {
                	    title : {
                	        text: '',
                	        //subtext: 'data from PM25.in',
                	        //sublink: 'http://www.pm25.in',
                	        x:'center'
                	    },
                	    tooltip : {
                	        trigger: 'item'
                	    },
                	    legend: {
                	        orient: 'vertical',
                	        x:'left',
                	        data:[]
                	    },
                	    //dataRange: {
                	    //    min : 0,
                	     //   max : 500,
                	      //  calculable : true,
                	       // color: ['maroon','purple','red','orange','yellow','lightgreen']
                	    //},
                	    toolbox: {
                	        show : true,
                	        orient : 'vertical',
                	        x: 'right',
                	        y: 'center',
                	        feature : {
                	            mark : {show: true},
                	            dataView : {show: true, readOnly: false},
                	            restore : {show: true},
                	            saveAsImage : {show: true}
                	        }
                	    },
                	    series : [
                	        {
                	            name: '',
                	            type: 'map',
                	            mapType: '上海|闵行区',
                	            showLegendSymbol:true,
                	            hoverable: false,
                	            roam:true,
                	            data : [],
                	            markPoint : {
                	            	//数据图形是否可点击，默认开启，如果没有click事件响应可以关闭 
                	            	clickable:true,
                	                symbolSize: 10,       // 标注大小，半宽（半径）参数，当图形为方向或菱形则总宽度为symbolSize * 2
                	                itemStyle: {
                	                    normal: {
                	                        borderColor: '#87cefa',
                	                        borderWidth: 1,            // 标注边线线宽，单位px，默认为1
                	                        label: {
                	                            show: false
                	                        }
                	                    },
                	                    emphasis: {
                	                        borderColor: '#1e90ff',
                	                        borderWidth: 5,
                	                        label: {
                	                            show: true
                	                        }
                	                    }
                	                },
                	                data : [
                	                    {name: "01中心", value: 9},
                	                    {name: "02中心", value: 9},
                	                    {name: "03中心", value: 9},
                	                    {name: "04中心", value: 9,selected: true},
                	                    {name: "05中心", value: 9}
                	                ]
                	            },
                	            geoCoord: {
                	                "01中心":[121.380202,31.090455],
                	            	"02中心":[121.379052,31.073383],
                	                "03中心":[121.339095,31.025862],
                	            	"04中心":[121.359217,31.062495],
                	                "05中心":[121.367554,31.072393]
                	            
                	            }
                	        }
                	    ]
                	};
                var ecConfig = require('echarts/chart/config');
                myChart.on(ecConfig.EVENT.CLICK,function (param) {
                	var selected=param.selected;
                   var mapSeries=option.series[0];
                    var data= [];
                    var legendData= [];
                    var name;
                    for (var p=0,len=mapSeries.markPoint.data.length; p<len; p++) {
                        name=mapSeries.markPoint.data[p].name;
                        
                    }
                });
                // 为echarts对象加载数据 
                myChart.setOption(option); 
            }
        );
 function xx(){
	 myChart
        	
        }
    </script>
    <input id="che" type="button" onclick="xx()">高亮</input>
    
</body>