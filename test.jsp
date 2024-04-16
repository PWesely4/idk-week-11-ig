<html>
	<head>

	</head>

	<body>
		testjsp
		<br />
		<b>hey! </b>
		<br />
		<i>what </i>
		<br />
		<u>Hi </u>
		<br />
		<%="java"%> 
		<br />
		
		<form>
			<input name="firstname" type="text">
			<br />
			<input type="submit">
		
		</form>
		<br />
		<br />
		
		<%
			String name = "Stan";
			out.println(name);
			
			int i = 4;
			i = i + 3;
			out.println("total is: " + i);
			
			if(request.getParameter("firstname").equals("Larry")) {
				out.println(" Hi Larry");
			}
			
		else out.println("I dont know you.");
			out.println("total is: " + i);
		%>
	</body>

</html>