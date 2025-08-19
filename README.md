Projeto Matriz em Java
Este é um projeto Java simples para criar e manipular matrizes 2D.

Estrutura do Projeto
src/: Contém o código-fonte Java.
Matriz.java: A classe principal que representa uma matriz. Inclui métodos para inicialização, definir/obter valores, preencher a matriz automaticamente ou via entrada do usuário, e exibi-la.
Main.java: A classe principal e ponto de entrada para a aplicação. Demonstra o uso da classe Matriz.
bin/: Contém os arquivos .class compilados.
lib/: Destinado a bibliotecas externas, mas atualmente não utilizado.
Fluxo de Trabalho do Desenvolvedor
O projeto não utiliza uma ferramenta de build como Maven ou Gradle. A compilação e a execução são feitas manualmente a partir da linha de comando.

Compilação
Para compilar todos os arquivos .java a partir do diretório raiz do projeto (matriz), execute o seguinte comando. Isso colocará os arquivos .class compilados no diretório bin/.

javac -d bin src/*.java
Execução
Para executar a aplicação após a compilação, use o seguinte comando a partir do diretório raiz do projeto. Isso informa à JVM para procurar os arquivos de classe no diretório bin/.

java -cp bin Main
Componentes Principais
Matriz.java: Este é o componente central. Ao adicionar novas funcionalidades, como adição ou multiplicação de matrizes, as alterações provavelmente serão neste arquivo.
Main.java: Esta classe é usada para conduzir a aplicação e testar as funcionalidades da classe Matriz.
Dependências
O projeto não possui dependências externas e depende apenas da biblioteca padrão do Java.
