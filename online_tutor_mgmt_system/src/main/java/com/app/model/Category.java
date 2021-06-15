package com.app.model;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	
	@Column(name="category_name",nullable = false)
	private String categoryName;
	
	@ManyToOne()
	@JoinColumn(name = "tutor_id",nullable = false)
	private Tutor tutors;
	
	//for accessing data
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.EAGER,orphanRemoval=true)
	private Set<TrainingMaterial> CategoryMaterial = new HashSet<TrainingMaterial>();

	public Category() {
		
	}
	public Category(int categoryId, String categoryName, Tutor tutors) {
		super();
		this.categoryName = categoryName;
		this.tutors = tutors;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Tutor getTutors() {
		return tutors;
	}

	public void setTutors(Tutor tutors) {
		this.tutors = tutors;
	}

	public Set<TrainingMaterial> getSelectedCategoryMaterial() {
		return CategoryMaterial;
	}

	public void setSelectedCategoryMaterial(Set<TrainingMaterial> selectedCategoryMaterial) {
		this.CategoryMaterial = selectedCategoryMaterial;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", CategoryMaterial="
				+ CategoryMaterial + "]";
	}

	
}
