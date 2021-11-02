package com.bruce.toucharael

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bruce.toucharael.databinding.ActivityMainBinding
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
             binding.clickTv.visibility = View.GONE
             val random = Random.nextInt(9)
             val stringArray = resources.getStringArray(R.array.strings_random)
             when {
                 (random == 0) -> {
                     binding.auxiliaryTv.text = stringArray[0]
                 }
                 (random == 1) -> {
                     binding.auxiliaryTv.text = stringArray[1]
                 }
                 (random == 2) -> {
                     binding.auxiliaryTv.text = stringArray[2]
                 }
                 (random == 3) -> {
                     binding.auxiliaryTv.text = stringArray[3]
                 }
                 (random == 4) -> {
                     binding.auxiliaryTv.text = stringArray[4]
                 }
                 (random == 5) -> {
                     binding.auxiliaryTv.text = stringArray[5]
                 }
                 (random == 6) -> {
                     binding.auxiliaryTv.text = stringArray[6]
                 }
                 (random == 7) -> {
                     binding.auxiliaryTv.text = stringArray[7]
                 }
                 (random == 8) -> {
                     binding.auxiliaryTv.text = stringArray[8]
                 }
             }
         }
     }
}




