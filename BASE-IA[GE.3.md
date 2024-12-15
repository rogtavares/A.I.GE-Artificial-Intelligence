
---
title: markmap
markmap:
  colorFreezeLevel: 8 
# GE-Artificial-Intelligence (IA)



## [TODOS SERVIÇOS AWS GÉTAVARES](https://rogtavares.github.io/mapamentalSAA-C03_getavares.github.io/)



## **1. Fundamentos de IA e ML**
- **O que é Inteligência Artificial (IA)?🟠**
  - IA é o campo da ciência da computação focado no desenvolvimento de sistemas que exibem comportamentos inteligentes.
  - Envolve coleta de dados, seleção de algoritmos, treinamento, teste e implantação.
- **Arquitetura de Aplicações de IA 🟠**
  - Camada de Dados, Modelo e Aplicação.
     
     - **Camada de Dados**: Organiza e prepara os dados para uso.
     - **Camada de Modelo**: Responsável pelas decisões do sistema, usando modelos treinados.
     - **Camada de Aplicação**: Interface com o usuário, que permite interagir com o sistema.
 
  
## **2. Terminologias Básicas de IA** 🟠
- **Machine Learning (ML)**: Algoritmos que melhoram automaticamente com base em dados.
- **Deep Learning (DL)🔵**: Subconjunto do ML que usa redes neurais profundas.
- **NLP (Natural Language Processing)**: Tecnologia que permite máquinas entenderem e interagirem com a linguagem humana.
- **LLMs  Large Language Models** são aqueles voltados para processamento de linguagem natural **(NLP)**, **IA generativa** e **Machine Leaning(ML)**

- **IA Responsável 🌟**: Práticas éticas que garantem que a IA seja justa, transparente e segura.

## 3. Diferenças entre IA, ML, Deep Learning e IA Generativa
- **IA**:🟠 Campo amplo da ciência de dados.
  
- **Machine Learning ML**:🟡 Algoritmos que aprendem a partir de dados.
- **Deep Learning (DL)**:🔵 Utiliza redes neurais profundas.
- **IA Generativa**:🌟 Criação de conteúdo novo (texto, imagem, áudio).

## **4. Compreendendo o Modelo Base**
- **Redes Neurais (RN)** 🟣: Redes neurais treinadas em grandes dados para serem ajustadas para novas tarefas.
  - Estruturas inspiradas no cérebro humano para processamento. 
- **Características**: 🟣Adaptabilidade, generalistas e desafios de integração e custo.
  - 4.1. **Modelo Perceptron**  
  - 4.2. **Perceptron Multicamadas (MLP)**  
  - 4.3. **Funções de Ativação**  
  - 4.4. **Redes Neurais Recorrentes (RNN)**  
  - 4.5. **Dropout** 


## **5. Machine Learning (ML)** 🟡
- **Definição**: Algoritmos que aprendem a partir de dados para tomar decisões.
- **Tipos**: 
  - 5.1. **Aprendizado Supervisionado**  
  - 5.2. **Aprendizado Não Supervisionado**  
  - 5.3. **Aprendizado Semi-Supervisionado**  
  - 5.4. **Aprendizado por Reforço**  
  - 5.5. **Agrupamento (Clustering)**  
  - 5.5. **Classificação**  
  - 5.7. **Regressão**  
  - 5.8. **Engenharia de Recursos**  
  - 5.9. **Aprendizagem em Conjunto**  
  - 5.8. Máquinas de Vetores de Suporte (SVM)
  -   - 5.11.**Árvores de Decisão**  


## **6. O Que é LLM?**
 - **LLM significa Large Language Model (Grande Modelo de Linguagem)**. 
   - são aqueles voltados para processamento de linguagem natural (NLP), IA generativa e aprendizado de máquina (ML). 

   - Os LLMs são um tipo de modelo de inteligência artificial (IA) projetado para processar e gerar texto semelhante ao humano.
     - • Eles são treinados em conjuntos de dados massivos de texto e código, permitindo que "aprendam" padrões complexos na linguagem.
     - • Essa capacidade de aprendizado permite que LLMs realizem uma variedade de tarefas, incluindo: 
    - • Geração de Texto: Criar histórias, artigos e outros tipos de conteúdo escrito.
    - • Tradução de Idiomas: Traduzir texto de um idioma para outro.
    - • Resumo de Texto: Condensar grandes quantidades de texto em resumos concisos.
    - • Resposta a Perguntas: Fornecer respostas informativas a perguntas complexas.
    - • Assistência à Codificação: Sugerir código e ajudar os desenvolvedores a escrever software.
      
    - • Chatbots e assistentes virtuais: Simplificam o autoatendimento do cliente e reduzem os custos operacionais, automatizando consultas de atendimento.
    - • Análise conversacional: Analisam o feedback não estruturado dos clientes para identificar os principais tópicos, detectar sentimentos e revelar tendências emergentes.
    - • Assistente de funcionários: Ajudam a encontrar informações precisas, obter respostas, resumir e criar conteúdo por meio de uma interface conversacional.
    - • Geração de código: Aceleram o desenvolvimento de aplicações com sugestões de código baseadas em comentários e códigos do desenvolvedor.

- É importante notar que,mesmos q LLMs sejam uma tecnologia avançada, eles ainda estão em desenvolvimento e possuem limitações. Por exemplo, os LLMs podem gerar informações imprecisas ("alucinações") ou exibir preconceitos presentes nos dados de treinamento. Por esse motivo,cuidado.


## **7. Pipeline de ML: Componentes com Serviços AWS**
- **Coleta de Dados**: Amazon S3, AWS Glue.
- **Treinamento de Modelos**: Amazon SageMaker.
- **Avaliação e Implantação**: SageMaker Model Monitor, Amazon CloudWatch.

## **8. Fundamentos de IA Generativa**  🌟
- **Definição**: Criação de conteúdo original usando aprendizado profundo.
- **Benefícios**: Acelera pesquisa, melhora a experiência do cliente e otimiza operações.
  - 8.1. **Geração de Conteúdo e Ideias**  
  - 8.2. **Aumentando a Produtividade**  
  - 8.3. **Personalização de Experiências**  
  - 8.4. **Avanços em Grandes Modelos de Linguagem (LLMs)**  
  - 8.5. **Integração Multimodal**  
  - 8.5. **Personalização e Controle Aprimorados**  
  - 8.7. **Mitigação Ética e de Preconceitos**  
  - 8.8. **Modelos Generativos Específicos**  
  - 8.9. **Aplicações em Tempo Real**

## **9. Aplicações de Modelos Base**
- **Engenharia de Prompt**: Orienta modelos para gerar respostas específicas.
- **RAG (Recuperação com Geração Aumentada)**: Melhora respostas utilizando dados internos.
- **RLHF (Reinforcement Learning with Human Feedback)**: Aprendizado por feedback humano.
- 
   **Método PACIF**
Criar bons prompts é essencial para extrair o máximo da IA. Aqui entra o método **PACIF**:
  - ***P (Preciso)***: Seja claro e específico.
  - ***A(Abrangente)***: Inclua detalhes relevantes.
  - ***C(Coerente)***: Mantenha a lógica e a consistência.
  - ***(Informativo)***: Forneça contexto - suficiente.
***F (Focado)***: Concentre-se no objetivo final.
 

## **10. Design e Implementação de Automação de Pipeline**
- **MLOps**: Práticas de DevOps para ML, incluindo automação e governança.
- **Monitoramento**: Detecção de desvios de desempenho usando SageMaker.

## **11. IA Responsável**

- **Práticas**: Questões morais e éticas no uso da IA.  
- Transparência, responsabilidade e impacto social. 

- **Ferramentas**: **SageMaker Clarify** para detecção de viés e explicações de previsões.

## **12. Serviços de IA 🟠 Gerenciados pela AWS**
### 12.1 Amazon Augmented AI (A2I)  

- Análise humana de sistemas de ML para auditoria e precisão.  

### 12.2 Amazon Bedrock  
- Acesso a modelos de base (FMs) para IA generativa via API única.  
  
   - 12.2.1 **Amazon Nova**
      - 12.2.1.1 **Amazon Nova Micro** 
        - Modelo apenas para texto, que oferece respostas com a menor latência e a custos extremamente baixos
      - 12.2.1.2 **Amazon Nova Lite** 
        - Modelo multimodal de baixo custo e extremamente rápido para processar entradas de texto, imagem e vídeo
      - 12.2.1.3 **Amazon Nova Pro** 
         - Modelo multimodal de alta capacidade que combina precisão, velocidade e custo para uma ampla gama de tarefas 
      - 12.2.1.4 **Amazon Nova Premier** **(será lançado no primeiro trimestre de 2025)**
         - o modelo multimodal mais avançado, ideal para tarefas complexas e para desenvolvimento de modelos personalizados
     - **((dois modelos para atividades específicas))**
       - 12.2.1.5 **Amazon Nova Canvas** 
         - Que gera imagens de alta qualidade 
       - 12.2.1.6  **Amazon Nova Reel**  
         - Que cria vídeos iguais aos de estúdio.


### 12.3 Amazon Comprehend  
- Extração de insights de texto.  

### 12.4 AWS DeepLens  
- Câmera para implementar modelos de visão computacional.  

### 12.5 Amazon Fraud Detector  
- Detecção de fraudes online com ML.  

### 12.6 Amazon Forecast  
- Previsão de resultados de negócios usando ML.  

### 12.7 AWS Glue DataBrew  
- Limpeza e transformação de dados para análises e ML.  

### 12.8 Amazon Kendra  
- Experiências de conversação seguras com IA generativa.  

### 12.9 Amazon Lex  
- Bots conversacionais com interfaces de voz e texto.  

### 12.10 Amazon Polly  
- Vozes humanas realistas para múltiplos idiomas.  

### 12.11 Amazon Personalize  
- Recomendação personalizada em tempo real.  

### 12.12 Amazon Q  

- **Amazon Q Developer:** Assistente para desenvolvimento e manutenção de software.
- - **Amazon Q Business:** Assistente para consultas e geração de conteúdo.    

### 12.13 Amazon Rekognition  
- Reconhecimento de imagens e vídeos.  

### 12.14 Amazon SageMaker  
- Criação, treinamento e implantação de modelos de ML gerenciados.  

### 12.15 Amazon Textract  
- Extração automática de texto e dados de documentos.  

### 12.16 Amazon Transcribe  
- Conversão automática de voz em texto.  

### 12.17 Amazon Translate  
- Tradução automática fluente e precisa.  

### 12.18 AWS Panorama  
- Processamento de vídeo local em tempo real.  

## 13. Serviços que utilizam ou suportam LLMs diretamente:

- **12.2 Amazon Bedrock**
Por que está relacionado a **LLMs**?
**É uma das soluções mais diretas da AWS para LLMs. Permite acessar modelos de linguagem pré-treinados e IA generativa** (como GPT, Claude, e Llama 2) via uma API única, facilitando a integração com aplicações de negócios.
- **12.3 Amazon Comprehend**
Por que está relacionado a **LLMs**?
Focado em extração de insights de texto, como análise de sentimentos, classificação de documentos e extração de entidades. Internamente, pode ser baseado em LLMs menores para tarefas específicas de NLP.
- **12.9 Amazon Lex**
Por que está relacionado a **LLMs**?
Usa modelos de linguagem para criar bots conversacionais (chatbots e voicebots). Integra-se com LLMs para melhorar o entendimento e as respostas contextuais.
- **12.14 Amazon SageMaker**
Por que está relacionado a **LLMs**?
Oferece infraestrutura completa para treinar, ajustar (fine-tune) e implantar LLMs. É amplamente utilizado para personalizar modelos para casos de uso específicos, como geração de conteúdo ou análise de dados.
   - Serviços complementares a **LLMs**:
Esses serviços não são LLMs diretamente, mas podem ser integrados ou usados para habilitar funcionalidades específicas:

  - **12.13 Amazon Rekognition**: Integra reconhecimento de imagens/vídeos a aplicações baseadas em LLMs, como assistentes multimodais.
 - **12.6 Amazon Forecast**: Utiliza ML para previsões, que podem ser aprimoradas com insights gerados por LLMs.
 - **12.5 Amazon Fraud Detector**: Modelos especializados em detecção de fraudes podem usar dados analisados por LLMs para enriquecer insights.
 - **12.15 Amazon Textract**: Extrai texto estruturado de documentos que pode ser processado posteriormente por LLMs para análises detalhadas.
 - **12.16 Amazon Transcribe** e **14.17 Amazon Translate**: Resultados de transcrição e tradução podem ser alimentados a LLMs para análise e geração de respostas. 

## **14. Segurança, Conformidade e Governança para Soluções de IA**
- **Amazon Macie**: Proteção de dados sensíveis.
       Serviço de segurança de dados e privacidade que usa machine learning para descobrir, classificar e proteger dados confidenciais P.I.I
- **AWS PrivateLink**: Conexões privadas e seguras para serviços de IA,e de terceiros de forma segura

ge tavares v14