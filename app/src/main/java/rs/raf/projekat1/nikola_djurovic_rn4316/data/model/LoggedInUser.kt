package rs.raf.projekat1.nikola_djurovic_rn4316.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val userName: String
)