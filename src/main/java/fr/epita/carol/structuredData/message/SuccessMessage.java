/**
 * 
 */
package fr.epita.carol.structuredData.message;

/**
 * @author tbrou
 *
 */
public class SuccessMessage {
	
	private String message;
	private String complementaryData;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the complementaryData
	 */
	public String getComplementaryData() {
		return complementaryData;
	}
	/**
	 * @param complementaryData the complementaryData to set
	 */
	public void setComplementaryData(String complementaryData) {
		this.complementaryData = complementaryData;
	}
	

}
