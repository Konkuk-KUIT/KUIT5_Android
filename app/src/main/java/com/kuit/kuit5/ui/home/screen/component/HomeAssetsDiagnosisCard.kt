package com.kuit.kuit5.ui.home.screen.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun HomeAssetsDiagnosisCard(
    modifier: Modifier = Modifier

) {
    Card( // 이번달 지출 전체 박스
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
                Column {

                    Text(
                        text = "이번 달 지출",
                        style = BankSaladTheme.typography.head_03_R_16,
                        color = BankSaladTheme.colors.gray500
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "198,000원",
                        style = BankSaladTheme.typography.head_02_B_20,
                        color = BankSaladTheme.colors.black
                    )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(// 일부 텍스트만 변경시 append를 사용
                        text = buildAnnotatedString {
                            append("지난달 같은 기간보다  ")

                            withStyle(style = SpanStyle(color = BankSaladTheme.colors.green)) {
                                append("53,000원 ")
                            }

                            append("덜 썼어요")
                        },
                        style = BankSaladTheme.typography.caption_01_R_10,
                        color = BankSaladTheme.colors.black // 기본 텍스트 색
                    )

                }
                CommonButton(title = "확인")

            }



            Column (
                modifier = Modifier.padding(horizontal = 20.dp),
            ){
                // 지출 정보

                val assetList = listOf(
                    AssetData(
                        icon = R.drawable.img_diagnosis_icon,
                        name = "오늘 지출",
                        value = "21,500원",
                        diffValue = "",
                    ),
                    AssetData(
                        icon = R.drawable.img_diagnosis_icon,
                        name = "예적금",
                        value = "1,000,000원",
                        diffValue = "",
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








                Spacer(modifier = Modifier.height(12.dp))

                // 하단: 목표 설정 텍스트
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp),
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
                            text = "3월 카드 지출",
                            style = BankSaladTheme.typography.body_02_R_12,
                            color = BankSaladTheme.colors.black
                        )

                        Spacer(modifier = Modifier.padding(12.dp))

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
private fun HomeAssetsDiagnosisCardPreview() {
    HomeAssetsDiagnosisCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    )

}

