package ua.com.alfacell.service;

// Created by Ponomarenko Oleh on 05.11.2016.

import ua.com.alfacell.dao.impl.ShopDaoImpl;
import ua.com.alfacell.dao.impl.StorageDaoImpl;
import ua.com.alfacell.dto.StorageDto;
import ua.com.alfacell.models.Shop;
import ua.com.alfacell.models.Storage;
import ua.com.alfacell.utilites.Transformer;

import java.util.LinkedList;
import java.util.List;

public class StorageService implements CrudService<StorageDto> {
    @Override
    public StorageDto findById(int id) {
        return null;
    }

    @Override
    public List<StorageDto> findAll() {
        List<Storage> temp = new StorageDaoImpl().findAll();
        List<Shop> shops = new ShopDaoImpl().findAll();
        List<Storage> storageList = new LinkedList<>();
        for (int i = 0; i < temp.size(); i++) {

        }

        List<StorageDto> storageDtos = Transformer.listStorageToListStorageDto(storageList);
        return storageDtos;
    }

    public List<StorageDto> findProductsByShopId(int shopId) {
        List<Storage> temp = new StorageDaoImpl().findAll();
        List<Storage> storageList = new LinkedList<>();
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).getShop().getId() == shopId) {
                storageList.add(temp.get(i));
            }
        }
        List<StorageDto> storageDtos = Transformer.listStorageToListStorageDto(storageList);
        return storageDtos;

    }



    @Override
    public void save(StorageDto storage) {

    }

    @Override
    public void update(StorageDto storage) {

    }

    @Override
    public void delete(StorageDto storage) {

    }
}
