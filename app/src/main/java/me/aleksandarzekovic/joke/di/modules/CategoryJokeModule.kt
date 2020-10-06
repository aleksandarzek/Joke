package me.aleksandarzekovic.joke.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.aleksandarzekovic.joke.ui.categoryjoke.CategoryJokeFragment

@Module
abstract class CategoryJokeModule {

    @ContributesAndroidInjector
    abstract fun contributeCategoryJokeFragment(): CategoryJokeFragment

}