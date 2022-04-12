package com.akbarmd.music_app.views.register

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.akbarmd.music_app.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        onClick()

    }

    private fun onClick() {
        binding.tbRegister.setNavigationOnClickListener { finish() }
        binding.btnAlreadyMemberLogin.setOnClickListener { finish() }
        binding.btnRegister.setOnClickListener {  }
    }

    private fun init() {
        //setup support action bar
        setSupportActionBar(binding.tbRegister)
        //menambahkan arrow back
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = null // bisa diganti apa aja tapi sekarang null

    }
}