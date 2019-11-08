
package com.example.alomundo

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private  lateinit var btMain: Button
    private lateinit var etMain: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btMain = findViewById(R.id.btMain)
        this.etMain = findViewById(R.id.etMain)

        this.btMain.setOnClickListener({clickButton()})


    }

    fun clickButton() {
        var time = this@MainActivity.etMain.text.toString().toInt()
        var it = Intent(this, Alarme::class.java)
        var pe: PendingIntent = PendingIntent.getBroadcast(applicationContext, 0, it, 0)

        var am: AlarmManager = this.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + time * 1000, pe)
        Toast.makeText(this,"Alarme ativado para" + time+" segundos",Toast.LENGTH_SHORT).show()

    }

}
