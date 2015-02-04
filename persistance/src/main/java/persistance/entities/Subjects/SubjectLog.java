package persistance.entities.Subjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT_LOG")
public class SubjectLog {
	
	@OneToOne
	private Subject subjectId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int log;
	
	@Column(name="subjectLog")
	private String subjectLog;
	
	/**
	 * Empty class constructor for subject table.
	 */
	public SubjectLog(){
		
	}
	
	/**
	 * Default constructor for SubjectLog table.
	 * @param subjectLog
	 */
	public SubjectLog(String subjectLog){
		this.subjectLog = subjectLog;
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
	public String get_subjectLog(){
		return subjectLog;
	}
	
	/**
	 * 
	 * @param clinicId
	 */
	public void set_subjectLog(String subjectLog){
		this.subjectLog = subjectLog;
	}

}
