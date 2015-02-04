/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Subjects;

import javax.persistence.*;


@Entity
public class Subject {
	
	//Subject ID is the primary key for table, 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	
	private String subjectId;
	private String clinicId;
	private String subjectLog;
	private String notes;
	
	/**
	 * Empty class constructor for subject table.
	 */
	public Subject(){
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int get_sid(){
	     return sid;
	}
	
	/**
	 * 
	 * @param uid
	 */
	public void set_sid(int sid){
		this.sid = sid;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_subjectId(){
		return subjectId;
	}
	
	/**
	 * 
	 * @param userId
	 */
	public void set_subjectId(String subjectId){
		this.subjectId = subjectId;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_clinicId(){
		return clinicId;
	}
	
	/**
	 * 
	 * @param clinicId
	 */
	public void set_clinicId(String clinicId){
		this.clinicId = clinicId;
	}
	
	/**
	 * 
	 * @param subjectLog
	 */
	public void set_subjectLog(String subjectLog){
		this.subjectLog = subjectLog;
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
	 * @return
	 */
	public String get_notes () {
		return notes;
	}
	
	/**
	 * 
	 * @param notes
	 */
	public void set_notes (String notes){
		this.notes = notes;
	}
}
