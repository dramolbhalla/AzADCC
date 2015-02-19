/**
 * @author Amol Bhalla
 */

package persistance.entities.UDS_ver3.Initial;

import java.io.Serializable;

import persistance.entities.Subjects.Subject;
import persistance.entities.UDS_ver3.Initial.Header;
import persistance.entities.Users.User;

public class A4G implements Serializable{
	User user;
	Subject subject;
	Header header;
	
	int a4g;
	int anymeds;

	public A4G() {
		super();
	}

	public A4G(int a4g, int anymeds) {
		super();
		this.a4g = a4g;
		this.anymeds = anymeds;
	}

	public A4G(User user, Subject subject, Header header, int a4g, int anymeds) {
		super();
		this.user = user;
		this.subject = subject;
		this.header = header;
		this.a4g = a4g;
		this.anymeds = anymeds;
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
	public int getA4g() {
		return a4g;
	}
	public void setA4g(int a4g) {
		this.a4g = a4g;
	}
	public int getAnymeds() {
		return anymeds;
	}
	public void setAnymeds(int anymeds) {
		this.anymeds = anymeds;
	}
	
	

}
