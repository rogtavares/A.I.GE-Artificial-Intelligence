
---
title: markmap
markmap:
  colorFreezeLevel: 10 


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

## **6. O Que é LLM?**
- **LLM significa Large Language Model (Grande Modelo de Linguagem)**.
  - Usado para processamento de linguagem natural (NLP) e IA generativa.
  - Treinado em grandes quantidades de texto e código.
  - Geração de Texto, Tradução de Idiomas, Resumo de Texto, Resposta a Perguntas, Assistência à Codificação.

## **7. Pipeline de ML: Componentes com Serviços AWS**
- **Coleta de Dados**: Amazon S3, AWS Glue.
- **Treinamento de Modelos**: Amazon SageMaker.
- **Avaliação e Implantação**: SageMaker Model Monitor, Amazon CloudWatch.

## **8. Fundamentos de IA Generativa** 🌟
- **Definição**: Criação de conteúdo original usando aprendizado profundo.
- **Benefícios**: Acelera pesquisa, melhora a experiência do cliente e otimiza operações.
  - 8.1. **Geração de Conteúdo e Ideias**  
  - 8.2. **Aumentando a Produtividade**  
  - 8.3. **Personalização de Experiências**  
  - 8.4. **Avanços em Grandes Modelos de Linguagem (LLMs)**  
  - 8.5. **Integração Multimodal**  
  - 8.6. **Mitigação Ética e de Preconceitos**  

## **9. Aplicações de Modelos Base**
- **Engenharia de Prompt**: Orienta modelos para gerar respostas específicas.
- **RAG (Recuperação com Geração Aumentada)**: Melhora respostas utilizando dados internos.
- **RLHF (Reinforcement Learning with Human Feedback)**: Aprendizado por feedback humano.

## **10. Design e Implementação de Automação de Pipeline**
- **MLOps**: Práticas de DevOps para ML, incluindo automação e governança.
- **Monitoramento**: Detecção de desvios de desempenho usando SageMaker.

## **11. IA Responsável**
- **Práticas**: Questões morais e éticas no uso da IA.
- **Ferramentas**: **SageMaker Clarify** para detecção de viés e explicações de previsões.

## **12. Serviços de IA 🟠 Gerenciados pela AWS**
### 12.1 Amazon Augmented AI (A2I)
- Análise humana de sistemas de ML para auditoria e precisão.
### 12.2 Amazon Bedrock  
- Acesso a modelos de base (FMs) para IA generativa via API única.
  - **Amazon Nova**: Modelos multimodais de alta capacidade.
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

## **13. Segurança, Conformidade e Governança para Soluções de IA**
- **Amazon Macie**: Proteção de dados sensíveis.
- **AWS PrivateLink**: Conexões privadas e seguras.

## **14. Serviços que utilizam ou suportam LLMs diretamente**
- **Amazon Bedrock**, **Amazon Comprehend**, **Amazon Lex**, **Amazon SageMaker**.

##  **15. Considerações Finais
- **IA** é o campo geral que engloba **ML, DL e IA Generativa**.
- **ML** é focado no aprendizado a partir de dados.
- **DL** utiliza redes neurais para aprender padrões complexos em grandes volumes de dados.
- **IA Generativa** é a aplicação mais recente que cria conteúdo novo baseado em dados de treinamento.


ge tavares v4