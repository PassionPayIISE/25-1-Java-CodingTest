import java.util.*;

public class bj_17478 {
	
	static String underBar = "";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		func(n);
	}
	
	public static void func(int n) {
		String temp = underBar;

        if(n == 0){
            System.out.println(temp + "\"재귀함수가 뭔가요?\" ");
            System.out.println(temp + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(temp + "라고 답변하였지. ");
            return;
        }

        System.out.println(temp + "\"재귀함수가 뭔가요?\"");
        System.out.println(temp + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어. ");
        System.out.println(temp + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지. ");
        System.out.println(temp + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        underBar += "____";

        func(n-1);

        System.out.println(temp + "라고 답변하였지. ");
    
	}
}
