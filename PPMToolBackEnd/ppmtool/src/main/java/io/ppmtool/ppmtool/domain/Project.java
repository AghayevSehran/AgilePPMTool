package io.ppmtool.ppmtool.domain;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message  = "Project name is required")
    private String projectName;
    @NotBlank(message  = "Project identifier is required")
    @Size(min=4,max=5,message = "Please use 4 and 5 character")
    @Column(updatable = false,unique = true)
    private String projectIdentifier;
    @NotBlank(message  = "Project decription is required")
    private String description;
    @JsonFormat(pattern= "yyyy-mm-dd")
    private Date sartDate;
    @JsonFormat(pattern= "yyyy-mm-dd")
    private Date endDate;
    @JsonFormat(pattern= "yyyy-mm-dd")
    private Date createdAt;
    @JsonFormat(pattern= "yyyy-mm-dd")
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
