// Created by Ponomarenko Oleh on 31.08.2016.

import org.junit.Assert;
import org.junit.Test;
import ua.com.alfacell.dto.ShopDto;
import ua.com.alfacell.dto.StorageDto;
import ua.com.alfacell.dto.UserDto;
import ua.com.alfacell.models.Storage;
import ua.com.alfacell.service.StorageService;
import ua.com.alfacell.service.UserService;

import java.util.List;

public class ServiceTests {

    UserService userService = new UserService();

    @Test
    public void testServiceSaveUser(){
        UserDto userDto = new UserDto();
        userDto.setLogin("oleg-login");
        userDto.setPassword("password1234");
        userDto.setFirstName("Oleg");
        userDto.setLastName("Ponomarenko");
        userDto.setPhone("+380631112220");
        userDto.setEmail("albka1986@mail.ru");

        ShopDto shopDto = new ShopDto();
        shopDto.setNameShop("Petrovskogo");
        userDto.setShopDto(shopDto);
        userService.save(userDto);
    }

    @Test
    public void testGetAllStorage(){

        StorageService storageService = new StorageService();
        List<StorageDto> storageDtos = storageService.findProductsByShopId(6);
        Assert.assertNotNull(storageDtos);
        storageDtos.forEach(System.out::println);

    }

    @Test
    public void testFindProductsByShopId(){
        List<StorageDto> storageDtoList = new StorageService().findProductsByShopId(6);
        Assert.assertNotNull(storageDtoList);
        System.out.println("List of Products in a Shop #6");
        storageDtoList.forEach(System.out::println);
    }
}
