package in.ashokit.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Course;
import in.ashokit.repo.CourseRepository;

@Service
public class CourseService implements CourseImpl {

	@Autowired
	private CourseRepository courseRepo;
	
	public boolean saveCourse(Course course) {
		
		Course save = courseRepo.save(course);
		
		return save.getId() != null ?true : false;
		
	}

	@Override
	public List<Course> getAllCorses() {
		
		return courseRepo.findAll();
	}
	
	
	
    
	
	
}
