package ch08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	Map<String, Product> products = new HashMap<>();
	
	// 제품 정보 Map에 담음
	public ProductService() {
		Product p = new Product("101", "아이폰12", "애플", 120, "2020.12.12");
		products.put("101", p);
		p = new Product("102", "갤럭시21", "삼성", 130, "2021.02.02");
		products.put("102", p);
		p = new Product("103", "듀얼", "엘쥐", 150, "2021.03.02");
		products.put("103", p);
	}
	
	// 전체 목록 보기 메소드
	public List<Product> findAll() {
		return new ArrayList<>(products.values());
	}
	
	// 단일 목록 보기 메소드
	public Product find(String id) {
		return products.get(id);
	}

}
