package com.hantsylabs.example.conference.dao;

import com.hantsylabs.example.conference.model.Conference;

public interface ConferenceDao {

	public abstract Conference findById(Long id);

	public abstract Long save(Conference conference);

	public abstract void delete(Long id);

	public abstract void update(Conference conference);

}