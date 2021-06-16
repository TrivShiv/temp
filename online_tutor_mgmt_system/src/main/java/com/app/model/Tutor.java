package com.app.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="tutor")
public class Tutor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tutor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tutorId;
	
	@Column(name = "tutor_name", nullable = false)
    private String tutorName;
 
    @Column(name = "tutor_email",unique=true, nullable = false)
    private String tutorEmail;
    
    @Column(name = "tutor_pwd", nullable = false)
    private String tutorPwd;
    
    @Column(name = "tutor_education")
    private String tutorEducation;
    
    @Column(name = "tutor_profession")
    private String tutorProfesion;
    
    @Column(name = "tutor_desc")
    private String tutorDesc;
    
	@Enumerated(EnumType.ORDINAL)
	@Column(columnDefinition = "int default 0")
	Status status;
	
	@Enumerated(EnumType.STRING)
	Role role;
	
	@Column(name="tutor_img")
	@Lob
	private byte[] tutorImage;
    
    @Column(name = "joined_at")
    private LocalDateTime joinedAt;
    
//    for accessing data
//    @OneToMany(mappedBy = "tutors",cascade= CascadeType.ALL,orphanRemoval=true)
//    private Set<StudentTutorMapping> tutorSelectedStudentMap = new HashSet<StudentTutorMapping>();
    
    @OneToMany(mappedBy = "tutor",cascade= CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval=true)
    private Set<StudentTutorMapping> tutorSelectedStudentMap = new HashSet<StudentTutorMapping>();
  
    @OneToMany(mappedBy = "tutor",cascade= CascadeType.ALL,orphanRemoval=true,fetch = FetchType.EAGER)
    private Set<TrainingMaterial> createdTrainingMaterials = new HashSet<TrainingMaterial>();
   
    
    @OneToMany(mappedBy = "tutors",cascade= CascadeType.ALL,orphanRemoval=true,fetch = FetchType.EAGER)
    private Set<Category> categories = new HashSet<Category>();
    
    public Tutor() {
		super();
	}
    

	public Tutor(String tutorName, String tutorEmail, String tutorPwd, Role role) {
		super();
		this.tutorName = tutorName;
		this.tutorEmail = tutorEmail;
		this.tutorPwd = tutorPwd;
		this.role = role;
	}

	
	
	public Tutor(String tutorEducation, String tutorProfesion, String tutorDesc, byte[] tutorImage) {
		super();
		this.tutorEducation = tutorEducation;
		this.tutorProfesion = tutorProfesion;
		this.tutorDesc = tutorDesc;
		this.tutorImage = tutorImage;
	}

	public int getTutorId() {
		return tutorId;
	}

	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}

	public String getTutorName() {
		return tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}

	public String getTutorEmail() {
		return tutorEmail;
	}

	public void setTutorEmail(String tutorEmail) {
		this.tutorEmail = tutorEmail;
	}

	public String getTutorPwd() {
		return tutorPwd;
	}

	public void setTutorPwd(String tutorPwd) {
		this.tutorPwd = tutorPwd;
	}

	public String getTutorEducation() {
		return tutorEducation;
	}

	public void setTutorEducation(String tutorEducation) {
		this.tutorEducation = tutorEducation;
	}

	public String getTutorProfesion() {
		return tutorProfesion;
	}

	public void setTutorProfesion(String tutorProfesion) {
		this.tutorProfesion = tutorProfesion;
	}

	public String getTutorDesc() {
		return tutorDesc;
	}

	public void setTutorDesc(String tutorDesc) {
		this.tutorDesc = tutorDesc;
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

	public byte[] getTutorImage() {
		return tutorImage;
	}

	public void setTutorImage(byte[] tutorImage) {
		this.tutorImage = tutorImage;
	}

	public LocalDateTime getJoinedAt() {
		return joinedAt;
	}

	public void setJoinedAt(LocalDateTime joinedAt) {
		this.joinedAt = joinedAt;
	}

	public Set<StudentTutorMapping> getTutorSelectedStudentMap() {
		return tutorSelectedStudentMap;
	}

	public void setTutorSelectedStudentMap(Set<StudentTutorMapping> tutorSelectedStudentMap) {
		this.tutorSelectedStudentMap = tutorSelectedStudentMap;
	}

	public Set<TrainingMaterial> getCreatedTrainingMaterials() {
		return createdTrainingMaterials;
	}

	public void setCreatedTrainingMaterials(Set<TrainingMaterial> createdTrainingMaterials) {
		this.createdTrainingMaterials = createdTrainingMaterials;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public void addStudentMaterial(StudentTutorMapping studentTutorMapping) {
        this.tutorSelectedStudentMap.add(studentTutorMapping);
    } 
	
	@Override
	public String toString() {
		return "Tutor [tutorName=" + tutorName + ", tutorEmail=" + tutorEmail + ", tutorPwd=" + tutorPwd + "]";
	}

    
}
