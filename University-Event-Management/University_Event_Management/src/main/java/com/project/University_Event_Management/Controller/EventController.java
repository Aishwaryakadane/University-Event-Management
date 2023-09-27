package com.project.University_Event_Management.Controller;

import com.project.University_Event_Management.Models.EventModel;
import com.project.University_Event_Management.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
      EventService eventService;


    @PostMapping("posting/event")
    public String addevent(@RequestBody EventModel id){
        return eventService.addevent(id);
    }

    @GetMapping("get/all")
    public List<EventModel> getallids(){
        return  eventService.getallids();
    }

    @PutMapping("updating/{id}/loc/{name}")
    public String updatingevent(@PathVariable Integer id,@PathVariable String name ){
        return eventService.updatingevent(id,name);
    }

    @GetMapping("event/{id}")
    public Optional<EventModel> getbyeventid(@PathVariable Integer id){
    return eventService.getbyeventid(id);
    }
//
//    @GetMapping("get/{id}")
//    public String getbyid(@PathVariable Integer id){
//        return eventService.getbyid(id);
//
//    }

    @DeleteMapping("deleting/{id}")
    public String deletebyid(@PathVariable Integer id){
        return eventService.deletebyid(id);
    }

    @GetMapping("gettingby/eventdate")
    public List<EventModel> getEventsByDate(@RequestParam LocalDate eventdate) {
        return eventService.getEventsByDate(eventdate);
    }

}
