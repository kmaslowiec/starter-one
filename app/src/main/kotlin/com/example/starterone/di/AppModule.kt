package com.example.starterone.di

import com.example.starterone.data.DataSet
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
//TODO Please replace the component depends on your needs
@InstallIn(ViewModelComponent::class)
object AppModule {

    //TODO This is just example. Please delete
    @Provides
    fun provideDataSet(): DataSet {
        return DataSet(listOf("January", "February", "March"))
    }
}
