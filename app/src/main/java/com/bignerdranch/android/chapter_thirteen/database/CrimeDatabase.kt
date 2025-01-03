package com.bignerdranch.android.chapter_thirteen.database

import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bignerdranch.android.chapter_thirteen.Crime
import androidx.room.Database as Database


@Database(entities = [Crime::class], version = 1)
@TypeConverters(CrimeTypeConverters::class)

abstract class CrimeDatabase: RoomDatabase() {

    abstract fun crimeDao(): CrimeDao
}