package com.jk.tourguide.component.languagedialog

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jk.tourguide.databinding.ItemListBinding
import com.jk.tourguide.extention.LanguageType
import com.jk.tourguide.extention.Resource
import com.jk.tourguide.mvvm.BaseRVAdapter

class LanguageAdapter(
    context: Context,
    private val resource: Resource<List<LanguageType>>,
    private val onItemClick: (String) -> Unit
) : BaseRVAdapter<LanguageType>(context, resource) {

    override fun createDataViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LanguageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is LanguageViewHolder && resource.data != null) {
            holder.bind(resource.data[position])
        }
    }

    inner class LanguageViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(language: LanguageType) {
            binding.tvName.text = binding.root.context.getString(language.displayName)
            binding.root.setOnClickListener {
                onItemClick(language.value)
            }
        }
    }
}
