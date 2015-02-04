/**
 * @author Amol Bhalla
 *
 */
package persistance.entities.Subjects;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="SUBJECT")
public class Subject {
	
	//Subject ID is the primary key for table, 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	
	@Column(name="subjectId")
	private String subjectId;
	
	@Column(name="clinicId")
	private String clinicId;
	
	@OneToMany
	private Set<SubjectLog> subjectLogs;
	
	@OneToMany
	private Set<SubjectNote> subjectNotes;
	
	@OneToOne
	private SubjectPersonalInfo subjectPersonalInfo;
	
	/**
	 * Empty class constructor for subject table.
	 */
	public Subject(){
		
	}
	
	/**
	 * 
	 * @param subjectId
	 * @param clinicId
	 */
	public Subject(String subjectId, String clinicId){
		this.clinicId = clinicId;
		this.subjectId = subjectId;
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
	public void set_subjectLog(Set<SubjectLog> subjectLog){
		this.subjectLogs = subjectLog;
	}
	
	/**
	 * 
	 * @return
	 */
	public Set<SubjectLog> get_subjectLog(){
		return subjectLogs;
	}
	
	/**
	 * 
	 * @return
	 */
	public Set<SubjectNote> get_notes () {
		return subjectNotes;
	}
	
	/**
	 * 
	 * @param subjectNote
	 */
	public void set_notes (Set<SubjectNote> subjectNote){
		this.subjectNotes = subjectNote;
	}
}
