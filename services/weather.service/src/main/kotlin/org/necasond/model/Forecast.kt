package org.necasond.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param plantId 
 * @param forecast 
 */
data class Forecast(

    @Schema(example = "Solar-park-Prerov", description = "")
    @get:JsonProperty("plantId") val plantId: kotlin.String? = null,

    @Schema(example = "Sunny", description = "")
    @get:JsonProperty("forecast") val forecast: kotlin.String? = null
) {

}

