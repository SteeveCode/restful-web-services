package com.brexson.restfulwebservices.jpa;

import com.brexson.restfulwebservices.user.Post;
import com.brexson.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}