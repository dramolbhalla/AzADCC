package persistance.entities.Centers;

public class Center {
	
	int cid;
	String centerId;
	String centerNumber;  
	String centerName; 
	String centerContactTitle; 
	String centerContactFirstName; 
	String centerContactLastName; 
	String centerContactJobTitle; 
	String centerAddress1; 
	String centerAddress2; 
	String centerCity; 
	String centerState;  
	String centerZip; 
	String centerPhone; 
	String centerFax; 
	String centerNote;
	
	public int get_cid (){
		return cid;
	}
	
	public void set_cid( int cid){
		this.cid = cid;
	}
	
	public String get_centerId(){
		return centerId;
	}
	
	public void set_centerId(String centerId){
		this.centerId = centerId;
	}
	
	public String get_centerNumber(){
		return centerNumber;
	}
	
	public void set_centerNumber(String centerNumber){
		this.centerNumber = centerNumber;
	}
	
	public String get_centerName(){
		return centerName;
	}
	
	public void set_centerName(String centerName){
		this.centerName = centerName;
	}

	public String get_centerContactTitle(){
		return centerContactTitle;
	}
	
	public void set_centerContactTitle(String centerContactTitle){
		this.centerContactTitle = centerContactTitle;
	}
	
	public String get_centerContactFirstName(){
		return centerContactFirstName;
	}
	
	public void set_centerContactFirstName(String centerContactFirstName){
		this.centerContactFirstName = centerContactFirstName;
	}
	
	public String get_centerContactLastName(){
		return centerContactLastName;
	}
	
	public void set_centerContactLastName(String centerContactLastName){
		this.centerContactLastName = centerContactLastName;
	}
	
	public String get_centerContactJobTitle(){
		return centerContactJobTitle;
	}
	
	public void set_centerContactJobTitle(String centerContactJobTitle){
		this.centerContactJobTitle = centerContactJobTitle;
	}
	
	public String get_centerAddress1(){
		return centerAddress1;
	}
	
	public void set_centerAddress1(String centerAddress1){
		this.centerAddress1 = centerAddress1;
	}
}
