/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.service;

import com.Pizzeria.entity.Estilos;
import com.Pizzeria.entity.Usuario;
import com.Pizzeria.repository.EstilosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstilosService implements IEstilosService{

    @Autowired
    private EstilosRepository estilosRepository;    
    
    @Override
    public List<Estilos> getAllEstilos() {
        return (List<Estilos>) estilosRepository.findAll();
    }

    @Override
    public void saveEstilo(Estilos estilo) {
        estilosRepository.save(estilo);
    }

    @Override
    public Estilos getEstiloById(long id) {
        Estilos estilo;
        Optional<Estilos> estiloEncontrado = estilosRepository.findById(id);
        if (estiloEncontrado.isPresent()){
            estilo  = new Estilos(estiloEncontrado.get());
            return estilo;
        }
        return null;
    }

    @Override
    public void deleteEstilo(long id) {
        estilosRepository.deleteById(id);
    }
    
}
