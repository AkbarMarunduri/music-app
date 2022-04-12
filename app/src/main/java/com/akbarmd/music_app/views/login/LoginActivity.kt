package com.akbarmd.music_app.views.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akbarmd.music_app.R
import com.akbarmd.music_app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}