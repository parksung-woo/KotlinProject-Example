package com.example.android04member

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.edit_id
import kotlinx.android.synthetic.main.activity_main.edit_name
import kotlinx.android.synthetic.main.activity_main.edit_pw
import kotlinx.android.synthetic.main.activity_main.edit_tel
import kotlinx.android.synthetic.main.infopage_activity.*

class InfoPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.infopage_activity)
        val mDatabase: SQLiteDatabase = openOrCreateDatabase("member.db", Context.MODE_PRIVATE,null)

        Log.i("testLog", intent.hasExtra("info").toString())
        Log.i("testLog", intent.hasExtra("bInfo").toString())
        Log.i("testLog", intent.hasExtra("vo").toString())

        if(intent.hasExtra("info")){
            Log.i("testLog", intent.getStringExtra("info").toString())
            val infos = intent.getStringExtra("info")?.split(":")
            tv_num.setText(infos?.get(0))
            edit_id.setText(infos?.get(1))
            edit_pw.setText(infos?.get(2))
            edit_name.setText(infos?.get(3))
            edit_tel.setText(infos?.get(4))

        }

        if(intent.hasExtra("bInfo")){
            val binfo = intent.getBundleExtra("bInfo")
            Log.i("testLog",binfo?.getInt("num").toString())
            Log.i("testLog",binfo?.getString("id").toString())
            Log.i("testLog",binfo?.getString("pw").toString())
            Log.i("testLog",binfo?.getString("name").toString())
            Log.i("testLog",binfo?.getString("tel").toString())

        }

        if(intent.hasExtra("vo")){
            val vo = intent.getParcelableExtra<LIstPageActivity.TestVO>("vo")
            Log.i("testLog",vo?.num.toString())
            Log.i("testLog",vo?.id.toString())
            Log.i("testLog",vo?.pw.toString())
            Log.i("testLog",vo?.name.toString())
            Log.i("testLog",vo?.tel.toString())

        }

        //수정
        button2.setOnClickListener {
            Log.i("testLog",edit_id.text.toString())
            Log.i("testLog",edit_pw.text.toString())
            Log.i("testLog",edit_name.text.toString())
            Log.i("testLog",edit_tel.text.toString())

            //update member set id='aaa',pw='bbb',name='ccc',tel='ddd'
            // where num=8
            var values_up = ContentValues()
            values_up.put("id",edit_id.text.toString())
            values_up.put("pw",edit_pw.text.toString())
            values_up.put("name",edit_name.text.toString())
            values_up.put("tel",edit_tel.text.toString())
            val result_up = mDatabase.update("member",
                values_up,
                "num=?", arrayOf(tv_num.text.toString()))
            Log.i("testLog","result_up:$result_up")

            if(result_up>=0){
                val intent = Intent(this,LIstPageActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)//Task 관리
                startActivity(intent)
            }else{
                Toast.makeText(this,
                    "잘못된입력",
                    Toast.LENGTH_SHORT).show()
            }
        }


        //삭제
        button_del.setOnClickListener {
            val result_del = mDatabase.delete("member","num=?", arrayOf(tv_num.text.toString()))
            arrayOf(tv_num.text.toString())
            Log.i("testing","result_del:$result_del")

            if (result_del > 0) {
                Toast.makeText(this, "삭제완료", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,LIstPageActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)//Task 관리
                startActivity(intent)
            }
        }



    }
}
