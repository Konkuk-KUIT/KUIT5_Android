package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun AssetInfoContainer(
    modifier: Modifier = Modifier,
    title:String,
    value:String,
    assetList:List<AssetData>
) {
    Column (
        modifier=modifier
            .fillMaxWidth()
    ){
        Row(
            modifier=modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = title,
                style = typography.body_02_R_12
            ) //ex)입출금
            Text(
                text = value,
                style = typography.body_02_R_12,
                color = colors.gray500
            ) //그 오른쪽에 총 액수
        }
        HorizontalDivider(
            modifier=modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            color= colors.gray300
        )
        Column(
            modifier=modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
            assetList.forEach{
                asset -> AssetInfoItem(asset=asset)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AssetInfoContainerPreview() {
    val assetList = listOf(
        AssetData( //디폴트
            icon= R.drawable.img_kakao_icon,
            name="입출금통장",
            value="234,567원"
        ),
        AssetData( //디폴트
            icon= R.drawable.img_kakao_icon,
            name="정기예금",
            value="1,000,000원"
        ),
        AssetData( //디폴트
            icon= R.drawable.img_shinhan_icon,
            name="현금",
            value="0원"
        )
    )

    AssetInfoContainer(
        title="입출금",
        value="234.567원",
        assetList = assetList
    )
}