# Sistematizacao_empregados
Este projeto é um simples sistema de gerenciamento de informações de empregados utilizando Java. Ele coleta dados dos empregados através do terminal e exibe as informações inseridas. Este projeto foi desenvolvido para auxiliar a empresa MGS (Max Global Sports) a gerenciar informações importantes dos seus funcionários, incluindo alergias e problemas médicos, para situações de emergência.

Funcionalidades
Coleta de informações de identificação dos empregados.
Coleta de informações médicas e de contato.
Exibição das informações dos empregados inseridas no sistema.
Estrutura do Projeto
O projeto contém duas classes principais:

Empregado - Representa um empregado e contém os atributos e métodos relacionados.
Main - Contém o método main para executar o programa.
Classe Empregado
A classe Empregado possui os seguintes atributos:

id (String): Identificador do empregado.
nome (String): Nome do empregado.
idade (int): Idade do empregado.
alergias (String): Alergias do empregado, separadas por vírgulas.
problemasMedicos (String): Problemas médicos do empregado, separados por vírgulas.
telefone (String): Telefone de contato do empregado.
email (String): Email de contato do empregado.
Classe Main
A classe Main solicita a entrada dos dados do empregado via terminal, cria um objeto Empregado com esses dados e exibe as informações do empregado.

Requisitos
Java Development Kit (JDK) 8 ou superior
Eclipse IDE

Como Executar o Projeto
Passo a Passo
Configurar o Ambiente

Instale o JDK 8 ou superior. Você pode baixar o JDK do site oficial da Oracle.
Instale o Eclipse IDE. Você pode baixar o Eclipse do site oficial do Eclipse.

Clonar o Repositório

Abra o terminal (ou a linha de comando) e navegue até o diretório onde deseja clonar o repositório.

Execute o seguinte comando para clonar o repositório:
git clone https://github.com/seu-usuario/SistemaDeEmpregados.git
Navegue até o diretório do projeto clonado:
cd SistemaDeEmpregados
Importar o Projeto no Eclipse

Abra o Eclipse.
Vá para File > Import.
Selecione Existing Projects into Workspace e clique em Next.
Clique em Browse e selecione o diretório onde o projeto foi clonado (SistemaDeEmpregados).
Clique em Finish.
Executar o Programa

No Eclipse, expanda o pacote br.com.mgs no Package Explorer.
Clique com o botão direito na classe Main.
Selecione Run As > Java Application.
O programa solicitará a entrada das informações do empregado pelo terminal e, em seguida, exibirá os dados inseridos.
