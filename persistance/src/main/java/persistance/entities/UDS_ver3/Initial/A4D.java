/**
 * @author Amol Bhalla
 */

package persistance.entities.UDS_ver3.Initial;

import java.io.Serializable;

import persistance.entities.Subjects.Subject;
import persistance.entities.UDS_ver3.Initial.Header;
import persistance.entities.Users.User;

public class A4D implements Serializable {
	User user;
	Subject subject;
	Header header;
	
	int a4d;
	String drugid;
	
	public A4D() {
		super();
	}
	public A4D(int a4d, String drugid) {
		super();
		this.a4d = a4d;
		this.drugid = drugid;
	}
	public A4D(User user, Subject subject, Header header, int a4d, String drugid) {
		super();
		this.user = user;
		this.subject = subject;
		this.header = header;
		this.a4d = a4d;
		this.drugid = drugid;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public int getA4d() {
		return a4d;
	}
	public void setA4d(int a4d) {
		this.a4d = a4d;
	}
	public String getDrugid() {
		return drugid;
	}
	public void setDrugid(String drugid) {
		this.drugid = drugid;
	}

}
