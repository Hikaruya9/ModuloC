/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciamentoTarefas;

/**
 *
 * @author Aluno
 */
public class TarefaAcademica implements Tarefa{

    private String task;
    private String taskDesc;
    private int priority;
    private int tempoRestante;
    private boolean executado;

    public TarefaAcademica(String task, String taskDesc, int priority, int tempoRestante, boolean executado) {
        this.task = task;
        this.taskDesc = taskDesc;
        this.priority = priority;
        this.tempoRestante = tempoRestante;
        this.executado = executado;
    }

    @Override
    public void obterDescricao() {
        System.out.println("Descricao da tarefa: "+this.taskDesc);
    }

    @Override
    public void obterPrioridade() {
        System.out.println("Prioridade: "+this.priority);
    }

    @Override
    public void executar() {
        if (!executado) {
            System.out.println("Executando a tarefa "+this.task+" com "+this.tempoRestante+" horas restantes!");
        } else {
            System.out.println("Esta tarefa ja foi executada!");
        }
    }
}