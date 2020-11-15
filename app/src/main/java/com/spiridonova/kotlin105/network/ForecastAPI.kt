package com.spiridonova.kotlin105.network

import android.os.Parcel
import android.os.Parcelable
import com.fasterxml.jackson.annotation.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import java.io.Serializable


interface ForecastAPI {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(
        "temp",
        "temp_min",
        "feels_like",
        "icon",
        "condition",
        "wind_speed",
        "wind_gust",
        "wind_dir",
        "pressure_mm",
        "pressure_pa",
        "humidity",
        "prec_type",
        "prec_strength",
        "cloudness"
    )
    class DayShort {
        @get:JsonProperty("temp")
        @set:JsonProperty("temp")
        @JsonProperty("temp")
        var temp: Int? = null

        @get:JsonProperty("temp_min")
        @set:JsonProperty("temp_min")
        @JsonProperty("temp_min")
        var tempMin: Int? = null

        @get:JsonProperty("feels_like")
        @set:JsonProperty("feels_like")
        @JsonProperty("feels_like")
        var feelsLike: Int? = null

        @get:JsonProperty("icon")
        @set:JsonProperty("icon")
        @JsonProperty("icon")
        var icon: String? = null

        @get:JsonProperty("condition")
        @set:JsonProperty("condition")
        @JsonProperty("condition")
        var condition: String? = null

        @get:JsonProperty("wind_speed")
        @set:JsonProperty("wind_speed")
        @JsonProperty("wind_speed")
        var windSpeed: Double? = null

        @get:JsonProperty("wind_gust")
        @set:JsonProperty("wind_gust")
        @JsonProperty("wind_gust")
        var windGust: Double? = null

        @get:JsonProperty("wind_dir")
        @set:JsonProperty("wind_dir")
        @JsonProperty("wind_dir")
        var windDir: String? = null

        @get:JsonProperty("pressure_mm")
        @set:JsonProperty("pressure_mm")
        @JsonProperty("pressure_mm")
        var pressureMm: Int? = null

        @get:JsonProperty("pressure_pa")
        @set:JsonProperty("pressure_pa")
        @JsonProperty("pressure_pa")
        var pressurePa: Int? = null

        @get:JsonProperty("humidity")
        @set:JsonProperty("humidity")
        @JsonProperty("humidity")
        var humidity: Int? = null

        @get:JsonProperty("prec_type")
        @set:JsonProperty("prec_type")
        @JsonProperty("prec_type")
        var precType: Int? = null

        @get:JsonProperty("prec_strength")
        @set:JsonProperty("prec_strength")
        @JsonProperty("prec_strength")
        var precStrength: Double? = null

        @get:JsonProperty("cloudness")
        @set:JsonProperty("cloudness")
        @JsonProperty("cloudness")
        var cloudness: Int? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(
        "temp_min",
        "temp_max",
        "temp_avg",
        "feels_like",
        "icon",
        "condition",
        "daytime",
        "polar",
        "wind_speed",
        "wind_dir",
        "pressure_mm",
        "pressure_pa",
        "humidity",
        "prec_mm",
        "prec_period",
        "prec_type",
        "prec_strength",
        "cloudness"
    )
    class Evening {
        @get:JsonProperty("temp_min")
        @set:JsonProperty("temp_min")
        @JsonProperty("temp_min")
        var tempMin: Int? = null

        @get:JsonProperty("temp_max")
        @set:JsonProperty("temp_max")
        @JsonProperty("temp_max")
        var tempMax: Int? = null

        @get:JsonProperty("temp_avg")
        @set:JsonProperty("temp_avg")
        @JsonProperty("temp_avg")
        var tempAvg: Int? = null

        @get:JsonProperty("feels_like")
        @set:JsonProperty("feels_like")
        @JsonProperty("feels_like")
        var feelsLike: Int? = null

        @get:JsonProperty("icon")
        @set:JsonProperty("icon")
        @JsonProperty("icon")
        var icon: String? = null

        @get:JsonProperty("condition")
        @set:JsonProperty("condition")
        @JsonProperty("condition")
        var condition: String? = null

