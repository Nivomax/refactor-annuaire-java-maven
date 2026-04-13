package org.example.controller;

import org.example.dto.SearchRequestDto;
import org.example.dto.SearchResponseDto;
import org.example.service.SearchService;

public class SearchController {
    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    public SearchResponseDto search(SearchRequestDto requestDto) {
        return new SearchResponseDto(searchService.search(requestDto.getText()));
    }
}

