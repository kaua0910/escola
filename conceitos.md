# 📚 Resumo – Estruturas de Dados

## O que são Estruturas de Dados?

São formas de organizar dados para facilitar operações como inserir, remover, buscar e ordenar informações.

**Pergunta principal:** *Qual é a melhor forma de organizar os dados para resolver um problema?*

---

# 1. Estruturas Abstratas de Dados (TAD)

Uma **TAD** define **o que uma estrutura faz**, sem dizer **como ela é implementada**.

**Exemplo:**
Uma pilha deve permitir:

* Empilhar (`push`)
* Desempilhar (`pop`)
* Consultar o topo (`top`)

Não importa se ela foi construída com um array ou uma lista ligada.

---

# 2. Encapsulamento

Esconde os detalhes internos de uma estrutura e permite acesso apenas por métodos controlados.

**Objetivo:**

* Proteger os dados.
* Evitar alterações incorretas.
* Facilitar o uso.

---

# 3. Arrays (Vetores)

Coleção de elementos armazenados em posições consecutivas na memória.

### Vantagens

* Acesso muito rápido por índice.
* Fácil de percorrer.

### Desvantagens

* Inserções e remoções no meio exigem mover elementos.
* Geralmente possuem tamanho fixo.

---

# 4. Alocação Dinâmica

Permite criar estruturas cujo tamanho aumenta ou diminui conforme necessário.

**Vantagem:**

* Melhor aproveitamento da memória.
* Estruturas flexíveis.

---

# 5. Listas Ligadas (Encadeadas)

Cada elemento guarda:

* um valor;
* um ponteiro para o próximo elemento.

### Lista Simples

Cada nó aponta apenas para o próximo.

```
A → B → C
```

### Lista Dupla

Cada nó aponta para o anterior e para o próximo.

```
A ⇄ B ⇄ C
```

### Lista Circular

O último elemento aponta novamente para o primeiro.

```
A → B → C
↑       ↓
└───────┘
```

### Vantagens

* Inserção e remoção rápidas.
* Não possuem tamanho fixo.

### Desvantagens

* Acesso aos elementos é sequencial.

---

# 6. Pilhas (Stack)

Funcionam segundo o princípio:

**LIFO (Last In, First Out)**

"O último que entra é o primeiro que sai."

Operações:

* Push → inserir.
* Pop → remover.
* Top → consultar o topo.

**Exemplo:**

* Desfazer (Ctrl + Z).
* Pilha de pratos.

---

# 7. Filas (Queue)

Funcionam segundo o princípio:

**FIFO (First In, First Out)**

"O primeiro que entra é o primeiro que sai."

Operações:

* Enqueue → inserir.
* Dequeue → remover.

**Exemplo:**

* Fila de banco.
* Fila de impressão.

---

# 8. Recursividade

Uma função chama ela mesma até atingir um **caso base**, que encerra as chamadas.

Usada para resolver problemas que podem ser divididos em partes menores.

---

# 9. Tabelas Hash (Hash Tables)

Estrutura que utiliza uma **função hash** para transformar uma chave em uma posição da memória.

### Vantagem

* Busca extremamente rápida na maioria dos casos.

**Exemplo:**
CPF → posição específica na tabela.

---

# 10. Árvores

Estrutura hierárquica composta por:

* raiz;
* nós;
* filhos.

Usadas em:

* sistemas de arquivos;
* HTML;
* bancos de dados;
* árvores genealógicas.

---

# 11. Métodos de Ordenação

Objetivo:
Organizar os elementos em ordem crescente ou decrescente.

### Bubble Sort

Compara elementos vizinhos e troca quando necessário.

### Selection Sort

Encontra o menor elemento e o coloca na posição correta.

### Insertion Sort

Insere cada elemento na posição correta entre os já ordenados.

### Merge Sort

Divide a lista, ordena as partes e depois junta tudo.

### Quick Sort

Escolhe um pivô, separa menores e maiores e repete o processo.

---

# 12. Métodos de Busca

## Busca Linear

Percorre todos os elementos até encontrar o desejado.

**Complexidade:** O(n)

---

## Busca Binária

Divide repetidamente uma lista ordenada ao meio até encontrar o elemento.

**Requisito:** a lista deve estar ordenada.

**Complexidade:** O(log n)

---

# Comparação rápida

| Estrutura    | Melhor para                      |
| ------------ | -------------------------------- |
| Array        | Acesso rápido por índice         |
| Lista Ligada | Inserções e remoções frequentes  |
| Pilha        | Desfazer ações, histórico        |
| Fila         | Atendimento por ordem de chegada |
| Hash         | Buscas muito rápidas             |
| Árvore       | Organização hierárquica          |

---

# Regra de Ouro

Sempre pergunte:

1. Qual problema essa estrutura resolve?
2. Como ela organiza os dados?
3. Quais operações são rápidas e quais são lentas?
4. Onde ela é utilizada na prática?

Se conseguir responder essas quatro perguntas, você realmente entendeu a estrutura, em vez de apenas decorar sua definição.
