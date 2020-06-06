package com.ak.service;

import com.ak.Person;

import java.util.List;

public interface LoginService{

    Person LoginCheck(int user_id, String user_name);

    List<Person> findall(int user_lev);
}
