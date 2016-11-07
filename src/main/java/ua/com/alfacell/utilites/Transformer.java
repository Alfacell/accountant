package ua.com.alfacell.utilites;

import ua.com.alfacell.dto.*;
import ua.com.alfacell.models.*;

import java.util.LinkedList;
import java.util.List;

public class Transformer {


    public static List<StorageDto> listStorageToListStorageDto(List<Storage> storageList) {
        List<StorageDto> storageDtos = new LinkedList<>();
        for (Storage storage : storageList) {
            storageDtos.add(storageToStorageDto(storage));
        }
        return storageDtos;
    }

    public static StorageDto storageToStorageDto(Storage storage) {
        StorageDto storageDto = new StorageDto();
        storageDto.setId(storage.getId());
        storageDto.setAmount(storage.getAmount());
        storageDto.setProductDto(productToProductDto(storage.getProduct()));
        storageDto.setShopDto(shopToShopDto(storage.getShop()));
        return storageDto;
    }

    public static ShopDto shopToShopDto(Shop shop) {
        ShopDto shopDto = new ShopDto();
        shopDto.setId(shop.getId());
        shopDto.setNameShop(shop.getNameShop());
        return shopDto;
    }

    public static ProductDto productToProductDto(Product product) {
        ProductDto productDto = new ProductDto();

        productDto.setId(product.getId());
        productDto.setBarcode(product.getBarcode());
        productDto.setCategoryDto(categoryToCategoryDto(product.getCategory()));
        productDto.setNameProduct(product.getNameProduct());
        productDto.setImei(product.getImei());
        productDto.setBrand(product.getBrand());

        return productDto;
    }

    public static CategoryDto categoryToCategoryDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setNameCategory(category.getNameCategory());
        return categoryDto;
    }

    public static UserDto userToUserDto(User user) {
        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setLogin(user.getLogin());
        userDto.setPassword(user.getPassword());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setPhone(user.getPhone());
        userDto.setShopDto(shopToShopDto(user.getShop()));
        userDto.setEmail(user.getEmail());
        userDto.setRole(user.getRole());

        return userDto;
    }

    public static List<UserDto> listUsersToListUserDto(List<User> userList) {
        List<UserDto> userDtos = new LinkedList<>();
        for (User user : userList) {
            userDtos.add(userToUserDto(user));
        }
        return userDtos;
    }

    public static User userDtoToUser(UserDto userDto) {
        User user = new User();

        user.setId(userDto.getId());
        user.setLogin(userDto.getLogin());
        user.setPassword(userDto.getPassword());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setRole(userDto.getRole());
        user.setPhone(user.getPhone());
        user.setShop(shopDtoToShop(userDto.getShopDto()));
        return user;
    }

    public static Shop shopDtoToShop(ShopDto shopDto) {
        Shop shop = new Shop();
        shop.setId(shopDto.getId());
        shop.setNameShop(shopDto.getNameShop());
        return shop;
    }
}
