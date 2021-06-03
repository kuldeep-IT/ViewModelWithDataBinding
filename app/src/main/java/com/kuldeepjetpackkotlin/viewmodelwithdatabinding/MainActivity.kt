package com.kuldeepjetpackkotlin.viewmodelwithdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.kuldeepjetpackkotlin.viewmodelwithdatabinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainAcViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

//        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainAcViewModel::class.java)

        binding.lifecycleOwner = this //replacement of observe

        binding.myViewModelXML = viewModel


//        viewModel.count.observe(this, Observer {
//
//            binding.textView.text = it.toString()
//
//        })



    }
}