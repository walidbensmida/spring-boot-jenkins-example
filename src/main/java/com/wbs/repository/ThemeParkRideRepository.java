package com.wbs.repository;

import com.wbs.entity.ThemeParkRide;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ThemeParkRideRepository extends JpaRepository<ThemeParkRide,Long> {

List<ThemeParkRide> findByName(String name);
}
