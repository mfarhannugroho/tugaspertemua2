

package com.example.tugaspertemuan2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugaspertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var admin: String
    private lateinit var adminPw: String

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        admin= "vokasi"
        adminPw = "victory"

        with(binding){

            loginButton.setOnClickListener {

                if(username.text.toString() == admin &&
                    password.text.toString() == adminPw){
                    Toast.makeText(this@MainActivity, "Login Sukses", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this@MainActivity, "Login Gagal", Toast.LENGTH_SHORT).show()
                }

            }

        }
    }}