package com.example.test12

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_linkpage.*
import kotlinx.android.synthetic.main.callhistory.*
class LinkPage : AppCompatActivity(){
    val DataList = arrayListOf(
        Data(R.drawable.user,"0번"),
        Data(R.drawable.user,"1번"),
        Data(R.drawable.user,"2번"),
        Data(R.drawable.user,"3번")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linkpage)

        setSupportActionBar(LinkPage_toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        user_recyclerView.layoutManager = LinearLayoutManager(this)
        user_recyclerView.adapter = CustomAdapter(DataList)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val myintent1 = Intent(this,MainActivity::class.java)
        startActivity(myintent1)
        return true
    }
}