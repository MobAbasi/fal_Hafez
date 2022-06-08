package com.example.mobinaabasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mobinaabasi.ApiBio.ApiInterface
import com.example.mobinaabasi.ApiBio.MyAdapter
import com.example.mobinaabasi.ApiBio.MyDataItem
import com.example.mobinaabasi.ApiBio.MyDataItem2
import com.example.mobinaabasi.databinding.ActivityFallBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class FallActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFallBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFallBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.backBtn.setOnClickListener {

            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }


        }

        binding.refreshBtn.setOnClickListener {

            binding.sherTxt.text = getMyData2().toString()

        }
        getMyData2()


    }


    private fun getMyData2() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData2()

        retrofitData.enqueue(object : Callback<MyDataItem2> {
            override fun onResponse(call: Call<MyDataItem2>, response: Response<MyDataItem2>) {
                binding.ghazalTxt.text = response?.body()?.title
                binding.sherTxt.text = response?.body()?.plainText
            }

            override fun onFailure(call: Call<MyDataItem2>, t: Throwable) {
                Log.d("BioActivity", "onFailure: " + t.message)
            }
        })
    }


}