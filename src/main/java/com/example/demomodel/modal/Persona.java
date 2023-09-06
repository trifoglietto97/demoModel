package com.example.demomodel.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    String nome;
    String cognome;
    String indirizzo;
    String telefono;
}
