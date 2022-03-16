package com.example;

import io.micronaut.http.annotation.*;

@Controller("/demoMicronautJavaGradle")
public class DemoMicronautJavaGradleController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}