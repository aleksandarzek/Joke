package me.aleksandarzekovic.joke.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.aleksandarzekovic.joke.di.modules.AppModule
import me.aleksandarzekovic.joke.di.modules.CategoryJokeModule
import me.aleksandarzekovic.joke.di.modules.JokeModule
import me.aleksandarzekovic.joke.di.modules.NetworkModule
import me.aleksandarzekovic.joke.utils.daggerawareviewmodel.ViewModelBuilder
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, NetworkModule::class, AppModule::class, JokeModule::class, CategoryJokeModule::class, ViewModelBuilder::class])
interface AppComponent : AndroidInjector<JokeApplication> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<JokeApplication>
}