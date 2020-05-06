package portfolio.designpattern.gof.creational.javabuilder.avatar;

public class Avatar {
	private final String nickName;
	private final String occupation;
	private final String gender;
	
	public static class Builder {
		private String nickName;
		private String occupation;
		private String gender;
		public Builder setNickName(String nickName) {
			this.nickName = nickName;
			return this;
		}
		public Builder setOccupation(String occupation) {
			this.occupation = occupation;
			return this;
		}
		public Builder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		public Avatar build() {
			return new Avatar(nickName, occupation, gender);
		}
	}
	
	public Avatar(String nickName, String occupation, String gender) {
		this.nickName = nickName;
		this.occupation = occupation;
		this.gender = gender;
	}

	public String getNickName() {
		return nickName;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Avatar [nickName=" + nickName + ", occupation=" + occupation + ", gender=" + gender + "]";
	}
	
}
