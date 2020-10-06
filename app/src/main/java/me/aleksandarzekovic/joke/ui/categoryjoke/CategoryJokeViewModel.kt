package me.aleksandarzekovic.joke.ui.categoryjoke

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.aleksandarzekovic.joke.data.model.CategoryJoke

class CategoryJokeViewModel : ViewModel(), CategoryJokeListener<CategoryJoke> {
    val data = MutableLiveData<ArrayList<CategoryJoke>>()
    val categoryJokeListener: CategoryJokeListener<CategoryJoke> = this
    val clickData = MutableLiveData<CategoryJoke>()

    init {
        loadData()
    }

    private fun loadData() {
        val test = ArrayList<CategoryJoke>()
        test.add(CategoryJoke("Any"))
        test.add(CategoryJoke("Miscellaneous"))
        test.add(CategoryJoke("Programming"))
        test.add(CategoryJoke("Dark"))
        test.add(CategoryJoke("Pun"))
        data.value = test
    }

    override fun clickCategoryJoke(model: CategoryJoke) {
        clickData.value = model
    }

    fun resetData() {
        clickData.value = null
    }


}