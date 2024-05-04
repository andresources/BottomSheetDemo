package com.bottomsheetdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bottomsheetdemo.databinding.ActivityMainBinding
import com.bottomsheetdemo.databinding.BottomSheetDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }
    private fun initViews(){
        with(binding){
            btnShow.setOnClickListener {
                createBottomSheetUI()
            }
        }
    }
    private fun createBottomSheetUI() {
        val dialog = BottomSheetDialog(this@MainActivity)
        val bottomSheetDialogBinding =
            BottomSheetDialogBinding.inflate(layoutInflater)
        dialog.setContentView(bottomSheetDialogBinding.root)
        dialog.show()
    }
}