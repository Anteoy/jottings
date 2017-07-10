package com.anteoy.lambda;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Alin
 */
/*匿名内部类 lambda(函数式接口) 方法引用（静态方法引用，实例方法引用，其他外部实例变量引用，构造方法）
* 函数式接口都用作方法的参数，其他部分通过Lambda表达式传递具体代码给它，
* 函数式接口和Lambda表达式还可用作方法的返回值，传递代码回调用者，将这两种用法结合起来，可以构造复合的函数，使程序简洁易读
* java8对接口的增强 接口的静态方法和默认方法
* 默认方法与抽象方法都是接口的方法，不同在于，它有默认的实现，实现类可以改变它的实现，也可以不改变。
* 引入默认方法主要是函数式数据处理的需求，是为了便于给接口增加功能。
* 接口中不能定义实例变量，而抽象类可以
* lambda（函数式接口作为方法返回值）==> 函数的复合 复合函数
* */

/*在没有默认方法之前，Java是很难给接口增加功能的，比如List接口，因为有太多非Java JDK控制的代码实现了该接口，如果给接口增加一个方法，
则那些接口的实现就无法在新版Java 上运行，必须改写代码，实现新的方法，这显然是无法接受的。函数式数据处理需要给一些接口增加一些新的方法，
所以就有了默认方法的概念，接口增加了新方法，而接口现有的实现类也不需要必须实现它。*/
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arrays.sort(files, Comparator.comparing(File::getName));

        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner"};
        List<String> players =  Arrays.asList(atp);

        // Old looping
        for (String player : players) {
            System.out.print(player + "; ");
        }

        System.out.println("");

        // Using lambda expression and functional operations
        players.forEach((player) -> System.out.print(player + "; "));

        System.out.println("");

        // Using double colon operator in Java 8
        players.forEach(System.out::println);

        System.out.println("");

        // Using anonymous innerclass
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();



        // Using lambda expression
        new Thread(() -> System.out.println("Hello world !")).start();

        // Using anonymous innerclass
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

        // Using lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");

        // Run em!
        race1.run();
        race2.run();
    }

}
