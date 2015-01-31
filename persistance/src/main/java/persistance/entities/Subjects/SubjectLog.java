package persistance.entities.Subjects;

public class SubjectLog {
	
	int sid;
	String subjectId;
	String subjectLog;
	
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
