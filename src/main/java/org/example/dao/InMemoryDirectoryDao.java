package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDirectoryDao implements DirectoryDao {
    @Override
    public List<String> findAllEntries() {
        List<String> data = new ArrayList<>();
        data.add("Google");
        data.add("Microsoft");
        data.add("Apple");
        data.add("Jean Aimarre");
        data.add("Annie Versaire");
        data.add("Sara Croche");
        return data;
    }
}

