package com.kuit.kuit5.ui.shopping.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R

@Composable
fun ProductImageCard(
    modifier: Modifier = Modifier
        .padding(20.dp)
) {
    Image(
        painter = painterResource(id = R.drawable.img_kb_label),
        contentDescription = "KB label",
        modifier = modifier
            .width((320.dp))
            .clip(RoundedCornerShape(16.dp))
    )
}

@Preview
@Composable
private fun ProductImageCardPreview() {
    ProductImageCard()
}