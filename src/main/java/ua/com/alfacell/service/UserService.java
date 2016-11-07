package ua.com.alfacell.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ua.com.alfacell.dao.impl.UserDaoImpl;
import ua.com.alfacell.dto.UserDto;
import ua.com.alfacell.models.User;
import ua.com.alfacell.utilites.Transformer;

import java.util.List;


public class UserService implements CrudService<UserDto> {


    @Override
    public UserDto findById(int id) {
        UserDaoImpl userDao = new UserDaoImpl();
        UserDto userDto = Transformer.userToUserDto(userDao.findById(id));
        return userDto;
    }

    @Override
    public List<UserDto> findAll() {
        UserDaoImpl userDao = new UserDaoImpl();
        List<UserDto> userDtos = Transformer.listUsersToListUserDto(userDao.findAll());
        return userDtos;
    }

    @Override
    public void save(UserDto userDto) {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = Transformer.userDtoToUser(userDto);
        userDao.save(user);
    }

    @Override
    public void update(UserDto userDto) {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.update(Transformer.userDtoToUser(userDto));
    }

    @Override
    public void delete(UserDto userDto) {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.delete(Transformer.userDtoToUser(userDto));
    }
}
