// Created by Ponomarenko Oleh on 06.11.2016.

import org.junit.Assert;
import org.junit.Test;
import ua.com.alfacell.dao.impl.StorageDaoImpl;
import ua.com.alfacell.dto.StorageDto;
import ua.com.alfacell.models.Storage;
import ua.com.alfacell.utilites.Transformer;

import java.util.LinkedList;
import java.util.List;

public class TransformerTests {
    @Test
    public void testListStorageToListStorageDto() {
        List<Storage> storageList = new LinkedList<>();
        Storage storage = new StorageDaoImpl().findById(1);
        Storage storage2 = new StorageDaoImpl().findById(2);
        storageList.add(storage);
        storageList.add(storage2);
        List<StorageDto> storageDtos = Transformer.listStorageToListStorageDto(storageList);
        Assert.assertNotNull(storageDtos);
        System.out.println(storageDtos);
    }

    @Test
    public void testStorageToStorageDto() {
        Storage storage = new StorageDaoImpl().findById(1);
        StorageDto storageDto = Transformer.storageToStorageDto(storage);
        Assert.assertNotNull(storageDto);
    }
}
