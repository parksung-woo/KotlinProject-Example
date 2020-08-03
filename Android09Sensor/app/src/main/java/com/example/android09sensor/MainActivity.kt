package com.example.android09sensor

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(),SensorEventListener {

        var sm:SensorManager? = null // 센서를 사용하기 위한 SensorManager 전역변수

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tv_title.text = "0.19" // 처음에는 sqlite(DB)에서 정보를 얻고, 다음에는 URL을 통해서 네트워크에서 정보를 얻음
                              // 하지만 이번에는 디바이스에서 얻어진 센서의 정보를 얻어온다.

        sm = getSystemService(Context.SENSOR_SERVICE) as SensorManager //this.getSystemService 가 와야햐지만 자기자신이라 생략

        //var list:MutableList<Sensor> = sm!!.getSensorList(Sensor.TYPE_PROXIMITY) // PROXIMITY 센서는 근접센서
        var list:MutableList<Sensor> = sm!!.getSensorList(Sensor.TYPE_ACCELEROMETER) // ACCELEROMETER 센서는 x,y,z축의 진동을 감지

        Log.i("testLog","list.size : ${list.size}")

        for(sensor in list){
            Log.i("testLog","Sensor name : ${sensor.name}")
        }

        sm!!.registerListener(this,
                list.get(0),
                SensorManager.SENSOR_DELAY_UI)


    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("testLog","Stop Sensor..")
        sm!!.unregisterListener(this)
    }
    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
}

    override fun onSensorChanged(event: SensorEvent?) {
        //항상 Log를 찍지만 x,y의 움직임의 변화가 있을 때만 Log를 출력
        if(event!!.values[0] >= 15 || (event!!.values[1]>=15)){
            Log.i("testLog", "x:${event!!.values[0]},y:${event.values[1]},z:${event.values[2]}")

            val ran = Random()
            val num = ran.nextInt(3)

            if(num == 0 ) {
                tv_title.text = "바위"
            }else if (num ==1){
                tv_title.text = "가위"
            }else tv_title.text = "보"
        }
    }
}