package com.example.programmercalculatorchallenge

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var decimalInputField: TextInputEditText
    private lateinit var binaryInputField: TextInputEditText
    private lateinit var octalInputField: TextInputEditText
    private lateinit var hexadecimalInputField: TextInputEditText
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decimalInputField = findViewById(R.id.decimalInputField)
        binaryInputField = findViewById(R.id.binaryInputField)
        octalInputField = findViewById(R.id.octalInputField)
        hexadecimalInputField = findViewById(R.id.hexadecimalInputField)
        clearButton = findViewById(R.id.clear_btn)

        clearButton.setOnClickListener {
            clearData()
        }

        decimalConverter()
    }

    private fun clearData() {
        decimalInputField.text?.clear()
        binaryInputField.text?.clear()
        octalInputField.text?.clear()
        hexadecimalInputField.text?.clear()
    }

    private fun decimalConverter() {
        decimalInputField.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binaryInputField.setText(s.toString().toIntOrNull()?.toString(2))
                octalInputField.setText(s.toString().toIntOrNull()?.toString(8))
                hexadecimalInputField.setText(
                    s.toString().toIntOrNull()?.toString(16)?.uppercase()
                )
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable?) {}

        })
    }

    private fun binaryConverter() {
        decimalInputField.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable?) {}

        })
    }

    private fun octalConverter() {
        decimalInputField.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable?) {}

        })
    }

    private fun hexadecimalConverter() {
        decimalInputField.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable?) {}

        })
    }
}