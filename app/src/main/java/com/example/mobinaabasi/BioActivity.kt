package com.example.mobinaabasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobinaabasi.ApiBio.ApiInterface
import com.example.mobinaabasi.ApiBio.MyAdapter
import com.example.mobinaabasi.ApiBio.MyDataItem
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL="https://ganjgah.ir/api/ganjoor/"
class BioActivity : AppCompatActivity() {
  lateinit var recyclerview:RecyclerView
    lateinit var myadapter:MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)

        recyclerview = findViewById(R.id.bio_recycelerview)
        recyclerview.layoutManager = LinearLayoutManager(this)

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
            override fun onResponse(call: Call<List<MyDataItem>?>, response: Response<List<MyDataItem>?>) {
                  val responsebody = response.body()!!
                    myadapter = MyAdapter(applicationContext , responsebody)
                    recyclerview.adapter = myadapter

            }

            override fun onFailure(call: Call<List<MyDataItem>?>, t: Throwable) {
                Log.d("BioActivity", "onFailure: "+t.message)
            }
        })
    }


}