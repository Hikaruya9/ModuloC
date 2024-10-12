/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GerenciamentoTarefas;

/**
 *
 * @author Aluno
 */
public class mainTarefa {

    public static void main(String[] args) {
        TarefaPessoal pessoal = new TarefaPessoal("Ler um livro na semana","Como primeiro livro, pegar o 1984 do autor George Orwell. Comecar lendo 10 paginas por dia e ir aumentando gradualmente.", 2, false);
        TarefaProfissional pro = new TarefaProfissional("Elementar Ltda", "Edicao", "Terminar de editar o video x", "Realizar algumas revisoes nos cortes pra garantir a coesao visual. Trazer videos pra usar no visual no minuto 15:24, acabou passando despercebido.", 1, 52, false);
        TarefaAcademica acad = new TarefaAcademica("Me aprofundar no topico das IAs", "Dar uma olhada nos livros da faculdade, realizar pesquisas em artigos e ver alguns videos que salvei ontem.", 1, 80, true);
        
        pessoal.obterDescricao();
        pessoal.obterPrioridade();
        pessoal.executar();
        acad.obterDescricao();
        System.out.println("--------------------------------------");
        pro.obterDescricao();
        pro.obterPrioridade();
        pro.executar();
        System.out.println("--------------------------------------");
        acad.obterDescricao();
        acad.obterPrioridade();
        acad.executar();
    }
}