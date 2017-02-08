
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</section>
<!-- container section start -->

<!-- javascripts -->
<script src="<c:url value="/resources/admin/js/jquery.js" />"></script>
<script
	src="<c:url value="/resources/admin/js/jquery-ui-1.10.4.min.js" />"></script>
<script src="<c:url value="/resources/admin/js/jquery-1.8.3.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/admin/js/jquery-ui-1.9.2.custom.min.js" />"></script>
<!-- bootstrap -->
<script src="<c:url value="/resources/admin/js/bootstrap.min.js" />"></script>
<!-- nice scroll -->
<script
	src="<c:url value="/resources/admin/js/jquery.scrollTo.min.js" />"></script>
<script src="<c:url value="/resources/admin/js/jquery.nicescroll.js" />"
	type="text/javascript"></script>
<!-- charts scripts -->
<script
	src="<c:url value="/resources/admin/assets/jquery-knob/js/jquery.knob.js" />"></script>
<script src="<c:url value="/resources/admin/js/jquery.sparkline.js" />"
	type="text/javascript"></script>
<script
	src="<c:url value="/resources/admin/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js" />"></script>
<script src="<c:url value="/resources/admin/js/owl.carousel.js" />"></script>
<!-- jQuery full calendar -->
<script src="<c:url value="/resources/admin/js/fullcalendar.min.js" />"></script>
<!-- Full Google Calendar - Calendar -->
<script
	src="<c:url value="/resources/admin/assets/fullcalendar/fullcalendar/fullcalendar.js" />"></script>
<!--script for this page only-->
<script src="<c:url value="/resources/admin/js/calendar-custom.js" />"></script>
<script src="<c:url value="/resources/admin/js/jquery.rateit.min.js" />"></script>
<!-- custom select -->
<script
	src="<c:url value="/resources/admin/js/jquery.customSelect.min.js" />"></script>
<script
	src="<c:url value="/resources/admin/assets/chart-master/Chart.js" />"></script>

<!--custome script for all page-->
<script src="<c:url value="/resources/admin/js/scripts.js" />"></script>
<!-- custom script for this page-->
<script src="<c:url value="/resources/admin/js/sparkline-chart.js" />"></script>
<script src="<c:url value="/resources/admin/js/easy-pie-chart.js" />"></script>
<script
	src="<c:url value="/resources/admin/js/jquery-jvectormap-1.2.2.min.js" />"></script>
<script
	src="<c:url value="/resources/admin/js/jquery-jvectormap-world-mill-en.js" />"></script>
<script src="<c:url value="/resources/admin/js/xcharts.min.js" />"></script>
<script
	src="<c:url value="/resources/admin/js/jquery.autosize.min.js" />"></script>
<script
	src="<c:url value="/resources/admin/js/jquery.placeholder.min.js" />"></script>
<script src="<c:url value="/resources/admin/js/gdp-data.js" />"></script>
<script src="<c:url value="/resources/admin/js/morris.min.js" />"></script>
<script src="<c:url value="/resources/admin/js/sparklines.js" />"></script>
<script src="<c:url value="/resources/admin/js/charts.js" />"></script>
<script
	src="<c:url value="/resources/admin/js/jquery.slimscroll.min.js" />"></script>
<!-- <script type="text/javascript" charset="utf8"
	src="//cdn.datatables.net/1.10.13/js/jquery.dataTables.js"></script> -->
<script src="//cdn.ckeditor.com/4.6.2/basic/ckeditor.js"></script>
<script>
	/* $(document).ready(function() {
		$('#tableRestaurant').DataTable();
	}); */
	//knob
	$(function() {
		$(".knob").knob({
			'draw' : function() {
				$(this.i).val(this.cv + '%')
			}
		})
	});

	//carousel
	$(document).ready(function() {
		$("#owl-slider").owlCarousel({
			navigation : true,
			slideSpeed : 300,
			paginationSpeed : 400,
			singleItem : true

		});
	});

	//custom select box

	$(function() {
		$('select.styled').customSelect();
	});

	/* ---------- Map ---------- */
	$(function() {
		$('#map').vectorMap({
			map : 'world_mill_en',
			series : {
				regions : [ {
					values : gdpData,
					scale : [ '#000', '#000' ],
					normalizeFunction : 'polynomial'
				} ]
			},
			backgroundColor : '#eef3f7',
			onLabelShow : function(e, el, code) {
				el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
			}
		});
	});

</script>

</body>
</html>
