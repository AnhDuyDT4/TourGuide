package com.jk.tourguide.component.languagedialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.jk.tourguide.R
import com.jk.tourguide.databinding.DialogLanguageSelectionBinding
import com.jk.tourguide.extention.LanguageType
import com.jk.tourguide.extention.Resource

class LanguageSelectionDialog(
    context: Context,
    private val onItemClick: (String) -> Unit
) : Dialog(context, R.style.TransparentDialog) {

    private lateinit var binding: DialogLanguageSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogLanguageSelectionBinding.inflate(LayoutInflater.from(context))
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        val languages = generateLanguageList()
        val adapter = LanguageAdapter(context, Resource.success(languages)){ selectedLanguage ->
            dismiss()
            onItemClick(selectedLanguage)
        }
        binding.languageListView.adapter = adapter

        binding.btnClose.setOnClickListener {
            dismiss()
        }
    }

    private fun generateLanguageList(): List<LanguageType> {

        return listOf(
            LanguageType.ENGLISH,
            LanguageType.JAPAN,
            LanguageType.VIETNAM,
            LanguageType.TAIWAN,
            LanguageType.CHINA,
            LanguageType.SPANISH
        )
    }
}