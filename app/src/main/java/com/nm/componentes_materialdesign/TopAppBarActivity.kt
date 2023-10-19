package com.nm.componentes_materialdesign

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nm.componentes_materialdesign.databinding.ActivityAppBarBinding
import com.nm.componentes_materialdesign.extensions.toast

// sempre que criar uma Activity, declará-la no AndroidManifest: Alt + Enter sob o nome da classe (TextFieldsActivity) e escolher a opção de declarar no Manifest

class TopAppBarActivity : AppCompatActivity() {

    // função lâmbida que busca o meu layout 'activity_' e infla
    private val binding by lazy { ActivityAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.topAppBar.setNavigationOnClickListener {
            toast("Clicou no menu de navegação.")
        }

        // para acessar as opções de cada ícone do menu
        binding.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.favorite -> {
                    toast("favorite")
                    true
                }
                R.id.search -> {
                    toast("search")
                    true
                }
                R.id.more -> {
                    toast("more")
                    true
                }
                else -> false // se nenhum dos ícones for clicado é retornado falso
            }
        }
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, TopAppBarActivity::class.java)
    }
}