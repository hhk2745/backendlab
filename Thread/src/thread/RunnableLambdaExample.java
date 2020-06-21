package thread;

public class RunnableLambdaExample {
    RunnableLambdaExample(){
        Runnable r2 = () -> System.out.println("lambda, world!");
        r2.run();
    }
}
