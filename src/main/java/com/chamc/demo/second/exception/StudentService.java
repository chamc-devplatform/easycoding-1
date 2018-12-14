package com.chamc.demo.second.exception;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chamc.boot.web.support.BussinessException;
import com.chamc.demo.second.exception.entity.StudentEntity;
import com.chamc.demo.second.exception.repository.StudentRepository;

import lombok.Getter;

@Service
public class StudentService {

	private @Autowired @Getter StudentRepository repository;
	
//	@javax.transaction.Transactional
//	public StudentEntity save(StudentEntity student) throws SQLException {
//		this.repository.save(student);
//		throw new SQLException("数据库异常");
//	}
	
//	@Transactional
//	public StudentEntity save(StudentEntity student) {
//		this.repository.save(student);
//		throw new RuntimeException("数据库异常");
//	}
	
//	@Transactional(rollbackFor = SQLException.class)
//	public StudentEntity save(StudentEntity student) throws SQLException {
//		this.repository.save(student);
//		throw new SQLException("数据库异常");
//	}
	
	@Transactional
	public void save(StudentEntity student) {
		try {
			this.repository.save(student);
			throw new SQLException("数据库异常");
		} catch (SQLException e) {
			throw new BussinessException(e);
		}
	}
}
