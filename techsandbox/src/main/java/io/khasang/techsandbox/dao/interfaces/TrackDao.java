package io.khasang.techsandbox.dao.interfaces;

import io.khasang.techsandbox.model.Track;

import java.util.List;

public interface TrackDao {
    Track findById(Integer id);

    List<Track> findAll();

    void save(Track project);

    void update(Track project);

    List<Track> findAllByOrderId(Integer orderId);

    List<Track> findAllByEmployeeId(Integer employeeId);

    List<Track> findUnfinishedByEmployeeId(Integer employeeId);

    Track findByOrderIdAndMaxProgress(Integer orderId);
}
