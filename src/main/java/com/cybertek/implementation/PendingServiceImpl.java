package com.cybertek.implementation;

import com.cybertek.dto.TaskDTO;
import com.cybertek.service.PendingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PendingServiceImpl extends AbstractMapService<TaskDTO, Long> implements PendingService {

    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public TaskDTO save(TaskDTO object) {

        return super.save(object.getId(), object);
    }

    @Override
    public void update(TaskDTO object) {
        super.update(object.getId(), object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(TaskDTO object) {
        super.delete(object);

    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findById(id);
    }


    @Override
    public List<TaskDTO> findTaskByStatus(TaskDTO status) {
        return null;
    }
}
