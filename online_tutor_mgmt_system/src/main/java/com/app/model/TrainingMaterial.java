package com.app.model;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="training_material")
public class TrainingMaterial implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="material_id")
	private int materialId;

	@Column(name="material_title",nullable = false)
	private String materialTitle;

	@Column(name="material_og_name",nullable = false)
	private String materialOgName;

	@Column(name="material_path",nullable = false)
	private String materialtPath;

	@Column(name="content_type",nullable = false)
	private String contentType;

	@Column(name="created_at",nullable = false)
	private LocalDateTime createdAt;

	@Column(name="modified_at")
	private LocalDateTime modifiedAt;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="category_id")
	private Category category;

	@ManyToOne()
	@JoinColumn(name ="tutor_id",nullable = false)
	private Tutor tutor;

	public TrainingMaterial() {
		
	}
	

	public TrainingMaterial(String materialTitle, String materialOgName, String materialtPath, String contentType,
			LocalDateTime createdAt, Category category, Tutor tutor) {
		super();
		this.materialTitle = materialTitle;
		this.materialOgName = materialOgName;
		this.materialtPath = materialtPath;
		this.contentType = contentType;
		this.createdAt = createdAt;
		this.category = category;
		this.tutor = tutor;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public String getMaterialTitle() {
		return materialTitle;
	}

	public void setMaterialTitle(String materialTitle) {
		this.materialTitle = materialTitle;
	}


	public String getMaterialOgName() {
		return materialOgName;
	}

	public void setMaterialOgName(String materialOgName) {
		this.materialOgName = materialOgName;
	}

	public String getMaterialtPath() {
		return materialtPath;
	}

	public void setMaterialtPath(String materialtPath) {
		this.materialtPath = materialtPath;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	@Override
	public String toString() {
		return "TrainingMaterial [materialId=" + materialId + ", materialTitle=" + materialTitle + ", materialOgName="
				+ materialOgName + ", materialtPath=" + materialtPath + ", contentType=" + contentType + ", createdAt="
				+ createdAt + ", modifiedAt=" + modifiedAt + ", category=" + category + ", tutor=" + tutor + "]";
	}

	

}
