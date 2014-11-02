package com.github.armanddu.intraepitech.response;

//TODO POJO UserInfo

/*
 {
 "id":"iiiiii",
 "login":"dupuis_c",
 "title":"Armand Dupuis",
 "email":null,
 "internal_email":"dupuis_c@epitech.eu",
 "lastname":"Dupuis",
 "firstname":"Armand",
 "userinfo":"{\"_private\":{\"LastNoticeView\":\"2014-10-31 18:58:04\"}}",
 "referent_used":true,
 "picture":"dupuis_c.bmp",
 "picture_fun":null,
 "email_referent":null,
 "pass_referent":"iiii",
 "promo":2017,
 "semester":5,
 "uid":iiiii,
 "gid":iiii,
 "location":"FR\/STG",
 "documents":"vrac\/dupuis_c",
 "userdocs":"\/u\/epitech_2017\/dupuis_c\/cu",
 "shell":"\/usr\/site\/bin\/shell",
 "netsoul":null,
 "close":true|false,
 "close_reason":null,
 "ctime":"2013-12-06 04:00:58",
 "mtime":"2013-11-22 18:00:05",
 "comment":null,
 "id_promo":"iii",
 "id_history":"iii",
 "course_code":"bachelor\/classic",
 "school_code":"epitech",
 "school_title":"epitech",
 "old_id_promo":"iii,iii,iii,...",
 "old_id_location":"ii",
 "rights":{

 },
 "invited":true|false,
 "studentyear":i,
 "admin":true|false,
 "decoded":iiiiiiiii
 }
 */

public class IntraGlobalInfos {
	private String		id;
	private String		login;
	private String		title;
	private String		email;
	private String		internal_email;
	private String		lastname;
	private String		firstname;
	private String		userinfo;
	private boolean		referent_used;
	private String		picture;
	private String		picture_fun;
	private String		email_referent;
	private String		pass_referent;
	private Number		promo;
	private Number		semester;
	private Number		uid;
	private Number		gid;
	private String		location;
	private String		documents;
	private String		userdocs;
	private String		shell;
	private String		netsoul;
	private boolean		close;
	private String		close_reason;
	private String		ctime;
	private String		mtime;
	private String		comment;
	private String		id_promo;
	private String		id_history;
	private String		course_code;
	private String		school_code;
	private String		school_title;
	private String		old_id_promo;
	private String		old_id_location;
	private IntraRight	rights;
	private boolean		invited;
	private Number		studentyear;
	private boolean		admin;
	private Number		decoded;

	public Number getId() {
		return Integer.valueOf(id);
	}

	public String getLogin() {
		return login;
	}

	public String getTitle() {
		return title;
	}

	public String getEmail() {
		return email;
	}

	public String getInternal_email() {
		return internal_email;
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getUserinfo() {
		return userinfo;
	}

	public boolean isReferent_used() {
		return referent_used;
	}

	public String getPicture() {
		return picture;
	}

	public String getPicture_fun() {
		return picture_fun;
	}

	public String getEmail_referent() {
		return email_referent;
	}

	public Number getPass_referent() {
		return Integer.valueOf(pass_referent);
	}

	public Number getPromo() {
		return promo;
	}

	public Number getSemester() {
		return semester;
	}

	public Number getUid() {
		return uid;
	}

	public Number getGid() {
		return gid;
	}

	public String getLocation() {
		return location;
	}

	public String getDocuments() {
		return documents;
	}

	public String getUserdocs() {
		return userdocs;
	}

	public String getShell() {
		return shell;
	}

	public String getNetsoul() {
		return netsoul;
	}

	public boolean isClose() {
		return close;
	}

	public String getClose_reason() {
		return close_reason;
	}

	public String getCtime() {
		return ctime;
	}

	public String getMtime() {
		return mtime;
	}

	public String getComment() {
		return comment;
	}

	public Number getId_promo() {
		return Integer.valueOf(id_promo);
	}

	public Number getId_history() {
		return Integer.valueOf(id_history);
	}

	public String getCourse_code() {
		return course_code;
	}

	public String getSchool_code() {
		return school_code;
	}

	public String getSchool_title() {
		return school_title;
	}

	public String getOld_id_promo() {
		return old_id_promo;
	}

	public String getOld_id_location() {
		return old_id_location;
	}

	public IntraRight getRights() {
		return rights;
	}

	public boolean isInvited() {
		return invited;
	}

	public Number getStudentyear() {
		return studentyear;
	}

	public boolean isAdmin() {
		return admin;
	}

	public Number getDecoded() {
		return decoded;
	}

}
