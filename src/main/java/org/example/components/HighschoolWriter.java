package org.example.components;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HighschoolWriter {
    private ObjectMapper objectMapper;
    private String outputPath;

    public HighschoolWriter(ObjectMapper objectMapper, String outputPath) {
        this.objectMapper = objectMapper;
        this.outputPath = outputPath;
    }


}