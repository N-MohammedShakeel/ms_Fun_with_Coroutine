package com.example.coroutines_message_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity2 : AppCompatActivity() {


    val TAG ="MainActivity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tv = findViewById<TextView>(R.id.tvh)
        GlobalScope.launch(Dispatchers.IO) {
            Log.d(TAG, "from main thread ${Thread.currentThread().name}")
            val answer = donetworkcall()
            val answer1 = donetworkcall1()
            val answer2 = donetworkcall2()
            val answer3 = donetworkcall3()
            val answer4 = donetworkcall4()
            val answer5 = donetworkcall5()
            val answer6 = donetworkcall6()
            val answer7 = donetworkcall7()
            val answer8 = donetworkcall8()



            withContext(Dispatchers.Main){
                Log.d(TAG, "from secondary thread ${Thread.currentThread().name}")
                delay(2000L)
                tv.text  = answer.toString()
                delay(3000L)
                tv.text = answer1.toString()
                delay(4000L)
                tv.text = answer2.toString()
                delay(5000L)
                tv.text = answer3.toString()
                delay(6000L)
                tv.text = answer4.toString()
                delay(7000L)
                tv.text = answer5.toString()
                delay(8000L)
                tv.text = answer6.toString()
                delay(9000L)
                tv.text = answer7.toString()
                delay(10000L)
                tv.text = answer8.toString()

            }


        }



    }
    fun donetworkcall() :String{
        return "Hyyy Welcome to Coroutines"
    }

    fun donetworkcall1() :String{

        return "Iam glad you are here"
    }
    fun donetworkcall2() :String{

        return "Do you know me"
    }
    fun donetworkcall3() :String{

        return "or Do you came to check out my app"
    }
    fun donetworkcall4() :String{

        return "Anyway you are here"
    }
    fun donetworkcall5() :String{

        return "Have fun with it"
    }
    fun donetworkcall6() :String{

        return "Check out other repos too"
    }
    fun donetworkcall7() :String{

        return "We will see ya later"
    }
    fun donetworkcall8() :String{

        return "Thank you"
    }

}
