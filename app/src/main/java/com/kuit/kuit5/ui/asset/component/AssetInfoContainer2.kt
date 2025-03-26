package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AssetData

@Composable
fun AssetInfoContainer2(
    modifier: Modifier = Modifier,
    title: String,
    assetList: List<AssetData>
) {
    Column(modifier=modifier
        .fillMaxWidth()
        .padding(20.dp)){
        //Spacer(modifier=modifier.size(20.dp))
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text=title,
                fontSize =16.sp,
                fontWeight = FontWeight.Bold    )
            Row() {
                Icon(
                    painter = painterResource(id = R.drawable.ic_vector_plus),
                    contentDescription = "plus",
                )
            }


        }
        Spacer(modifier=modifier.size(30.dp))

        Column(modifier=modifier.fillMaxWidth(),
            verticalArrangement=Arrangement.spacedBy(12.dp))
        {
            assetList.forEach{ asset->
                AssetInfoItem(asset=asset)

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AssetInfoContainer2Preview(){
    val assetList = listOf(
        AssetData(
            icon= R.drawable.ic_card,
            name="  내가 맞는 추천카드는?",
            value ="확인하기"

        ),
        /* AssetData(
             icon= R.drawable.kakao_bank,
             name="입출금 통장",
             value ="1,000,000원"

         ),

         AssetData(
             icon= R.drawable.kakao_bank,
             name="입출금 통장",
             value ="1,000,000원"

         ),
 */

    )

    AssetInfoContainer2(
        title = "입출금",
        assetList= assetList
    )

}