package com.example.android08gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class TxtImgAdapter(val c: Context, val txtImg:Int, val list: ArrayList<Item>)
        : BaseAdapter() {
    override fun getView(position:Int , convertView: View?, p2: ViewGroup?): View {
        var v:View? = convertView
        val inflater = c.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                    as LayoutInflater
        v = inflater.inflate(txtImg,null)

        var iv:ImageView = v.findViewById(R.id.img)
        var tv:TextView = v.findViewById(R.id.txt)

        iv.setImageResource(list.get(position).img)
        tv.text = list.get(position).txt
        return v
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return list.size
    }
}

