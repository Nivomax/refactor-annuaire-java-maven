package org.example;

import org.example.controller.SearchController;
import org.example.dao.DirectoryDao;
import org.example.dao.InMemoryDirectoryDao;
import org.example.dto.SearchRequestDto;
import org.example.dto.SearchResponseDto;
import org.example.repository.DirectoryRepository;
import org.example.repository.DirectoryRepositoryImpl;
import org.example.service.SearchService;
import org.example.service.SearchServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DirectoryDao directoryDao = new InMemoryDirectoryDao();
        DirectoryRepository directoryRepository = new DirectoryRepositoryImpl(directoryDao);
        SearchService searchService = new SearchServiceImpl(directoryRepository);
        SearchController searchController = new SearchController(searchService);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String text = scanner.nextLine();

        SearchRequestDto requestDto = new SearchRequestDto(text);
        SearchResponseDto responseDto = searchController.search(requestDto);

        System.out.println(responseDto.getResults());
    }
}