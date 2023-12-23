package com.poly.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poly.bean.Comments;
import com.poly.dao.CommentsDAO;
import com.poly.service.CommentsService;

@Service
public class CommentsServiceImpl implements CommentsService{

	@Autowired
	CommentsDAO dao;
	
	@Override
	public List<Comments> getComments(Integer id) {
		// TODO Auto-generated method stub
		return dao.getComments(id);
	}

	@Override
	public Comments createComment(JsonNode data) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Comments comment = mapper.convertValue(data, Comments.class);
		return dao.save(comment);
	}

}
