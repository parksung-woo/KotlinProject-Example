package com.example.android05sqlite3

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mDatabase:SQLiteDatabase = openOrCreateDatabase("member.db", Context.MODE_PRIVATE,null)
        mDatabase.execSQL("create table if not exists member (num integer primary key autoincrement, id text, " +
                "pw text, " +
                "name text, " +
                "tel text)")
        var valuses = ContentValues()
        valuses.put("id","admin1")
        valuses.put("pw","hi1111")
        valuses.put("name","kim1")
        valuses.put("tel","011")
        var result = mDatabase.insert("member",null,valuses)
        Log.i("testing","result:$result")

        //update member set id='aaa', pw='bbb', name='ccc', tel='ddd'
        //수정
        var valuses_up = ContentValues()
        valuses_up.put("id","aaa")
        valuses_up.put("pw","bbb")
        valuses_up.put("name","ccc")
        valuses_up.put("tel","ddd")
        val result_up =
        // 변경된 데이터의 갯수가 반환되는 특징을 가진다.
        mDatabase.update("member",valuses_up,"num=?", arrayOf("8")) //나중에 arrayOf만 변수처리해서 사용할 수 있다.
        Log.i("testing","result_up:$result_up")

        //삭제
        //delete from where num = 8
        val result_del = mDatabase.delete("member","num=?", arrayOf("9"))
        Log.i("testing","result_del:$result_del")

        //select * from member order by num desc;
        val c:Cursor = mDatabase.query("member",
            null,null,null,null,null,
            "num desc")

        //배열의 길이를 모르기 때문에 ArrayList사용
        var list:ArrayList<String> = arrayListOf<String>()
        Log.i("testLog","list.size:${list.size}")

        //select num from member order by num desc;
        c.moveToFirst()
        while(!(c.isAfterLast())){
            val num = c.getInt(c.getColumnIndex("num"))
            val id = c.getString(c.getColumnIndex("id"))
            val pw = c.getString(c.getColumnIndex("pw"))
            val name = c.getString(c.getColumnIndex("name"))

            val tel = c.getString(c.getColumnIndex("tel"))

            list.add("$num:$id;$pw:$name:$tel ")

            c.moveToNext()
            }  //end while

    }
}