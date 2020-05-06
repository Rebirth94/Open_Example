package portfolio.designpattern.gof.creational.javabuilder;

import portfolio.designpattern.gof.creational.javabuilder.avatar.Avatar;
import portfolio.designpattern.gof.creational.javabuilder.avatar.NonbuilderAvatar;

/**
 * (자바)빌더 패턴
 * 자바 진영에서 주로 사용하는 빌더 패던으로
 * 자바 빌더 패턴을 따로 써놓은 이유는 GOF빌더 패턴과 개념과 목적이 다르며
 * 그렇지만 자바에서 자주 사용되기에 따로 정리했다
 * 
 * 우선 자바에서 빌더 패턴을 대체 할 간단한 패턴이 몇 가지 있다
 * 점층적 생성자 패턴 : 생성자를 오버로딩해서 인자 값으로 전부 받는 방법
 * (코드)
 * 자바빈 패턴 : 관례에 따라 Getter,Setter로 구성된 자바의 표준 객체인 자바빈을 이용한 방법
 * (코드)
 * 
 * GOF에서의 빌더 패턴은 객체의 생성 과정과 표현 방법을 분리하는게 목적이었다
 * 자바에서의 빌더 패턴은 주된 목적이 객체 일관성을 유지하면서 불변 객체를 만드는데에 있으며
 * 빌더의 setter메소드명을 통하여 가독성을 높여준다.
 * 
 * 간단히 게임 캐릭터를 생성한다고 해보자
 * 아바타 객체의 속성은 닉네임,성별,직업 3가지로 가정한다.
 */
public class JavaBuilderClient {
	public static void main(String[] args) {
		// 점층적 생성자 패턴으로 인한 수많은 인자 값
		// 인자 값이 많을수록 가독성을 심하게 해친다
		NonbuilderAvatar nbAvatar = new NonbuilderAvatar("nickName", "occupation", "gender", "arg4", "arg5", "arg6", "arg7", "arg8");
		
		// 자바빈 패턴으로 
		nbAvatar = new NonbuilderAvatar();
		nbAvatar.setNickName("닉네임");
		nbAvatar.setOccupation("직업");
		nbAvatar.setGender("남");
		
		
		Avatar avatar = new Avatar.Builder()
				.setNickName("닉네임")
				.setOccupation("전사")
				.setGender("남")
				.build();
		
		System.out.println(avatar.toString());
	}
}
