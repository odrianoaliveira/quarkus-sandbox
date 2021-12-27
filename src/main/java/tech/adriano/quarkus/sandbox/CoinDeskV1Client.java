package tech.adriano.quarkus.sandbox;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/v1")
@RegisterRestClient(configKey = "coindesk-api")
public interface CoinDeskV1Client {
    @GET()
    @Path("/bpi/currentprice.json")
    PriceResponse getBpi();
}
