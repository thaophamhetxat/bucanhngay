package repository;

import modules.BinhLuan;

import java.util.List;

public interface IBinhLuanRepo {
    List<BinhLuan> findAll();

    BinhLuan save(BinhLuan binhLuan);

    BinhLuan like(int id);

}
