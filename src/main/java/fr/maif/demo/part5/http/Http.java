package fr.maif.demo.part5.http;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http {
  public static void main(String[] args) throws URISyntaxException {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI("https://cat-fact.herokuapp.com/facts"))
        .GET()
        .build();

    final HttpClient client = HttpClient.newHttpClient();
      client
          .sendAsync(request, HttpResponse.BodyHandlers.ofString())
          .thenAccept(
              response -> {
                System.out.println(response.body());
              })
          .toCompletableFuture().join();
  }
}
