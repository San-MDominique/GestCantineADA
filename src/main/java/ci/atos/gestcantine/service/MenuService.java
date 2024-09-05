package ci.atos.gestcantine.service;

import ci.atos.gestcantine.service.dto.MenuDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    MenuDTO save(MenuDTO UserDTO);
    MenuDTO update(MenuDTO UserDTO);
    void delete(Long id);
    List<MenuDTO> getAll();
    Optional<MenuDTO> findOne(Long id);
    List<MenuDTO> initUser(List<MenuDTO> UserDTO);

}
