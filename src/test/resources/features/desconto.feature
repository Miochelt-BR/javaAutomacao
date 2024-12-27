# language: pt

Funcionalidade: Desconto da QAzando
  Eu como usuário QAzando
  Quero um cupom de desconto
  Para comprar um curso

  Cenário: Visualizar código de desconto
    Dado que estou no site da QAzando
    Quando eu coloco meu email
    E clico em ganhar cupom
    Então vejo o código de desconto
