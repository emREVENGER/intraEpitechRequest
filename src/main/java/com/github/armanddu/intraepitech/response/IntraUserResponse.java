package com.github.armanddu.intraepitech.response;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class IntraUserResponse {

	private String						login;
	private String						title;
	@SerializedName("internal_email")
	private String						internalEmail;
	@SerializedName("lastname")
	private String						lastName;
	@SerializedName("firstname")
	private String						firstName;
	@SerializedName("userinfo")
	private IntraUserInfo				userInfo;
	@SerializedName("referent_used")
	private boolean						referentUsed;
	private String						picture;
	@SerializedName("picture_fun")
	private String						pictureFun;
	private Number						promo;
	private Number						semester;
	private Number						uid;
	private Number						gid;
	private String						location;
	private String						documents;
	private String						userdocs;
	private String						shell;
	private boolean						close;
	private String						ctime;
	private String						mtime;
	@SerializedName("id_promo")
	private String						idPromo;
	@SerializedName("id_history")
	private String						idHistory;
	@SerializedName("course_code")
	private String						courseCode;
	@SerializedName("school_code")
	private String						schoolCode;
	@SerializedName("school_title")
	private String						schoolTitle;
	@SerializedName("old_id_promo")
	private String						oldIdPromo;
	@SerializedName("old_id_location")
	private String						oldIdLocation;
	private IntraRight					rights;
	private boolean						invited;
	@SerializedName("studentyear")
	private Number						studentYear;
	private boolean						admin;
	private boolean						editable;
	private ArrayList<IntraGroup>		groups;
	private ArrayList<IntraEvent>		events;
	private Number						credits;
	private ArrayList<IntraGpa>			gpa;
	private ArrayList<IntraAverageGpa>	averageGPA;
	private IntraSpice					spice;
	@SerializedName("nsstat")
	private IntraNsStat					nsStat;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInternalEmail() {
		return internalEmail;
	}

	public void setInternalEmail(String internalEmail) {
		this.internalEmail = internalEmail;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public IntraUserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(IntraUserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public boolean isReferentUsed() {
		return referentUsed;
	}

	public void setReferentUsed(boolean referentUsed) {
		this.referentUsed = referentUsed;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPictureFun() {
		return pictureFun;
	}

	public void setPictureFun(String pictureFun) {
		this.pictureFun = pictureFun;
	}

	public Number getPromo() {
		return promo;
	}

	public void setPromo(Number promo) {
		this.promo = promo;
	}

	public Number getSemester() {
		return semester;
	}

	public void setSemester(Number semester) {
		this.semester = semester;
	}

	public Number getUid() {
		return uid;
	}

	public void setUid(Number uid) {
		this.uid = uid;
	}

	public Number getGid() {
		return gid;
	}

	public void setGid(Number gid) {
		this.gid = gid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getUserdocs() {
		return userdocs;
	}

	public void setUserdocs(String userdocs) {
		this.userdocs = userdocs;
	}

	public String getShell() {
		return shell;
	}

	public void setShell(String shell) {
		this.shell = shell;
	}

	public boolean isClose() {
		return close;
	}

	public void setClose(boolean close) {
		this.close = close;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getMtime() {
		return mtime;
	}

	public void setMtime(String mtime) {
		this.mtime = mtime;
	}

	public String getIdPromo() {
		return idPromo;
	}

	public void setIdPromo(String idPromo) {
		this.idPromo = idPromo;
	}

	public String getIdHistory() {
		return idHistory;
	}

	public void setIdHistory(String idHistory) {
		this.idHistory = idHistory;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolTitle() {
		return schoolTitle;
	}

	public void setSchoolTitle(String schoolTitle) {
		this.schoolTitle = schoolTitle;
	}

	public String getOldIdPromo() {
		return oldIdPromo;
	}

	public void setOldIdPromo(String oldIdPromo) {
		this.oldIdPromo = oldIdPromo;
	}

	public String getOldIdLocation() {
		return oldIdLocation;
	}

	public void setOldIdLocation(String oldIdLocation) {
		this.oldIdLocation = oldIdLocation;
	}

	public IntraRight getRights() {
		return rights;
	}

	public void setRights(IntraRight rights) {
		this.rights = rights;
	}

	public boolean isInvited() {
		return invited;
	}

	public void setInvited(boolean invited) {
		this.invited = invited;
	}

	public Number getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(Number studentYear) {
		this.studentYear = studentYear;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public ArrayList<IntraGroup> getGroups() {
		return groups;
	}

	public void setGroups(ArrayList<IntraGroup> groups) {
		this.groups = groups;
	}

	public ArrayList<IntraEvent> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<IntraEvent> events) {
		this.events = events;
	}

	public Number getCredits() {
		return credits;
	}

	public void setCredits(Number credits) {
		this.credits = credits;
	}

	public ArrayList<IntraGpa> getGpa() {
		return gpa;
	}

	public void setGpa(ArrayList<IntraGpa> gpa) {
		this.gpa = gpa;
	}

	public ArrayList<IntraAverageGpa> getAverageGPA() {
		return averageGPA;
	}

	public void setAverageGPA(ArrayList<IntraAverageGpa> averageGPA) {
		this.averageGPA = averageGPA;
	}

	public IntraSpice getSpice() {
		return spice;
	}

	public void setSpice(IntraSpice spice) {
		this.spice = spice;
	}

	public IntraNsStat getNsStat() {
		return nsStat;
	}

	public void setNsStat(IntraNsStat nsStat) {
		this.nsStat = nsStat;
	}

}