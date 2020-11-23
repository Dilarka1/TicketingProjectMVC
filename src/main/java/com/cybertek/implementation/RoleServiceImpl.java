package com.cybertek.implementation;


import com.cybertek.dto.RoleDTO;
import com.cybertek.service.RoleService;

import java.util.List;

public class RoleServiceImpl extends AstractMapService<RoleDTO, Long> implements RoleService {
    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        deleteByID(id);

    }

    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(RoleDTO object) {
        super.delete(object);
    }

    @Override
    public RoleDTO findByID(Long id) {
        return super.findByID(id);
    }
}
