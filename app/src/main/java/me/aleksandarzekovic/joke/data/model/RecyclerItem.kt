package me.aleksandarzekovic.joke.data.model

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding

data class RecyclerItem(
    val data: Any,
    @LayoutRes val layoutId: Int,
    val variableId: Int,
    val clickListener: Any,
    val listenerId: Int
) {
    fun bind(binding: ViewDataBinding) {
        binding.setVariable(variableId, data)
        binding.setVariable(listenerId, clickListener)
    }
}