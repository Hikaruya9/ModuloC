/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Aluno
 */
public class RemoteController implements Controller {

    private int volume;
    private boolean on;
    private boolean channel;

    public RemoteController() {
        this.volume = 50;
        this.on = true;
        this.channel = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isChannel() {
        return channel;
    }

    public void setChannel(boolean channel) {
        this.channel = channel;
    }

    @Override
    public void ligar() {
        this.setOn(true);
    }

    @Override
    public void desligar() {
        this.setOn(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Is it on? " + this.isOn());
        System.out.println("Esta passando um programa? " + this.isChannel());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isOn()) {
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isOn()) {
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isOn() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isOn() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isOn() && !(this.isChannel())) {
            this.setChannel(true);
        } else {
            System.out.println("Nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isOn() && this.isChannel()) {
            this.setChannel(false);
        } else {
            System.out.println("Nao consegui pausar");
        }
    }
}