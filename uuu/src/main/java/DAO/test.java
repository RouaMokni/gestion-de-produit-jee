package DAO;
import java.util.ArrayList;
import java.util.List;

import entities.Produit;
public class test {
public static void main (String [] args ) {
//------------------------------------------------------------------------
	//add product
	/*
	Produit p = new Produit(1,"tv",2,7);
	GestionProduit g= new GestionProduit();
	g.addProduit(p);
	*/
//-------------------------------------------------------------------
	// get by id
	/*
	 GestionProduit g = new GestionProduit();
     Produit p = g.getProductById(2); 
    if (p != null) {
        
        System.out.println(p.toString());
    } else {
        System.out.println("Product not found.");
    }
*/
//----------------------------------------------------------
	//delete
/*
	Produit p = new Produit();
	GestionProduit g= new GestionProduit();
	g.deleteProduit(1);
*/
//--------------------------------------------------------
	//get by PMC
	/*GestionProduit g = new GestionProduit();
	List<Produit> liste = g.getProductByPMc("pc");
	if (liste != null) {
	    for (Produit p : liste) {
	        System.out.println(p.toString());
	    }
	} else {
	    System.out.println("No products found with the name 'camera'.");
	}*/
//-------------------------------------------------------------
	//get all product
	/*
	GestionProduit g = new GestionProduit();
	List <Produit> liste= g.getAllProduit();
	if(liste != null) {
		for(Produit p : liste) {
			System.out.println(p.toString());
		}
	}*/
	/*
	Produit p = new Produit();
	GestionProduit g = new GestionProduit();
	
	p.setName("tt"); 
	p.setPrix(5); 
	p.setQuantities(6); 
	p.setId(3);
	
	p.setName("aa");
	g.UpdateProduct(p);   
	 
     */
	
	
}}



