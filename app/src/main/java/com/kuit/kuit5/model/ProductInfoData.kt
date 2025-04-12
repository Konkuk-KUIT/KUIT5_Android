package com.kuit.kuit5.model


// 1. 데이터 구조 정의
data class ProductInfo(
    val label: String,
    val value: String
)

// 2. 실제 데이터 선언
val productInfoList = listOf(
    ProductInfo("가입 연령", "19~34세"),
    ProductInfo("소득 기준", "연 6,000만 원 이하"),
    ProductInfo("월 납입 금액", "40만원 ~ 최대 70만원"),
    ProductInfo("정부 지원금", "납입액의 3~6%")
)

/* class ProductInfoData {
    //데이터클래스만들기
    //뒤로가기시 첫화면나오게하기
}*/