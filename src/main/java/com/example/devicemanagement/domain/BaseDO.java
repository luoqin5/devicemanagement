package com.example.devicemanagement.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

@javax.persistence.MappedSuperclass
@javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
public  class BaseDO implements Serializable {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private Long id;
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @javax.persistence.Column(updatable = false, insertable = false)
    private LocalDateTime gmtCreate;
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @javax.persistence.Column(updatable = false, insertable = false)
    private LocalDateTime gmtModified;

    public BaseDO() { /* compiled code */ }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}
