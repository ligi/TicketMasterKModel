package ticketmastertest

import org.ligi.ticketmasterkmodel.data.Country

data class Venue(
        val name: String,
        val social: Social?,
        val country: Country?,
        val test: Boolean
)
