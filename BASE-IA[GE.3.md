
---
title: markmap
markmap:
  colorFreezeLevel: 8 
# GE-Artificial-Intelligence (IA)



## Índice
- [GE-Artificial-Intelligence (IA)](#ge-artificial-intelligence-ia)
  - [Índice](#índice)
  - [1. Fundamentos de IA e ML](#1-fundamentos-de-ia-e-ml)
  - [2. Terminologias Básicas de IA 🟠](#2-terminologias-básicas-de-ia-)
  - [3. Diferenças entre IA, ML, Deep Learning e IA Generativa](#3-diferenças-entre-ia-ml-deep-learning-e-ia-generativa)
  - [4. Compreendendo o Modelo Base](#4-compreendendo-o-modelo-base)
  - [5. Tipos de Modelos de IA 🟠](#5-tipos-de-modelos-de-ia-)
  - [6. Machine Learning (ML)🟡](#6-machine-learning-ml)
  - [7. Pipeline de ML: Componentes com Serviços AWS](#7-pipeline-de-ml-componentes-com-serviços-aws)
  - [8. Fundamentos de IA Generativa 🌟](#8-fundamentos-de-ia-generativa-)
  - [9. Aplicações de Modelos Base](#9-aplicações-de-modelos-base)
  - [10. Design e Implementação de Automação de Pipeline](#10-design-e-implementação-de-automação-de-pipeline)
  - [11. IA Responsável](#11-ia-responsável)
  - [12. Serviços de IA 🟠 Gerenciados pela AWS](#12-serviços-de-ia--gerenciados-pela-aws)
    - [12.1 Amazon Augmented AI (A2I)](#121-amazon-augmented-ai-a2i)
    - [12.2 Amazon Bedrock](#122-amazon-bedrock)
    - [12.3 Amazon Comprehend](#123-amazon-comprehend)
    - [12.4 AWS DeepLens](#124-aws-deeplens)
    - [12.5 Amazon Fraud Detector](#125-amazon-fraud-detector)
    - [12.6 Amazon Forecast](#126-amazon-forecast)
    - [12.7 AWS Glue DataBrew](#127-aws-glue-databrew)
    - [12.8 Amazon Kendra](#128-amazon-kendra)
    - [12.9 Amazon Lex](#129-amazon-lex)
    - [12.10 Amazon Polly](#1210-amazon-polly)
    - [12.11 Amazon Personalize](#1211-amazon-personalize)
    - [12.12 Amazon Q](#1212-amazon-q)
    - [12.13 Amazon Rekognition](#1213-amazon-rekognition)
    - [12.14 Amazon SageMaker](#1214-amazon-sagemaker)
    - [12.15 Amazon Textract](#1215-amazon-textract)
    - [12.16 Amazon Transcribe](#1216-amazon-transcribe)
    - [12.17 Amazon Translate](#1217-amazon-translate)
    - [12.18 AWS Panorama](#1218-aws-panorama)
  - [12.0 Robótica](#120-robótica)
  - [13. Segurança, Conformidade e Governança para Soluções de IA](#13-segurança-conformidade-e-governança-para-soluções-de-ia)

---

## 1. Fundamentos de IA e ML
- **O que é Inteligência Artificial (IA)?🟠**
  - IA é o campo da ciência da computação focado no desenvolvimento de sistemas que exibem comportamentos inteligentes.
  - Envolve coleta de dados, seleção de algoritmos, treinamento, teste e implantação.
- **Arquitetura de Aplicações de IA 🟠**
  - Camada de Dados, Modelo e Aplicação.
     
     - **Camada de Dados**: Organiza e prepara os dados para uso.
     - **Camada de Modelo**: Responsável pelas decisões do sistema, usando modelos treinados.
     - **Camada de Aplicação**: Interface com o usuário, que permite interagir com o sistema.
 
  
## 2. Terminologias Básicas de IA 🟠
- **Machine Learning (ML)🟠**: Algoritmos que melhoram automaticamente com base em dados.
- **Deep Learning (DL)🔵**: Subconjunto do ML que usa redes neurais profundas.
- **NLP (Natural Language Processing)**: Tecnologia que permite máquinas entenderem e interagirem com a linguagem humana.
- **IA Responsável 🌟**: Práticas éticas que garantem que a IA seja justa, transparente e segura.

## 3. Diferenças entre IA, ML, Deep Learning e IA Generativa
- **IA**:🟠 Campo amplo da ciência de dados.
  
- **Machine Learning ML**:🟡 Algoritmos que aprendem a partir de dados.
- **Deep Learning (DL)**:🔵 Utiliza redes neurais profundas.
- **IA Generativa**:🌟 Criação de conteúdo novo (texto, imagem, áudio).

## 4. Compreendendo o Modelo Base
- **Redes Neurais (RN)** 🟣: Redes neurais treinadas em grandes dados para serem ajustadas para novas tarefas.
  - Estruturas inspiradas no cérebro humano para processamento. 
- **Características**: 🟣Adaptabilidade, generalistas e desafios de integração e custo.
  - 4.1. **Modelo Perceptron**  
  - 4.2. **Perceptron Multicamadas (MLP)**  
  - 4.3. **Funções de Ativação**  
  - 4.4. **Redes Neurais Recorrentes (RNN)**  
  - 4.5. **Dropout** 

## 5. Tipos de Modelos de IA 🟠
- **Visão Computacional**: Amazon Rekognition.
- **NLP**: Amazon Comprehend, Amazon Lex.
- **Reconhecimento de Fala**: Amazon Transcribe.
- **IA Generativa**: Amazon Bedrock.

## 6. Machine Learning (ML)🟡
- **Definição**: Algoritmos que aprendem a partir de dados para tomar decisões.
- **Tipos**: 
  - 6.1. **Aprendizado Supervisionado**  
  - 6.2. **Aprendizado Não Supervisionado**  
  - 6.3. **Aprendizado Semi-Supervisionado**  
  - 6.4. **Aprendizado por Reforço**  
  - 6.5. **Agrupamento (Clustering)**  
  - 6.6. **Classificação**  
  - 6.7. **Regressão**  
  - 6.8. **Engenharia de Recursos**  
  - 6.9. **Aprendizagem em Conjunto**  
  - 6.10. Máquinas de Vetores de Suporte (SVM)
  -   - 6.11.**Árvores de Decisão**  
- 2.12. **Redução de Dimensionalidade**

## 7. Pipeline de ML: Componentes com Serviços AWS
- **Coleta de Dados**: Amazon S3, AWS Glue.
- **Treinamento de Modelos**: Amazon SageMaker.
- **Avaliação e Implantação**: SageMaker Model Monitor, Amazon CloudWatch.

## 8. Fundamentos de IA Generativa 🌟
- **Definição**: Criação de conteúdo original usando aprendizado profundo.
- **Benefícios**: Acelera pesquisa, melhora a experiência do cliente e otimiza operações.
  - 8.1. **Geração de Conteúdo e Ideias**  
  - 8.2. **Aumentando a Produtividade**  
  - 8.3. **Personalização de Experiências**  
  - 8.4. **Avanços em Grandes Modelos de Linguagem (LLMs)**  
  - 8.5. **Integração Multimodal**  
  - 8.6. **Personalização e Controle Aprimorados**  
  - 8.7. **Mitigação Ética e de Preconceitos**  
  - 8.8. **Modelos Generativos Específicos**  
  - 8.9. **Aplicações em Tempo Real**

## 9. Aplicações de Modelos Base
- **Engenharia de Prompt**: Orienta modelos para gerar respostas específicas.
- **RAG (Recuperação com Geração Aumentada)**: Melhora respostas utilizando dados internos.
- **RLHF (Reinforcement Learning with Human Feedback)**: Aprendizado por feedback humano.

## 10. Design e Implementação de Automação de Pipeline
- **MLOps**: Práticas de DevOps para ML, incluindo automação e governança.
- **Monitoramento**: Detecção de desvios de desempenho usando SageMaker.

## 11. IA Responsável

- **Práticas**: Questões morais e éticas no uso da IA.  
- Transparência, responsabilidade e impacto social. 

- **Ferramentas**: **SageMaker Clarify** para detecção de viés e explicações de previsões.

## 12. Serviços de IA 🟠 Gerenciados pela AWS
### 12.1 Amazon Augmented AI (A2I)  
- Análise humana de sistemas de ML para auditoria e precisão.  

### 12.2 Amazon Bedrock  
- Acesso a modelos de base (FMs) para IA generativa via API única.  

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

## 12.0 Robótica  
- Aplicações de IA em automação e robôs inteligentes.  

## 13. Segurança, Conformidade e Governança para Soluções de IA
- **Amazon Macie**: Proteção de dados sensíveis.
       Serviço de segurança de dados e privacidade que usa machine learning para descobrir, classificar e proteger dados confidenciais P.I.I
- **AWS PrivateLink**: Conexões privadas e seguras para serviços de IA,e de terceiros de forma segura

ge tavares v7