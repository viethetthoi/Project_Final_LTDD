package com.example.newapp_project.db

import androidx.room.TypeConverter
import com.example.newapp_project.models.Source
import com.google.gson.Gson

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        // Ví dụ: Chuyển đổi Source thành một chuỗi JSON
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        // Ví dụ: Chuyển đổi chuỗi JSON thành đối tượng Source
        return Source(name, name)
    }
}
//class Converters {
//    @TypeConverter
//    fun fromSource(source: Source): String {
//        // Ví dụ: Chuyển đổi Source thành một chuỗi JSON
//        return Gson().toJson(source)
//    }
//
//    @TypeConverter
//    fun toSource(json: String): Source {
//        // Ví dụ: Chuyển đổi chuỗi JSON thành đối tượng Source
//        return Gson().fromJson(json, Source::class.java)
//    }
//}
