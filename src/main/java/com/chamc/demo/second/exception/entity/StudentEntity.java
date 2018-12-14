package com.chamc.demo.second.exception.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * t_student表sql如下：
 * CREATE TABLE `easycoding`.`t_student` (
 * `id` BIGINT(20) NOT NULL,
 * `name` VARCHAR(45) NULL,
 * `sex` VARCHAR(1) NULL,
 * PRIMARY KEY (`id`));
 */
@Entity
@Table(name = "t_student")
@Data
@EqualsAndHashCode(callSuper=false)
public class StudentEntity {

	@Id
	@GeneratedValue(generator = "snowflake")
	@GenericGenerator(name = "snowflake", strategy = "com.chamc.boot.web.support.SnowflakeIdGenerator")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sex")
	private String sex;
}
