package com.delta.security.response

class JwtResponse {
    var id: String? = null
    var fullName: String? = null
    var organization: String? = null
    var username: String? = null
    var mobile: String? = null
    var role:String? = null
    var token: String? = null
    var type = "Bearer"

    constructor() : super() {
    }

    constructor(
        id: String?, fullName: String?, organization: String?, username: String?,
        mobile: String?, role: String?, token: String?, type: String
    ) : super() {
        this.id = id
        this.fullName = fullName
        this.organization = organization
        this.username = username
        this.mobile = mobile
        this.role = role
        this.token = token
        this.type = type
    }

    constructor(id: String?, fullName: String?, username: String?, token: String?) : super() {
        this.id = id
        this.fullName = fullName
        this.username = username
        this.token = token
    }
}