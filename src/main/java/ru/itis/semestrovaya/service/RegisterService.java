package ru.itis.semestrovaya.service;


import ru.itis.semestrovaya.dto.RegisterDto;

public interface RegisterService {
    boolean saveUser(RegisterDto registerDto);
}
