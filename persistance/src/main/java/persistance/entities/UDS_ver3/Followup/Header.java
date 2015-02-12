/**
 * @author Amol Bhalla
 */

package persistance.entities.UDS_ver3.Followup;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import persistance.entities.Subjects.*;
import persistance.entities.Users.*;

@Entity 
@Table(name = "HEADER", catalog = "uds_ver3_followup", uniqueConstraints = {
		@UniqueConstraint(columnNames = "USER_ID"),
		@UniqueConstraint(columnNames = "USER_USERID"),
		@UniqueConstraint(columnNames = "USER_ACCESSLEVEL") })
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("HEADER")
public class Header implements Serializable{
	User user;
	Subject subject;
	
	int header;
	String packet;
	String formid;
	int formver;
	int adcid;
	String ptid;
	int visitmo;
	int visitday;
	int visityr;
	int visitnum;
	String initials;
	
	public Header(){
		
	}
}
