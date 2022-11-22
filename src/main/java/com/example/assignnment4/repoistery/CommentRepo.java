package com.example.assignnment4.repoistery;

import com.example.assignnment4.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepo extends MongoRepository<Comment,String> {

}