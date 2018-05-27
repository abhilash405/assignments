/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

/**
 *
 * @author Abhilash
 */
public class Item {
    private String name;
	private int price;
	private String type;
	
	public Item(String name, int price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price + ", type=" + type ;
    }
        
}
