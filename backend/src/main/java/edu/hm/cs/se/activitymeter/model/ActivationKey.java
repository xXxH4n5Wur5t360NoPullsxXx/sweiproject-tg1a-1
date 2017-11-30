package edu.hm.cs.se.activitymeter.model;

import javax.persistence.*;

@Entity
@Table(name = "Keys")
public class ActivationKey {

	@Column(name = "key", unique = true, nullable = false)
	private String key;

	@Id
	@Column(name = "id")
	private long activity_id;

	@OneToOne
	@JoinColumn(name = "id")
	private Activity activity;

	public ActivationKey() {}

	public ActivationKey(long activity_id, String key) {
		this.key = key;
		this.activity_id = activity_id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public long getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(long activity_id) {
		this.activity_id = activity_id;
	}

	public Activity getActivity() {
		return activity;
	}
}