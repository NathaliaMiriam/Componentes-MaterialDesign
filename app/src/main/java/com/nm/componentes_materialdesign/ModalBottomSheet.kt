package com.nm.componentes_materialdesign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.nm.componentes_materialdesign.databinding.BottomSheetModalBinding

// por ser um Fragment não é necessário add no Manifest

class ModalBottomSheet : BottomSheetDialogFragment() {

    // função lâmbida que busca o meu layout 'bottom_sheet_modal' e infla ... foi feito desta maneira, pois o Fragment não tem um contexto
    private val binding by lazy {
        BottomSheetModalBinding.inflate(LayoutInflater.from(requireContext()))
    }

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        return binding.root
    }

    companion object {
        private const val TAG = "ModalBottomSheet"

        fun start(manager: FragmentManager) { // recebe um 'FragmentManager' q vai ser responsável por tirar e colocar o Fragment quando necessário
            ModalBottomSheet().show(manager, TAG)
        }
    }
}