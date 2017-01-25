<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Admin Panel</title>

    <!-- Bootstrap CSS -->    
    <link href="<c:url value="/resources/admin/css/bootstrap.min.css" />" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="<c:url value="/resources/admin/css/bootstrap-theme.css" />" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="<c:url value="/resources/admin/css/elegant-icons-style.css" />" rel="stylesheet" />
    <link href="<c:url value="/resources/admin/css/font-awesome.min.css" />" rel="stylesheet" />    
    <!-- full calendar css-->
    <link href="<c:url value="/resources/admin/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" />" rel="stylesheet" />
	<link href="<c:url value="/resources/admin/assets/fullcalendar/fullcalendar/fullcalendar.css" />" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="<c:url value="/resources/admin/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" />" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="<c:url value="/resources/admin/css/owl.carousel.css" />" type="text/css">
	<link href="<c:url value="/resources/admin/css/jquery-jvectormap-1.2.2.css" />" rel="stylesheet">
    <!-- Custom styles -->
	<link rel="stylesheet" href="<c:url value="/resources/admin/css/fullcalendar.css" />">
	<link href="<c:url value="/resources/admin/css/widgets.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/admin/css/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/admin/css/style-responsive.css" />" rel="stylesheet" />
	<link href="<c:url value="/resources/admin/css/xcharts.min.css" />" rel=" stylesheet">	
	<link href="<c:url value="/resources/admin/css/jquery-ui-1.10.4.min.css" />" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.13/css/jquery.dataTables.css">
  </head>

  <body>
  <!-- container section start -->
  <section id="container" class="">
     
      
      <header class="header dark-bg">
            <div class="top-nav notification-row">                
                <!-- notificatoin dropdown start-->
                <ul class="nav pull-right top-menu">
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="username">Welcome, Admin</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li>
                                <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->

      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  <li>
                      <a class="" href="/AdminPanel/Restaurant">
                          <span>Restaurants</span>
                      </a>
                  </li>                
                  <li>
                      <a class="" href="/AdminPanel/Food">
                          <span>Foods</span>
                      </a>
                  </li>                
                  <li>
                      <a class="" href="/AdminPanel/Account">
                          <span>Account</span>
                      </a>
                  </li>
 
              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>