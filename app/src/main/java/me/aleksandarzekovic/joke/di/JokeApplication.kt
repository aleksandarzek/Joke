package me.aleksandarzekovic.joke.di

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class JokeApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}