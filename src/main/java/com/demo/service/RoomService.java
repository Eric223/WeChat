package com.demo.service;

import com.demo.dao.RoomDao;
import com.demo.pojo.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by yangyin 0n 2018/
 */
@Service
public class RoomService {

    @Autowired
    private RoomDao roomDao;

    public List<Room> getAllRoom(){
        return this.roomDao.getAllRoom();
    }

    public void insert(Room room) {
        this.roomDao.insertInto(room);
    }
}
