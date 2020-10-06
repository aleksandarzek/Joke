package me.aleksandarzekovic.joke.di.modules

import android.content.Context
import dagger.Binds
import dagger.Module
import me.aleksandarzekovic.joke.di.JokeApplication
import javax.inject.Singleton


@Module
abstract class AppModule {
    @Singleton
    @Binds
    abstract fun context(appInstance: JokeApplication): Context
}