package com.example.myapplication

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.features.bookmarks_screen.data.local.BookmarkDAO
import com.example.myapplication.features.bookmarks_screen.data.local.BookmarksEntity

@Database(entities = [BookmarksEntity::class], version = 2)
abstract class AppDataBase : RoomDatabase() {
    abstract fun bookmarksDAO() : BookmarkDAO
}