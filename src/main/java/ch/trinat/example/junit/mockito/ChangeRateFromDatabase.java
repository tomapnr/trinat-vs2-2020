package ch.trinat.example.junit.mockito;

public class ChangeRateFromDatabase implements ChangeRate {

	/**
	 * Startet die Datenbankverbindung
	 * @param server the server name
	 * @param name the database name
	 * @param code the code
	 */
	public void startDatabaseConnection(String server, String name, String code)
	{}

	/**
	 * schliesst die bestehende Datenbankverbindung
	 */
	public void closeDatabaseConnection()
	{}

	@Override
	public double getRate_EUROtoSFR() {
		//TODO get Rate from Database
		return 0; //avoid Error
	}

	@Override
	public double getRate_EUROtoEURO() {
		//TODO get Rate from Database
		return 0; //avoid Error
	}

	@Override
	public double getRate_EUROtoDOLLAR() {
		//TODO get Rate from Database
		return 0; //avoid Error
	}

	@Override
	public double getRate_EUROtoPOUND() {
		//TODO get Rate from Database
		return 0; //avoid Error
	}

}
