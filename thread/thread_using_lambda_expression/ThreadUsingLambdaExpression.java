package thread.thread_using_lambda_expression;

public class ThreadUsingLambdaExpression {
	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> System.out.println("Created Thread Using Lambda Expression"));
		
		thread.start();
	}
}
