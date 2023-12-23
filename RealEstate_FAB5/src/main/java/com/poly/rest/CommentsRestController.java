package com.poly.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.poly.bean.Comments;
import com.poly.service.CommentsService;

@RestController
public class CommentsRestController {

	@Autowired
	CommentsService commentService;
	
	@RequestMapping("/rest/comments")
	public List<Comments> getComments(@Param("id") Integer id){
		return commentService.getComments(id);
	}
	
	@RequestMapping("/rest/add-comment")
	public Comments createComment(@RequestBody JsonNode dt) {
		return commentService.createComment(dt);
	}
}
