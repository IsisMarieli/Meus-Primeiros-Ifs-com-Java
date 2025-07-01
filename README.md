# Meus Primeiros Ifs com Java

## 💻 Desafio Java: Cálculo Salarial com Imposto

Este repositório contém a solução para um desafio de lógica de programação em Java, cujo objetivo é calcular o salário a ser transferido para o funcionário após a aplicação do imposto sobre o salário bruto, somado ao valor dos benefícios.

## 🧠 Objetivo do Desafio

Receber dois valores:
- Valor bruto do salário
- Valor adicional dos benefícios

E com base na faixa salarial, aplicar um percentual de imposto conforme as regras a seguir:

### 📊 Tabela de Impostos

| Faixa Salarial (R$)        | Alíquota de Imposto |
|----------------------------|---------------------|
| Até 1100.00                | 5%                  |
| De 1100.01 até 2500.00     | 10%                 |
| Acima de 2500.00           | 15%                 |

O valor final transferido é calculado da seguinte forma:

```
salário líquido = (salário bruto - imposto) + benefícios 
```

---

## 📥 Entrada

Dois números com casas decimais, representando:

1. Valor bruto do salário
2. Valor dos benefícios

Exemplo:

```
2000
250
```
---

## 📤 Saída

Um número com duas casas decimais, representando o valor final a ser transferido:

```
2050.00
```

## 🧾 Exemplo de Cálculo

Para o salário de R$2000, aplica-se uma alíquota de 10%:

```
Imposto: 2000 x 0.10 = 200
Salário líquido: (2000 - 200) + 250 = 2050.00
```

## 📌 O que eu aprendi

- Leitura de dados com `Scanner`
- Operadores condicionais (`if`, `else if`)
- Cálculo percentual
- Impressão formatada com `String.format("%.2f", valor)`
- Lógica de negócios com múltiplas condições

---