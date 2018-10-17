package com.thoughtworks.aceleradora.biblioteca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BibliotecaController {

    @GetMapping("/")
    public String listaDeLivros() {

        Livro oitentaEQuatro = new Livro("1984");
        Livro admiravelMundoNovo = new Livro("Admiravel Mundo Novo");
        Livro policarpoQuaresma = new Livro("Triste fim de Policarpo Quaresma");
        Livro fahrenheit451 = new Livro("Fahrenheit 451");
        Livro maus = new Livro("Maus");

        return "livros/lista";
    }

}