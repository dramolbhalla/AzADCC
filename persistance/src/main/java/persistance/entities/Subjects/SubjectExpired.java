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
	private boolean subjectExpired;

	@Column(name="subjectExpiredAge")
	private int subjectExpiredAge;

	@Column(name="subjectExpiredDate")
	private int subjectExpiredDate;
	
	@Column(name="subjectExpiredMonth")
	private int subjectExpiredMonth;
	
	@Column(name="subjectExpiredYear")
	private int subjectExpiredYear;
	
	@Column(name="subjectExpiredReason")
	private String subjectExpiredReason; 
	
	/**
	 * Empty class constructor for subject table.
	 */
	public SubjectExpired(){
		
	}
	
	/**
	 * Default constructor for SubjectExpired Class
	 * @param subjectExpired
	 * @param subjectExpiredAge
	 * @param subjectExpiredDate
	 * @param subjectExpiredMonth
	 * @param subjectExpiredYear
	 * @param subjectExpiredReason
	 */
	public SubjectExpired(boolean subjectExpired, int subjectExpiredAge, int subjectExpiredDate, int subjectExpiredMonth, int subjectExpiredYear, String subjectExpiredReason){
		this.subjectExpired = subjectExpired;
		this.subjectExpiredAge = subjectExpiredAge;
		this.subjectExpiredDate = subjectExpiredDate;
		this.subjectExpiredMonth = subjectExpiredMonth;
		this.subjectExpiredYear = subjectExpiredYear;
		this.subjectExpiredReason = subjectExpiredReason;
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
	public boolean get_subjectExpired (){
		return subjectExpired;
	}
	
	/**
	 * 
	 * @param subjectExpired
	 */
	public void set_subjectedExpired (boolean subjectExpired){
		this.subjectExpired = subjectExpired;
	}
	
	/**
	 * 
	 * @return
	 */
	public int get_subjectExpiredAge (){
		return subjectExpiredAge;
	}
	
	/**
	 * 
	 * @param subjectExpiredAge
	 */
	public void set_subjectedExpiredAge (int subjectExpiredAge){
		this.subjectExpiredAge = subjectExpiredAge;
	}
	
	/**
	 * 
	 * @return
	 */
	public int get_subjectExpiredDate (){
		return subjectExpiredDate;
	}
	
	/**
	 * 
	 * @param subjectExpiredDate
	 */
	public void set_subjectedExpiredDate (int subjectExpiredDate){
		this.subjectExpiredDate = subjectExpiredDate;
	}
	
	/**
	 * 
	 * @return
	 */
	public int get_subjectExpiredMonth (){
		return subjectExpiredMonth;
	}
	
	/**
	 * 
	 * @param subjectExpiredDate
	 */
	public void set_subjectedExpiredMonth (int subjectExpiredMonth){
		this.subjectExpiredMonth = subjectExpiredMonth;
	}
	
	/**
	 * 
	 * @return
	 */
	public int get_subjectExpiredYear (){
		return subjectExpiredYear;
	}
	
	/**
	 * 
	 * @param subjectExpiredDate
	 */
	public void set_subjectedExpiredYear (int subjectExpiredYear){
		this.subjectExpiredYear = subjectExpiredYear;
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
