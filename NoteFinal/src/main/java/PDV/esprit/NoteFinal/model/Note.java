package PDV.esprit.NoteFinal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Note implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long id;
	private String nameF;
	private String lastNameF;
	private String birthDate;
	private String statusFiche;
	private String Gender;
	private String imageUrl;
	@Column(nullable = false, updatable = false)
	private String PostID;
	
	
	
	
	
	
	public Note() {
		
	}
	
	
	
	
	
	public Note(String nameF, String lastNameF, String birthDate, String statusFiche, String gender,String postId,String imageUrl) {
		this.nameF = nameF;
		this.lastNameF = lastNameF;
		this.birthDate = birthDate;
		this.statusFiche = statusFiche;
		this.Gender = gender;
		this.PostID = postId;
	
	}
	




	public String getImageUrl() {
		return imageUrl;
	}





	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}





	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameF() {
		return nameF;
	}
	public void setNameF(String nameF) {
		this.nameF = nameF;
	}
	public String getLastNameF() {
		return lastNameF;
	}
	public void setLastNameF(String lastNameF) {
		this.lastNameF = lastNameF;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getStatusFiche() {
		return statusFiche;
	}
	public void setStatusFiche(String statusFiche) {
		this.statusFiche = statusFiche;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	





	public String getPostID() {
		return PostID;
	}





	public void setPostID(String postID) {
		PostID = postID;
	}





	@Override
	public String toString() {
		return "Note [id=" + id + ", nameF=" + nameF + ", lastNameF=" + lastNameF + ", birthDate=" + birthDate
				+ ", statusFiche=" + statusFiche + ", Gender=" + Gender + ", imageUrl=" + imageUrl + ", PostID="
				+ PostID + "]";
	}





	
	
	
	
	
	

}
