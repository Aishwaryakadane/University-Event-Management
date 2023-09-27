package com.project.University_Event_Management.Repo;

import com.project.University_Event_Management.Models.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IstudentRepo extends CrudRepository<StudentModel,Integer> {
}
