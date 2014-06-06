<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <div><img id="functionLogo" src="<c:url value="/images/function.jpg"/>"></div> --%>
<!-- <div id="functionTXT">${empData.bdyPriority.jobname}</div> -->
<div style="margin-top:10px;width:100%">
	<div style='margin:0 auto;width:90%;border-radius:7px;border:1px solid darkgray'>
		<div style='background-color:darkgray;border-radius:7px 7px 0 0;color:white'>
			${empData.bdyPriority.jobname}
		</div>
		<p style="font-size:1.3em"><strong>${empData.name}</strong></p>
	</div>
</div>
<c:set value="${empData.bdyPriority.prio }" var="prio"></c:set>
<input class="MainBtnColor asideBtn" type="button" value="公告" onclick="goURL('<c:url value="/mainpage.jsp" />')"><br>
<c:if test="${prio == 1 || prio == 2 }">
<input class="MainBtnColor asideBtn" type="button" value="現場" onclick="goURL('<c:url value="/table/opentable.jsp" />')"><br>
<input class="MainBtnColor asideBtn" type="button" value="訂位" onclick="goURL('<c:url value="/booking/booking.jsp" />')"><br>
<%-- <input class="MainBtnColor asideBtn" type="button" value="結帳" onclick="goURL('<c:url value="/checkout/checkTable.action" />')"><br> --%>
<%-- <input class="MainBtnColor asideBtn" type="button" value="點餐" onclick="goURL('<c:url value="/order/order.jsp" />')"><br> --%>
</c:if>
<c:if test="${prio == 1 || prio == 3 }">
<input class="MainBtnColor asideBtn" type="button" value="出餐" onclick="goURL('<c:url value="/kitchen/kitchenView.action"/>')"><BR>
</c:if>
<c:if test="${prio == 1}">
<input class="MainBtnColor asideBtn" type="button" value="現場擺設" onclick="goURL('<c:url value="/table/tableset.jsp" />')"><br>
<input class="MainBtnColor asideBtn" type="button" value="報表" onclick="goURL('<c:url value="/report/reportmenu.jsp" />')"><BR>
<input class="MainBtnColor asideBtn" type="button" value="員工管理" onclick="goURL('<c:url value="/secure/showEmp.action?resign=0" />')"><BR>
<input class="MainBtnColor asideBtn" type="button" value="餐廳管理" onclick="goURL('<c:url value="/secure/sort?act=show" />')"><BR>
<input class="MainBtnColor asideBtn" type="button" value="內場管理" onclick="goURL('<c:url value="/secure/inside" />')"><BR>
<input class="MainBtnColor asideBtn" type="button" value="套餐設定" onclick="goURL('<c:url value="/setmeal/setIndex.action" />')"><BR>
</c:if>
<input class="MainBtnColor asideBtn" type="button" value="登出" onclick="goURL('<c:url value="/secure/logout.action" />')">

