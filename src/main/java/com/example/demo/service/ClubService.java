package com.example.demo.service;

import com.example.demo.dto.ClubDto;
import com.example.demo.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(Long clubId);

    void updateClub(ClubDto club);

    void delete(Long clubId);

    List<ClubDto> searchClubs(String query);
}
