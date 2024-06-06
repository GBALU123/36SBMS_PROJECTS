package in.ashokit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Repo.StudentRepo;
import in.ashokit.entity.Student;

@RestController
public class StudentController  {
	
	@Autowired
	private StudentRepo studentrepo;
	
	
	@GetMapping("/students")
	public Iterable<Student> getallstudent(){
		
		
		return studentrepo.findAll();
		
	}
	
	
	@PostMapping("/student")
	public String addstudent(@RequestBody Student student) {
		
		studentrepo.save(student);
		
		return "student saved";
		
	}
	

}
