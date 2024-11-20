
---
title: markmap
markmap:
  colorFreezeLevel: 8 
# GE-Artificial-Intelligence (IA)



## Índice
- [GE-Artificial-Intelligence (IA)](#ge-artificial-intelligence-ia)
  - [Índice](#índice)
  - [1. Fundamentos de IA e ML](#1-fundamentos-de-ia-e-ml)
  - [2. Terminologias Básicas de IA](#2-terminologias-básicas-de-ia)
  - [3. Diferenças entre IA, ML, Deep Learning e IA Generativa](#3-diferenças-entre-ia-ml-deep-learning-e-ia-generativa)
  - [4. Compreendendo o Modelo Base](#4-compreendendo-o-modelo-base)
  - [5. Tipos de Modelos de IA](#5-tipos-de-modelos-de-ia)
  - [6. Machine Learning (ML)🟡](#6-machine-learning-ml)
  - [7. Pipeline de ML: Componentes com Serviços AWS](#7-pipeline-de-ml-componentes-com-serviços-aws)
  - [8. Fundamentos de IA Generativa](#8-fundamentos-de-ia-generativa)
  - [9. Aplicações de Modelos Base](#9-aplicações-de-modelos-base)
  - [10. Design e Implementação de Automação de Pipeline](#10-design-e-implementação-de-automação-de-pipeline)
  - [11. IA Responsável](#11-ia-responsável)
  - [12. Serviços de IA Gerenciados pela AWS](#12-serviços-de-ia-gerenciados-pela-aws)
  - [13. Segurança, Conformidade e Governança para Soluções de IA](#13-segurança-conformidade-e-governança-para-soluções-de-ia)

---

## 1. Fundamentos de IA e ML
- **O que é Inteligência Artificial (IA)?**
  - IA é o campo da ciência da computação focado no desenvolvimento de sistemas que exibem comportamentos inteligentes.
  - Envolve coleta de dados, seleção de algoritmos, treinamento, teste e implantação.
- **Arquitetura de Aplicações de IA**
  - Camada de Dados, Modelo e Aplicação.
  
## 2. Terminologias Básicas de IA
- **Machine Learning (ML)**: Algoritmos que melhoram automaticamente com base em dados.
- **Deep Learning (DL)**: Subconjunto do ML que usa redes neurais profundas.
- **NLP (Natural Language Processing)**: Tecnologia que permite máquinas entenderem e interagirem com a linguagem humana.
- **IA Responsável**: Práticas éticas que garantem que a IA seja justa, transparente e segura.

## 3. Diferenças entre IA, ML, Deep Learning e IA Generativa
- **IA**:🟠 Campo amplo da ciência de dados.
  
- **Machine Learning ML**:🟡 Algoritmos que aprendem a partir de dados.
- **Deep Learning (DL)**:🔵 Utiliza redes neurais profundas.
- **IA Generativa**:🌟 Criação de conteúdo novo (texto, imagem, áudio).

## 4. Compreendendo o Modelo Base
--  **Redes Neurais (RN)** 🟣: Redes neurais treinadas em grandes dados para serem ajustadas para novas tarefas.
- **Características**: 
- Adaptabilidade, generalistas e desafios de integração e custo.
 - 4.1. **Modelo Perceptron**  
 - 4.2. **Perceptron Multicamadas (MLP)**  
- 4.3. **Funções de Ativação**  
- 4.4. **Redes Neurais Recorrentes (RNN)**  
- 4.5. **Dropout** 

## 5. Tipos de Modelos de IA
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

## 8. Fundamentos de IA Generativa
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
- **Práticas**: Justa, transparente, privada e confiável.
- **Ferramentas**: SageMaker Clarify para detecção de viés e explicações de previsões.

## 12. Serviços de IA Gerenciados pela AWS
- **Amazon Polly**: Texto para fala.
- **Amazon Rekognition**: Análise de imagens e vídeos.
- **Amazon Transcribe**: Transcrição de fala em texto.
- **Amazon Translate**: Tradução de texto.

## 13. Segurança, Conformidade e Governança para Soluções de IA
- **Amazon Macie**: Proteção de dados sensíveis.
- **AWS PrivateLink**: Conexões privadas e seguras para serviços de IA.

ge tavares v6