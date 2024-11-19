package id.ac.polbeng.srimulyaniadha.onlineservice.models

data class JasaResponse (
    val message: String,
    val error: Boolean,
    val data: ArrayList<Jasa>
)
