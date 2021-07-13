package vn.techmaster.basicthymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.techmaster.basicthymeleaf.model.Person;
import vn.techmaster.basicthymeleaf.repository.InMemoryRepository;

@Controller
@RequestMapping("/")
public class MyController {
    List<Person> persons = new InMemoryRepository().getPerson();

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/persons")
    public String listPerson(Model model) {
        model.addAttribute("persons", persons);
        return "listperson";
    }

    @GetMapping("/personintworow")
    public String listPersonInTwoRow(Model model) {
        model.addAttribute("persons", persons);
        return "personIntworow";
    }

    @GetMapping("/addtwonumbers")
    public String addTwoNumber() {
        return "addtwonumber";
    }

}