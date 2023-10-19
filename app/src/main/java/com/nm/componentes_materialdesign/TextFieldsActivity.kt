package com.nm.componentes_materialdesign

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nm.componentes_materialdesign.databinding.ActivityTextFieldsBinding

// sempre que criar uma Activity, declará-la no AndroidManifest: Alt + Enter sob o nome da classe (TextFieldsActivity) e escolher a opção de declarar no Manifest

class TextFieldsActivity : AppCompatActivity() {

    // função lâmbida que busca o meu layout 'activity_text_fields' e infla
    private val binding by lazy { ActivityTextFieldsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.inputError.error = "campo obrigatório" // seta o input de erro ... p ver funcionando é necessário rodar o app no emulador
    }

    // cria a intenção
    companion object {
        fun createIntent(context: Context): Intent = Intent(context, TextFieldsActivity::class.java)

    }
}