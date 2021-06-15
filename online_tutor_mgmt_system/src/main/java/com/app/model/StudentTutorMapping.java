package com.app.model;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;


@Entity
@Table(name="student_tutor_mapping")
public class StudentTutorMapping implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_tutor_id")
	private int studentTutorId;
	
	@ManyToOne
	@JoinColumn(name="student_id",nullable = false)
	private Student student;

	@ManyToOne
	@JoinColumn(name = "tutor_id",nullable = false)
	private Tutor tutor;


	@Enumerated(EnumType.ORDINAL)
	@Column(columnDefinition = "int default 0",nullable = false)
	Status status;

	@Column(name="access_at")
	private LocalDateTime accessAt;
	
	public StudentTutorMapping() {
		super();
	}

	public StudentTutorMapping(Student students, Tutor tutors) {
		super();
		this.student = students;
		this.tutor = tutors;
	}


	public int getStudentTutorId() {
		return studentTutorId;
	}

	public void setStudentTutorId(int studentTutorId) {
		this.studentTutorId = studentTutorId;
	}

	public Student getStudents() {
		return student;
	}

	public void setStudents(Student students) {
		this.student = students;
	}

	public Tutor getTutors() {
		return tutor;
	}

	public void setTutors(Tutor tutors) {
		this.tutor = tutors;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDateTime getAccessAt() {
		return accessAt;
	}

	public void setAccessAt(LocalDateTime accessAt) {
		this.accessAt = accessAt;
	}
	
//	helper method
	public void addStudent(Student s,Tutor t)
	{
		this.setStudents(s);
		this.setTutors(t);
		this.setStatus(Status.valueOf("NOTAPPROVED"));
		
		s.addStudentMaterial(this);
		t.addStudentMaterial(this);
		
	}

	@Override
	public String toString() {
		return "StudentTutorMapping [studentTutorId=" + studentTutorId + ", students=" + student + ", tutors=" + tutor
				+ ", status=" + status + ", accessAt=" + accessAt + "]";
	}




}
