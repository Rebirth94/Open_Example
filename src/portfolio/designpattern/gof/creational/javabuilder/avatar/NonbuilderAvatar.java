package portfolio.designpattern.gof.creational.javabuilder.avatar;

public class NonbuilderAvatar {
	private String nickName;
	private String occupation;
	private String gender;
	
	public NonbuilderAvatar() {}
	public NonbuilderAvatar(String nickName, String occupation, String gender
			,String arg4, String arg5, String arg6,String arg7,String arg8) {}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
