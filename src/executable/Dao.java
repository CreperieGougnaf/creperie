package executable;

import java.util.ArrayList;

public interface Dao {

	ArrayList<Crepe> show();

	boolean addCrepe();

	boolean updateCrepe();

	boolean deleteCrepe();

}
