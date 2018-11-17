package com.example.taoxiao;

public class user {
	private int id;
	private String name;
	private String address;
	private String phonenumber;
	private String wechat;
	private String email;
	private String qq;
	private String word;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
}
/*
CREATE TABLE IF NOT EXISTS `user`(
`id` INT UNSIGNED AUTO_INCREMENT,
`name` VARCHAR(100) NOT NULL,
`address` VARCHAR(100),
`phonenumber` VARCHAR(100),
`wechat` VARCHAR(100),
`email` VARCHAR(100),
`qq` VARCHAR(100),
`word` TEXT,
PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

insert into `user` values(null,'a','abc','123','1234','123@','213','sdjfdkdkl');
insert into `user` values(null,'b','abc','123','1234','123@','213','sdjfdkdkl');
*/
