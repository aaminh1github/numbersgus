package com.example.numbersguss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    lateinit var arr :ArrayList<String>
    lateinit var rvMain:RecyclerView
    lateinit var gussb: Button
    lateinit var guss: EditText
     var g=0
    lateinit var rvAdapter:Adapter

    var num=Random.nextInt(10)
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            var gnum =2
            rvMain=findViewById(R.id.rvMain)
            guss=findViewById(R.id.etGuss)
            gussb=findViewById(R.id.btGuss)
            arr = arrayListOf("")

            gussb.setOnClickListener {try{
                var txt=guss.text.toString()
                g=txt.toInt()

                if (gnum>0){
                    arr.add("your guss is $g")
                    if (g!=num){
                        arr.add("you have $gnum gusses left")
                        gnum-=1}
                    else arr.add("you win!")}
                else{arr.add("your guss is $g")
                    Toast.makeText(this, "Sorry, you are out off guesses", Toast.LENGTH_SHORT).show()}
rvMain.adapter!!.notifyDataSetChanged()
            }catch (e :Exception) {//b
                Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()
            }
            }


rvAdapter=Adapter(arr)
            rvMain.adapter=rvAdapter
            rvMain.layoutManager= LinearLayoutManager(this)
    }

}