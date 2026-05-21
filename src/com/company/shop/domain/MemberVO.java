/**
 * 파일명: MemberVO.java <br>
 * 설명 :   <br>
 * 작성자: CannedCorn  <br>
 * 생성일: 2026-05-21 <br>
 */
package com.company.shop.domain;

/**
 * 
 */
public class MemberVO {

	private String memberId;
	private String name;
	private String password;
	private String email;
	private String regDate;
	private String role;
	/**
	 * @param memberId
	 * @param name
	 * @param password
	 * @param email
	 * @param regDate
	 * @param role
	 */
	public MemberVO(String memberId, String name, String password, String email, String regDate, String role) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.regDate = regDate;
		this.role = role;
	}
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the regDate
	 */
	public String getRegDate() {
		return regDate;
	}
	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", regDate=" + regDate + ", role=" + role + ", toString()=" + super.toString() + "]";
	}

	
}
