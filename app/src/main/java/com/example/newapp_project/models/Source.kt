
package com.example.newapp_project.models

import java.io.Serializable

data class Source(
    val id: String?,
    val name: String
) : Serializable {
    override fun hashCode(): Int {
        return id?.hashCode() ?: 0 * 31 + name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Source) return false
        return id == other.id && name == other.name
    }
}

