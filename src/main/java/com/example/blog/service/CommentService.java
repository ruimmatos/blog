package com.example.blog.service;

import com.example.blog.payload.CommentDto;
import com.example.blog.payload.CommentResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    CommentDto createComment(Long postId, CommentDto commentDto);

    CommentResponse getCommentsByPostId(Long postId, int pageNo, int pageSize, String sortBy, String sortDir);

    CommentDto getCommentById(Long postId, Long commentId);

    CommentDto updateComment(Long postId, Long commentId, CommentDto commentRequest);

    void deleteComment(Long postId, Long commentId);
}
