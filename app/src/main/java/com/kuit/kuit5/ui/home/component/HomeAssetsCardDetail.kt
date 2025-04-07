package com.kuit.kuit5.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AccountDetailItem
import com.kuit.kuit5.ui.theme.Blue
import com.kuit.kuit5.ui.theme.Gray400
import com.kuit.kuit5.ui.theme.Gray500

@Composable
fun HomeAssetsCardDetail(
    item: AccountDetailItem,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .padding(horizontal = 12.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // 왼쪽: 아이콘 + 텍스트 2줄
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.img_kakao_icon), // 적절한 아이콘
                contentDescription = "계좌 아이콘",
                modifier = Modifier.size(30.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = item.accountType,
                    fontSize = 14.sp,
                    color = Gray400,
                    fontFamily = FontFamily(Font(R.font.pretendard_regular))
                )
                Text(
                    text = item.amountText,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_medium))
                )
            }
        }

        // 오른쪽: 아이콘 + 텍스트 + 아이콘
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.img_home_downarrow),
                contentDescription = "downarrow",
                modifier = Modifier.size(10.dp)
            )

            Spacer(modifier = Modifier.width(2.dp))

            Text(
                text = item.changeText,
                fontSize = 14.sp,
                color = Blue,
                fontFamily = FontFamily(Font(R.font.pretendard_medium))
            )

            Spacer(modifier = Modifier.width(2.dp))

            Icon(
                painter = painterResource(id = R.drawable.ic_asset_right_arrow),
                contentDescription = null,
                tint = Gray500
            )
        }
    }
}

@Preview
@Composable
private fun HomeAssetsCardDetailPreview() {
    val assetItem = AccountDetailItem(
        amountText = "234,567원",
        accountType = "계좌 · 현금",
        changeText = "4,500원"
    )

    HomeAssetsCardDetail(item = assetItem)
}
