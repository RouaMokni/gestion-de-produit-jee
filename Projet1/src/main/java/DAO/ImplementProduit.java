package DAO;
import java.util.List;
import entities.Produit;

public interface ImplementProduit {
	public void addProduit(Produit p);
	public List<Produit> getAllProduit();
	public void deleteProduit(int id);
	public Produit getProductById(int id);
	public List <Produit> getProductByPMc(String mc);
	public void UpdateProduct(Produit p);

}
