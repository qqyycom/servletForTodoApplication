<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<form action="/add-todo.do" method="post">
		welcome ${name}
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>Category</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${todoList}" var="todo">
				<tr>
					<td>${todo.name}</td>
					<td>${todo.category}</td>
					<td><a class="btn btn-danger"
					href="/delete-todo.do?todo=${todo.name}&category=${todo.category} ">delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		
		<a href="/add-todo.do" class="btn btn-success">Add new todo</a>
	</form>
</div>

<%@ include file="../common/footer.jspf"%>