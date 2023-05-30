<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
    <div class="container">
        <h1>전체 학생 성적 목록</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>학번</th>
                    <th>이름</th>
                    <th>국어</th>
                    <th>수학</th>
                    <th>영어</th>
                    <th>총점</th>
                    <th>평균</th>
                </tr>
            </thead>
            <tbody>
                <!-- tr태그는 반복문을 이용해서 처리합니다. -->
                <c:forEach var="score" items="${scoreList}">
                    <tr>
                        <td>${score.studentNumber}</td>
                        <td>${score.name}</td>
                        <td>${score.korScore}</td>
                        <td>${score.mathScore}</td>
                        <td>${score.engScore}</td>
                        <td>${score.korScore + score.mathScore + score.engScore}</td>
                        <td>${(score.korScore + score.mathScore + score.engScore) / 3}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <hr>
        <h1>성적 등록 폼</h1>
        <!-- 제일 앞 /의 의미: 기본 서버주소 http://localhost:8080/ -->
        <form action="/score/register" method="POST"> <!-- http://localhost:8080/score/register -->
            <!-- <div class="mb-3"> -->
                <label for="user-name" class="form-label">유저이름</label>
                <input type="text" class="form-control" name="name" id="user-name">
                <label for="user-kor" class="form-label">국어성적</label>
                <input type="text" class="form-control" name="korScore" id="user-kor">
                <label for="user-math" class="form-label">수학성적</label>
                <input type="text" class="form-control" name="mathScore" id="user-math">
                <label for="user-eng" class="form-label">영어성적</label>
                <input type="text" class="form-control" name="engScore" id="user-eng">
                <input type="submit" value="제출하기">
            <!-- </div> -->
        </form>
    </div>
</body>
</html>