<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.962899.com/" prefix="ucan"%>
<html>
<head>
  <title></title>
  <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/highcharts.js"></script>
  <script src="${pageContext.request.contextPath}/js/theme.js"></script>
  <script src="${pageContext.request.contextPath}/js/highcharts-3d.js"></script>
</head>

<body>


<div>
	<table>
		<tr>
		<td>
		<ucan:select name="ceshi" dictionaryName="dictionary" type="gender"></ucan:select>
			<%--<select multiple="multiple" id="" name="" onchange="" disabled="disabled" style="" size="" class="" onclick="">
				<option selected="selected"></option>
			</select>
		--%></td>
		</tr>
	</table>
</div>
</body>
</html>
