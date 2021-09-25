package io.ppmtool.ppmtool.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date sartDate;
    private Date endDate;
    private Date createdAt;
    private Date updatedAt;

    @PrePersist
    protected  void onCreate(){
        this.createdAt = new Date();
    }

    @PreUpdate
    protected  void onUpdate(){
        this.updatedAt = new Date();
    }

    public Project() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProjectName(String progetName) {
        this.projectName = progetName;
    }

    public void setProjectIdentifier(String progetIdentifier) {
        this.projectIdentifier = progetIdentifier;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSartDate(Date sartDate) {
        this.sartDate = sartDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public Date getSartDate() {
        return sartDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }



}
