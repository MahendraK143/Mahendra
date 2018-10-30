import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestForEach8 {
    public static void main(String arg[]){
        List<Integer> nos = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        nos.forEach(System.out::print);
        System.out.println();
        //nos=nos.stream().map(e -> e*e).collect(Collectors.toList());
        nos = nos.parallelStream().map(e -> e*e*e).collect(Collectors.toList());
        nos.forEach(System.out::print);
        nos=nos.stream().filter(e -> e!=0).collect(Collectors.toList());
        System.out.println();
        nos.forEach(System.out::print);
        long count=nos.stream().filter(e -> e!=0).count();
        System.out.println();
        System.out.println(count);
        System.out.println();
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        List<String> sss = Arrays.asList("Mahendra","","Kola","PK","*");
        String string=sss.stream().filter(s -> s!="").collect(Collectors.joining(","));
        System.out.println(string);
        IntSummaryStatistics statistics=nos.stream().mapToInt(e -> e).summaryStatistics();
        System.out.println(statistics.getCount());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
    }
}
