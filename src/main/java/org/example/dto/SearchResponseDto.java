package org.example.dto;

import java.util.List;

public class SearchResponseDto {
    private final List<String> results;

    public SearchResponseDto(List<String> results) {
        this.results = results;
    }

    public List<String> getResults() {
        return results;
    }
}

