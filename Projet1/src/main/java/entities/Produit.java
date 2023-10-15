package entities;

public class Produit {
int id;
String name;
float prix;
int quantities;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
public int getQuantities() {
	return quantities;
}
public void setQuantities(int quantities) {
	this.quantities = quantities;
}
public Produit(int id, String name, float prix, int quantities) {
	super();
	this.id = id;
	this.name = name;
	this.prix = prix;
	this.quantities = quantities;
}
public Produit() {
	super();
}
@Override
public String toString() {
	return "Produit [id=" + id + ", name=" + name + ", prix=" + prix + ", quantities=" + quantities + "]";
}
}
