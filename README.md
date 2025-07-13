# ☕ Introdução ao Java

Este repositório contém explicações e exemplos simples dos principais conceitos básicos da linguagem **Java**, como:

- Variáveis
- Condicionais (`if`, `else`, `else if`)
- `switch`
- Laços (`for`, `while`, `do while`)
- Funções (métodos)

---

## 📌 O que é Java?

Java é uma linguagem de programação de propósito geral, orientada a objetos, criada em 1995. Sua principal característica é a **portabilidade**: *"Escreva uma vez, execute em qualquer lugar"*.

---

## 🧠 Variáveis em Java

As variáveis guardam valores na memória e possuem um tipo definido. Exemplo:

```java
int idade = 25;
double altura = 1.75;
char letra = 'A';
boolean ativo = true;
String nome = "Maria";
Tipo = Significado
int = Número inteiro
double = Número decimal
char = Um caractere
boolean	Verdadeiro ou falso
String = Texto (palavras)
 ````
# ✅ Condicionais (if, else, else if)
Permitem executar ações diferentes dependendo de uma condição:
````Java
int idade = 20;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
````
Operadores comuns:

| Operador | Significado    | Exemplo  |
| -------- | -------------- | -------- |
| `==`     | igual a        | `x == y` |
| `!=`     | diferente de   | `x != y` |
| `>`      | maior que      | `x > y`  |
| `<`      | menor que      | `x < y`  |
| `>=`     | maior ou igual | `x >= y` |
| `<=`     | menor ou igual | `x <= y` |


| Operador | Nome      | Exemplo                       |        
| -------- | --------- | ----------------------------- | 
| `&&`     | E (AND)   | `idade >= 18 && idade < 60`   |      
| \`       |           | \`                            | 
| `!`      | NÃO (NOT) | `!ativo` (se ativo for false) |        


# 🔁 switch (decisões com vários casos)
Ideal para quando há várias opções fixas:
````Java
int opcao = 2;

switch (opcao) {
    case 1:
        System.out.println("Cadastrar");
        break;
    case 2:
        System.out.println("Editar");
        break;
    case 3:
        System.out.println("Excluir");
        break;
    default:
        System.out.println("Opção inválida");
}

````

Também pode ser usado com String:

```` Java
String comando = "deitar";

switch (comando) {
    case "sentar":
        System.out.println("Sentou");
        break;
    case "deitar":
        System.out.println("Deitou");
        break;
    default:
        System.out.println("Comando desconhecido");
}

`````
# 🔄 Laços de repetição
for – quando você sabe quantas vezes quer repetir:

```` Java
for (int i = 1; i <= 5; i++) {
    System.out.println("Volta número " + i);
}

````

while – repete enquanto a condição for verdadeira:
```Java
int x = 0;

while (x < 3) {
    System.out.println("x = " + x);
    x++;
}

```
do while – executa pelo menos uma vez:
```
int x = 0;

do {
    System.out.println("x = " + x);
    x++;
} while (x < 3);
```




