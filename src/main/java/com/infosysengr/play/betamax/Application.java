package com.infosysengr.play.betamax;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.youtube.com/watch?v=u8qFAGLBJfE");
//        URL url = new URL("http://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        while ((inputLine = reader.readLine()) != null)
            System.out.println(inputLine);
        reader.close();
        System.out.println("done.");
    }
}
