 <%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html lang="ja">
 <head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>リセールチケット販売完了</title>
 <link rel="stylesheet" href="javascript:void(0)"> 
</head>
 <body>
 	<div class = enclose2>
 	<h5>チケットのリセール出品が完了しました</h5><br/>
 	</div>
 	<form ticket="${pageContext.request.contextPath}/TicketList" method="post" onsubmit="saveData()">
 	<button type="submit" name="resale" value="memberTop">TOP</button>
 	</form>
 </body>
 </html>