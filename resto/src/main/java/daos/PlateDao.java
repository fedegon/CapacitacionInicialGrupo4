package daos;

import model.Plate;

public interface PlateDao extends GenericDao<Plate> {

	public Long createPlate(Plate p);
	public Plate mergePlate(Plate p);

}