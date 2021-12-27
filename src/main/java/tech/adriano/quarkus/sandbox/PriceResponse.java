package tech.adriano.quarkus.sandbox;

import java.util.HashMap;

public class PriceResponse {
    public HashMap<String, BPI> bpi;
    public String chartName;
    public String disclaimer;
    public PriceTime time;
}
