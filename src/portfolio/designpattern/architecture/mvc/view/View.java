package portfolio.designpattern.architecture.mvc.view;

public class View {

	public static void jspLanding() {
		System.out.println("<html>");
		System.out.println("	<head>");
		System.out.println("		<title> 랜딩 페이지 </title>");
		System.out.println("	</head>");
		System.out.println("	<body>");
		System.out.println("		...");
		System.out.println("		Model 데이터");
		System.out.println("		...");
		System.out.println("	</body>");
		System.out.println("</html>");
	}
	
	public static void jspMain() {
		System.out.println("<html>");
		System.out.println("	<head>");
		System.out.println("		<title> 메인 페이지 </title>");
		System.out.println("	</head>");
		System.out.println("	<body>");
		System.out.println("		...");
		System.out.println("		Model 데이터");
		System.out.println("		...");
		System.out.println("	</body>");
		System.out.println("</html>");
	}
	
	public static void jspLoginScript(boolean isLoginSuccess) {
		if(isLoginSuccess == true) {
			System.out.println("(alert) 로그인 되었습니다.");
		} else {
			System.out.println("(alert) 로그인 실패 하였습니다.");
		}
	}
}
