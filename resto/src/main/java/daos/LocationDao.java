package daos;

import model.Location;

public interface LocationDao  extends GenericDao<Location> {

		public Long createLocation(Location l);
		public Location mergeLocation(Location l);
}
