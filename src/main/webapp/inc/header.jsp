<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
    <!-- ヘッダー -->
    <header>
      <div class="header_inline_block">
        <nav>
          <ul>
            <!-- ロゴ -->
            <form action="★" method="post">
              <li>
                <input
                  type="image"
                  src="PhoenixChicket.png"
                  alt="ロゴ兼Home"
                  class="logo"
                />
              </li>
            </form>
            <div class="nav">
              <!-- ログイン -->
              <form action="★" method="post" class="login">
                <li>
                  <button type="submit" name="submit" value="login">
                    ログイン
                  </button>
                </li>
              </form>
              <!-- 新規登録 -->
              <form action="★" method="post">
                <li>
                  <button type="submit" name="submit" value="newRegistration">
                    新規登録
                  </button>
                </li>
              </form>
            </div>
          </ul>
        </nav>
      </div>
    </header>