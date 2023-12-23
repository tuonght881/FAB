package com.poly.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.poly.bean.Comments;

public interface CommentsService {

	public List<Comments> getComments(Integer id);
	
	public Comments createComment(JsonNode data);
}
