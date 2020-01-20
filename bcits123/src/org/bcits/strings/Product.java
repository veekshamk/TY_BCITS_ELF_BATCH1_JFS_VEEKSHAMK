package org.bcits.strings;
public class Product 
{
public static void main(String[] args) 
{
		ProductBean p1=new ProductBean();
		p1.setId(1);
		p1.setName("tomato");
		p1.setPrice(100);
		
		ProductBean p2=new ProductBean();
		p2.setId(2);
		p2.setName("onion");
		p2.setPrice(200);
		
		ProductBean p3=new ProductBean();
		p3.setId(3);
		p3.setName("potato");
		p3.setPrice(50);
		
		ProductBean p4=new ProductBean();
		p4.setId(4);
		p4.setName("carrot");
		p4.setPrice(100);
		
		Object a[]= {p1,p2,p3,p4};
		for(Object p:a)
		{
			System.out.println(p);
		}

}
}
