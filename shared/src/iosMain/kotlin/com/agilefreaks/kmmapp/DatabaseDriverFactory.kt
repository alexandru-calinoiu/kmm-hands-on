package com.agilefreaks.kmmapp

import com.agilefreaks.kmmapp.cache.AppDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver = NativeSqliteDriver(AppDatabase.Schema, "test.db")
}