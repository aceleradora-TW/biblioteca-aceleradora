package com.thoughtworks.aceleradora.biblioteca;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static java.util.Arrays.asList;

@Controller
public class BibliotecaController {

    @GetMapping("/")
    public String listaDeLivros(Model model) {

        List<Livro> livros = asList(
                new Livro("1984"),
                new Livro("Admiravel mundo novo"),
                new Livro("Fahrenheit 451"),
                new Livro("Maus")
        );

        model.addAttribute("xablau", livros);

        return "livros/lista";
    }

}