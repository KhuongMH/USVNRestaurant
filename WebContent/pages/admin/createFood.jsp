<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%--
  Created by IntelliJ IDEA.
  User: Noob
  Date: 11/15/2016
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:include page="/pages/shared/admin/header.jsp" />

<section id="main-content">
	<section class="wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h3 class="page-header">
					</i> Create Food
				</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<section class="panel">
					<div class="panel-body">



						<form class="form-horizontal" id="createForm" method="POST">
							<div class="form-group">
								<label class="col-sm-2 control-label">Name</label>
								<div class="col-sm-10">
									<input type="text" name="name" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">Type</label>
								<div class="col-sm-10">
									<input type="text" name="type" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">Image Url</label>
								<div class="col-sm-10">
									<input type="text" name="imageurl" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">From</label>
								<div class="col-sm-10">
									<input type="text" name="from" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">Description</label>
								<div class="col-sm-10">
									<textarea name="description" id="description" class="form-control"></textarea>
								</div>
							</div>
							<input type="submit" class="btn btn-primary" />
						</form>

					</div>
				</section>
			</div>
		</div>
		<!-- page end-->
	</section>
</section>

<jsp:include page="/pages/shared/admin/footer.jsp" />

<script src="<c:url value="/resources/admin/js/pmain.js" />"></script>