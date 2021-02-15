package portfolio.designpattern.architecture.mvvm.viewmodel;

import java.util.Observable;
import java.util.Scanner;

import portfolio.designpattern.architecture.mvvm.model.LoginService;


public class LoginViewModel extends Observable {
	private static final LoginViewModel instance = new LoginViewModel();
	
	public static LoginViewModel getInstance() {
		return LoginViewModel.instance;
	}
	
	private final LoginService loginService = new LoginService();
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		setChanged();
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
		setChanged();
	}
	
	public void login(Scanner sc) {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		Integer age = sc.nextInt();
		
		loginService.isValidAccount();
		setData(name, age);;
		notifyObservers();
	}
	
	public void logout() {
		setData(null, null);
	}
	
	public void setData(String name, Integer age) {
		setName(name);
		setAge(age);
		notifyObservers();
	}
	
	public boolean isLogin() {
		if(age == null || name == null || name.isEmpty()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "LoginViewModel [name=" + name + ", age=" + age + "]";
	}
	
}
