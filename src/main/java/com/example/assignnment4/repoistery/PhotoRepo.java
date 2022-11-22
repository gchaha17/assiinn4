package com.example.assignnment4.repoistery;

import com.example.assignnment4.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepo extends MongoRepository<Photo,String> {
}