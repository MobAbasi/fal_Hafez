package com.example.mobinaabasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.mobinaabasi.ApiBio.ApiInterface
import com.example.mobinaabasi.ApiBio.MyDataItem
import com.example.mobinaabasi.databinding.ActivityBioBinding
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder

const val BASE_URL="https://ganjgah.ir/api/ganjoor/"
class BioActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBioBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        getMyData()

    }



    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<MyDataItem>?> {
            override fun onResponse(
                call: Call<List<MyDataItem>?>,
                response: Response<List<MyDataItem>?>
            ) {
                val responseBody = response.body()!!

                val myStringBuilder =StringBuilder()
                for (myData in responseBody){
                    myStringBuilder.append(myData.name)
                    myStringBuilder.append("\n")
                }
                binding.textView4.text = myStringBuilder

            }

            override fun onFailure(call: Call<List<MyDataItem>?>, t: Throwable) {
                Log.d("BioActivity", "onFailure: "+t.message)
            }
        })
    }


}