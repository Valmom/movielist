package webclient.service

import webclient.IMDB_API_KEY
import webclient.model.Top250Data
import retrofit2.http.GET

interface MovieService {

    @GET(IMDB_API_KEY)
    suspend fun findTop250Movies(): Top250Data

}