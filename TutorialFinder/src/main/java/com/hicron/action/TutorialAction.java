/*
 * 
 */
package com.hicron.action;

import com.hicron.service.TutorialFinderService;


/**
 * The Class TutorialAction.
 */
public class TutorialAction {
	
	/** The best tutorials site. */
	private String bestTutorialsSite;
	
	/** The language. */
	private String language;
	
	/**
	 * Gets the language.
	 *
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 *
	 * @param language the new language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Gets the best tutorials site.
	 *
	 * @return the best tutorials site
	 */
	public String getBestTutorialsSite() {
		return bestTutorialsSite;
	}

	/**
	 * Sets the best tutorials site.
	 *
	 * @param bestTutorialsSite the new best tutorials site
	 */
	public void setBestTutorialsSite(String bestTutorialsSite) {
		this.bestTutorialsSite = bestTutorialsSite;
	}

	/**
	 * Execute.
	 *
	 * @return the string
	 */
	public String execute() {
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		//System.out.println(getLanguage());
		setBestTutorialsSite(tutorialFinderService.getBestTutorialsSite(language));
		return "success";
	}
}
