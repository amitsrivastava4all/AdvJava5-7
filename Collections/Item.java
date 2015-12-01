
public class Item implements Comparable<Item> {
private Integer id;
private String name;
private String desc;
private Double price;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Item (id=" + id + ", name=" + name + ", desc=" + desc + ", price="
			+ price + ")\n";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Item other = (Item) obj;
	if (desc == null) {
		if (other.desc != null)
			return false;
	} else if (!desc.equals(other.desc))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	return true;
}
public int compareTo(Item o) {
	// TODO Auto-generated method stub
	//return this.name.compareTo(o.name);
	//return this.name.compareToIgnoreCase(o.name);
	return o.name.compareToIgnoreCase(this.name);
}



/*@Override
public boolean equals(Object o){
	Item item = null;
	boolean result = false;
	if(o instanceof Item){
		item = (Item)o;
		if(this.id==item.id && this.name.equals(item.name) && this.desc.equals(item.desc)){
			result = true;
		}
	}
	return result;
}*/

}
