package LDELVILLARV.LDELVILLARV.Service.impl;

import LDELVILLARV.LDELVILLARV.Dao.IPersonaDao;
import LDELVILLARV.LDELVILLARV.Entity.Persona;

import LDELVILLARV.LDELVILLARV.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersonas() {

        List<Persona> personaList = this.personaDao.findAll();

        for (Persona persona:personaList){
            System.out.println(persona.toString());
        }
        return personaList;
    }
    @Override
    public Persona obtenerPersonaByDni(String idpersona) {
        return this.personaDao.buscarPersona(idpersona);
    }

}
