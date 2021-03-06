package com.quick.tim.mobileserviceprovider.entity;
// Generated 5 Jun, 2013 6:08:00 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * RoleMaster generated by hbm2java
 */
@Entity
@Table(name="role_master", schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="role_name")
)

public class RoleMaster  implements java.io.Serializable {


   
     private String roleName;
     private Set<UserRoles> userRoleses = new HashSet<UserRoles>(0);

    public RoleMaster() {
    }

	
    public RoleMaster( String roleName) {
       
        this.roleName = roleName;
    }
    public RoleMaster(String roleName, Set<UserRoles> userRoleses) {
       this.roleName = roleName;
       this.userRoleses = userRoleses;
    }
   
    @Id 
    @Column(name="role_name", unique=true, nullable=false, length=32)
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="roleMaster")
    public Set<UserRoles> getUserRoleses() {
        return this.userRoleses;
    }
    
    public void setUserRoleses(Set<UserRoles> userRoleses) {
        this.userRoleses = userRoleses;
    }




}


