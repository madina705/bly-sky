import com.google.gson.annotations.SerializedName

data class Minutely(

    @field:SerializedName("summary")
    val summary: String? = null,

    @field:SerializedName("data")
    val data: List<Daily?>? = null,

    @field:SerializedName("icon")
    val icon: String? = null
)