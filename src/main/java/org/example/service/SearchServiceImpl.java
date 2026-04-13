package org.example.service;

import org.example.repository.DirectoryRepository;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    private final DirectoryRepository directoryRepository;

    public SearchServiceImpl(DirectoryRepository directoryRepository) {
        this.directoryRepository = directoryRepository;
    }

    @Override
    public List<String> search(String text) {
        String normalizedText = text == null ? "" : text.toLowerCase();
        List<String> results = new ArrayList<>();

        for (String item : directoryRepository.findAllEntries()) {
            if (item.toLowerCase().contains(normalizedText)) {
                results.add(item);
            }
        }

        return results;
    }
}

