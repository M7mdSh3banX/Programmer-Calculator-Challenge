package com.example.programmercalculatorchallenge

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var decimalInputField: TextInputEditText
    private lateinit var binaryInputField: TextInputEditText
    private lateinit var octalInputField: TextInputEditText
    private lateinit var hexadecimalInputField: TextInputEditText
    private lateinit var calculateButton: Button
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decimalInputField = findViewById(R.id.decimalInputField)
        binaryInputField = findViewById(R.id.binaryInputField)
        octalInputField = findViewById(R.id.octalInputField)
        hexadecimalInputField = findViewById(R.id.hexadecimalInputField)
        calculateButton = findViewById(R.id.calculate_btn)
        clearButton = findViewById(R.id.clear_btn)

        clearButton.setOnClickListener {
            clearData()
        }
    }

    private fun clearData() {
        decimalInputField.text?.clear()
        binaryInputField.text?.clear()
        octalInputField.text?.clear()
        hexadecimalInputField.text?.clear()
    }
}