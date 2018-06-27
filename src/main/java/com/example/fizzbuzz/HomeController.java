package com.example.fizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {

//    @Autowired
//    FizzBuzz fizzbuzz;

//    @RequestMapping("/")
//    public String List(Model model){
//       model.addAttribute("newnumbers", fizzbuzz);
//        return "List";
//    }
    @GetMapping("/add")
    public String Form(Model model){
        model.addAttribute("numbers", new FizzBuzz());
        return "Form";
    }
    @PostMapping("/process")
    public String List(@Valid @ModelAttribute("numbers") FizzBuzz fizzBuzz, BindingResult result, Model model){

        if(result.hasErrors()){
        return "Form";
        }
        ArrayList<String> output = new ArrayList<>();
        Integer max = fizzBuzz.getEndingNumber() ;
        Integer min = fizzBuzz.getStartingNumber();
        Integer i;
        for (i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else output.add(i.toString());
        }

        model.addAttribute("myList", output);

        return "List";
    }

}


