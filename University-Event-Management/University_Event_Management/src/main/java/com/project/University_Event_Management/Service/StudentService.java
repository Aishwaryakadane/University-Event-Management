package com.project.University_Event_Management.Service;


import com.project.University_Event_Management.Models.StudentModel;
import com.project.University_Event_Management.Models.Type;
import com.project.University_Event_Management.Repo.IeventRepo;
import com.project.University_Event_Management.Repo.IstudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IstudentRepo istudentRepo;
    public String addstudent(StudentModel studentModel) {
        istudentRepo.save(studentModel);
        return "added";
    }


    public List<StudentModel> getstudents() {
        return (List<StudentModel>) istudentRepo.findAll();
    }

    public String deletingbyid(StudentModel id) {
        istudentRepo.delete(id);
        return "id deleted";
    }

    public StudentModel getbyid(Integer id) {
        Optional<StudentModel> studentOptional = istudentRepo.findById(id);

        if (studentOptional.isPresent()) {
            return studentOptional.get();
        } else {
            throw new NoSuchElementException("Student not found");
        }
    }
//
//    public void updateStudentDepartment(Integer studentId, String name) {
//
//            Optional<StudentModel> studentOptional = istudentRepo.findById(studentId);
//
//            if (studentOptional.isPresent()) {
//                StudentModel student = studentOptional.get();
//                student.setDepartment();
//                istudentRepo.save(student);
//            }
//            // No need for an else block; if student is not found, no action is taken
//        }
    public  String updateStudentDepartment(Integer id, Type department){
        Optional<StudentModel> s = istudentRepo.findById(id);

        if(s.isEmpty()){
            return "Student Id not found !!!";
        }

        StudentModel stu = s.get();
        stu.setDepartment(department);
        istudentRepo.save(stu);
        return "Student's Department is Updated !!!";
    }
}

