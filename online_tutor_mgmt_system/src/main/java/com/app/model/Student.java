package com.app.model;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stud_id")
	private Integer studId;
	
	@Column(name="stud_name",length=30,nullable = false)
	private String studName;
	
	@Column(name="stud_email",length=30,unique=true,nullable = false)
	private String studEmail;
	
	@Column(name="stud_pwd",length=20,nullable = false)
	private String studPwd;
	
	@Column(name="joined_at")
	private LocalDateTime joinedAt;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(columnDefinition = "int default 0")
	Status status;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	Role role;
	
	@Column(name="stud_img")
	@Lob
	private byte[] studImage;

//	for accessing data
//    @OneToMany(mappedBy = "students",cascade=CascadeType.ALL,orphanRemoval=true)
//    private Set<StudentTutorMapping> studentSelectedTutorMap = new HashSet<StudentTutorMapping>();
	
    @OneToMany(mappedBy = "student",cascade=CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval=true)
    private Set<StudentTutorMapping> studentSelectedTutorMap = new HashSet<StudentTutorMapping>();

	public Student() {
		System.out.println("in student ctor");
	}

	public Integer getStudId() {
		return studId;
	}

	public Student(String studName, String studEmail, String studPwd,Role role) {
		super();
		this.studName = studName;
		this.studEmail = studEmail;
		this.studPwd = studPwd;
		this.role = role;
	}
	
	
	public Student(String studName,String studPwd) {
		super();
		this.studName = studName;
		
		this.studPwd = studPwd;
		
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	public String getStudPwd() {
		return studPwd;
	}

	public void setStudPwd(String studPwd) {
		this.studPwd = studPwd;
	}


	public LocalDateTime getJoinedAt() {
		return joinedAt;
	}

	public void setJoinedAt(LocalDateTime joinedAt) {
		this.joinedAt = joinedAt;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Set<StudentTutorMapping> getStudentSelectedTutorMap() {
		return studentSelectedTutorMap;
	}



	public void setStudentSelectedTutorMap(Set<StudentTutorMapping> studentSelectedTutorMap) {
		this.studentSelectedTutorMap = studentSelectedTutorMap;
	}

	public byte[] getStudImage() {
		return studImage;
	}

	public void setStudImage(byte[] studImage) {
		this.studImage = studImage;
	}

	 public void addStudentMaterial(StudentTutorMapping studentTutorMapping) {
	        this.studentSelectedTutorMap.add(studentTutorMapping);
	    }  
	 
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studEmail=" + studEmail + ", studPwd="
				+ studPwd + ", role=" + role + "]";
	}

	

	
}
