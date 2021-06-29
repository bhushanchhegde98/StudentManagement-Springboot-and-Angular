package com.te.studentmanagement.service;

import java.util.List;
import com.te.studentmanagement.bean.Student;  


public interface StudentService {
	  
	    public List<Student> getStudents();  
	    public boolean deleteStudent(Student student);  
	    public List<Student> getStudentByID(Student student);  
	    public boolean updateStudent(Student student);
		public boolean saveStudent(Student student);  

}
