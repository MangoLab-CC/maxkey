<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  	<#include  "formbased_common.ftl">
  	
  	<script type="text/javascript">
	function redirect2link( ){
		window.top.location.href="${loginUrl}";
	};

	setTimeout("redirect2link()", 5000);
</script> 
</head>

<body style="display:none"  >
	<a href="${loginUrl}">click here to login</a>
	<br>
	submitType:${submitType}
	<br>
	<iframe src="<@base />/authz/formbased/${id}"></iframe>
</body>
</html>
