<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<form action="/login.do" method="post">
		<p>${loginError}</p>
		name<input type="text" name="name"> password<input
			type="password" name="password"> <input type="submit"
			value="login">
		<div id="results"></div>
	</form>
</div>

<%@ include file="../common/footer.jspf"%>
