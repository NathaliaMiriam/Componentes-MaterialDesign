package com.nm.componentes_materialdesign.extensions

import android.content.Context
import android.widget.Toast

// fun para as mensagens que aparecem ao clicar nos ícones do App
fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}