package dev.proxyfox.pluralkt.types

import dev.proxyfox.pluralkt.*
import kotlinx.serialization.*

@Serializable
enum class AutoProxyMode {
    @SerialName("off") OFF,
    @SerialName("front") FRONT,
    @SerialName("latch") LATCH,
    @SerialName("member") MEMBER
}