package com.parqueadero.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ParqueaderoPersona {

	int id;
	Parqueadero parqueadero;
	Persona persona;
}
