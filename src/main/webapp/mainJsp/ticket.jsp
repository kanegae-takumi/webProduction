 <%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html lang="ja">
 <head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>チケット一覧</title>
 <link rel="stylesheet" href="javascript:void(0)"> 
</head>
 <body>
 	<h1>マイチケット</h1>
 	<div class = enclose1>
 	<form ticket="${pageContext.request.contextPath}/TicketList" method="post" onsubmit="saveData()">
 	<h1>試合チーム</h1>
 	<h5>
		日時<br/>
		場所<br/>
		座席<br/>
	</h5>	
	<br/>
	<button type="submit" name="ticket" value="resaleTicketSalesConfirmation">リセールする</button>
 	<button type="submit" name="ticket" value="ticketDisplay">詳細</button>
 	</form>
	</div> 
 </body>
 </html>