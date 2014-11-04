/*
 * 
 */
package com.hicron.service;

// TODO: Auto-generated Javadoc
/**
 * The Class TutorialFinderService.
 */
public class TutorialFinderService {
	
	/**
	 * Gets the best tutorials site.
	 *
	 * @param language the language
	 * @return the best tutorials site
	 */
	public String getBestTutorialsSite(String language) {
		if (language.equals("italian")) return "Prince";
		else return "Language not found";
	}
}