        @get:JsonProperty("daytime")
        @set:JsonProperty("daytime")
        @JsonProperty("daytime")
        var daytime: String? = null

        @get:JsonProperty("polar")
        @set:JsonProperty("polar")
        @JsonProperty("polar")
        var polar: Boolean? = null

        @get:JsonProperty("wind_speed")
        @set:JsonProperty("wind_speed")
        @JsonProperty("wind_speed")
        var windSpeed: Double? = null

        @get:JsonProperty("wind_dir")
        @set:JsonProperty("wind_dir")
        @JsonProperty("wind_dir")
        var windDir: String? = null

        @get:JsonProperty("pressure_mm")
        @set:JsonProperty("pressure_mm")
        @JsonProperty("pressure_mm")
        var pressureMm: Int? = null

        @get:JsonProperty("pressure_pa")
        @set:JsonProperty("pressure_pa")
        @JsonProperty("pressure_pa")
        var pressurePa: Int? = null

        @get:JsonProperty("humidity")
        @set:JsonProperty("humidity")
        @JsonProperty("humidity")
        var humidity: Int? = null

        @get:JsonProperty("prec_mm")
        @set:JsonProperty("prec_mm")
        @JsonProperty("prec_mm")
        var precMm: Double? = null

        @get:JsonProperty("prec_period")
        @set:JsonProperty("prec_period")
        @JsonProperty("prec_period")
        var precPeriod: Int? = null

        @get:JsonProperty("prec_type")
        @set:JsonProperty("prec_type")
        @JsonProperty("prec_type")
        var precType: Int? = null

        @get:JsonProperty("prec_strength")
        @set:JsonProperty("prec_strength")
        @JsonProperty("prec_strength")
        var precStrength: Double? = null

        @get:JsonProperty("cloudness")
        @set:JsonProperty("cloudness")
        @JsonProperty("cloudness")
        var cloudness: Double? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder("now", "now_dt", "info", "fact", "forecasts")
    class Example {
        @get:JsonProperty("now")
        @set:JsonProperty("now")
        @JsonProperty("now")
        var now: Int? = null

        @get:JsonProperty("now_dt")
        @set:JsonProperty("now_dt")
        @JsonProperty("now_dt")
        var nowDt: String? = null

        @get:JsonProperty("info")
        @set:JsonProperty("info")
        @JsonProperty("info")
        var info: Info? = null

        @get:JsonProperty("fact")
        @set:JsonProperty("fact")
        @JsonProperty("fact")
        var fact: Fact? = null

        @get:JsonProperty("forecasts")
        @set:JsonProperty("forecasts")
        @JsonProperty("forecasts")
        var forecasts: List<Forecast>? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(
        "temp",
        "feels_like",
        "icon",
        "condition",
        "wind_speed",
        "wind_gust",
        "wind_dir",
        "pressure_mm",
        "pressure_pa",
        "humidity",
        "daytime",
        "polar",
        "season",
        "prec_type",
        "prec_strength",
        "is_thunder",
        "cloudness",
        "obs_time",
        "phenom_icon",
        "phenom-condition"
    )
    class Fact {
        @get:JsonProperty("temp")
        @set:JsonProperty("temp")
        @JsonProperty("temp")
        var temp: Int? = null

        @get:JsonProperty("feels_like")
        @set:JsonProperty("feels_like")
        @JsonProperty("feels_like")
        var feelsLike: Int? = null

        @get:JsonProperty("icon")
        @set:JsonProperty("icon")
        @JsonProperty("icon")
        var icon: String? = null

        @get:JsonProperty("condition")
        @set:JsonProperty("condition")
        @JsonProperty("condition")
        var condition: String? = null

        @get:JsonProperty("wind_speed")
        @set:JsonProperty("wind_speed")
        @JsonProperty("wind_speed")
        var windSpeed: Int? = null

        @get:JsonProperty("wind_gust")
        @set:JsonProperty("wind_gust")
        @JsonProperty("wind_gust")
        var windGust: Double? = null

        @get:JsonProperty("wind_dir")
        @set:JsonProperty("wind_dir")
        @JsonProperty("wind_dir")
        var windDir: String? = null

