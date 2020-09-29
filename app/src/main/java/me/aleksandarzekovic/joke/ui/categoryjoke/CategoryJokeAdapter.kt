package me.aleksandarzekovic.joke.ui.categoryjoke


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import me.aleksandarzekovic.joke.BR
import me.aleksandarzekovic.joke.R
import me.aleksandarzekovic.joke.data.model.CategoryJoke
import me.aleksandarzekovic.joke.databinding.ItemCategoryBinding

class CategoryJokeAdapter (private val listCategoryJoke: List<CategoryJoke>) : RecyclerView.Adapter<CategoryJokeAdapter.ViewHolder>() {

    private lateinit var binding: ItemCategoryBinding

    inner class ViewHolder(private var binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(obj: Any?){
            binding.setVariable(BR.model, obj)
            binding.executePendingBindings()

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_category,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var list = listCategoryJoke.get(position)
        list.let {
            holder.bind(it)
        }
    }

    override fun getItemCount(): Int {
        return listCategoryJoke.size
    }


}