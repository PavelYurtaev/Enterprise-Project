<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<jsp:include page="../fragments/header.jsp"/>

	<body>
		<header class="top">
			<img id="headerLogo"
					 src="../images/headerLogo.png" alt="Enterprise header logo image">
			<img id="headerSlogan"
					src="../images/headerSlogan.png" alt="Слоган">
		</header>

		<nav id="privateArea">
			<ul>
				<li><a href="../index.jsp">ВЫХОД</a></li>
			</ul>
		</nav>

		<nav id="publicArea">
			<ul>
				<li class="selected"><a href="../admin/admin.jsp">ЛИЧНЫЙ КАБИНЕТ АДМИНИСТРАТОРА</a></li>
				<li><a href="../admin/chat.jsp">ЧАТ</a></li>
				<li><a href="../admin/structure.jsp">СТРУКТУРА</a></li>
				<li><a href="../admin/news.jsp">НОВОСТИ И СТАТЬИ</a></li>
				<li><a href="../admin/projects.jsp">НАШИ ПРОЕКТЫ</a></li>
				<li><a href="../admin/contacts.jsp">КОНТАКТЫ</a></li>
			</ul>
		</nav>

		<div id="mainContainer">
			<div id="mainRow">
				<section id="main">
					<h1>Личный кабинет Администратора</h1>
					<h2>Вариант 1</h2>
					<p>
						Табличные элементы, обеспечивающие доступ и работу (изменение, удаление, добавление) с данными в основных таблица БД (Пользователи, Заказы, ...).
						<br>
						Поле ввода для SQL-комманд и область для вывода результата выполнения комманд, а так же табличный элемент для результатов выполнения запросов.
					</p>
					<h2>Вариант 2</h2>
					<p>
						Поле ввода для SQL-комманд и область для вывода результата выполнения комманд, а так же табличный элемент для результатов выполнения запросов.
					</p>
					<h2>Динамическая HTML-страница</h2>
				</section>
				<section id="news">
					<jsp:include page="../fragments/newssection.jsp"/>
				</section>
			</div> <!-- mainRow -->
		</div> <!-- mainContainer -->

		<footer>
			&copy; 2016, Enterprise co.
		</footer>

	</body>
</html>


