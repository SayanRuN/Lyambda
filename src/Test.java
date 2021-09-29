public class Test {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,2);
        int c = calc.devide.apply(a,b);

        calc.println.accept(c);

        Worker.OneTaskDoneListener listener = System.out::println;
        Worker.OneTaskErrorListener listener1 = System.out :: println;
        Worker worker = new Worker(listener, listener1);
        worker.start();
    }
}