        @get:JsonProperty("pressure_mm")
        @set:JsonProperty("pressure_mm")
        @JsonProperty("pressure_mm")
        var pressureMm: Int? = null

        @get:JsonProperty("pressure_pa")
        @set:JsonProperty("pressure_pa")
        @JsonProperty("pressure_pa")
        var pressurePa: Int? = null

        @get:JsonProperty("humidity")
        @set:JsonProperty("humidity")
        @JsonProperty("humidity")
        var humidity: Int? = null

        @get:JsonProperty("daytime")
        @set:JsonProperty("daytime")
        @JsonProperty("daytime")
        var daytime: String? = null

        @get:JsonProperty("polar")
        @set:JsonProperty("polar")
        @JsonProperty("polar")
        var polar: Boolean? = null

        @get:JsonProperty("season")
        @set:JsonProperty("season")
        @JsonProperty("season")
        var season: String? = null

        @get:JsonProperty("prec_type")
        @set:JsonProperty("prec_type")
        @JsonProperty("prec_type")
        var precType: Int? = null

        @get:JsonProperty("prec_strength")
        @set:JsonProperty("prec_strength")
        @JsonProperty("prec_strength")
        var precStrength: Double? = null

        @get:JsonProperty("is_thunder")
        @set:JsonProperty("is_thunder")
        @JsonProperty("is_thunder")
        var isThunder: Boolean? = null

        @get:JsonProperty("cloudness")
        @set:JsonProperty("cloudness")
        @JsonProperty("cloudness")
        var cloudness: Int? = null

        @get:JsonProperty("obs_time")
        @set:JsonProperty("obs_time")
        @JsonProperty("obs_time")
        var obsTime: Int? = null

        @get:JsonProperty("phenom_icon")
        @set:JsonProperty("phenom_icon")
        @JsonProperty("phenom_icon")
        var phenomIcon: String? = null

        @get:JsonProperty("phenom-condition")
        @set:JsonProperty("phenom-condition")
        @JsonProperty("phenom-condition")
        var phenomCondition: String? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(
        "date",
        "date_ts",
        "week",
        "sunrise",
        "sunset",
        "moon_code",
        "moon_text",
        "parts",
        "hours"
    )
    class Forecast() :Serializable, Parcelable {
        @get:JsonProperty("date")
        @set:JsonProperty("date")
        @JsonProperty("date")
        var date: String? = null

        @get:JsonProperty("date_ts")
        @set:JsonProperty("date_ts")
        @JsonProperty("date_ts")
        var dateTs: Int? = null

        @get:JsonProperty("week")
        @set:JsonProperty("week")
        @JsonProperty("week")
        var week: Int? = null

        @get:JsonProperty("sunrise")
        @set:JsonProperty("sunrise")
        @JsonProperty("sunrise")
        var sunrise: String? = null

        @get:JsonProperty("sunset")
        @set:JsonProperty("sunset")
        @JsonProperty("sunset")
        var sunset: String? = null

        @get:JsonProperty("moon_code")
        @set:JsonProperty("moon_code")
        @JsonProperty("moon_code")
        var moonCode: Int? = null

        @get:JsonProperty("moon_text")
        @set:JsonProperty("moon_text")
        @JsonProperty("moon_text")
        var moonText: String? = null

        @get:JsonProperty("parts")
        @set:JsonProperty("parts")
        @JsonProperty("parts")
        var parts: Parts? = null

        @get:JsonProperty("hours")
        @set:JsonProperty("hours")
        @JsonProperty("hours")
        var hours: List<Hour>? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()

