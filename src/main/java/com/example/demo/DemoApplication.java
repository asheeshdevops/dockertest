package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return """
            <html>
<head>
<style>
               body {
                   background-color: lightblue;
                   text-align: center;
                   padding-top: 100px;
                   font-family: Arial, sans-serif;
               }
               h1 {
                   background-color: white;
                   padding: 20px;
                   border-radius: 10px;
               }
</style>
</head>
<body>
<h1>Hello from Java!</h1>
</body>
</html>
       """;
    }
}
