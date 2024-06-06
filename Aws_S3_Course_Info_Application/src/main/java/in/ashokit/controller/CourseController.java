package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import in.ashokit.entity.Course;
import in.ashokit.service.CourseImpl;
import in.ashokit.utils.S3Utils;

@Controller
public class CourseController {
	private S3Utils s3Util;
	private CourseImpl courseService;

	public CourseController(S3Utils s3Util, CourseImpl courseService) {
		this.s3Util = s3Util;
		this.courseService = courseService;
	}

	@GetMapping("/")
	public String showForm(Model model) {
		model.addAttribute("course", new Course());
		return "index.html";
	}

	@PostMapping("/save-course")
	public String saveCourse(@ModelAttribute("course") Course course,
			@RequestParam("courseImageUrl") MultipartFile courseImage, Model model) {
		String putObject = s3Util.putObject(courseImage);
		course.setCourseDesc(putObject);
		boolean saveCourse = courseService.saveCourse(course);
		if (saveCourse) {
			model.addAttribute("succMsg", "Course saved successfully");
		} else {
			model.addAttribute("errMsg", "Error while saving the course");
		}
		return "index";
	}

	@GetMapping("/show-courses")
	public String showCourses(Model model) {
		model.addAttribute("courses", courseService.getAllCorses());
		return "courses";
	}
}
