package com.project.University_Event_Management.Repo;

import com.project.University_Event_Management.Models.EventModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IeventRepo extends CrudRepository<EventModel,Integer> {


    List<EventModel> findByDate(LocalDate eventdate);

}

