package com.chamc.demo.second.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chamc.demo.second.exception.entity.StudentEntity;

@EnableAutoConfiguration 
@Controller
@RequestMapping("student")
public class StudentController {

	private static final String OK = "ok";
	private static final String NOOK = "nook";
	private @Autowired StudentService service;

	@GetMapping("add")
	public ResponseEntity<String> add() {
		StudentEntity student = new StudentEntity();
		student.setName("chenpeng");
		student.setSex("男");
		try {
			this.service.save(student);
		} catch (Exception e) {
//			e.printStackTrace(); // 实际处理异常而不是简单的打印
			return ResponseEntity.ok(NOOK);
		}
		return ResponseEntity.ok(OK);
	}
}
