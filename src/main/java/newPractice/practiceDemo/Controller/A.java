//package newPractice.practiceDemo.Controller;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class A {
//
//
//    public static void main(String[] args) {
////        List< Integer> ints = List.of(1,2,4,5,6,7,8,9,0,7);
////        List<Integer> collect = ints.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
////        List<Integer> collects = ints.stream().map(i -> i * 2).collect(Collectors.toList());
////        List<Integer> collectss =ints.stream().sorted((a , b )-> (b - a)).collect(Collectors.toList());
////        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
////        limit.forEach(System.out::println);
////        List<String> collect1 = Stream.generate(() -> "hello rahul").limit(122).collect(Collectors.toList());
////        Stream<Integer> limit1 = Stream.iterate(2, n -> n + 2).limit(10);
////
////        limit1.forEach(System.out::println);
//
//             String str = "rahul";
//        Predicate<Integer> rahul = x -> x % 2 == 0 ;
//        Function<Integer,Integer> suraj = x -> x*x;
//        Consumer<Integer> gajanan = x-> System.out.println(2);
//        Supplier<Integer> tt = ()-> 12;
//
//
//    }
//}