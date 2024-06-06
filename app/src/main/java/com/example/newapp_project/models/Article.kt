
package com.example.newapp_project.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.Objects

@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
) : Serializable {
    override fun hashCode(): Int {
        return Objects.hash(id, author, content, description, publishedAt, source, title, url, urlToImage)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Article) return false
        return id == other.id &&
                author == other.author &&
                content == other.content &&
                description == other.description &&
                publishedAt == other.publishedAt &&
                source == other.source &&
                title == other.title &&
                url == other.url &&
                urlToImage == other.urlToImage
    }
}
