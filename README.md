🏥 Sensus Triagem - IA para Saúde
O Sensus Triagem é um sistema Java para triagem hospitalar que não apenas classifica pacientes por prioridade, mas utiliza Inteligência Artificial (Azure Cognitive Services) para extrair termos clínicos de sintomas descritos em texto bruto e validar a consistência das informações.

🚀 O que o projeto faz?
O sistema resolve um problema comum: a inconsistência entre o relato do paciente e a escala de dor informada.

Integração com Azure: Extrai palavras-chave de sintomas (ex: "desmaio", "dor no peito") usando Processamento de Linguagem Natural (NLP).
Validação de Inconsistência: Se o paciente relata um sintoma grave (como desmaio), mas indica um nível de dor baixo (nível 1), o sistema gera um alerta de inconsistência.
Classificação Dinâmica: Define cores de prioridade (Verde, Amarelo, Vermelho) com base na gravidade detectada.

🛠️ Tecnologias
Java 17 (Linguagem principal)
Maven (Gerenciamento de dependências)
OkHttp3 (Consumo da API REST da Azure)
Dotenv (Segurança de credenciais)
Azure AI Services (Extração de entidades clínicas)

📦 Como rodar o projeto
Para rodar este projeto na sua máquina, siga os passos abaixo:

Clonar o repositório:
git clone https://github.com/felipehnr00/SensusTriagem.git
Configurar as chaves:
Crie um arquivo chamado .env na raiz do projeto (use o arquivo env.example como base) e insira suas credenciais da Azure
Compilar e Rodar:
Abra o projeto em uma IDE (IntelliJ recomendada) e execute a classe Main.java.

🛡️ Segurança de Credenciais
Este projeto utiliza boas práticas de segurança:

As chaves de API não estão no código-fonte.
O arquivo .env está no .gitignore para evitar vazamentos.
O arquivo env.example serve apenas como molde para novos usuários.

💡 Por que escolhi essa abordagem
Muitos sistemas de triagem são apenas um monte de if/else. O Sensus Triagem vai além ao tentar entender o que o paciente está sentindo através de IA, garantindo que sintomas graves não passem despercebidos por erro humano na hora de preencher o nível de dor.
