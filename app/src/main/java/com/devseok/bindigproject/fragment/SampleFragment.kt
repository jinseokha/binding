package com.devseok.bindigproject.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.devseok.bindigproject.R
import com.devseok.bindigproject.activity.MainActivity
import com.devseok.bindigproject.databinding.FragmentSampleBinding
import com.devseok.binding.fragment.viewBinding

class SampleFragment : Fragment(R.layout.fragment_sample) {

    private val binding: FragmentSampleBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvFragmentTitle.text = getString(R.string.sample_fragment_title)
        binding.btnFragmentSample.text = getString(R.string.sample_fragment_button)

        binding.btnFragmentSample.setOnClickListener {
            Toast.makeText(context, "Sample Fragment Button Clicked", Toast.LENGTH_SHORT).show()
        }

        binding.btnSample.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }
    }
}