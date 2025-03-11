<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html lang="ja">

	<head>
		<meta charset="UTF-8">
		<title>管理者画面-試合情報一覧</title>
		<link rel="stylesheet" href="javascript:void(0)">
	</head>

	<body>
		<div class="gameSearch">
			<div class="searchForm">

				<div class="formItem">
					<span>試合ID</span>
					<input type="text" name="gameId">
				</div>

				<div class="formItem">
					<span>試合日</span>
					<input type="text" name="gameDay">
				</div>

				<div class="formItem">
					<span>チーム(ホーム)</span>
					<input type="text" name="homeTeam">
				</div>

				<div class="formItem">
					<span>チーム(アウェイ)</span>
					<input type="text" name="awayTeam">
				</div>

				<div class="formItem">
					<span>開催場所</span>
					<input type="text" name="gamePlace">
				</div>

				<div class="formItem">
					<span>試合ステータス</span>

					<label for="all">すべて</label>
					<input type="radio" id="all" name="status" value="all">
					<label for="beforeGame">今後開催</label>
					<input type="radio" name="status" value="all">
					<label for="afterGame">終了</label>
					<input type="radio" name="status" value="all">
				</div>

			</div>
		</div>
	</body>

	</html>