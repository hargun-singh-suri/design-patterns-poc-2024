package com.hargun.dp.behavioral.observer;

public class ObserverPatternExample {

	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();

		NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
		NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");

		newsAgency.addObserver(subscriber1);
		newsAgency.addObserver(subscriber2);

		newsAgency.setLatestNews("HDFC Stock falls by 8%");

		/*
		 * Output
		 * 
		 * Hello Subscriber 1, News Update - HDFC Stock falls by 8%
		 * 
		 * Hello Subscriber 2, News Update - HDFC Stock falls by 8%
		 * 
		 */

	}

}
