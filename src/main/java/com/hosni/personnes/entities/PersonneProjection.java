package com.hosni.personnes.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomPersonne", types = { Personne.class })

public interface PersonneProjection {
	public String getNomPersonne();
}
