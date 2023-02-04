package org.webapps;

import org.example.RESTService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloService implements RESTService {

    @Override
    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: text/html\r\n" +
                "\r\n";
    }

    @Override
    public String getResponse() {
        byte[] fileContent;
        try {
            fileContent = Files.readAllBytes(Paths.get("src/main/resources/hello.html"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(fileContent);
    }
}
