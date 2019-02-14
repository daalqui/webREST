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
            preparedStatement.setDouble(9, hipoteca.getDatosFinancieros().getCapital());
            preparedStatement.setString(10, hipoteca.getDatosFinancieros().getTipoInteres());
            preparedStatement.setString(11, hipoteca.getDatosFinancieros().getTipoEuribor());
            preparedStatement.setDouble(12, hipoteca.getDatosFinancieros().getEuribor());
            preparedStatement.setDouble(13, hipoteca.getDatosFinancieros().getDiferencial());
            preparedStatement.setDouble(14, hipoteca.getDatosFinancieros().getEuribor());
            preparedStatement.setDouble(15, hipoteca.getDatosFinancieros().getDiferencial());
            preparedStatement.setDouble(16, hipoteca.getDatosFinancieros().getInteresFijo());
            preparedStatement.setDouble(17, hipoteca.getDatosFinancieros().getPlazoAnyos());
            preparedStatement.setBoolean(18, hipoteca.getProductosContratados().isSeguroCasa());
            preparedStatement.setBoolean(19, hipoteca.getProductosContratados().isNomina());
            preparedStatement.setBoolean(20, hipoteca.getProductosContratados().isSeguroVida());

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
		Connection connection = null;

        try {
            connection = getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE `hipoteca` SET  `nombre`=?, `ape1`=?, `ape2`=?, `nif`=?, `edad`=?, `telefono`=?, `email`=?, `ingresosMensuales`=?, `capital`=?, `tipo_interes`=?, `tipo_euribor`=?, `euribor`=?, `diferencial`=?, `interes_fijo`=?, `plazo_anyos`=?, `producto_segurocasa`=?,`producto_nomina`=?,`producto_segurovida`=?,`cuota_mensual`=?,`interes_aplicado`=? WHERE IdSeguroMedico=?");

            preparedStatement.setString(1, hipoteca.getNombre());
            preparedStatement.setString(2, hipoteca.getApe1());
            preparedStatement.setString(3,hipoteca.getApe2());
            preparedStatement.setString(4, hipoteca.getNif());
            preparedStatement.setInt(5, hipoteca.getEdad());
            preparedStatement.setString(6, hipoteca.getTelefono());
            preparedStatement.setString(7, hipoteca.getEmail());
            preparedStatement.setDouble(8, hipoteca.getIngresosMensuales());
            preparedStatement.setDouble(9, hipoteca.getDatosFinancieros().getCapital());
            preparedStatement.setString(10, hipoteca.getDatosFinancieros().getTipoInteres());
            preparedStatement.setString(11, hipoteca.getDatosFinancieros().getTipoEuribor());
            preparedStatement.setDouble(12, hipoteca.getDatosFinancieros().getEuribor());
            preparedStatement.setDouble(13, hipoteca.getDatosFinancieros().getDiferencial());
            preparedStatement.setDouble(14, hipoteca.getDatosFinancieros().getEuribor());
            preparedStatement.setDouble(15, hipoteca.getDatosFinancieros().getDiferencial());
            preparedStatement.setDouble(16, hipoteca.getDatosFinancieros().getInteresFijo());
            preparedStatement.setDouble(17, hipoteca.getDatosFinancieros().getPlazoAnyos());
            preparedStatement.setBoolean(18, hipoteca.getProductosContratados().isSeguroCasa());
            preparedStatement.setBoolean(19, hipoteca.getProductosContratados().isNomina());
            preparedStatement.setBoolean(20, hipoteca.getProductosContratados().isSeguroVida());
            preparedStatement.setInt(21, idHipoteca);

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

	public Hipoteca get(int idHipoteca) throws Exception {
		 Connection connection = null;

	        try {
	            connection = getConnection();

	            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM hipoteca WHERE idHipoteca=?");
	            
	            preparedStatement.setInt(1, idHipoteca);
	            
	            ResultSet rst = preparedStatement.executeQuery();

	            if (rst.next()) {
	                return createHipoteca(rst);
	            } else {
	                return null;
	            }

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

	public void delete(int idHipoteca) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public List<Hipoteca> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
