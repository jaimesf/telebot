<html>
<head>
<title>Registro de bots</title>

<script type="text/javascript">
	function onSubmitBot(){
		var token = document.getElementById("token");
		var url = document.getElementById("url");
		var form = document.getElementById("form");
		var urlBaseRegisterWebhook = 'https://api.telegram.org/bot';
		var methodSetWebhook = '/setWebhook'
		
		if(token.value == '' || url == ''){
			alert("Fill the fields url and token");
			return false;
		}else{
			form.setAttribute("action", urlBaseRegisterWebhook + token.value + methodSetWebhook);
			return true;
		}
	
	
	}
	
</script>

</head>
<body>
	<div style="border: 1px solid;">

		<h1>Register webhook for your bot</h1>
		<form id="form" enctype="multipart/form-data" onsubmit="return onSubmitBot();"
			action=""
			method="POST">

			Your bot URL (Ports permitted: 443, 80, 88 and 8443): <br>
			<input size="100" type="text" id="url" name="url" value=""><br> <br> 
			Your bot token: <br>
			<input size="50" type="text" id=token value=""> <br> <br> 
			Public certificate <br>
			<input type="file" id="certificate" name="certificate"><br> <br> 
			<input type="submit" value="Send" />

		</form>
	</div>
</body>
</html>