package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bean.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public void insertOrUpdate(Student s)
	{
		hibernateTemplate.saveOrUpdate(s);
	}
	public List<Student> getAllStudent()
	{
		return hibernateTemplate.loadAll(Student.class);
	}
	public Student getStudent(int id) {
		return hibernateTemplate.get(Student.class,id );
	}
	
	@Transactional
	public void deleteStudent(int id) {
		Student s=hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(s);
	}
}
