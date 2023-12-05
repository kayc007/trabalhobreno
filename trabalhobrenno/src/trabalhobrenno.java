import java.util.Scanner;

public class trabalhobrenno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Perguntas e Respostas!");

        char respostaCorreta;
        char respostaUsuario;

        // Pergunta 1
        System.out.println("Pergunta 1: Qual é a capital da Austrália?");
        System.out.println("a) Sydney");
        System.out.println("b) Melbourne");
        System.out.println("c) Canberra");
        System.out.println("d) Brisbane");
        respostaCorreta = 'c';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 2
        System.out.println("Pergunta 2: Quem foi o primeiro presidente dos Estados Unidos?");
        System.out.println("a) Thomas Jefferson");
        System.out.println("b) George Washington");
        System.out.println("c) Abraham Lincoln");
        System.out.println("d) John Adams");
        respostaCorreta = 'b';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 3
        System.out.println("Pergunta 3: Em que ano a Revolução Francesa começou?");
        System.out.println("a) 1776");
        System.out.println("b) 1789");
        System.out.println("c) 1804");
        System.out.println("d) 1832");
        respostaCorreta = 'b';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 4
        System.out.println("Pergunta 4: Qual é o segundo maior oceano do mundo?");
        System.out.println("a) Oceano Índico");
        System.out.println("b) Oceano Atlântico");
        System.out.println("c) Oceano Antártico");
        System.out.println("d) Oceano Pacífico");
        respostaCorreta = 'a';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 5
        System.out.println("Pergunta 5: Quem escreveu '1984'?");
        System.out.println("a) George Orwell");
        System.out.println("b) Aldous Huxley");
        System.out.println("c) Ray Bradbury");
        System.out.println("d) J.K. Rowling");
        respostaCorreta = 'a';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 6
        System.out.println("Pergunta 6: Qual é a maior cordilheira do mundo?");
        System.out.println("a) Montanhas Rochosas");
        System.out.println("b) Andes");
        System.out.println("c) Alpes");
        System.out.println("d) Himalaias");
        respostaCorreta = 'd';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 7
        System.out.println("Pergunta 7: Quem foi o primeiro homem a pisar na Lua?");
        System.out.println("a) Yuri Gagarin");
        System.out.println("b) Neil Armstrong");
        System.out.println("c) Buzz Aldrin");
        System.out.println("d) Michael Collins");
        respostaCorreta = 'b';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 8
        System.out.println("Pergunta 8: Qual é a capital do Japão?");
        System.out.println("a) Seul");
        System.out.println("b) Pequim");
        System.out.println("c) Tóquio");
        System.out.println("d) Bangkok");
        respostaCorreta = 'c';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 9
        System.out.println("Pergunta 9: Quem foi o pintor do famoso quadro 'A Noite Estrelada'?");
        System.out.println("a) Pablo Picasso");
        System.out.println("b) Claude Monet");
        System.out.println("c) Vincent van Gogh");
        System.out.println("d) Leonardo da Vinci");
        respostaCorreta = 'c';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 10
        System.out.println("Pergunta 10: Qual é o maior mamífero terrestre?");
        System.out.println("a) Elefante Africano");
        System.out.println("b) Girafa");
        System.out.println("c) Rinoceronte");
        System.out.println("d) Baleia Azul");
        respostaCorreta = 'a';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 11
        System.out.println("De onde é a invenção do chuveiro elétrico");
        System.out.println("a) FRANÇA");
        System.out.println("b) INGLATERRA");
        System.out.println("c) BRASIL");
        System.out.println("d) ITÁLIA");
        respostaCorreta = 'c';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 12
        System.out.println("QUAIS O MENOR E O MAIOR PAÍS DO MUNDO");
        System.out.println("a) VATICANO E RÚSSIA ");
        System.out.println("b) NAURU E CHINA");
        System.out.println("c) MÔNACO E CANADÁ");
        System.out.println("d) MALTA E ESTADOS UNIDOS");
        respostaCorreta = 'a';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 13
        System.out.println("Pergunta 3: Qual clube tem mais títulos na Liga dos Campeões da UEFA?");
        System.out.println("a) Real Madrid");
        System.out.println("b) Barcelona");
        System.out.println("c) Bayern de Munique");
        System.out.println("d) Manchester United");
        respostaCorreta = 'a';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 14
        System.out.println("Pergunta 2: Qual jogador é conhecido como 'O Rei'?");
        System.out.println("a) Cristiano Ronaldo");
        System.out.println("b) Lionel Messi");
        System.out.println("c) Pelé");
        System.out.println("d) Neymar");
        respostaCorreta = 'c';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);

        // Pergunta 15
        System.out.println("Pergunta 5: Quem é o artilheiro da história da Liga dos Campeões da UEFA?");
        System.out.println("a) Cristiano Ronaldo");
        System.out.println("b) Lionel Messi");
        System.out.println("c) Raul");
        System.out.println("d) Robert Lewandowski");
        respostaCorreta = 'a';
        respostaUsuario = obterResposta(scanner);
        verificarResposta(respostaUsuario, respostaCorreta);





        scanner.close();
    }

    // Método para obter a resposta do usuário
    private static char obterResposta(Scanner scanner) {
        System.out.print("Sua resposta: ");
        return scanner.next().charAt(0);
    }

    // Método para verificar se a resposta está correta
    private static void verificarResposta(char respostaUsuario, char respostaCorreta) {
        if (respostaUsuario == respostaCorreta) {
            System.out.println("Parabéns! Você acertou!");
        } else {
            System.out.println("Ops! Resposta incorreta. A resposta correta é " + respostaCorreta);
        }
    }
}