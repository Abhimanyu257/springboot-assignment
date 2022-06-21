package com.example.Springbootassignment.repository;

import com.example.Springbootassignment.document.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends MongoRepository<Project,String> {


    public List<Project> findCourseByEmail(String email);

    public void deleteByEmail(String email);
}
