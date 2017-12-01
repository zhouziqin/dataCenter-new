<%@ page language="java"  import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/highcharts.js"></script>
  <script src="${pageContext.request.contextPath}/js/theme.js"></script>
  <script src="${pageContext.request.contextPath}/js/highcharts-3d.js"></script>
<script type="text/javascript">
$(function(){
	getworkorderList();
})
//获取主动关爱数据
function getworkorderList(){
	  alert("1");
		 $.ajax({
			 type:"post",
			url:"${pageContext.request.contextPath}/workorder/workorderAll",
			 data:{},
			 success: function(json){
				var obj=eval(json);
				//alert(str[0].supplierName);
				for ( var i = 0; i < obj.length; i++) {
					var res =obj[i];
					var tr="<tr><td>"
					+"<span style='white-space:pre'>	</span>"+ res.workorderno
					+"<span style='white-space:pre'>	</span> </td>  <td>"
						+ res.workorderno
						+ "</td> <td>"
						+ res.uuid
						+ "</td>";
						+ "<td><a  class='a_model a_collect' href=javascript:openUpdateModal('"+res.bucketName+"','"+res.number+"','"+res.dailyNew+"')>修改</a>" + "<a class='a_track' href=javascript:delResource('"+res.bucketName+"')>删除</a></td> </tr>";
						$("#f").append(tr);
				}
			 }
			 
		 })
}

</script>
</head>
<body>
	<table id="f">
</body>
</html>