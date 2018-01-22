package com.sw.hong.customlistviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //리스트에 들어갈 아이템 생성
        val item = Array(20,{ i -> "$i + list" })

        //baseAdapter로 생성
        listView.adapter = HBaseAdapter(this,item)
        //ArrayAdapter로 생성
        //listView.adapter = HArrayAdapter(this,R.layout.listview_item,item)
    }
}
