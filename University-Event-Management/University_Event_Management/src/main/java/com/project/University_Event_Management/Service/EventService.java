package com.project.University_Event_Management.Service;

import com.project.University_Event_Management.Models.EventModel;
import com.project.University_Event_Management.Models.StudentModel;
import com.project.University_Event_Management.Repo.IeventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    IeventRepo eventRepo;


    public String addevent(EventModel id) {
        eventRepo.save(id);
        return "added";
    }

    public List<EventModel> getallids() {
        return (List<EventModel>) eventRepo.findAll();
    }

    public String updatingevent(Integer id, String name) {
        Optional<EventModel> s = eventRepo.findById(id);

        if (s.isEmpty()) {
            return "Event not found !!!";
        }

        EventModel e = s.get();
        e.setLocationOfEvent(name);
        eventRepo.save(e);
        return "Location updated for the provided event";
    }

    public Optional<EventModel> getbyeventid(Integer id) {
        return eventRepo.findById(id);
    }

    public String deletebyid(Integer id) {
        eventRepo.deleteById(id);
        return "deleted";
    }
//
//    public EventModel getEventsOnSameDate(LocalDate date) {
//        return eventRepo.findByEventDate(date);
//    }


    public List<EventModel> getEventsByDate(LocalDate eventdate) {
        return eventRepo.findByDate(eventdate);
    }
}
