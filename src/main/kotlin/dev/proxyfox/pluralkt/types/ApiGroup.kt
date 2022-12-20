package dev.proxyfox.pluralkt.types

import dev.proxyfox.pluralkt.*
import kotlinx.serialization.*

@Serializable
class ApiGroup : ApiType {
    val id: PkId = ""
    val uuid: PkUuid = ""
    val created: PkTimestamp = ""
    var name: String = ""
    @SerialName("display_name")
    var displayName: String? = null
    var color: PkColor = null
    var icon: String? = null
    var banner: String? = null
    var description: String? = null

    override fun toString(): String = PluralKt.json.encodeToString(this)
}