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
@Table(name = "Question", catalog = "db_a8b45e_examapps", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Question.findAll", query = "SELECT q FROM Question q")
    , @NamedQuery(name = "Question.findById", query = "SELECT q FROM Question q WHERE q.id = :id")
    , @NamedQuery(name = "Question.findByName", query = "SELECT q FROM Question q WHERE q.name = :name")
    , @NamedQuery(name = "Question.findByNote", query = "SELECT q FROM Question q WHERE q.note = :note")
    , @NamedQuery(name = "Question.findByStatus", query = "SELECT q FROM Question q WHERE q.status = :status")
    , @NamedQuery(name = "Question.findByCreated", query = "SELECT q FROM Question q WHERE q.created = :created")
    , @NamedQuery(name = "Question.findByCreatedBy", query = "SELECT q FROM Question q WHERE q.createdBy = :createdBy")
    , @NamedQuery(name = "Question.findByCreatedByName", query = "SELECT q FROM Question q WHERE q.createdByName = :createdByName")
    , @NamedQuery(name = "Question.findByModified", query = "SELECT q FROM Question q WHERE q.modified = :modified")
    , @NamedQuery(name = "Question.findByModifiedBy", query = "SELECT q FROM Question q WHERE q.modifiedBy = :modifiedBy")
    , @NamedQuery(name = "Question.findByModifiedByName", query = "SELECT q FROM Question q WHERE q.modifiedByName = :modifiedByName")
    , @NamedQuery(name = "Question.findByIdLevel", query = "SELECT q FROM Question q WHERE q.idLevel = :idLevel")
    , @NamedQuery(name = "Question.findByIdSubject", query = "SELECT q FROM Question q WHERE q.idSubject = :idSubject")})
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "Id")
    private String id;
    @Size(max = 3000)
    @Column(name = "Name")
    private String name;
    @Size(max = 3000)
    @Column(name = "Note")
    private String note;
    @Column(name = "Status")
    private Boolean status;
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
    @Size(max = 36)
    @Column(name = "IdLevel")
    private String idLevel;
    @Size(max = 36)
    @Column(name = "IdSubject")
    private String idSubject;

    public Question() {
    }

    public Question(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public String getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(String idLevel) {
        this.idLevel = idLevel;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
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
        if (!(object instanceof Question)) {
            return false;
        }
        Question other = (Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Question[ id=" + id + " ]";
    }
    
}
