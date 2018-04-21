<div class="container">
	<div class="row">
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<div class="col-md-9">
			<div class="row">
				<div class="col-lg-12">
					<c:choose>
						<c:when test="${userClickHome == 'listAllProducts'}">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
								<li class="breadcrumb-item active">All Products</li>

							</ol>
						</c:when>
						<c:when test="${userClickHome == 'categoryProducts'}">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
								<li class="breadcrumb-item active">Category</li>
								<li class="breadcrumb-item active">${category.name}</li>
								
							</ol>
						</c:when>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
</div>