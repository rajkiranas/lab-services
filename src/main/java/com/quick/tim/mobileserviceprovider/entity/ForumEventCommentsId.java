package com.quick.tim.mobileserviceprovider.entity;
// Generated Oct 24, 2013 2:28:19 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ForumEventCommentsId generated by hbm2java
 */
@Embeddable
public class ForumEventCommentsId  implements java.io.Serializable {


     private int eventDetailId;
     private String username;
     private Date commentTime;

    public ForumEventCommentsId() {
    }

    public ForumEventCommentsId(int eventDetailId, String username, Date commentTime) {
       this.eventDetailId = eventDetailId;
       this.username = username;
       this.commentTime = commentTime;
    }
   

    @Column(name="event_detail_id", nullable=false)
    public int getEventDetailId() {
        return this.eventDetailId;
    }
    
    public void setEventDetailId(int eventDetailId) {
        this.eventDetailId = eventDetailId;
    }

    @Column(name="username", nullable=false, length=250)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name="comment_time", nullable=false, length=35)
    public Date getCommentTime() {
        return this.commentTime;
    }
    
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ForumEventCommentsId) ) return false;
		 ForumEventCommentsId castOther = ( ForumEventCommentsId ) other; 
         
		 return (this.getEventDetailId()==castOther.getEventDetailId())
 && ( (this.getUsername()==castOther.getUsername()) || ( this.getUsername()!=null && castOther.getUsername()!=null && this.getUsername().equals(castOther.getUsername()) ) )
 && ( (this.getCommentTime()==castOther.getCommentTime()) || ( this.getCommentTime()!=null && castOther.getCommentTime()!=null && this.getCommentTime().equals(castOther.getCommentTime()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getEventDetailId();
         result = 37 * result + ( getUsername() == null ? 0 : this.getUsername().hashCode() );
         result = 37 * result + ( getCommentTime() == null ? 0 : this.getCommentTime().hashCode() );
         return result;
   }   


}


