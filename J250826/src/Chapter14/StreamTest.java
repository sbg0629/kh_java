package Chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class StreamTest {
public static void main(String[] args) {
	//업 캐스팅으로 arraylist 객체 생성
	List<Product> list = new ArrayList<Product>();
	list.add(new Product(1, "NotBook", 100));
	list.add(new Product(2, "Tv", 320));
	list.add(new Product(3, "washing machine", 250));
	list.add(new Product(4, "Air conditioner", 500));
	
	List<String> result = list.stream()
	
		.filter(p->p.price > 300)//가격이 300초과한 제품만 추출 람다식
		.map(p->p.name)//추출한 제품 이름
		.collect(Collectors.toList())
	;
	System.out.println(result);
}
}
