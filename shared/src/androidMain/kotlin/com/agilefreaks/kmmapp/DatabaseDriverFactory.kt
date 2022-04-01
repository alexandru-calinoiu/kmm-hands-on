package com.agilefreaks.kmmapp

import android.content.Context
import com.agilefreaks.kmmapp.cache.AppDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver = AndroidSqliteDriver(AppDatabase.Schema, context, "test.db")
}