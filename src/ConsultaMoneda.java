import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    private final String API_KEY = "32224f8176daa590653c8537";

    public double convertirMoneda(String from, String to, double cantidad) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + from + "/" + to;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        RespuestaMoneda datos = new Gson().fromJson(response.body(), RespuestaMoneda.class);

        return datos.conversion_rate() * cantidad;
    }
}
