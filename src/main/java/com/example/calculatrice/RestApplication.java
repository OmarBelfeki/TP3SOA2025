package com.example.calculatrice;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

@ApplicationPath("/api")
public class RestApplication extends ResourceConfig {

    public static final String BASE_URI = "http://localhost:8080/";

    public RestApplication() {
        packages("com.example.calculatrice");
    }

    public static void main(String[] args) {
        ResourceConfig config = new RestApplication();
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(
                URI.create(BASE_URI),
                config
        );

        System.out.println("🚀 Jersey started at " + BASE_URI);
        System.out.println("Press CTRL+C to stop");

        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            server.shutdownNow();
        }
    }
}
