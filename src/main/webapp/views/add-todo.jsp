<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<form action="/add-todo.do" method="post">
		<div>Let's add a new Todo:</div>
		<fieldset class="form-group">
			<label>Description: </label><input class="form-control" type="text" name="todo"><BR/>
		</fieldset>
		<fieldset class="form-group">
			<label>Category: </label><input class="form-control" type="text" name="category"><BR/>
		</fieldset>
		<input type="submit" value="Sure" class="btn btn-success">
	</form>
</div>

<%@ include file="../common/footer.jspf"%>