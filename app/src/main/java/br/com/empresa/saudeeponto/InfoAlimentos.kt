package br.com.empresa.saudeeponto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InfoAlimentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_alimentos)

        val btnSearchFruta: ImageButton = findViewById(R.id.btnSearchFruta)
        val edt_alimento: EditText = findViewById(R.id.edt_alimento)
        val qnt_porcao: TextView = findViewById(R.id.qnt_porcao)
        val qnt_gordura: TextView = findViewById(R.id.qnt_gordura)
        val qnt_acucar: TextView = findViewById(R.id.qnt_acucar)
        val qnt_calorias: TextView = findViewById(R.id.qnt_calorias)


        val Fruta = edt_alimento




        btnSearchFruta.setOnClickListener {
            val call = RetrofitFactory().retrofitService().getFruta(edt_alimento.text.toString())

            call.enqueue(object : Callback<RetrofitService.Fruta> {

                override fun onResponse(call: Call<RetrofitService.Fruta>, response: Response<RetrofitService.Fruta>) {
                    Log.i("Fruta", it.toString())
                    Toast.makeText(this@InfoAlimentos, it.toString(), Toast.LENGTH_LONG).show()
                }

                override fun onFailure(call: Call<RetrofitService.Fruta>?, t: Throwable?) {
                    t?.message?.let { it1 -> Log.e("Erro", it1) }
                }

            })

        }


    }
}