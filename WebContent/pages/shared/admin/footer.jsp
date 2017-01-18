</div>
<!-- /#wrapper -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- jQuery -->
<script src="<c:url value="/js/jquery.js" />"></script>
<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

<script type="application/javascript">
    $(document).ready(function() {
        $('#restaurants').DataTable();
    } );
</script>

<!-- Bootstrap Core JavaScript -->
<script src="<c:url value="/admin/js/bootstrap.min.js" />"></script>

<!-- Morris Charts JavaScript -->
<script src="<c:url value="/admin/js/plugins/morris/raphael.min.js" />"></script>
<script src="<c:url value="/admin/js/plugins/morris/morris.min.js" />"></script>
<script src="<c:url value="/admin/js/plugins/morris/morris-data.js" />"></script>

</body>

</html>
