package me.aleksandarzekovic.joke.ui.categoryjoke

interface CategoryJokeListener<T> {
    fun clickCategoryJoke(model: T)
}