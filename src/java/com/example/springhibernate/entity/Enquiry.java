/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springhibernate.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "enquiries")
@NamedQueries({
    @NamedQuery(name = "Enquiry.findAll", query = "SELECT e FROM Enquiry e")})
public class Enquiry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "enquiry_id")
    private Integer enquiryId;
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "contact_no")
    private String contactNo;
    @Basic(optional = false)
    @Column(name = "enquiry_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enquiryDate;
    @Basic(optional = false)
    @Column(name = "is_read")
    private boolean isRead;
    @JoinColumn(name = "enquiry_status_id", referencedColumnName = "enquiry_status_id")
    @ManyToOne(optional = false)
    private EnquiryStatus enquiryStatusId;
    @JoinColumn(name = "faculty_id", referencedColumnName = "faculty_id")
    @ManyToOne(optional = false)
    private Faculty facultyId;
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    @ManyToOne(optional = false)
    private Course courseId;

    public Enquiry() {
    }

    public Enquiry(Integer enquiryId) {
        this.enquiryId = enquiryId;
    }

    public Enquiry(Integer enquiryId, String firstName, String lastName, String email, String contactNo, Date enquiryDate, boolean isRead) {
        this.enquiryId = enquiryId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNo = contactNo;
        this.enquiryDate = enquiryDate;
        this.isRead = isRead;
    }

    public Integer getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(Integer enquiryId) {
        this.enquiryId = enquiryId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Date getEnquiryDate() {
        return enquiryDate;
    }

    public void setEnquiryDate(Date enquiryDate) {
        this.enquiryDate = enquiryDate;
    }

    public boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public EnquiryStatus getEnquiryStatusId() {
        return enquiryStatusId;
    }

    public void setEnquiryStatusId(EnquiryStatus enquiryStatusId) {
        this.enquiryStatusId = enquiryStatusId;
    }

    public Faculty getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Faculty facultyId) {
        this.facultyId = facultyId;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enquiryId != null ? enquiryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enquiry)) {
            return false;
        }
        Enquiry other = (Enquiry) object;
        if ((this.enquiryId == null && other.enquiryId != null) || (this.enquiryId != null && !this.enquiryId.equals(other.enquiryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.springhibernate.entity.Enquiry[ enquiryId=" + enquiryId + " ]";
    }
    
}
