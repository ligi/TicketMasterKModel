package org.ligi.ticketmasterkmodel.api

import com.squareup.moshi.Json
import ticketmastertest.Venue

data class VenueSearchResultContent(val venues:List<Venue>)

data class VenueSearchResult(
        @Json(name = "_embedded")
        val content: VenueSearchResultContent
)
