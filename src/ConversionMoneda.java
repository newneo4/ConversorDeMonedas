import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversionMoneda {

    public static double conversion(String target, String origin, double mount) {
        try {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/62fa5939481430fa32ace45c/pair/" + origin + "/" + target + "/" + mount);

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String responseBody = response.body();

            Response responseObject = new Gson().fromJson(responseBody, Response.class);

            return responseObject.getConversionResult();
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    static class Response {
        private double conversion_result;

        public double getConversionResult() {
            return conversion_result;
        }
    }
}
