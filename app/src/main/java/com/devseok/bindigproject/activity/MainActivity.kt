package com.devseok.bindigproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devseok.bindigproject.R
import com.devseok.bindigproject.databinding.ActivityMainBinding
import com.devseok.binding.activity.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


}