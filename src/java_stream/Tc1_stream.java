package java_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tc1_stream {

	public static void main(String[] args) {

List<String> nam= Arrays.asList("Abhishek","Rama","Alekhya","Adam", "Mary") ;		
		
Stream<String> names = Stream.of("Abhishek","Rama","Alekhya","Adam", "Mary");
Stream<String> name = Stream.of("Abhishek","Rama","Alekhya","Adam", "Mary");
long m = name.count();
long n = names.filter(s->s.startsWith("A")).count();
int o = nam.size();
System.out.println(n);
System.out.println(m);
System.out.println(o);
System.out.print("\n");

nam.stream().filter(s->s.endsWith("a")).sorted().forEach(s->System.out.println(s));
System.out.print("\n");

nam.stream().filter(s->s.startsWith("A")).filter(s->s.endsWith("a")).forEach(s->System.out.println(s));
System.out.print("\n");

nam.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
System.out.print("\n");

List<String> initiators= nam.stream().filter(s->s.startsWith("A")).sorted().collect(Collectors.toList());
System.out.print(initiators + "\n");

List<Number> values = List.of(1,3,2,2,5,8,2,9);
long countOf = values.stream().filter(s->s.equals(2)).count();
System.out.println("\n" + countOf);

//List<String> value = Arrays.asList("1","3","2","2","5","8","2","9");
//value.stream().filter(s->s.dsitinct);


	}

}
