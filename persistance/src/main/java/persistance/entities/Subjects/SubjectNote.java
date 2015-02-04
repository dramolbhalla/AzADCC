package persistance.entities.Subjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT_NOTE")
public class SubjectNote {
	
	@OneToOne
	private Subject subjectId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int note;
	
	@Column(name="subjectNote")
	private String subjectNote;
	
	/**
	 * Empty class constructor for subject table.
	 */
	public SubjectNote(){
		
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
	public String get_subjectNote(){
		return subjectNote;
	}
	
	/**
	 * 
	 * @param clinicId
	 */
	public void set_subjectLog(String subjectNote){
		this.subjectNote = subjectNote;
	}

}
