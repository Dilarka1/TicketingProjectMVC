package com.cybertek.service;

import com.cybertek.dto.PendingDTO;
import com.cybertek.dto.TaskDTO;
import com.cybertek.dto.UserDTO;

import java.util.List;

public interface PendingService extends CrudService<PendingDTO, Long> {

    List<PendingDTO> findTaskByStatus(PendingDTO status);

}
