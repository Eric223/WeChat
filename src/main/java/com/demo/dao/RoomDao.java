package com.demo.dao;

import com.demo.pojo.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoomDao {

    List<Room> getAllRoom();

    void insertInto(@Param("room") Room room);
}
