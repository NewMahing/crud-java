package br.com.crud;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {

    private final List<Usuario> usuarios = new ArrayList<>();

//create
    public void adicionar(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Adicionado com sucesso!" + usuario.nome() );
    }
}

//read
    public void listar() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuario encontrado.");
            return;
        }
        usuarios.forEach(System.out::println);
    }

// update
    public void atualizar(int id, String nome, String email, String senha) {
        for (var i = 0; i < usuarios.size(); i++) {
            var u = usuario.get(i);
            if (u.id() == id) {
                var atualizado = new Usuario(id, novoNome, novoEmail, novoSenha);
                usuarios.set (i, atualizado);
                System.out.println("Atualizado com sucesso!" + atualizado.nome());
                return;
            }
        }
        System.out.println("Nenhum usuario com ID " + id + " encontrado.");
    }

// delete
    public void remover(int id) {
        var removido = usuarios.removeIf(u -> u.id() == id);
        if (removido)
            System.out.println("🗑️ Usuário removido com sucesso!");
        else
            System.out.println("⚠️ Usuário não encontrado para remoção.");
        }
    }