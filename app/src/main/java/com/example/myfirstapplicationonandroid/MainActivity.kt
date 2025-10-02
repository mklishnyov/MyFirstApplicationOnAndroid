package com.example.myfirstapplicationonandroid

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myfirstapplicationonandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var count = 0

        binding.BecomeRichBtn.setOnClickListener {
            when (count) {
                0 -> {
                    binding.RichImage.setImageResource(R.drawable.ic_im_rich_image)
                    binding.BecomeRichBtn.text = "Become even richer"
                    count++
                }
                1 -> {
                    binding.RichImage.setImageResource(R.drawable.ic_im_rich_image_oc)
                    binding.BecomeRichBtn.visibility = View.GONE
                    count++
                }
            }
        }

    }
}