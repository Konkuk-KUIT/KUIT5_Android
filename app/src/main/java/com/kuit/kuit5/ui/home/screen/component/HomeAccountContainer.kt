package com.kuit.kuit5.ui.home.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme

@Composable
fun HomeAccountContainer(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text(
                        text = "입출금 계좌",
                        style = BankSaladTheme.typography.head_03_R_16,
                        color = BankSaladTheme.colors.gray500
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "234,567원",
                        style = BankSaladTheme.typography.head_02_B_20,
                        color = BankSaladTheme.colors.black
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 24.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                        CommonButton(title = "송금")
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "어제보다",
                            style = BankSaladTheme.typography.caption_01_R_10,
                            color = BankSaladTheme.colors.gray400
                        )
                    }
                }
            }

            Column {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 22.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                modifier = Modifier.size(24.dp),
                                painter = painterResource(id = R.drawable.img_kakao_icon),
                                contentDescription = "카카오뱅크 아이콘"
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(
                                    text = "234,567원",
                                    style = BankSaladTheme.typography.body_01_M_14,
                                    color = BankSaladTheme.colors.black
                                )
                                Spacer(modifier = Modifier.size(8.dp))
                                Text(
                                    text = "입출금 통장",
                                    style = BankSaladTheme.typography.body_02_R_12,
                                    color = BankSaladTheme.colors.gray400
                                )
                            }
                        }

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_home_direction),
                                contentDescription = "down",
                                tint = Color.Blue,
                            )
                            Spacer(modifier = Modifier.size(2.dp))
                            Text(
                                text = "3,300원",
                                style = BankSaladTheme.typography.body_01_M_14,
                                color = BankSaladTheme.colors.blue
                            )
                            Spacer(modifier = Modifier.size(2.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.ic_assets_right_arrow),
                                contentDescription = "right arrow",
                                tint = BankSaladTheme.colors.gray500
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = BankSaladTheme.colors.apricot),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                modifier = Modifier.size(28.dp),
                                painter = painterResource(id = R.drawable.img_pig_icon),
                                contentDescription = "종잣돈 아이콘"
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "목표를 설정하고 종잣돈을 모아보세요",
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

                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeAccountContainerPreview() {
    HomeAccountContainer(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    )
}
