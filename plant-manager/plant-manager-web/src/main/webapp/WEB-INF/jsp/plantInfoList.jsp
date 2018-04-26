<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>植物详细生长信息列表</title>
<table class="easyui-datagrid" id="plantInfoList" title="植物生长信息列表"
	data-options="singleSelect:false,collapsible:true,pagination:true,url:'/plant/list',method:'get',pageSize:10,toolbar:toolbar">
	<thead>
		<tr>
			<th data-options="field:'plantid',width:60">植物ID</th>
			<th data-options="field:'time',width:60">采集信息时间</th>
			<th data-options="field:'soiltemp',width:60">土壤温度</th>
			<th data-options="field:'soilhum',width:60">土壤湿度</th>
			<th data-options="field:'airtemp',width:60">空气温度</th>
			<th data-options="field:'airhum',width:60">空气湿度</th>
			<th data-options="field:'light',width:60">光照强度</th>
			<th data-options="field:'co2',width:200">二氧化碳浓度</th>
			<th data-options="field:'growstatusid',width:100">植物生长阶段</th>
		</tr>
		<c:forEach items="${plantInfoList}" var="plantinfo">
			<tr>
				<td>${plantinfo.plantid}</td>
				<td>${plantinfo.time}</td>
				<td>${plantinfo.soiltemp}</td>
				<td>${plantinfo.soilhum}</td>
				<td>${plantinfo.airtemp}</td>
				<td>${plantinfo.airhum}</td>
				<td>${plantinfo.light}</td>
				<td>${plantinfo.co2}</td>
				<td>${plantinfo.growstatusid}</td>

			</tr>
		</c:forEach>
	</thead>
</table>

</head>
</html>