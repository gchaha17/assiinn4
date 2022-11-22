package com.example.assignnment4.repoistery;

import com.example.assignnment4.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepo extends MongoRepository<Album,String> {
}