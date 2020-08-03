package com.example.android08gridview

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView


class TestAdapter<T>(val c: Context, val imgArr: Array<Int>)
    : BaseAdapter() {//오버라이딩 (alt+ enter로 전체추가
    //한칸의 그림을 추가
    //converView -> 제일 처음만 null이고 나머지는 이전의 layout정보를 기억한다.
    override fun getView(position:Int , convertView: View?, p2: ViewGroup?): View {
        var iv:ImageView    // ImageView를 한번만 생성하고 스크롤했을 때의 사진이 출력되는 속도를 높인다.
        if(convertView == null){
            iv = ImageView(c)
        }else{
            iv = convertView as ImageView
        }
        iv.setImageResource(imgArr[position])
        return iv
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return imgArr.size  //배열의 길이를 반환 (하지않을 경우 화면 출력불가)
    }

}
