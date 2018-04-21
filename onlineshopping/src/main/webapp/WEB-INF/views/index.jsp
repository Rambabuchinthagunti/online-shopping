<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<spring:url var="css" value="/resources/css" />
<spring:url var="images" value="/resources/images" />
<spring:url var="js" value="/resources/js" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>${title}-Onlineshopping</title>
<script type="text/javascript">
	window.menu = "${title}";
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop-homepage.css" rel="stylesheet">

<link href="${css}/bootstrap-theme.css" rel="stylesheet">


</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>
		
		<div class="content">
			<%--     <!-- Page Content  -->
    <c:if test="${userClickHome == 'home'}" >
    	<%@include file="home.jsp" %>
    </c:if>
     --%>
			<!-- switch -->
			<c:choose>
				<c:when test="${userClickHome == 'home'}">
					<%@include file="home.jsp"%>
				</c:when>
				<c:when test="${userClickHome == 'about'}">
					<%@include file="about.jsp"%>
				</c:when>
				<c:when test="${userClickHome == 'listAllProducts'}">
					<%@include file="listallproducts.jsp"%>
				</c:when>
				<c:when test="${userClickHome == 'categoryProducts'}">
					<%@include file="listallproducts.jsp"%>
				</c:when>
				<c:otherwise>
					<%@include file="contact.jsp"%>
				</c:otherwise>
			</c:choose>
			<!-- /.container -->
		</div>
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<!-- 	self coded js -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
