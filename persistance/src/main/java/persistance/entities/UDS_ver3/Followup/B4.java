/**
 * @author Amol Bhalla
 */

package persistance.entities.UDS_ver3.Followup;

import java.io.Serializable;

import persistance.entities.Subjects.Subject;
import persistance.entities.Users.User;

public class B4 implements Serializable{
	User user;
	Subject subject;
	Header header;
	
	int b4;
	int memory;
	int orient;
	int judgment;
	int commun;
	int homehobb;
	int perscare;
	int cdrsum;
	int cdrglob;
	int comport;
	int cdrlang;
	
	public B4() {
		super();
	}

	public B4(int b4, int memory, int orient, int judgment, int commun,
			int homehobb, int perscare, int cdrsum, int cdrglob, int comport,
			int cdrlang) {
		super();
		this.b4 = b4;
		this.memory = memory;
		this.orient = orient;
		this.judgment = judgment;
		this.commun = commun;
		this.homehobb = homehobb;
		this.perscare = perscare;
		this.cdrsum = cdrsum;
		this.cdrglob = cdrglob;
		this.comport = comport;
		this.cdrlang = cdrlang;
	}

	public B4(User user, Subject subject, Header header, int b4, int memory,
			int orient, int judgment, int commun, int homehobb, int perscare,
			int cdrsum, int cdrglob, int comport, int cdrlang) {
		super();
		this.user = user;
		this.subject = subject;
		this.header = header;
		this.b4 = b4;
		this.memory = memory;
		this.orient = orient;
		this.judgment = judgment;
		this.commun = commun;
		this.homehobb = homehobb;
		this.perscare = perscare;
		this.cdrsum = cdrsum;
		this.cdrglob = cdrglob;
		this.comport = comport;
		this.cdrlang = cdrlang;
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

	public int getB4() {
		return b4;
	}

	public void setB4(int b4) {
		this.b4 = b4;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getOrient() {
		return orient;
	}

	public void setOrient(int orient) {
		this.orient = orient;
	}

	public int getJudgment() {
		return judgment;
	}

	public void setJudgment(int judgment) {
		this.judgment = judgment;
	}

	public int getCommun() {
		return commun;
	}

	public void setCommun(int commun) {
		this.commun = commun;
	}

	public int getHomehobb() {
		return homehobb;
	}

	public void setHomehobb(int homehobb) {
		this.homehobb = homehobb;
	}

	public int getPerscare() {
		return perscare;
	}

	public void setPerscare(int perscare) {
		this.perscare = perscare;
	}

	public int getCdrsum() {
		return cdrsum;
	}

	public void setCdrsum(int cdrsum) {
		this.cdrsum = cdrsum;
	}

	public int getCdrglob() {
		return cdrglob;
	}

	public void setCdrglob(int cdrglob) {
		this.cdrglob = cdrglob;
	}

	public int getComport() {
		return comport;
	}

	public void setComport(int comport) {
		this.comport = comport;
	}

	public int getCdrlang() {
		return cdrlang;
	}

	public void setCdrlang(int cdrlang) {
		this.cdrlang = cdrlang;
	}
	
}
