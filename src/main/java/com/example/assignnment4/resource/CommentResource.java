package com.example.assignnment4.resource;

import com.example.assignnment4.model.Comment;
import com.example.assignnment4.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentResource {
    @Autowired
    private CommentService crs;
    @PostMapping()
    public Comment saveComment(@RequestBody @Valid Comment c1)
    {
        return crs.saveComment(c1);

    }
    @GetMapping()
    public List<Comment> getComment()
    {
        return crs.getComment();

    }
    @PutMapping()
    public Comment updateComment(@RequestBody Comment c1)
    {

        return crs.updateComment(c1);
    }
    @DeleteMapping()
    public void deleteComment(@RequestParam(name="commentId")String commentId)
    {
        crs.deleteComment(commentId);

    }
}