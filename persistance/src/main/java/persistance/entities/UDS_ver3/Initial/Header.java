/**
 * @author Amol Bhalla
 */

package persistance.entities.UDS_ver3.Initial;

import persistance.entities.Subjects.Subject;
import persistance.entities.Users.User;

public class Header {
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
}
