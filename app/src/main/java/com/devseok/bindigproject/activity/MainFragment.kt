package com.devseok.bindigproject.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devseok.bindigproject.databinding.FragmentMainBinding
import com.devseok.bindigproject.fragment.SampleFragment
import com.devseok.binding.activity.viewBinding

class MainFragment : AppCompatActivity() {

    private val binding : FragmentMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fragment = SampleFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.container.id, fragment)
        transaction.commit()
    }

}