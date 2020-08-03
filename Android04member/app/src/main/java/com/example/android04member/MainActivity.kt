package com.example.android04member

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*button.setOnClickListener { Log.i(
            "testLog", "id:${edit_id.text}, password:${edit_pw.text}, " +
                    "name:${edit_name.text}, Tel:${edit_tel.text}"
        */
        // sqlite3 프로젝트의 DB를 수행하기 위하여 추가
        // 다른 어플리케이션이기 때문에 새로 추가해준다.
        val mDatabase: SQLiteDatabase = openOrCreateDatabase("member.db", Context.MODE_PRIVATE,null)
        mDatabase.execSQL("create table if not exists member (num integer primary key autoincrement, id text, " +
                "pw text, " +
                "name text, " +
                "tel text)")

        button2.setOnClickListener {
            Log.i("testLog", edit_id.text.toString())
            Log.i("testLog", edit_pw.text.toString())
            Log.i("testLog", edit_name.text.toString())
            Log.i("testLog", edit_tel.text.toString())
            val intent = Intent(this, LIstPageActivity::class.java) //LIstPageActivity로 이동
            startActivity(intent)

            //db의 저장
            var valuses = ContentValues()
            valuses.put("id", edit_id.text.toString())
            valuses.put("pw", edit_pw.text.toString())
            valuses.put("name", edit_name.text.toString())
            valuses.put("tel", edit_tel.text.toString())
            var result = mDatabase.insert("member", null, valuses)
            Log.i("testing", "result:$result")

            if (result > 0) {
                val intent = Intent(this, LIstPageActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)//Task 관리
                startActivity(intent)
            }
        }
    }
}

