/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GerenciamentoTarefas;

/**
 *
 * @author Aluno
 */
public interface Tarefa {
    public abstract void obterDescricao();
    public abstract void obterPrioridade();
    public abstract void executar();
}