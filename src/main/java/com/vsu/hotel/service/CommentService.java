package com.vsu.hotel.service;

import com.vsu.hotel.data.models.Comment;
import com.vsu.hotel.data.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public void createComment(Comment comment){
        commentRepository.save(comment);
    }
    public List<Comment> findAll(){
        return commentRepository.findAll();
    }
}
