package org.example.repository;

import org.example.dao.DirectoryDao;

import java.util.List;

public class DirectoryRepositoryImpl implements DirectoryRepository {
    private final DirectoryDao directoryDao;

    public DirectoryRepositoryImpl(DirectoryDao directoryDao) {
        this.directoryDao = directoryDao;
    }

    @Override
    public List<String> findAllEntries() {
        return directoryDao.findAllEntries();
    }
}

