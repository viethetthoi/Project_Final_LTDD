package com.example.newapp_project.db

import androidx.room.TypeConverter
import com.example.newapp_project.models.Source
import com.google.gson.Gson

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}

