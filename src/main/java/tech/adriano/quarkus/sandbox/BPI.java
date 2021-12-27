package tech.adriano.quarkus.sandbox;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BPI {
    public String code;
    public String description;
    public String rate;
    @JsonProperty("rate_float")
    public String rateFloat;
    public String symbol;
}
