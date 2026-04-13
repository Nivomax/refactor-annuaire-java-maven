package org.example.dto;

public class SearchRequestDto {
    private final String text;

    public SearchRequestDto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

