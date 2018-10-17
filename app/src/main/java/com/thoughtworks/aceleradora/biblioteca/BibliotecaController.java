package com.thoughtworks.aceleradora.biblioteca;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BibliotecaController {

    @GetMapping("/")
    public String listaDeLivros(Model model) {

        Livro oitentaEQuatro = new Livro("1984");
        Livro admiravelMundoNovo = new Livro("Admiravel Mundo Novo");
        Livro policarpoQuaresma = new Livro("Triste fim de Policarpo Quaresma");
        Livro fahrenheit451 = new Livro("Fahrenheit 451");
        Livro maus = new Livro("Maus");

        List<Livro> livros = Arrays.asList(
                oitentaEQuatro,
                admiravelMundoNovo,
                policarpoQuaresma,
                fahrenheit451,
                maus
        );

        model.addAttribute("livros", livros);

        return "livros/lista";
    }

}