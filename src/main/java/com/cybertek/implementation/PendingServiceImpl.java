package com.cybertek.implementation;

import com.cybertek.dto.PendingDTO;
import com.cybertek.dto.TaskDTO;
import com.cybertek.service.PendingService;
import com.cybertek.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PendingServiceImpl extends AbstractMapService<PendingDTO, Long> implements PendingService {

    @Override
    public List<PendingDTO> findAll() {
        return super.findAll();
    }

    @Override
    public PendingDTO save(PendingDTO object) {

        return super.save(object.getId(), object);
    }

    @Override
    public void update(PendingDTO object) {
        super.update(object.getId(), object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(PendingDTO object) {
        super.delete(object);

    }

    @Override
    public PendingDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<PendingDTO> findTaskByStatus(PendingDTO status) {
        return super.findAll().stream().filter(task -> task.getProject().getAssignedManager().equals(status)).collect(Collectors.toList());
    }
}
