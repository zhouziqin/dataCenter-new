<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/highcharts.js"></script>
  <script src="${pageContext.request.contextPath}/js/theme.js"></script>
  <script src="${pageContext.request.contextPath}/js/highcharts-3d.js"></script>
  </head>
  <script type="text/javascript">
  var servers;
  function getCount(){
	  alert("1");
		 $.ajax({
			 type:"post",
			url:"${pageContext.request.contextPath}/b2b/getCount",
			 data:{},
			 success: function(json){
				var str=eval(json);
				servers=eval(str[0].data);
				 chartCount();
			 }
			 
		 })
	  
  }
  var data=['2016-03','2016-04','2016-05','2016-06','2016-07']
  $(function () {
	  getCount();
	});
  function chartCount(){
	  $('#container').highcharts({
	        chart: {
	            type: 'column',
	            options3d: {
	                enabled: true,
	                alpha: 15,
	                beta: 3,
	                viewDistance: 25,
	                depth: 150
	            },
	            marginTop: 80,
	            marginRight: 40
	        },

	        title: {
	            text: '历史牵线搭桥增长量'
	        },
	        credits:{
	             enabled:false // 禁用版权信息
	        },
	        xAxis: {
	            categories: data,
	        },

	        yAxis: {
	            allowDecimals: false,
	            min: 0,
	            title: {
	                text: ''
	            }
	        },

	        tooltip: {
	            headerFormat: '<b>{point.key}</b><br>',
	            pointFormat: '<span style="color:{series.color}">\u25CF</span> {series.name}: {point.y} / {point.stackTotal}'
	        },

	        plotOptions: {
	            column: {
	                stacking: 'normal',
	                depth: 40
	            }
	        },
	        series: [{
	            name: '新增数',
	            data: servers
	        }]
	    });
  }
</script>
  <body>
   <div id="container"></div>
   <c:forEach items="${list}" var="user" varStatus="vs">  
        <tr>  
              
             <td>  
                <s:property value="#vs.index+1"/>  
             </td>  
             <td align = "center">${user.uuid}</td>  
         </tr>  
	</c:forEach> 
  </body>
</html>
