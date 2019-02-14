package persistencia.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import dominio.Hipoteca;
import persistencia.HipotecaDAO;

public class HipotecaDAOimplJDB implements HipotecaDAO {
	
	private Connection getConnection() {
        try {
            InitialContext initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            DataSource dataSource = (DataSource) envCtx.lookup("jdbc/hipoteca");

            return dataSource.getConnection();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
	}

	public void insert(Hipoteca hipoteca) throws Exception {
		Connection connection = null;

        try {
            connection = getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `hipoteca` (`nombre`, `ape1`, `ape2`, `nif`, `edad`, `telefono`, `email`, `ingresosMensuales`, `capital`, `tipo_interes`, `tipo_euribor`, `euribor`, `diferencial`, `interes_fijo`, `plazo_anyos`, `producto_segurocasa`,`producto_nomina`,`producto_segurovida`,`cuota_mensual`,`interes_aplicado`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            preparedStatement.setString(1, hipoteca.getNombre());
            preparedStatement.setString(2, hipoteca.getApe1());
            preparedStatement.setString(3,hipoteca.getApe2());
            preparedStatement.setString(4, hipoteca.getNif());
            preparedStatement.setInt(5, hipoteca.getEdad());
            preparedStatement.setString(6, hipoteca.getTelefono());
            preparedStatement.setString(7, hipoteca.getEmail());
            preparedStatement.setDouble(8, hipoteca.getIngresosMensuales());
            preparedStatement.setDouble(9, hipoteca.getCuotaMensual());
            preparedStatement.setDouble(10, hipoteca.getInteresAplicado());


            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {

                }
            }
        }
		
	}

	public void update(int idHipoteca, Hipoteca hipoteca) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public Hipoteca get(int idHipoteca) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int idHipoteca) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public List<Hipoteca> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
