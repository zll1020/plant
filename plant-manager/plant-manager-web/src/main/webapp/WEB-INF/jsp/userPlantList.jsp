<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户植物列表</title>

<table class="easyui-datagrid" id="userPlantList" title="植物生长信息列表"
	data-options="singleSelect:false,collapsible:true,pagination:true,url:'/plant/list',method:'get',pageSize:10,toolbar:toolbar">
	<thead>
		<tr>
			<th data-options="field:'plantname',width:60">植物名称</th>
			<th data-options="field:'typeid',width:60">植物类型</th>
		</tr>
		<c:forEach items="${userPlantList}" var="plant">
			<tr>
				<td>${plant.plantname}</td>
				<td>${plant.typeid}</td>

			</tr>
		</c:forEach>
	</thead>
</table>
</head>
</html>