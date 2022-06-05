package com.example.mobinaabasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobinaabasi.databinding.ActivityFallBinding



class FallActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFallBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFallBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.backBtn.setOnClickListener {

            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }



        }

        binding.refreshBtn.setOnClickListener {

            binding.ghazalTxt.text="غزل شماره 30"
            binding.sherTxt.text=""
            binding.tranlateTxt.text=""



        }








    }
}