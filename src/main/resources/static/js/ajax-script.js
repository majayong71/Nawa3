$(document).ready(function  () {
    $("first__area.")

$.ajax({
    url : '/data',
    type: 'GET',
    dataType: 'json',
    data:'img1',
    success: function(data) {

    // 성공적으로 데이터를 받아왔을 때 실행할 콜백 함수
    console.log(data) // 받아온 데이터를 콘솔에 출력
    }, //여기서 데이터를 DOM에 추가하는 등의 작업을 수행할 수 있다.
    error: function(xhr,status,error) {
    // 요청이 실패했을 때 실행할 콜백 함수
    console.error(error); // 에러메세지를 콘솔에 출력.
    }
});


//// src/main/resources/static/js/ajax-script.js
//$(document).ready(function () {
//    $(".load-data-btn").click(function () {
//        $.ajax({
//            url: '/data', // 컨트롤러에서 정의한 엔드포인트 경로
//            type: 'GET',
//            success: function (data) {
//                // 서버로부터 받은 데이터를 처리하는 로직
//                // 여기서는 받은 데이터를 alert로 표시하는 예시
//                alert(JSON.stringify(data));
//            },
//            error: function () {
//                alert('Error occurred while fetching data.');
//            }
//        });
//    });
//});