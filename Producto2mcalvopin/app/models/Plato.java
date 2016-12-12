package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Computer entity managed by Ebean
 */
@Entity 
public class Plato extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    @Constraints.Required
    public String costo;
    @Constraints.Required
    public String ingrediente;
    @Constraints.Required
    public String descripcion;
    
    public static Find<Long,Plato> find = new Find<Long,Plato>(){};
	public static <find> List<Plato> listadoPlatos() {
		// TODO Auto-generated method stub
		return find.all();
	}

    
}

