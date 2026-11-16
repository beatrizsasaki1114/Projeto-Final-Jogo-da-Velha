# Projeto-Final-Jogo-da-Velha

## Integrantes
| Nome | RA | 
|------|----|
| Beatriz Naomi Ferreira Sasaki | 25016735 |
| Matheus Antony Lucas Lima | 25013260 |


## Instruções de Compilação e Execução

### 1. Pré-requisitos

É necessário ter o JDK instalado. Para verificar, execute no terminal:

```bat
java -version
javac -version
```

### 2. Acessar a pasta do projeto
Abra o terminal na pasta  `Projeto-Final-Jogo-da-Velha`.

### 3. Compilar o projeto
Execute:

```bat
javac -encoding UTF-8 -d out jogo\*.java jogo\jogador\*.java
```

Os arquivos compilados serão armazenados na pasta `out`

### 4. Executar o jogo
Execute:

```bat
java -cp out jogo.Velha
```

### 5. Jogar
- Você jogará contra o computador.
- O primeiro jogador da partida inicial é sorteado.
- Caso você comece, escolha sua marca: `X` ou `O`.
- Em cada jogada, informe primeiro a linha e depois a coluna, utilizando os números `0`, `1` ou `2`.
- Escolha uma posição que esteja livre.
- Ao final, digite `1` para jogar novamente ou `2` para encerrar.


## Estratégia do Jogador Automático 

A lógica do jogador automático consiste em analisar as marcas presentes nas linhas, colunas e diagonais do tabuleiro. Para isso, o programa compara as marcas de cada posição com a sua própria marca e com a do adversário, verificando também quais espaços estão livres.

### 1. Buscar a vitória
Verifica se alguma sequência contém duas marcas do jogador automático e uma posição livre. Se encontrar, ocupa essa posição para completar três marcas e vencer a partida.

### 2. Bloquear o adversário
Se não puder vencer imediatamente, procura uma sequência com duas marcas do jogador humano e uma posição livre. Nesse caso, ocupa o espaço restante para impedir a vitória do adversário.

### 3. Preparar uma possível vitória
Se não houver uma vitória imediata para nenhum dos jogadores, procura uma sequência que contenha uma marca do jogador automático e duas posições livres. Ao colocar a segunda marca nessa sequência, cria uma ameaça de vitória para uma próxima jogada.

### 4. Escolher uma posição disponível

Se nenhuma das condições anteriores for atendida, percorre o tabuleiro linha por linha e ocupa a primeira posição livre.

### Lógica de decisão
Essas verificações são organizadas em uma sequência de condições if e else if. Assim, apenas a primeira condição atendida é executada, respeitando a ordem de prioridade: vencer, bloquear, preparar uma sequência e ocupar um espaço disponível.