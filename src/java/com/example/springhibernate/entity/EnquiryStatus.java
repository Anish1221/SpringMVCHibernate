/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springhibernate.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "enquiry_status")
@NamedQueries({
    @NamedQuery(name = "EnquiryStatus.findAll", query = "SELECT e FROM EnquiryStatus e")})
public class EnquiryStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "enquiry_status_id")
    private Integer enquiryStatusId;
    @Basic(optional = false)
    @Column(name = "status_name")
    private String statusName;
    @Basic(optional = false)
    @Column(name = "status_color")
    private String statusColor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enquiryStatusId")
    private List<Enquiry> enquiryList;

    public EnquiryStatus() {
    }

    public EnquiryStatus(Integer enquiryStatusId) {
        this.enquiryStatusId = enquiryStatusId;
    }

    public EnquiryStatus(Integer enquiryStatusId, String statusName, String statusColor) {
        this.enquiryStatusId = enquiryStatusId;
        this.statusName = statusName;
        this.statusColor = statusColor;
    }

    public Integer getEnquiryStatusId() {
        return enquiryStatusId;
    }

    public void setEnquiryStatusId(Integer enquiryStatusId) {
        this.enquiryStatusId = enquiryStatusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusColor() {
        return statusColor;
    }

    public void setStatusColor(String statusColor) {
        this.statusColor = statusColor;
    }

    public List<Enquiry> getEnquiryList() {
        return enquiryList;
    }

    public void setEnquiryList(List<Enquiry> enquiryList) {
        this.enquiryList = enquiryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enquiryStatusId != null ? enquiryStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnquiryStatus)) {
            return false;
        }
        EnquiryStatus other = (EnquiryStatus) object;
        if ((this.enquiryStatusId == null && other.enquiryStatusId != null) || (this.enquiryStatusId != null && !this.enquiryStatusId.equals(other.enquiryStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.springhibernate.entity.EnquiryStatus[ enquiryStatusId=" + enquiryStatusId + " ]";
    }
    
}
