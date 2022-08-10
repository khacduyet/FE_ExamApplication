/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AdminDEV
 */
@Entity
@Table(name = "Report", catalog = "db_a8b45e_examapps", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Report.findAll", query = "SELECT r FROM Report r")
    , @NamedQuery(name = "Report.findById", query = "SELECT r FROM Report r WHERE r.id = :id")
    , @NamedQuery(name = "Report.findByContent", query = "SELECT r FROM Report r WHERE r.content = :content")
    , @NamedQuery(name = "Report.findByIdUser", query = "SELECT r FROM Report r WHERE r.idUser = :idUser")
    , @NamedQuery(name = "Report.findByCreated", query = "SELECT r FROM Report r WHERE r.created = :created")
    , @NamedQuery(name = "Report.findByCreatedBy", query = "SELECT r FROM Report r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "Report.findByCreatedByName", query = "SELECT r FROM Report r WHERE r.createdByName = :createdByName")
    , @NamedQuery(name = "Report.findByModified", query = "SELECT r FROM Report r WHERE r.modified = :modified")
    , @NamedQuery(name = "Report.findByModifiedBy", query = "SELECT r FROM Report r WHERE r.modifiedBy = :modifiedBy")
    , @NamedQuery(name = "Report.findByModifiedByName", query = "SELECT r FROM Report r WHERE r.modifiedByName = :modifiedByName")
    , @NamedQuery(name = "Report.findByStatus", query = "SELECT r FROM Report r WHERE r.status = :status")})
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "Id")
    private String id;
    @Size(max = 1073741823)
    @Column(name = "Content")
    private String content;
    @Size(max = 1073741823)
    @Column(name = "IdUser")
    private String idUser;
    @Size(max = 27)
    @Column(name = "Created")
    private String created;
    @Size(max = 36)
    @Column(name = "CreatedBy")
    private String createdBy;
    @Size(max = 200)
    @Column(name = "CreatedByName")
    private String createdByName;
    @Size(max = 27)
    @Column(name = "Modified")
    private String modified;
    @Size(max = 36)
    @Column(name = "ModifiedBy")
    private String modifiedBy;
    @Size(max = 200)
    @Column(name = "ModifiedByName")
    private String modifiedByName;
    @Column(name = "Status")
    private Boolean status;

    public Report() {
    }

    public Report(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedByName() {
        return modifiedByName;
    }

    public void setModifiedByName(String modifiedByName) {
        this.modifiedByName = modifiedByName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Report)) {
            return false;
        }
        Report other = (Report) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Report[ id=" + id + " ]";
    }
    
}
