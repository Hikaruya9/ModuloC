/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciamentoTarefas;

/**
 *
 * @author Aluno
 */
public class TarefaProfissional implements Tarefa{

    private String nomeEmpresa;
    private String setor;
    private String task;
    private String taskDesc;
    private int priority;
    private int tempoRestante;
    private boolean executado;

    public TarefaProfissional(String nomeEmpresa, String setor, String task, String taskDesc, int priority, int tempoRestante, boolean executado) {
        this.nomeEmpresa = nomeEmpresa;
        this.setor = setor;
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
            System.out.println("Executando tarefa "+this.task+" na empresa "+this.nomeEmpresa+" do setor "+this.setor+" com "+this.tempoRestante+" horas restantes");
            executado = true;
        } else {
            System.out.println("A tarefa "+this.task+" ja foi executada hoje!");
        }
    }
}