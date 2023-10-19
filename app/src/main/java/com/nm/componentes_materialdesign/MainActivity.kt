package com.nm.componentes_materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nm.componentes_materialdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // função lâmbida que busca o meu layout 'activity_main' e infla
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar) // configura a Toolbar

        supportActionBar?.title = "Componentes - Material Design" // define o título na Toolbar

        insertListeners()
    }

    // função dos cliques dos botões
    private fun insertListeners() {
        binding.cvButtons.setOnClickListener {
            startActivity(ButtonsActivity.createIntent(this))
        }

        binding.cvTextFields.setOnClickListener {
            startActivity(TextFieldsActivity.createIntent(this))
        }
    }
}