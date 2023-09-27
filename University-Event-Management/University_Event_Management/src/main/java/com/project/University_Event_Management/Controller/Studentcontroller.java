package com.project.University_Event_Management.Controller;

import com.project.University_Event_Management.Models.StudentModel;
import com.project.University_Event_Management.Models.Type;
import com.project.University_Event_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class Studentcontroller {

    @Autowired
    StudentService uniservice;


    @PostMapping("posting")
    public String addstu(@RequestBody StudentModel studentModel){
        return uniservice.addstudent(studentModel);
    }

    @GetMapping("getting")
    public List<StudentModel> getstudent(){
        return uniservice.getstudents();
    }

    @DeleteMapping("delete/{id}")
    public String deletingbyid(@PathVariable StudentModel id){
        return uniservice.deletingbyid(id);
    }

    @GetMapping("getby/{id}")
    public StudentModel getbyid(@PathVariable Integer id){
        return uniservice.getbyid(id);
    }

    @PutMapping("updating/{id}/{depart}")
    public String updateStudentDepartment(@PathVariable Integer id,@PathVariable Type depart) {
        return uniservice.updateStudentDepartment(id,depart);
    }


}