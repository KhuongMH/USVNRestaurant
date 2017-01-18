<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--
  Created by IntelliJ IDEA.
  User: Noob
  Date: 11/15/2016
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/pages/shared/admin/header.jsp"/>


<div id="page-wrapper">

    <div class="container-fluid">

        <!-- Page Heading -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                    Dashboard <small>Statistics Overview</small>
                </h1>
                <ol class="breadcrumb">
                    <li class="active">
                        <i class="fa fa-dashboard"></i> Dashboard
                    </li>
                </ol>
            </div>
        </div>
        <!-- /.row -->
        <div class="row">
            <div class="col-lg-12">
                <h2>List Of Restaurant</h2>
                <div class="table-responsive">
                    <table id="restaurants" class="table table-bordered table-hover">
                        <thead>
                        <tr>
                            <th>Tên</th>
                            <th>Địa Chỉ</th>
                            <th>Mô Tả</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:if test="${!empty listRestaurants}">
                            <c:forEach items="${listRestaurants}" var="restaurant">
                                <tr>
                                    <td>${restaurant.name}</td>
                                    <td>${restaurant.address}</td>
                                    <td>${restaurant.description}</td>
                                </tr>
                            </c:forEach>
                        </c:if>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <!-- /.row -->

    </div>
    <!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->

<jsp:include page="/pages/shared/admin/footer.jsp"/>
