package persistance.entities.Subjects;

public class SubjectExpired {

	int sid;
	String subjectId;
	String subjectExpired;
    String subjectExpiredAge; 
    String subjectExpiredDate;
    String subjectExpiredReason; 
	
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
