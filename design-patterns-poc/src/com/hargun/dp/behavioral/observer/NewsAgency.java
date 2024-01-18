package com.hargun.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

	private List<Observer> observers = new ArrayList<>();
	private String latestNews;

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		if (observers != null && observers.size() > 0) {
			observers.remove(observer);
		}
	}

	public void notifyObservers() {
		if (observers != null && observers.size() > 0) {
			observers.forEach(observer -> {
				observer.update(getLatestNews());
			});
		} else {
			System.out.println("No subscriber to listen the news !!");
		}
	}

	public String getLatestNews() {
		return latestNews;
	}

	public void setLatestNews(String latestNews) {
		this.latestNews = latestNews;
		notifyObservers();
	}

}
