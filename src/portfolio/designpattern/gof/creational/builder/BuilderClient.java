package portfolio.designpattern.gof.creational.builder;

import portfolio.designpattern.gof.creational.builder.builder.ArcherBuilder;
import portfolio.designpattern.gof.creational.builder.builder.AvatarBuilder;
import portfolio.designpattern.gof.creational.builder.builder.WarriorBuilder;
import portfolio.designpattern.gof.creational.builder.director.AvatarDirector;
import portfolio.designpattern.gof.creational.builder.director.JumpingAvatarDirector;
import portfolio.designpattern.gof.creational.builder.director.NormalAvatarDirector;

/**
 * (GOF)빌더 패턴
 * 복합 객체의 생성 과정과 표현 방법을 분리하여
 * 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴이다.
 * 
 * 빌더 패턴에는 사용하는 객체
 * Product : 생성 할 대상 객체
 * Builder : Product생성의 책임을 담당 할 객체
 * Director : Builder객체를 이용해서 표현의 책임을 담당 할 객체 
 * 
 * 주의할 점은 다른 개념으로 사용되는 같은 이름의 빌더 패턴이 있다
 * 일반적으로 OOP개념으로의 빌더 패턴은 지금 다룰 내용이 맞으나
 * 자바에서 별도의 개념으로 자주 사용하는 빌더 패턴이 있어 따로 정리했다
 * 
 * 우선 GOF의 빌더 패턴의 예제로 게임 캐릭터를 생성 한다고 할때
 * 캐릭터의 직업은 3가지(전사,궁수,마법사)이며
 * 캐릭터를 생성하는데 레벨 1부터 장비도 없이 시작하는 일반 캐릭터와
 * 레벨 100부터 시작하고 장비까지 다 맞춰진 점핑 캐릭터를 생성한다고 가정하자
 */
public class BuilderClient {
	public static void main(String[] args) {
		AvatarBuilder wBuilder = new WarriorBuilder("초보 전사");
		AvatarDirector normalDirector = new NormalAvatarDirector(wBuilder);

		System.out.println(normalDirector.build().toString());
		
		AvatarBuilder aBuilder = new ArcherBuilder("점핑 궁수");
		AvatarDirector jumpingDirector = new JumpingAvatarDirector(aBuilder);

		System.out.println(jumpingDirector.build().toString());
	}
}
