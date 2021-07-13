package vn.techmaster.basicthymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.techmaster.basicthymeleaf.model.Person;

@Repository
public class InMemoryRepository {
    private ArrayList<Person> person = new ArrayList<>(
            List.of((new Person("David Beckham", "England", "05/1975", "Male")),
                    (new Person("Maria Sarapova", "Rusia", "04/1987", "Female")),
                    (new Person("Bill Gates", "Usa", "10/1955", "Male")),
                    (new Person("Hồ Chí Minh", "Vietnam", "02/1890", "Male")),
                    (new Person("Hồ Cẩm Đào", "China", "12/1942", "Male")),
                    (new Person("Angela Merkel", "Germany", "07/1954", "Female")),
                    (new Person("Elizabeth II", "England", "04/1926", "Female")),
                    (new Person("Arsene wenger", "France", "10/1949", "Male"))));

    public List<Person> getPerson() {
        return person;
    }

}