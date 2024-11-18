package id.ac.polbeng.srimulyaniadha.onlineservice.models

data class LoginResponse (
    val message: String,
    val error: Boolean,
    val data: User
)