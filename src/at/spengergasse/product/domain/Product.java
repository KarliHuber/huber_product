package at.spengergasse.product.domain

import java.util.*

//https://github.com/KarliHuber/huber_product.git
public class Product()
{
	//properties
	public LinkedList products;
	public float price = 10;
	public boolean onStock = true;
	
	//constructor
	public Product()
	{
		products = new LinkedList();
	}
}