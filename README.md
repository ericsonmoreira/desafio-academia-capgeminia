# Desafio Academia Capgeminia

![cover](.github/logo-capgemini.png)

## :fire: Introdução

A Academia Técnica Capgemini é um Programa de Formação designado a capacitar futuros (as) colaboradores (as) para os 
times de trabalho da empresa, Líder Global em tecnologia, terceirização e serviços de consultoria.

A Academia Java Capgemini 2022 iniciará com o Processo Seletivo, que envolverá Teste de Raciocínio Lógico e um **Desafio
de Programação**. 

Esse projeto se trata com o processo do Desafio de Programação.

## :toolbox: Ferramentas utilizadas

- IDE: [IntelliJIDEA](https://www.jetbrains.com/pt-br/idea/)
- JUnit
- Java 8

## :fist_left: Arquivos

### Estreutura de pastas

<pre><font color="#BD93F9"><b>.</b></font>
├── desafio-academia-capgeminia.iml
├── README.md
└── <font color="#BD93F9"><b>src</b></font>
    ├── <font color="#BD93F9"><b>questions</b></font>
    │   ├── QuestionOne.java
    │   ├── QuestionThree.java
    │   └── QuestionTwo.java
    └── <font color="#BD93F9"><b>tests</b></font>
        ├── QuestionOneTest.java
        ├── QuestionThreeTest.java
        └── QuestionTwoTest.java
</pre>

> Pacote `questions`: **Classes** com a descrição das questões e os algoritmos.
>
> Pacote `tests`: **Classes** com os testes.

## :question: Questões

### [QuestionOne][1]

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da 
escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

#### Exemplo

#### Entrada: n = 6

#### Saída:

```shell
     *
    **
   ***
  ****
 *****
******
```

### [QuestionTwo][2]

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o 
preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela 
satisfaz os seguintes critérios:

- Possui no mínimo 6 caracteres. 
- Contém no mínimo 1 digito.
- Contém no mínimo 1 letra em minúsculo. 
- Contém no mínimo 1 letra em maiúsculo. 
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: __!@#$%^&*()-+__.

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar
Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string
qualquer ser considerada segura.

#### Exemplo:

#### Entrada: Ya3

#### Saída: 3

#### Explicação:

Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres
não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

### [QuestionThree][3]

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para 
formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings 
que são anagramas.

#### Exemplo:

##### Exemplo 1)

##### Entrada: ovo

##### Saída: 3

##### Explicação:

A lista de todos os anagramas pares são: `[o, o]`, `[ov, vo]` que estão nas posições `[[0, 2], [0, 1], [1, 2]]` 
respectivamente.

##### Exemplo 2)

##### Entrada: ifailuhkqq

##### Saída: 3

##### Explicação:

A lista de todos os anagramas pares são: `[i, i]`, `[q, q]` e `[ifa, fai]` que estão nas posições 
`[[0, 3]], [[8, 9]]` e `[[0, 1, 2], [1, 2, 3]]`.

### [QuestionOneTest][4]

Testes da primeira questão.

### [QuestionTwoTest][5]

Testes da segunda questão.

### [QuestionThreeTest][6]

Testes da terceira questão.

## :test_tube: Como testar

Siga os seguintes passos para testar o projeto:

### Clone o projeto

```shell
git clone https://github.com/ericsonmoreira/desafio-academia-capgeminia.git
```

### Abrir abrir o projeto

1. Abra o projeto com a IDE que achar mais interessante, mas recomendamos usar o 
[IntelliJIDEA](https://www.jetbrains.com/pt-br/idea/).
2. Baixe as dependências do projeto. 
3. Execute os testes.
   1. Se vc estiver usando o IntelliJIDEA, cique com o botão esquerdo no projeto e selecione `Run All Tests`.


[1]: src/questions/QuestionOne.java
[2]: src/questions/QuestionTwo.java
[3]: src/questions/QuestionThree.java
[4]: src/tests/QuestionOneTest.java
[5]: src/tests/QuestionTwoTest.java
[6]: src/tests/QuestionThreeTest.java

