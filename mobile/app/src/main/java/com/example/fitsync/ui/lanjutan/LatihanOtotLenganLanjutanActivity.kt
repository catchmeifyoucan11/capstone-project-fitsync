package com.example.fitsync.ui.lanjutan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.bumptech.glide.Glide
import com.example.fitsync.R
import com.example.fitsync.data.gerakanlatihan.bagianLatihan
import com.example.fitsync.data.gerakanlatihan.kaloriLatihan
import com.example.fitsync.data.gerakanlatihan.lenganLanjutan
import com.example.fitsync.data.gerakanlatihan.lenganMenengah
import com.example.fitsync.data.gerakanlatihan.perutPemula
import com.example.fitsync.data.gerakanlatihan.tingkatanLatihan
import com.example.fitsync.databinding.ActivityLatihanOtotLenganLanjutanBinding
import com.example.fitsync.ui.persiapanlatihan.PersiapanLatihanActivity

class LatihanOtotLenganLanjutanActivity : AppCompatActivity() {
   private var _binding: ActivityLatihanOtotLenganLanjutanBinding? = null
   private val binding get() = _binding!!
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
      _binding = ActivityLatihanOtotLenganLanjutanBinding.inflate(layoutInflater)
      setContentView(binding.root)
      window.statusBarColor = getColor(R.color.navy)

      binding.btnBack.setOnClickListener { onBackPressed() }
      binding.btnStart.setOnClickListener {
         kaloriLatihan = 326
         bagianLatihan = "Lengan"
         tingkatanLatihan = "Lanjutan"
         val intent = Intent(
            this@LatihanOtotLenganLanjutanActivity,
            PersiapanLatihanActivity::class.java
         )
         intent.putExtra("gerakan", lenganLanjutan)
         startActivity(intent)
      }

      Glide.with(this)
         .load(R.drawable.tricep_dips_gif)
         .centerCrop()
         .into(binding.imageSitup)
      Glide.with(this)
         .load(R.drawable.jumping_jacks_gif)
         .centerCrop()
         .into(binding.imageLegraises)
      Glide.with(this)
         .load(R.drawable.diamond_push_up_gif)
         .centerCrop()
         .into(binding.imageDiamondPushup)
      Glide.with(this)
         .load(R.drawable.push_up_gif)
         .centerCrop()
         .into(binding.imageCobrastretch)
   }

   override fun onDestroy() {
      super.onDestroy()
      _binding = null
   }
}