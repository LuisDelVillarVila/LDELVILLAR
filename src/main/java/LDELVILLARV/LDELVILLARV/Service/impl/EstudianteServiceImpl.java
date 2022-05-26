package LDELVILLARV.LDELVILLARV.Service.impl;

import LDELVILLARV.LDELVILLARV.Dao.IEstudianteDao;
import LDELVILLARV.LDELVILLARV.Entity.Estudiante;
import LDELVILLARV.LDELVILLARV.Service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;


    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {return this.estudianteDao.buscarEstudiante(codigo);}
}
