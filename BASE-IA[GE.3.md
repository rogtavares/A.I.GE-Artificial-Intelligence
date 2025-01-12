# GE-Artificial-Intelligence (IA)

## [TODOS SERVIÇOS AWS GÉTAVARES](https://rogtavares.github.io/AWS_getavares.github.io/)

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
- Inteligência artificial (IA)
- Rede neural artificial (Artificial neural network)
- Inteligência aumentada (Augmented intelligence)
- CRM com IA
- Deep learning (DL)🔵
- AI generativa (Generative AI)
- GPT
- Machine learning
- NLP
- Parâmetros (Parameters)
- Transformador (Transformer)
- **IA Responsável 🌟**: Práticas éticas que garantem que a IA seja justa, transparente e segura.

## **3. Diferenças entre IA, ML, Deep Learning e IA Generativa**
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
  - 5.6. **Classificação**  
  - 5.7. **Regressão**  
  - 5.8. **Engenharia de Recursos**  
  - 5.9. **Aprendizagem em Conjunto**  
  - 5.10. Máquinas de Vetores de Suporte (SVM)
  - 5.11.**Árvores de Decisão** 

   **Dependência de Dados**: Depende de dados rotulados ou não rotulados.
- **Aplicações**:
  - Análise preditiva
  - Sistemas de recomendação
  - Detecção de fraude
- **Exemplos**:
  - Filtros de spam
  - Recomendações personalizadas
  - Previsão do tempo
  
## 6. Deep Learning (DL)
- **Definição**: Subconjunto do ML que usa redes neurais profundas para aprender com grandes volumes de dados.
- **Tipos/Metodologias**:
  - Redes neurais convolucionais (CNNs)
  - Redes neurais recorrentes (RNNs)
  - Transformadores
- **Dependência de Dados**: Requer grandes quantidades de dados para treinamento eficaz.
- **Aplicações**:
  - Reconhecimento de imagem
  - Processamento de Linguagem Natural (PNL)
  - Veículos autônomos
- **Exemplos**:
  - Reconhecimento facial
  - Carros autônomos
  - Serviços de tradução de idiomas

---

## 7. IA Generativa (Ge AI)
- **Definição**: Tipo de IA focada na geração de novo conteúdo, como imagens, texto ou música.
- **Tipos/Metodologias**:
  - Redes Generativas Adversariais (GANs)
  - Autoencoders Variacionais (VAEs)
  - Modelos de Linguagem Grandes (LLMs)
- **Dependência de Dados**: Requer grandes conjuntos de dados para treinamento realista.
- **Aplicações**:
  - Geração de imagem/vídeo
  - Geração de texto (chatbots)
  - Composição musical
- **Exemplos**:
  - DALL-E (imagens)
  - ChatGPT (texto)
  - DeepDream (criação de imagens)
## **8. O Que é LLM?**
- **(LLM) significa Large Language Model (Grande Modelo de Linguagem)**.
  - Usado para processamento de linguagem natural (NLP) e IA generativa.
  - Treinado em grandes quantidades de texto e código.
  - Geração de Texto, Tradução de Idiomas, Resumo de Texto, Resposta a Perguntas, Assistência à Codificação.
  - Assistência à Codificação: Sugerir código e ajudar os desenvolvedores a escrever software.
  - Chatbots e assistentes virtuais: Simplificam o autoatendimento do cliente e reduzem os custos operacionais, automatizando consultas de atendimento.
  - Análise conversacional: Analisam o feedback não estruturado dos clientes para identificar os principais tópicos, detectar sentimentos e revelar tendências emergentes.
  - Assistente de funcionários: Ajudam a encontrar informações precisas, obter respostas, resumir e criar conteúdo por meio de uma interface conversacional.
  - É importante notar que,mesmos q LLMs sejam uma tecnologia avançada, eles ainda estão em desenvolvimento e possuem limitações.
       - Por exemplo, os LLMs podem gerar informações imprecisas ("alucinações") ou exibir preconceitos presentes nos dados de treinamento. Por esse motivo,cuidado.

## **7. Pipeline de ML: Componentes com Serviços AWS**
- **Coleta de Dados**: Amazon S3, AWS Glue.
- **Treinamento de Modelos**: Amazon SageMaker.
- **Avaliação e Implantação**: SageMaker Model Monitor, Amazon CloudWatch.

## **9. Fundamentos de IA Generativa** 🌟
- **Definição**: Criação de conteúdo original usando aprendizado profundo.
- **Benefícios**: Acelera pesquisa, melhora a experiência do cliente e otimiza operações.
  - 9.1. **Geração de Conteúdo e Ideias**  
  - 9.2. **Aumentando a Produtividade**  
  - 9.3. **Personalização de Experiências**  
  - 9.4. **Avanços em Grandes Modelos de Linguagem (LLMs)**  
  - 9.5. **Integração Multimodal**  
  - 9.6. **Mitigação Ética e de Preconceitos**  

## **10. Aplicações de Modelos Base**
- **Engenharia de Prompt**: Orienta modelos para gerar respostas específicas.
- **RAG (Recuperação com Geração Aumentada)**: Melhora respostas utilizando dados internos.
- **RLHF (Reinforcement Learning with Human Feedback)**: Aprendizado por feedback humano.

## **11. Design e Implementação de Automação de Pipeline**
- **MLOps**: Práticas de DevOps para ML, incluindo automação e governança.
- **Monitoramento**: Detecção de desvios de desempenho usando SageMaker.

## **12. IA Responsável**
- **Práticas**: Questões morais e éticas no uso da IA.
- **Ferramentas**: **SageMaker Clarify** para detecção de viés e explicações de previsões.

## **13. Serviços de IA 🟠 Gerenciados pela AWS**
### 13.1 Amazon Augmented AI (A2I)
- Análise humana de sistemas de ML para auditoria e precisão.
### 13.2 Amazon Bedrock  
- Acesso a modelos de base (FMs) para IA generativa via API única.
  - **Amazon Nova**: Modelos multimodais de alta capacidade.
       - 13.2.1 **Amazon Nova**
      - 13.2.1.1 **Amazon Nova Micro** 
        - Modelo apenas para texto, que oferece respostas com a menor latência e a custos extremamente baixos
      - 13.2.1.2 **Amazon Nova Lite** 
        - Modelo multimodal de baixo custo e extremamente rápido para processar entradas de texto, imagem e vídeo
      - 13.2.1.3 **Amazon Nova Pro** 
         - Modelo multimodal de alta capacidade que combina precisão, velocidade e custo para uma ampla gama de tarefas 
      - 13.2.1.4 **Amazon Nova Premier** **(será lançado no primeiro trimestre de 2025)**
         - o modelo multimodal mais avançado, ideal para tarefas complexas e para desenvolvimento de modelos personalizados
     - **((dois modelos para atividades específicas))**
       - 13.2.1.5 **Amazon Nova Canvas** 
         - Que gera imagens de alta qualidade 
       - 13.2.1.6  **Amazon Nova Reel**  
         - Que cria vídeos iguais 
### 13.3 Amazon Comprehend  
- Extração de insights de texto.
### 13.4 AWS DeepLens  
- Câmera para implementar modelos de visão computacional.
### 13.5 Amazon Fraud Detector  
- Detecção de fraudes online com ML.
### 13.6 Amazon Forecast  
- Previsão de resultados de negócios usando ML.
### 13.7 AWS Glue DataBrew  
- Limpeza e transformação de dados para análises e ML.
### 13.8 Amazon Kendra  
- Experiências de conversação seguras com IA generativa.
### 13.9 Amazon Lex  
- Bots conversacionais com interfaces de voz e texto.
### 13.10 Amazon Polly  
- Vozes humanas realistas para múltiplos idiomas.
  
### 13.11 Amazon Personalize  
- Recomendação personalizada em tempo real.  

### 13.12 Amazon Q  

- **Amazon Q Developer:** Assistente para desenvolvimento e manutenção de software.
- **Amazon Q Business:** Assistente para consultas e geração de conteúdo.    

### 13.13 Amazon Rekognition  
- Reconhecimento de imagens e vídeos.  

### 13.14 Amazon SageMaker  
- Criação, treinamento e implantação de modelos de ML gerenciados.

### 13.14.2 Amazon SageMaker JumpStart
-  é um **hub de machine learning (ML)** que pode ajudar você a acelerar sua jornada de ML. Com o SageMaker JumpStart, você pode avaliar, comparar e selecionar Foundation Models (FMs) rapidamente com base em métricas de qualidade e responsabilidade predefinidas para executar tarefas como resumo de artigos e geração de imagens. Os modelos pré-treinados são totalmente personalizáveis ​​para seu caso de uso com seus dados, e você pode implantá-los facilmente na produção com a interface do usuário ou SDK. ​​  

### 13.4.3 SageMaker Clarify (Avalie FMs com o SageMaker Clarify)
- O SageMaker Clarify ajuda a identificar possíveis vieses durante a preparação de dados sem escrever código. Você especifica recursos de entrada, como gênero ou idade, e o SageMaker Clarify executa um trabalho de análise para detectar possíveis vieses nesses recursos.(( Viés em resultados gerados por IA envolveria conteúdo que favorece ou discrimina injustamente certos grupos))
    - Viés de amostragem
    - Viés de medição
    - Viés do observador
    - Viés de confirmação
### 13.15 Amazon Textract  
- Extração automática de texto e dados de documentos.  

### 13.16 Amazon Transcribe  
- converte entrada de áudio em texto, o que abre as portas para vários aplicativos de análise de texto em entrada de voz

### 13.17 Amazon Translate  
- Tradução automática fluente e precisa.  

### 13.18 AWS Panorama  
- Processamento de vídeo local em tempo real.

### 13.19 AWS Trainium
- O AWS Trainium é o chip de machine learning (ML) que a AWS construiu especificamente para treinamento de deep learning (DL) de mais de 100 bilhões de modelos de parâmetros. Cada instância Trn1 do Amazon Elastic Compute Cloud (Amazon EC2) implementa até 16 aceleradores Trainium para fornecer uma solução de alto desempenho e baixo custo para treinamento DL na nuvem.  

## **14. Segurança, Conformidade e Governança para Soluções de IA**
- **Amazon Macie**: Proteção de dados sensíveis.
- **AWS PrivateLink**: Conexões privadas e seguras.

## **15. Serviços que utilizam ou suportam LLMs diretamente**
- **Amazon Bedrock**, **Amazon Comprehend**, **Amazon Lex**, **Amazon SageMaker**.

## **16. Considerações Finais**
- **IA** é o campo geral que engloba ML, DL e IA Generativa.
- **ML** é focado no aprendizado a partir de dados.
- **DL** utiliza redes neurais para aprender padrões complexos em grandes volumes de dados.
- **IA Generativa** é a aplicação mais recente que cria conteúdo novo baseado em dados de treinamento.




ge.tV5
