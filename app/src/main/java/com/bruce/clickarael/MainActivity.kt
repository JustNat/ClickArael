package com.bruce.clickarael

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bruce.clickarael.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

         insertListeners()
     }

     private fun insertListeners() {
         binding.mainImage.setOnClickListener {
             val random = Random.nextInt(10)
             val stringArray = resources.getStringArray(R.array.strings_random)
             binding.clickTv.text = stringArray[random]
         }
     }
}




