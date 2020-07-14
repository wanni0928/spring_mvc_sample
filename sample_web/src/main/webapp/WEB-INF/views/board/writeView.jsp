<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>게시판</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
</head>
<body>
	<div id="root">
		<header>
			<h1>게시판</h1>
		</header>
		<hr />

		<div>
			<%@include file="nav.jsp"%>
		</div>
		<hr />

		<section id="container">
			<form name="writeForm" method="post" action="/board/write">
				<table>
					<tbody>
						<tr>
							<td><label for="title">제목</label><input type="text"
								id="title" name="title" class="chk" /></td>
						</tr>
						<tr>
							<td><label for="content">내용</label> <textarea id="content"
									name="content" class="chk"></textarea></td>
						</tr>
						<tr>
							<td><label for="writer">작성자</label><input type="text"
								id="writer" name="writer" class="chk" /></td>
						<tr>
							<td>
								<button type="submit" class="write_btn" >작성</button>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</section>
		<hr />
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			var formObj = $("form[name='writeForm']");
			$(".write_btn").on("click", function() {
				if (fn_valiChk()) {
					return false;
				}
				formObj.attr("action", "/board/write");
				formObj.attr("method", "post");
				formObj.submit();
			});
		})
		function fn_valiChk() {
			var regForm = $("form[name='writeForm'] .chk").length;
			for (var i = 0; i < regForm; i++) {
				if ($(".chk").eq(i).val() == ""
						|| $(".chk").eq(i).val() == null) {
					alert($(".chk").eq(i).attr("name"));
					return true;
				}
			}
		}
	</script>
</body>
</html>