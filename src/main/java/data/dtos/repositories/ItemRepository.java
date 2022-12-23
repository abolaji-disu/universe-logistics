package data.dtos.repositories;

import data.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
    Item findItemByName(String s);
    Item findItemById(String s);
}
