package persistencia;

import java.util.List;

import dominio.Hipoteca;

public interface HipotecaDAO {

	void insert(Hipoteca hipoteca) throws Exception;
    
    void update(int idHipoteca,Hipoteca hipoteca) throws Exception;

    Hipoteca get(int idHipoteca) throws Exception;

    void delete(int idHipoteca) throws Exception;

    List<Hipoteca> findAll() throws Exception;
}
