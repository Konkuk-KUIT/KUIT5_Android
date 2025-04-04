package com.kuit.kuit5.ui.home.screen.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.ui.theme.BankSaladTheme

@Composable
fun HomeAssetContainer(
    modifier: Modifier = Modifier

) {
    Card( // 순자산 전체 카드박스
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier


                    ) {

                    Text(
                        text = "순자산",
                        style = BankSaladTheme.typography.head_03_R_16,
                        color = BankSaladTheme.colors.gray500
                    )
                    Spacer(modifier = Modifier.height(10.dp))


                    Text(
                        text = "1,234,567원",
                        style = BankSaladTheme.typography.head_02_B_20,
                        color = BankSaladTheme.colors.black
                    )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(// 일부 텍스트만 변경시 append를 사용
                        text = buildAnnotatedString {
                            append("지난 방문일보다 ")

                            withStyle(style = SpanStyle(color = BankSaladTheme.colors.green)) {
                                append("4,500원 ")
                            }

                            append("줄었어요")
                        },
                        style = BankSaladTheme.typography.caption_01_R_10,
                        color = BankSaladTheme.colors.black // 기본 텍스트 색
                    )

                }
                CommonButton(title = "송금")

            }



            Column (
                modifier = Modifier.padding(horizontal = 20.dp),
            ){
                // 순자산 정보: 아이콘 + 금액 + 화살표

                val assetList = listOf(
                    AssetData(
                        icon = R.drawable.img_kakao_icon,
                        name = "계좌 · 현금",
                        value = "234,567원",
                        diffValue = "4,500원"
                    ),
                    AssetData(
                        icon = R.drawable.img_kakao_icon,
                        name = "예적금",
                        value = "1,000,000원",
                        diffValue = "10,000원"
                    )
                )

                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp)
                ) {
                    assetList.forEach { asset ->
                        HomeAssetsCardDetail(
                            modifier = Modifier.fillMaxWidth(),
                            asset = asset
                        )
                    }
                }








                Spacer(modifier = Modifier.height(26.dp))

                // 하단: 목표 설정 텍스트
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp, vertical = 24.dp),
                            colors = CardDefaults.cardColors(containerColor = BankSaladTheme.colors.gray200),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 14.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {

                                Text(
                                    text = "쌓인 예적금 이자 확인하고 진단받기",
                                    style = BankSaladTheme.typography.body_02_R_12,
                                    color = BankSaladTheme.colors.black
                                )

                                Spacer(modifier = Modifier.size(12.dp))

                                Icon(
                                    painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                                    contentDescription = "right arrow",
                                    tint = BankSaladTheme.colors.gray500

                                )
                            }
                        }

                    }

                }
            }
        }





@Preview(showBackground = true)
@Composable
private fun HomeAssetContainerPreview() {
    HomeAssetContainer(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    )

}

