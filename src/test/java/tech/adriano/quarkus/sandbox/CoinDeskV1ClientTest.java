package tech.adriano.quarkus.sandbox;

import io.quarkus.logging.Log;
import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
class CoinDeskV1ClientTest {
    @Inject
    @RestClient
    CoinDeskV1Client coinDeskV1Client;

    @Test
    void getBpi() {
        PriceResponse priceResponse = coinDeskV1Client.getBpi();
        Log.info(priceResponse);
    }
}
