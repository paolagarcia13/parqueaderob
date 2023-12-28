package com.parqueadero.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Persona {

	int id;
	String nombres;
	String identificacion;
	String primerApellido;
	String segundoApellido;
}
