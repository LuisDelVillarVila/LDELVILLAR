package LDELVILLARV.LDELVILLARV.Service.impl;

import LDELVILLARV.LDELVILLARV.Dao.IDireccionDao;
import LDELVILLARV.LDELVILLARV.Entity.Direccion;
import LDELVILLARV.LDELVILLARV.Service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;

public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    private IDireccionDao DireccionDao;

    @Override
    public Direccion obtenerDireccionByNombre(String idpersona) {return this.DireccionDao.buscarDireccion(idpersona);}

}


