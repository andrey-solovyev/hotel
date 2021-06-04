package com.vsu.hotel.data.repository;

import com.vsu.hotel.data.models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer> {
    List<Comment> findAll();
}
