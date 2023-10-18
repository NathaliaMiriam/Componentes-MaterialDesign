package com.nm.componentes_materialdesign

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nm.componentes_materialdesign.databinding.ActivityButtonsBinding

// sempre que criar uma Activity, declará-la no AndroidManifest: Alt + Enter sob o nome da classe (ButtonsActivity) e escolher a opção de declarar no Manifest

class ButtonsActivity : AppCompatActivity() {

    // função lâmbida que busca o meu layout 'activity_buttons' e infla
    private val binding by lazy { ActivityButtonsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, ButtonsActivity::class.java)

    }
}