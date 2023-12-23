package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.bean.Comments;

public interface CommentsDAO extends JpaRepository<Comments, Integer>{

	@Query(value="select * from comments where post_id = ?1 order by comments_id desc", nativeQuery = true)
	public List<Comments> getComments(Integer postId);
}
