package persistance.entities.Subjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT_EXPIRED")
public class SubjectExpired {

	@OneToOne
	private Subject subjectId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int expired;
	
	@Column(name="subjectExpired")
	private String subjectExpired;

	@Column(name="subjectExpiredAge")
	private String subjectExpiredAge;

	@Column(name="subjectExpiredDate")
	private String subjectExpiredDate;
	
	@Column(name="subjectExpiredReason")
	private String subjectExpiredReason; 
	
	/**
	 * Empty class constructor for subject table.
	 */
	public SubjectExpired(){
		
	}
	
	/**
	 * 
	 * @return
	 */
	public Subject get_subjectId(){
		return subjectId;
	}
	
	/**
	 * 
	 * @param userId
	 */
	public void set_subjectId(Subject subjectId){
		this.subjectId = subjectId;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_subjectExpired (){
		return subjectExpired;
	}
	
	/**
	 * 
	 * @param subjectExpired
	 */
	public void set_subjectedExpired (String subjectExpired){
		this.subjectExpired = subjectExpired;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_subjectExpiredAge (){
		return subjectExpiredAge;
	}
	
	/**
	 * 
	 * @param subjectExpiredAge
	 */
	public void set_subjectedExpiredAge (String subjectExpiredAge){
		this.subjectExpiredAge = subjectExpiredAge;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_subjectExpiredDate (){
		return subjectExpiredDate;
	}
	
	/**
	 * 
	 * @param subjectExpiredDate
	 */
	public void set_subjectedExpiredDate (String subjectExpiredDate){
		this.subjectExpiredDate = subjectExpiredDate;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_subjectExpiredReason (){
		return subjectExpiredReason;
	}
	
	/**
	 * 
	 * @param subjectExpiredAge
	 */
	public void set_subjectedExpiredReason (String subjectExpiredReason){
		this.subjectExpiredReason = subjectExpiredReason;
	}
}
