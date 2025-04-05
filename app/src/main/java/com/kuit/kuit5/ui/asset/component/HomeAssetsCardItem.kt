package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.NetAssetData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun HomeAssetsCardItem(
    modifier: Modifier = Modifier,
    title: String,
    total_money: Int,
    info1: String,
    info2: Int,
    info3: String,
    button_name: String,
    text:String,
    NetAssetDataList: List<NetAssetData>
) {
    Box(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(colors.white)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column() {
                    Text(
                        text = title,
                        style = typography.head_03_R_16,
                        color = colors.gray500
                    )
                    Spacer(modifier = modifier.size(10.dp))
                    Text(
                        text = total_money.toDecimalFormat() + "원",
                        style = typography.head_02_B_20,
                        color = colors.black
                    )
                    Spacer(modifier = modifier.size(10.dp))
                    Row() {
                        Text(
                            text = info1,
                            style = typography.body_02_R_12, //폰트 확인이 안됨..
                            color = colors.black
                        )
                        Text(
                            text = info2.toDecimalFormat() + "원 ",
                            style = typography.body_02_SB_12,
                            color = colors.green
                        )
                        Text(
                            text = info3,
                            style = typography.body_02_R_12, //폰트 확인이 안됨..
                            color = colors.black
                        )
                    }
                }
                Column(modifier = Modifier.wrapContentWidth()) {
                    BankSaladGrayButton(text = button_name)
                }
            }
            Spacer(modifier = modifier.size(30.dp))
            Column(verticalArrangement = Arrangement.spacedBy(30.dp)) {
                NetAssetDataList.forEach {netAssetData->
                    HomeAssetCardDetail(net_asset = netAssetData)
                }
            }
            Spacer(modifier = modifier.size(30.dp))
            HomeAssetsDiagnosisCard(text = text)
        }
    }
}

@Preview
@Composable
private fun HomeAssetsCardItemPreview() {
    val assetList = listOf(
        NetAssetData(
            icon = R.drawable.img_kakao_icon,
            title = "계좌 · 현금",
            money = 234567.toDecimalFormat() + "원",
            dropMoney = 4500.toDecimalFormat() + "원"
        ),
        NetAssetData(
            icon = R.drawable.img_kakao_icon,
            title = "예적금",
            money = 1000000.toDecimalFormat() + "원",
            dropMoney = 10000.toDecimalFormat() + "원"
        )
    )
    val spendList = listOf(
        NetAssetData(
            icon = R.drawable.img_won_icon,
            title = "오늘 지출",
            money = 21500.toDecimalFormat() + "원",
            dropMoney = ""
        ),
        NetAssetData(
            icon = R.drawable.img_won_icon,
            title = "어제 지출",
            money = 3500.toDecimalFormat() + "원",
            dropMoney = ""
        )
    )
    Column(modifier = Modifier) {
        HomeAssetsCardItem(
            title = "순자산",
            total_money = 1234567,
            info1 = "지난 방문일보다 ",
            info2 = 4500,
            info3 = "줄었어요",
            button_name = "송금",
            text="쌓인 예적금 이자 확인하고 진단받기",
            NetAssetDataList = assetList,
        )
        HomeAssetsCardItem(
            title = "이번달 지출",
            total_money = 198000,
            info1 = "지난달 같은 기간보다 ",
            info2 = 53000,
            info3 = "덜썼어요",
            button_name = "확인",
            text="3월 카드 지출",
            NetAssetDataList = spendList,
        )
    }
}