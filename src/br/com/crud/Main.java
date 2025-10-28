package br.com.crud;

public class Main {
    public static void main(String[] args) {

        var repo = new UsuarioRepositorio();

        repo.adicionar(new Usuario(1, "Paulo", "paulo@email.com"));
        repo.adicionar(new Usuario(2, "Ana", "ana@email.com"));

        System.out.println("\n📋 Lista de usuários:");
        repo.listar();

        repo.atualizar(2, "Ana Clara", "ana.clara@email.com");

        System.out.println("\n📋 Após atualização:");
        repo.listar();

        repo.remover(1);

        System.out.println("\n📋 Após remoção:");
        repo.listar();
    }
}
