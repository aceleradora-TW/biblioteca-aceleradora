package com.thoughtworks.aceleradora.biblioteca;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static java.util.Arrays.asList;

@Controller
public class BibliotecaController {

    LivroRepository repository;

    public BibliotecaController(LivroRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cria")
    @ResponseBody
    public String criaLivro() {
        Livro livro = new Livro("Livro " + Math.random());

        repository.save(livro);

       return "Foi: " + livro;
    }

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