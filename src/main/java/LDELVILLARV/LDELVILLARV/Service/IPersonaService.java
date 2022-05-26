package LDELVILLARV.LDELVILLARV.Service;

import LDELVILLARV.LDELVILLARV.Entity.Persona;

import java.util.List;

public interface IPersonaService {

    // listar personasa

    List<Persona> listaPersonas();


    //Buscar persona por su dni
    Persona obtenerPersonaByDni(String idpersona);

}
