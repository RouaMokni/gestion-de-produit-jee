package DAO;
import java.sql.*;

import java.util.*;

import entities.Produit;


public class GestionProduit implements ImplementProduit {

	@Override
	public void addProduit(Produit p) {
		Connection cx = SingletonConnection.getConnection();
		try {
			PreparedStatement st = cx.prepareStatement("insert into t_produit (id,name,prix,quantities) values(?,?,?,?)");
			st.setInt(1,p.getId());
			st.setString(2,p.getName());
			st.setFloat(3,p.getPrix());
			st.setInt(4,p.getQuantities());
			st.executeUpdate();
			System.out.print("produit ajouté");
			
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public List<Produit> getAllProduit() {
		Connection cx = SingletonConnection.getConnection();
		List<Produit> liste =new ArrayList<>();
		try {
			PreparedStatement ps = cx.prepareStatement("select * from t_produit");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit p = new Produit();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrix(rs.getFloat(3));
				p.setQuantities(rs.getInt(4));
				liste.add(p);
				System.out.print("produits existes");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}return liste;
	}

	@Override
	public void deleteProduit(int id) {
		Connection cx = SingletonConnection.getConnection();
		try {
			PreparedStatement st = cx.prepareStatement("delete from t_produit where id=?");
			st.setInt(1, id);
			st.executeUpdate();
			System.out.print("produit supprimé");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Produit getProductById(int id) {
		Connection cx = SingletonConnection.getConnection();
		Produit p = null;
		try {
			PreparedStatement ps = cx.prepareStatement("select * from t_produit where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p = new Produit();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrix(rs.getFloat(3));
				p.setQuantities(rs.getInt(4));
				System.out.print("produit trouvé");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<Produit> getProductByPMc(String mc) {
		Connection cx = SingletonConnection.getConnection();
		List<Produit>liste = new ArrayList<>();
		try {
			PreparedStatement ps =cx.prepareStatement("select * from t_produit where name like ?");
			ps.setString(1,"%"+mc+"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit p = new Produit();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrix(rs.getFloat(3));
				p.setQuantities(rs.getInt(4));
				liste.add(p);
				System.out.print("produit trouvé");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public void UpdateProduct(Produit p) {
		Connection cx = SingletonConnection.getConnection();
		try {
			PreparedStatement st = cx.prepareStatement("update t_produit set name=?,prix=?,quantities=? where id=?");
			st.setString(1, p.getName());
			st.setFloat(2,p.getPrix());
			st.setInt(3, p.getQuantities());
			st.setInt(4, p.getId());
			st.executeUpdate();
			System.out.print("produit modifié");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
