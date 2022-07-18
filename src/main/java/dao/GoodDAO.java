package dao;

import model.Good;

import java.util.List;

public interface GoodDAO {

    List<Good> getAll();

    Good getByTitleAndPrice(String title, String price);
}
