package com.hargun.dp.behavioral.observer;

public class NewsSubscriber implements Observer {

	private String subscriberName;

	public NewsSubscriber(String subscriberName) {
		super();
		this.subscriberName = subscriberName;
	}

	public String getSubscriberName() {
		return subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	@Override
	public void update(String news) {
		System.out.println(String.format("Hello %s, News Update - %s", getSubscriberName(), news));
	}

}
