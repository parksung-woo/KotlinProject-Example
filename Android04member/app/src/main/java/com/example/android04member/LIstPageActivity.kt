package com.example.android04member

import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.activity_list.*
import java.io.Serializable


class LIstPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val mDatabase: SQLiteDatabase = openOrCreateDatabase("member.db", Context.MODE_PRIVATE,null)

/*        var datas:Array<String> = Array(30,{i->"aaa${i+1}"})
        datas.forEach { Log.i("testLogs",it)  }*/

        var list= ArrayList<String>()
        //Log.i("testLog",list.size.toString())
        /*for(i in 1..30){
            list.add("$i:admin  $i:hi1234  $i:kim  $i:010$i")
        }
        list.forEach({Log.i("testLog",it)})*/
        val c:Cursor = mDatabase.query("member",
            null,null,null,null,null,
            "num desc")
        c.moveToFirst()
        while(!(c.isAfterLast())){
            val num = c.getInt(c.getColumnIndex("num"))
            val id = c.getString(c.getColumnIndex("id"))
            val pw = c.getString(c.getColumnIndex("pw"))
            val name = c.getString(c.getColumnIndex("name"))
            val tel = c.getString(c.getColumnIndex("tel"))
            list.add("$num:$id:$pw:$name:$tel ")

            c.moveToNext()
        }
        Log.i("testLog",list.size.toString())
        //android Context <- Activity <- AppCompatActivity <- ListPageActivity
        // list출력단
        //listView.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datas)
        //listView.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list)
        listView.adapter = ArrayAdapter<String>(this,R.layout.layout_list,list) //우리가 만든 layout으로 출력
    /*  listView.setOnItemClickListener { adapterView, view, position, l ->
            Log.i("testLog","$position, ${datas[position]}")
        }*/
        listView.setOnItemClickListener { adapterView, view, position, l ->
            Log.i("testLog", "$position, ${list.get(position)}")
            Toast.makeText(this, "${list.get(position)}", Toast.LENGTH_SHORT).show()  //말풍선

            val intent = Intent(this, InfoPageActivity::class.java)
            intent.putExtra("info", "${list.get(position)}")

            val num = 99
            val id = "tester"
            val pw = "hi4444"
            val name = "lee"
            val tel = "02"
//            intent.putExtra("num",num)
//            intent.putExtra("id",id)
//            intent.putExtra("pw",pw)
//            intent.putExtra("name",name)
//            intent.putExtra("tel",tel)

            val bundle = Bundle()
            bundle.putInt("num", num)
            bundle.putString("id", id)
            bundle.putString("pw", pw)
            bundle.putString("name", name)
            bundle.putString("tel", tel)
            intent.putExtra("bInfo", bundle)

           val vo = TestVO(num,id,pw,name,tel)
            intent.putExtra("vo",vo)

            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY )//Task 관리
            startActivity(intent)

        }//end setOnItemClickListener
    }//end onCreate()

   @Parcelize
    data class TestVO(val num:Int,val id:String,val pw:String,val name:String,val tel:String):Parcelable

}//end class
