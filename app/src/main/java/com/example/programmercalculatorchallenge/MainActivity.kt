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

        viewsId()

        clearButton.setOnClickListener {
            clearData()
        }

        converters()
    }

    private fun viewsId() {
        decimalInputField = findViewById(R.id.decimalInputField)
        binaryInputField = findViewById(R.id.binaryInputField)
        octalInputField = findViewById(R.id.octalInputField)
        hexadecimalInputField = findViewById(R.id.hexadecimalInputField)
        clearButton = findViewById(R.id.clear_btn)
    }

    private fun clearData() {
        decimalInputField.text?.clear()
        binaryInputField.text?.clear()
        octalInputField.text?.clear()
        hexadecimalInputField.text?.clear()
    }

    private fun converters() {
        decimalConverter()
        binaryConverter()
        octalConverter()
        hexadecimalConverter()
    }

    private fun decimalConverter() {
        decimalInputField.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (decimalInputField.hasFocus()) {
                    val decimal = s.toString().toLongOrNull(10) ?: return

                    binaryInputField.setText(decimal.toString(2))
                    octalInputField.setText(decimal.toString(8))
                    hexadecimalInputField.setText(decimal.toString(16).uppercase())
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable?) {}

        })
    }

    private fun binaryConverter() {
        binaryInputField.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binaryInputField.hasFocus()) {
                    val binary = s.toString().toULongOrNull(2) ?: return

                    decimalInputField.setText(binary.toString(10))
                    octalInputField.setText(binary.toString(8))
                    hexadecimalInputField.setText(binary.toString(16).uppercase())
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable?) {}

        })
    }

    private fun octalConverter() {
        octalInputField.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (octalInputField.hasFocus()) {
                    val octal = s.toString().toULongOrNull(8) ?: return

                    decimalInputField.setText(octal.toString(10))
                    binaryInputField.setText(octal.toString(2))
                    hexadecimalInputField.setText(octal.toString(16).uppercase())
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable?) {}

        })
    }

    private fun hexadecimalConverter() {
        hexadecimalInputField.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (hexadecimalInputField.hasFocus()) {
                    val hexadecimal = s.toString().toULongOrNull(16) ?: return

                    decimalInputField.setText(hexadecimal.toString(10))
                    binaryInputField.setText(hexadecimal.toString(2))
                    octalInputField.setText(hexadecimal.toString(8))
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable?) {}

        })
    }
}