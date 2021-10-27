package com.bruce.toucharael

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.bruce.toucharael.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

         WindowCompat.setDecorFitsSystemWindows(window, false)
         WindowInsetsControllerCompat(window, binding.root).let { controller ->
             controller.hide(WindowInsetsCompat.Type.systemBars())
             controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
         }

         insertListeners()
     }

     private fun insertListeners() {
         binding.mainImage.setOnClickListener {
             fun hideClick() {
                 binding.clickTv.visibility = View.INVISIBLE
             }
             hideClick()
             binding.aulixiaryTv.text = "dafuki velho?"
             }
         }
     }