        constructor(parcel: Parcel) : this() {
            date = parcel.readString()
            dateTs = parcel.readValue(Int::class.java.classLoader) as? Int
            week = parcel.readValue(Int::class.java.classLoader) as? Int
            sunrise = parcel.readString()
            sunset = parcel.readString()
            moonCode = parcel.readValue(Int::class.java.classLoader) as? Int
            moonText = parcel.readString()
        }

        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeString(date)
            parcel.writeValue(dateTs)
            parcel.writeValue(week)
            parcel.writeString(sunrise)
            parcel.writeString(sunset)
            parcel.writeValue(moonCode)
            parcel.writeString(moonText)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Forecast> {
            override fun createFromParcel(parcel: Parcel): Forecast {
                return Forecast(parcel)
            }

            override fun newArray(size: Int): Array<Forecast?> {
                return arrayOfNulls(size)
            }
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(
        "hour",
        "hour_ts",
        "temp",
        "feels_like",
        "icon",
        "condition",
        "wind_speed",
        "wind_gust",
        "wind_dir",
        "pressure_mm",
        "pressure_pa",
        "humidity",
        "prec_mm",
        "prec_period",
        "prec_type",
        "prec_strength",
        "is_thunder",
        "cloudness"
    )
    class Hour {
        @get:JsonProperty("hour")
        @set:JsonProperty("hour")
        @JsonProperty("hour")
        var hour: String? = null

        @get:JsonProperty("hour_ts")
        @set:JsonProperty("hour_ts")
        @JsonProperty("hour_ts")
        var hourTs: Int? = null

        @get:JsonProperty("temp")
        @set:JsonProperty("temp")
        @JsonProperty("temp")
        var temp: Int? = null

        @get:JsonProperty("feels_like")
        @set:JsonProperty("feels_like")
        @JsonProperty("feels_like")
        var feelsLike: Int? = null

        @get:JsonProperty("icon")
        @set:JsonProperty("icon")
        @JsonProperty("icon")
        var icon: String? = null

        @get:JsonProperty("condition")
        @set:JsonProperty("condition")
        @JsonProperty("condition")
        var condition: String? = null

        @get:JsonProperty("wind_speed")
        @set:JsonProperty("wind_speed")
        @JsonProperty("wind_speed")
        var windSpeed: Double? = null

        @get:JsonProperty("wind_gust")
        @set:JsonProperty("wind_gust")
        @JsonProperty("wind_gust")
        var windGust: Double? = null

        @get:JsonProperty("wind_dir")
        @set:JsonProperty("wind_dir")
        @JsonProperty("wind_dir")
        var windDir: String? = null

        @get:JsonProperty("pressure_mm")
        @set:JsonProperty("pressure_mm")
        @JsonProperty("pressure_mm")
        var pressureMm: Int? = null

        @get:JsonProperty("pressure_pa")
        @set:JsonProperty("pressure_pa")
        @JsonProperty("pressure_pa")
        var pressurePa: Int? = null

        @get:JsonProperty("humidity")
        @set:JsonProperty("humidity")
        @JsonProperty("humidity")
        var humidity: Int? = null

        @get:JsonProperty("prec_mm")
        @set:JsonProperty("prec_mm")
        @JsonProperty("prec_mm")
        var precMm: Double? = null

        @get:JsonProperty("prec_period")
        @set:JsonProperty("prec_period")
        @JsonProperty("prec_period")
        var precPeriod: Int? = null

        @get:JsonProperty("prec_type")
        @set:JsonProperty("prec_type")
        @JsonProperty("prec_type")
        var precType: Int? = null

        @get:JsonProperty("prec_strength")
        @set:JsonProperty("prec_strength")
        @JsonProperty("prec_strength")
        var precStrength: Double? = null

        @get:JsonProperty("is_thunder")
        @set:JsonProperty("is_thunder")
        @JsonProperty("is_thunder")
        var isThunder: Boolean? = null

        @get:JsonProperty("cloudness")
        @set:JsonProperty("cloudness")
        @JsonProperty("cloudness")
        var cloudness: Int? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder("lat", "lon", "tzinfo", "def_pressure_mm", "def_pressure_pa", "url")
    class Info {
        @get:JsonProperty("lat")
        @set:JsonProperty("lat")
        @JsonProperty("lat")
        var lat: Double? = null

        @get:JsonProperty("lon")
        @set:JsonProperty("lon")
        @JsonProperty("lon")
        var lon: Double? = null

        @get:JsonProperty("tzinfo")
        @set:JsonProperty("tzinfo")
        @JsonProperty("tzinfo")
        var tzinfo: Tzinfo? = null

        @get:JsonProperty("def_pressure_mm")
        @set:JsonProperty("def_pressure_mm")
        @JsonProperty("def_pressure_mm")
        var defPressureMm: Int? = null

        @get:JsonProperty("def_pressure_pa")
        @set:JsonProperty("def_pressure_pa")
        @JsonProperty("def_pressure_pa")
        var defPressurePa: Int? = null

        @get:JsonProperty("url")
        @set:JsonProperty("url")
        @JsonProperty("url")
        var url: String? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(
        "temp_min",
        "temp_max",
        "temp_avg",
        "feels_like",
        "icon",
        "condition",
        "daytime",
        "polar",
        "wind_speed",
        "wind_gust",
        "wind_dir",
        "pressure_mm",
        "pressure_pa",
        "humidity",
        "prec_mm",
        "prec_period",
        "prec_type",
        "prec_strength",
        "cloudness"
    )
    class Night {
        @get:JsonProperty("temp_min")
        @set:JsonProperty("temp_min")
        @JsonProperty("temp_min")
        var tempMin: Int? = null

        @get:JsonProperty("temp_max")
        @set:JsonProperty("temp_max")
        @JsonProperty("temp_max")
        var tempMax: Int? = null

        @get:JsonProperty("temp_avg")
        @set:JsonProperty("temp_avg")
        @JsonProperty("temp_avg")
        var tempAvg: Int? = null

        @get:JsonProperty("feels_like")
        @set:JsonProperty("feels_like")
        @JsonProperty("feels_like")
        var feelsLike: Int? = null

        @get:JsonProperty("icon")
        @set:JsonProperty("icon")
        @JsonProperty("icon")
        var icon: String? = null

        @get:JsonProperty("condition")
        @set:JsonProperty("condition")
        @JsonProperty("condition")
        var condition: String? = null

        @get:JsonProperty("daytime")
        @set:JsonProperty("daytime")
        @JsonProperty("daytime")
        var daytime: String? = null

        @get:JsonProperty("polar")
        @set:JsonProperty("polar")
        @JsonProperty("polar")
        var polar: Boolean? = null

        @get:JsonProperty("wind_speed")
        @set:JsonProperty("wind_speed")
        @JsonProperty("wind_speed")
        var windSpeed: Double? = null

        @get:JsonProperty("wind_gust")
        @set:JsonProperty("wind_gust")
        @JsonProperty("wind_gust")
        var windGust: Int? = null

        @get:JsonProperty("wind_dir")
        @set:JsonProperty("wind_dir")
        @JsonProperty("wind_dir")
        var windDir: String? = null

        @get:JsonProperty("pressure_mm")
        @set:JsonProperty("pressure_mm")
        @JsonProperty("pressure_mm")
        var pressureMm: Int? = null

        @get:JsonProperty("pressure_pa")
        @set:JsonProperty("pressure_pa")
        @JsonProperty("pressure_pa")
        var pressurePa: Int? = null

        @get:JsonProperty("humidity")
        @set:JsonProperty("humidity")
        @JsonProperty("humidity")
        var humidity: Int? = null

        @get:JsonProperty("prec_mm")
        @set:JsonProperty("prec_mm")
        @JsonProperty("prec_mm")
        var precMm: Int? = null

        @get:JsonProperty("prec_period")
        @set:JsonProperty("prec_period")
        @JsonProperty("prec_period")
        var precPeriod: Int? = null

        @get:JsonProperty("prec_type")
        @set:JsonProperty("prec_type")
        @JsonProperty("prec_type")
        var precType: Int? = null

        @get:JsonProperty("prec_strength")
        @set:JsonProperty("prec_strength")
        @JsonProperty("prec_strength")
        var precStrength: Int? = null

        @get:JsonProperty("cloudness")
        @set:JsonProperty("cloudness")
        @JsonProperty("cloudness")
        var cloudness: Double? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder(
        "temp",
        "feels_like",
        "icon",
        "condition",
        "wind_speed",
        "wind_gust",
        "wind_dir",
        "pressure_mm",
        "pressure_pa",
        "humidity",
        "prec_type",
        "prec_strength",
        "cloudness"
    )
    class NightShort {
        @get:JsonProperty("temp")
        @set:JsonProperty("temp")
        @JsonProperty("temp")
        var temp: Int? = null

        @get:JsonProperty("feels_like")
        @set:JsonProperty("feels_like")
        @JsonProperty("feels_like")
        var feelsLike: Int? = null

        @get:JsonProperty("icon")
        @set:JsonProperty("icon")
        @JsonProperty("icon")
        var icon: String? = null

        @get:JsonProperty("condition")
        @set:JsonProperty("condition")
        @JsonProperty("condition")
        var condition: String? = null

        @get:JsonProperty("wind_speed")
        @set:JsonProperty("wind_speed")
        @JsonProperty("wind_speed")
        var windSpeed: Double? = null

        @get:JsonProperty("wind_gust")
        @set:JsonProperty("wind_gust")
        @JsonProperty("wind_gust")
        var windGust: Double? = null

        @get:JsonProperty("wind_dir")
        @set:JsonProperty("wind_dir")
        @JsonProperty("wind_dir")
        var windDir: String? = null

        @get:JsonProperty("pressure_mm")
        @set:JsonProperty("pressure_mm")
        @JsonProperty("pressure_mm")
        var pressureMm: Int? = null

        @get:JsonProperty("pressure_pa")
        @set:JsonProperty("pressure_pa")
        @JsonProperty("pressure_pa")
        var pressurePa: Int? = null

        @get:JsonProperty("humidity")
        @set:JsonProperty("humidity")
        @JsonProperty("humidity")
        var humidity: Int? = null

        @get:JsonProperty("prec_type")
        @set:JsonProperty("prec_type")
        @JsonProperty("prec_type")
        var precType: Int? = null

        @get:JsonProperty("prec_strength")
        @set:JsonProperty("prec_strength")
        @JsonProperty("prec_strength")
        var precStrength: Int? = null

        @get:JsonProperty("cloudness")
        @set:JsonProperty("cloudness")
        @JsonProperty("cloudness")
        var cloudness: Double? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder("night", "evening", "day_short", "night_short")
    class Parts {
        @get:JsonProperty("night")
        @set:JsonProperty("night")
        @JsonProperty("night")
        var night: Night? = null

        @get:JsonProperty("evening")
        @set:JsonProperty("evening")
        @JsonProperty("evening")
        var evening: Evening? = null

        @get:JsonProperty("day_short")
        @set:JsonProperty("day_short")
        @JsonProperty("day_short")
        var dayShort: DayShort? = null

        @get:JsonProperty("night_short")
        @set:JsonProperty("night_short")
        @JsonProperty("night_short")
        var nightShort: NightShort? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder("offset", "name", "abbr", "dst")
    class Tzinfo {
        @get:JsonProperty("offset")
        @set:JsonProperty("offset")
        @JsonProperty("offset")
        var offset: Int? = null

        @get:JsonProperty("name")
        @set:JsonProperty("name")
        @JsonProperty("name")
        var name: String? = null

        @get:JsonProperty("abbr")
        @set:JsonProperty("abbr")
        @JsonProperty("abbr")
        var abbr: String? = null

        @get:JsonProperty("dst")
        @set:JsonProperty("dst")
        @JsonProperty("dst")
        var dst: Boolean? = null

        @JsonIgnore
        private val additionalProperties: MutableMap<String, Any> = HashMap()
        @JsonAnyGetter
        fun getAdditionalProperties(): Map<String, Any> {
            return additionalProperties
        }

        @JsonAnySetter
        fun setAdditionalProperty(name: String, value: Any) {
            additionalProperties[name] = value
        }
    }


    @Headers("X-Yandex-API-Key: 7a8221d4-03b8-4b31-bb5f-d0786fc42af1")
    @GET("/v2/forecast")
    fun getForecast(
        @Query("lat") lat: String?,
        @Query("lon") lon: String?, @Query("lang") lang: String?, @Query("limit") limit: Int?, @Query("extra") extra: Boolean?
    ): Call<Example>?
}


