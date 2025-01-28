package br.ufrn.imd.view;

import br.ufrn.imd.dao.ZooDao;
import br.ufrn.imd.model.*;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class ZooView extends JFrame {

    private ZooDao zooDao;

    public ZooView() {
        zooDao = new ZooDao();
        configurarDadosIniciais();
        configurarJanela();
    }

    private void configurarDadosIniciais() {
        zooDao.adicionarAnimal(new Elefante("Dumbo", LocalDate.of(2010, 5, 15), 1200.0, 2.0));
        zooDao.adicionarAnimal(new Girafa("Melman", LocalDate.of(2015, 8, 20), 800.0, 50.0));
        zooDao.adicionarAnimal(new Tigre("Shere Khan", LocalDate.of(2018, 3, 10), 200.0, "Bengala"));
    }

    private void configurarJanela() {
        setTitle("ZooNatal - Sistema de Gerenciamento");
        setSize(getToolkit().getScreenSize());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(8, 1, 10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnListarAnimais = new JButton("Listar Animais");
        btnListarAnimais.addActionListener(e -> listarAnimais());
        painelPrincipal.add(btnListarAnimais);

        JButton btnCalcularAlimentos = new JButton("Calcular Total de Alimentos");
        btnCalcularAlimentos.addActionListener(e -> calcularTotalAlimentos());
        painelPrincipal.add(btnCalcularAlimentos);

        JButton btnListarPorIdade = new JButton("Listar Animais por Idade");
        btnListarPorIdade.addActionListener(e -> listarAnimaisPorIdade());
        painelPrincipal.add(btnListarPorIdade);

        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> System.exit(0));
        painelPrincipal.add(btnSair);

        add(painelPrincipal, BorderLayout.CENTER);
    }

    private void listarAnimais() {
        StringBuilder builder = new StringBuilder("Lista de Animais:\n\n");
        zooDao.listarAnimais().forEach(animal -> builder.append(animal).append("\n"));
        JOptionPane.showMessageDialog(this, builder.toString(), "Animais", JOptionPane.INFORMATION_MESSAGE);
    }

    private void calcularTotalAlimentos() {
        double totalHerbivoros = zooDao.calcularTotalAlimento("Herbívoro");
        double totalCarnivoros = zooDao.calcularTotalAlimento("Carnívoro");

        JOptionPane.showMessageDialog(this,
                String.format("Total Alimento Herbívoros: %.2f kg\nTotal Alimento Carnívoros: %.2f kg",
                        totalHerbivoros, totalCarnivoros),
                "Total de Alimentos",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void listarAnimaisPorIdade() {
        StringBuilder builder = new StringBuilder("Animais Mais Novos e Mais Velhos:\n\n");

        builder.append("Mais Novos:\n");
        zooDao.listarPorIdade(true).forEach(animal -> builder.append(animal).append("\n"));

        builder.append("\nMais Velhos:\n");
        zooDao.listarPorIdade(false).forEach(animal -> builder.append(animal).append("\n"));

        JOptionPane.showMessageDialog(this, builder.toString(), "Idade dos Animais", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ZooView view = new ZooView();
            view.setVisible(true);
        });
    }
}
