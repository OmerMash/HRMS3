package com.hrms.hrms;

import java.util.List;

public interface IAlgoSearch {

    List<Person> search(List<Person> p, int minAge, int maxAge, String profession );

    //#VERSION1
//    List<Person> search(List<Person> p, int minAge, int maxAge, String profession );
}
