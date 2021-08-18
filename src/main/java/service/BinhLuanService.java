package service;

import modules.BinhLuan;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IBinhLuanRepo;

import java.util.ArrayList;
import java.util.List;

public class BinhLuanService {
    @Autowired
    IBinhLuanRepo iBinhLuanRepo;
    public ArrayList<BinhLuan> list = new ArrayList<>();


    public void save(BinhLuan binhLuan) {
        iBinhLuanRepo.save(binhLuan);
    }


    public void findAll() {
        list = (ArrayList<BinhLuan>) iBinhLuanRepo.findAll();
    }





}
