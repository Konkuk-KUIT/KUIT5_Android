package com.kuit.kuit5.ui.shopping.viewmodel

import androidx.lifecycle.ViewModel
import com.kuit.kuit5.R
import com.kuit.kuit5.model.ShoppingData

class ShoppingViewModel : ViewModel() {
    val kbShoppingProduct = ShoppingData(
        icon = R.drawable.img_kb_label,
        name = "KB 청년도약계좌",
        age = "19~34세",
        earnings = "연 6,000 만원 이하",
        payment = "40만원 ~ 최대 70만원",
        govern = "납입액의 3~6%",
        note = "5년 동안 해지 없이 완납할 수 있는지 체크해야 해요.\n\n 만기가 길다는 건 그 긴 기간 동안 목돈이 묶인다는 말과 같아요. 때문에 중도에 해지할 가능성이 커서 희망한 혜택을 제대로 못 받을 수 있어요. 심지어 만기를 못 채우고 중도에 해지하면 감면받은 세금을 다시 추징한다고 해요. 또, 청년도약계좌를 유지하는 동안 운용 수익을 늘릴 수 있는 다른 좋은 기회를 놓칠 수도 있어요.\n\n 내 수입과 지출을 잘 분석해 저축 여력이 충분한지 반드시 체크해야 해요. 저축 여력이 충분하지 않은 상태에서 무리하여 70만 원을 저축하기보다는, 40만 원을 납입하여 해지 없이 완납하는 것이 더 합리적일 수 있어요."

    )

//    var newAccount = mutableIntStateOf(0)
//
//    fun addAccount() {
//        newAccount.value += 1
//    }
}
