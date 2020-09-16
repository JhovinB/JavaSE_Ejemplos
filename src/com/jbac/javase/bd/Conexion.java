package com.jbac.javase.bd;

import java.security.spec.RSAKeyGenParameterSpec;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Conexion {
	
	private Connection con;
	
	public void conectarse() {
			
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/crud","postgres","123456");
			System.out.println("Conectado exitosa!");
			
		} catch (Exception e) {
			System.out.println("Este fue el error "+e.getMessage());
			
		}
		
	}	
	public void desconectarse() {
		
		try {
			if(con !=null) {
				con.close();
				System.out.println("Conexion cerrada");
			}
			
		} catch (Exception e) {
			System.out.println("Este fue el error"+e.getMessage());
		}
	}
	public List<Persona>listar() throws SQLException{
		List<Persona> personas = new ArrayList<>();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM PERSONA");
			
			while(rs.next()) {
				Persona p = new Persona();
				p.setId(rs.getInt("id"));
				p.setNombres(rs.getString("nombres"));
				p.setApellidos(rs.getString("apellidos"));
				
				personas.add(p);
			}
		} catch (Exception e) {
			System.out.println("Este fue el error"+e.getMessage());
		}finally {
			if(!rs.isClosed()) {
				rs.close();
				st.close();
			}
		}
		
		return personas;
	}
	
	public void registrar() {
		try {
			
			String sql = "INSERT INTO PERSONA (id,nombres,apellidos) VALUES(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 3);
			ps.setString(2, "Luz");
			ps.setString(3,"Ayllon");
			ps.executeUpdate();
			ps.close();
			
		}catch (Exception e) {
			System.out.println("Este fue el error"+e.getMessage());
		}
	}
	//Crear una funcion en BaseDeDatos
	public void registrarProcAlmacenados() throws SQLException {
		
		CallableStatement cs = null;
		
		try {
			String sql = "{call sp_registrar_persona(?,?,?)}";
			cs = con.prepareCall(sql);
			cs.setInt(1, 4);
			cs.setString(2, "Kley");
			cs.setString(3,"Zuñiga");
			cs.execute();
			
		} catch (Exception e) {
			System.out.println("Este fue el error"+e.getMessage());
		
		}finally {
			cs.close();
		}
	}
	public static void main(String[] args) {	
		Conexion cx = new Conexion();
		try {
			cx.conectarse();
			cx.listar().forEach(l->System.out.println(l.getId()+l.getNombres()+l.getApellidos()));
			//cx.registrar();
			//cx.registrarProcAlmacenados();
		} catch (Exception e) {
			System.out.println("Este fue el error"+e.getMessage());
		}
	
		//Hilos
//		try {
//			Thread.sleep(3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		cx.desconectarse();
		
	}
}
