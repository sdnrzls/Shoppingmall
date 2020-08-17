  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
  <%@include file="../Main/header.jsp" %>
     <%@ include file="../Main/side.jsp" %>
    
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Homepage - Start Bootstrap Template</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">

</head>

<body>

      <div class="col-lg-9">

        <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
            	<a href="/shoppingProject/product/detailview?productid=18">
              <img class="d-block img-fluid" src="/shoppingProject/image/0 (105).jpg" alt="First slide" width="auto" height="auto">
              </a>
            </div>
            <div class="carousel-item">
            <a href="/shoppingProject/product/detailview?productid=26">
              <img class="d-block img-fluid" src="/shoppingProject/image/0 (61).jpg" alt="Second slide" width="auto" height="auto">
            </a>
            </div>
            <div class="carousel-item">
            <a href="/shoppingProject/product/detailview?productid=21">
              <img class="d-block img-fluid" src="/shoppingProject/image/0 (284).jpg" alt="Third slide" width="auto" height="auto">
            </a>
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>

        <div class="row">

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="/shoppingProject/product/detailview?productid=12">
              <img class="card-img-top" src="/shoppingProject/image/0 (85).jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">멜란지 하이랜드 프린팅 반팔 티셔츠</a>
                </h4>
                <h5>$15000</h5>
                <p class="card-text">소프트한 분위기를 자아내는 멜란지 컬러 베이스의 하이앤드 프린팅 티셔츠 입니다</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="/shoppingProject/product/detailview?productid=14">
              <img class="card-img-top" src="/shoppingProject/image/0 (93).jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">프리미엄 루즈벨트 오버 티셔츠</a>
                </h4>
                <h5>$16500</h5>
                <p class="card-text">브랜드 공장에서 제작되어 높은 퀄리티를 자랑하는 오버핏 반팔 티셔츠 입니다</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="/shoppingProject/product/detailview?productid=27">
              <img class="card-img-top" src="/shoppingProject/image/0 (18).jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">오드 워싱 밴딩 와이드 팬츠</a>
                </h4>
                <h5>$36,000</h5>
                <p class="card-text">편안하게 착용하실 수 있는 밴딩 와이드 팬츠 입니다</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="/shoppingProject/product/detailview?productid=26">
              <img class="card-img-top" src="/shoppingProject/image/0 (61).jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">서프 고밀도 나일론 팬츠</a>
                </h4>
                <h5>$32,000</h5>
                <p class="card-text">고밀도 나일론 100%, 방수기능으로 여름철 피서지에서도 높을 활용도를 자랑합니다</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="/shoppingProject/product/detailview?productid=22">
              <img class="card-img-top" src="/shoppingProject/image/0 (156).jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">디프 썸머 쓰리버튼 자켓</a>
                </h4>
                <h5>75000</h5>
                <p class="card-text">깔끔한 쓰리버튼 디자인의 썸머 캐주얼 자켓 입니다</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="/shoppingProject/product/detailview?productid=34">
              <img class="card-img-top" src="/shoppingProject/image/0 (192).jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">핸드 통짜 소가죽 슬리퍼</a>
                </h4>
                <h5>$80,000</h5>
                <p class="card-text">높은 퀄리티의 소가죽으로 제작된 프리미엄 수제 슬리퍼 입니다.</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

        </div>
        <!-- /.row -->

      </div>
      <!-- /.col-lg-9 -->


  <!-- Footer -->
   <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
  
    <!-- /.container -->
   
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
