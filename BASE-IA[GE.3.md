---
markmap:
  maxWidth: 300
  initialExpandLevel: 2
  htmlParser:
    selector: h1,h2,h3,ul,ol,li,table,pre
---

# **GE-Artificial-Intelligence (IA)**

## **1. Fundamentos de IA e ML**
- **O que é Inteligência Artificial (IA)?**
  - Campo amplo para criar máquinas capazes de executar tarefas que exigem inteligência humana//// treinamento, teste e implantação.
  -  IA é a raiz do diagrama, com os demais tópicos conectados como **subconjuntos ou especializações**.
   
- **Arquitetura de Aplicações de IA**
  - **Camada de Dados**: Organiza e prepara os dados.
  - **Camada de Modelo**: Responsável pelas decisões do sistema, utilizando modelos treinados.

## **2. Diferenças entre IA, ML, DL e IA Generativa**
- **IA**: Campo geral que engloba ML, DL e IA Generativa.
- **ML**:  Subconjunto focado no aprendizado a partir de dados para tomada de decisão.
- **DL**: (Redes neurais) : Subconjunto do ML que usa redes neurais profundas para aprender com grandes volumes de dados..
- **IA Generativa**: Criação de conteúdo novo baseado em dados de treinamento.

## **3. Modelos Base (Foundation Models)**
- **Redes Neurais (RN)**: Inspiradas no cérebro humano.
  - **Perceptron** e **MLP** (Perceptron Multicamadas).
  - **Funções de Ativação**.
  - **RNN** (Redes Neurais Recorrentes).
- **Características**: Adaptabilidade, generalistas, desafios de custo e integração.

## **4. Machine Learning (ML)**
- **Definição/MLDef**: Algoritmos que aprendem a partir de dados para tomar decisões.
- **Tipos de Aprendizado**:
   - **Supervisionado**,
       - O algoritmo é treinado com dados **rotulados**, onde as entradas e saídas desejadas são conhecidas. Exemplos incluem classificação de e-mails como spam ou não spam. 
  - **Não Supervisionado**.
      - O algoritmo trabalha com **dados não rotulados**, buscando identificar padrões e estruturas por conta própria. É usado para clustering e detecção de anomalias.  
  - **Semi-Supervisionado**
     -  Combina **dados rotulados e não rotulados** para treinamento, útil quando a rotulação completa é custosa ou impraticável
  - **Reforço**
    - O algoritmo aprende por meio de interações com um ambiente, recebendo recompensas ou penalidades por suas ações. É aplicado em robótica e jogos. 
- **Técnicas**:
    - **Agrupamento (Clustering)**: Técnica não supervisionada para agrupar dados similares, como o algoritmo K-Means.
  - **Classificação**: Usada para categorizar dados em classes predefinidas. Algoritmos comuns incluem Árvores de Decisão, Naive Bayes e Support Vector Machines (SVM).
  - **Regressão**: Utilizada para prever valores numéricos contínuos. A Regressão Linear é um exemplo comum.
  - **Máquinas de Vetores** de Suporte (SVM): Algoritmo versátil usado tanto para classificação quanto para regressão.
  - **Árvores de Decisão**: Modelo de aprendizado que usa uma **estrutura de árvore** para tomar decisões baseadas em características dos dados.
   - **Redes Neurais**: Inspiradas no funcionamento do cérebro humano, são usadas para tarefas complexas como reconhecimento de imagem e processamento de linguagem natural
- **Aplicações**:
   - **Análise Preditiva**: Utilizada para prever tendências futuras com base em dados históricos, como previsão de vendas ou demanda.
  - Sistemas de Recomendação: Empregados por plataformas como Netflix e Amazon para sugerir produtos ou conteúdos personalizados aos usuários.
  - **Detecção de Fraudes**: Usado por instituições financeiras para identificar transações suspeitas em tempo real.
  - **Reconhecimento de Imagem e Voz**: Aplicado em sistemas de segurança, assistentes virtuais e carros autônomos.
  - **Diagnósticos Médicos**: Auxilia profissionais de saúde na detecção precoce de doenças e na análise de imagens médicas.
  - **Otimização de Processos**: Utilizado na indústria para melhorar a eficiência operacional e prever necessidades de manutenção

## **5. Deep Learning (DL)**
- **Definição/DLDef**: Subconjunto de ML que utiliza redes neurais profundas.
- **Tipos/Metodologias**:
  - **Redes Convolucionais (CNNs), Redes Recorrentes (RNNs), Transformadores**.
- **Aplicações**:
  - Reconhecimento de imagem, PNL, Veículos autônomos.

## **6. IA Generativa (Ge AI)**
- **Definição/ GenAIDef**:
     - IA focada na criação de conteúdo original, como imagens, textos, sons e vídeos, usando modelos avançados. Três técnicas centrais frequentemente associadas à IA Generativa incluem 

- **GANs** (Generative Adversarial Networks),
    - as **GANs** consistem em duas redes neurais que competem entre si:
    - Gera dados falsos tentando enganar o discriminador.
    - Discriminador: Avalia se os dados recebidos são reais ou gerados.
    - Funcionamento: Durante o treinamento, o gerador melhora continuamente até produzir dados tão realistas que o discriminador tem dificuldade em diferenciá-los dos dados reais.
Aplicações:
Criação de imagens realistas (ex.: rostos humanos com StyleGAN).
Geração de arte digital e design.
Aumento de dados para treinamento de modelos de IA.    
- **VAEs** (Variational Autoencoders)
    - são uma abordagem probabilística para compressão e reconstrução de dados.

Um codificador transforma os dados de entrada em uma representação comprimida (latente).
Um decodificador recria os dados originais a partir dessa representação latente. 
  
- **LLMs** (Large Language Models)
    - **VEJA 7. Large Language Models (LLMs)**

## **7. Large Language Models (LLMs)**
- **Definição**: Modelos treinados em grandes volumes de texto e código.
- **Aplicações**:
  - Geração de texto, Tradução, Resumo, Assistência à codificação.
- **Considerações Éticas**:
  - Alucinações, preconceitos nos dados.

## **8. Pipeline de ML com Serviços AWS**
-  é como uma linha de montagem para o **aprendizado de máquina**. 
-  Ele organiza e automatiza as etapas necessárias para transformar dados brutos em insights acionáveis por meio de modelos de ML.
   - **Vantagens de um Pipeline de ML**
   - **Automatização**: Reduz trabalho manual e acelera processos.
   - **Escalabilidade**: Suporta grandes volumes de dados e múltiplos modelos.
   - **Reprodutibilidade**: Garante que os resultados possam ser repetidos de forma consistente.
   - **Eficiência**: Otimiza recursos e tempo em cada etapa.
   - **Gerenciamento Centralizado**: Facilita a visualização e o controle de todas as etapas.  

## **9. IA Responsável**
- **Práticas**: Questões éticas no uso da IA.
- [Transforme a IA responsável da teoria em prática](https://aws.amazon.com/pt/ai/responsible-ai/)
- Criando aplicações de IA responsáveis com Guardrails 
- [Introdução aos Guardrails para LLMs](https://aws.amazon.com/pt/blogs/machine-learning/build-safe-and-responsible-generative-ai-applications-with-guardrails/)
- **Ferramentas AWS**:
  - **SageMaker Clarify**: Detecção de vieses e explicação de previsões.

## **10. Serviços AWS para IA e ML**
### **10.1 Amazon Bedrock**
-  é um serviço gerenciado de IA generativa que permite acessar e integrar modelos base\\\\ **(Foundation Models)** de parceiros como Anthropic, Stability AI, e AWS, **sem precisar gerenciá-los diretamente**.

  
    - Simplicidade: API gerenciada, sem necessidade de infraestrutura.
    - Flexibilidade: Escolha de diferentes modelos base conforme o caso de uso.
    - Personalização: Ajuste fino (fine-tuning) dos modelos para aplicações específicas.
  - **Amazon Nova**: Modelos multimodais.
    - **Amazon Nova Micro**: Texto rápido e econômico.
    - **Amazon Nova Lite**: Multimodal, custo-benefício.
    - **Amazon Nova Pro**: Alta precisão e capacidade.
    - **Amazon Nova Premier** (lançamento em 2025): Avançado e personalizável.
    - **Amazon Nova Canvas**: Geração de imagens.
    - **Amazon Nova Reel**: Criação de vídeos.


### **10.2 Amazon SageMaker**
- Criação, treinamento e implantação de modelos de ML.
     -  **10.2.1 SageMaker AutoPilot**
   Automatiza criação de modelos de ML, incluindo explicações.

    -  **10.2.2 SageMaker Batch Transform**
    Realize inferência em lote para grandes volumes de dados.  
     - **10.2.3 Amazon SageMaker Canvas** 
  Interface sem código para criar modelos e previsões de ML. (Permite que usuários sem habilidades de codificação criem ML)

    -  **10.2.4 SageMaker Clarify**
  Detecta e analisa vieses em dados e modelos de ML.

    -   **10.2.5 Amazon SageMaker Data Wrangler**
  Simplifica preparação de dados com transformações e integração de fontes.
    - **10.2.6 Amazon SageMaker Debugger**
  Monitora e identifica problemas no treinamento de modelos.Analise métricas de desempenho do modelo em tempo real.
   - **10.2.7  Amazon SageMaker Distributed Training**
    Treina grandes modelos em clusters distribuídos para maior eficiência.
   - **10.2.8  Amazon SageMaker Edge Manager**
   Gerencia e monitora modelos implantados em dispositivos de borda. 
     
   - **10.2.9  Amazon SageMaker Feature Store**
   Repositório gerenciado para compartilhar recursos de ML.
   - **10.2.10  Amazon SageMaker Ground Truth**
   Rotulação eficiente de dados com automação e revisão manual. 
   - **10.2.11 Amazon SageMaker Inference Recommender**
   Sugere configurações ideais de inferência para reduzir custos e latência. 
   - **10.2.12 Amazon SageMaker Model Card**
   Documenta detalhes críticos do modelo para governança e relatórios 
   - **10.2.13 Amazon SageMaker Model Dashboard**
   Centraliza a gestão de modelos em uma única interface
   - **10.2.14 Amazon SageMaker Model Monitor**
   Monitora a qualidade e desvios dos modelos em produção. 
   - **10.2.15 Amazon SageMaker Neo**
   Otimiza modelos para execução em dispositivos de borda e na nuvem.
   - **10.2.16 Amazon SageMaker Pipeline**
   Automatiza fluxos de trabalho de **ML com integração e controle de versão**. 
   - **10.2.17 Amazon SageMaker Studio** (IDEA)
IDE unificada para criar, treinar e implantar modelos de ML.
  - **10.2.18 Amazon SageMaker Training Compiler** 
Acelera treinamento de modelos de deep learning em GPUs.
### **10.3 Amazon Comprehend**
- Extração de insights de texto.
### **10.4 Amazon DeepLens**
- Câmera para implementar modelos de visão computacional.

### **10.5 Amazon Fraud Detector**
- Detecção de fraudes online com ML.

### **10.6 Amazon Forecast**
- Previsão de resultados de negócios usando ML.

### **10.7 AWS Glue DataBrew**
- Limpeza e transformação de dados para análises e ML.

### **10.8 Amazon Kendra**
- Experiências de conversação seguras com IA generativa.

### **10.9 Amazon Lex**
- Bots conversacionais com interfaces de voz e texto.

### **10.10 Amazon Polly**
- Vozes humanas realistas para múltiplos idiomas.

### **10.11 Amazon Personalize**
- Recomendação personalizada em tempo real.

### **10.12 Amazon Q**

- O **Amazon Q** é um assistente com inteligência artificial generativa (gen AI) projetado para acelerar o desenvolvimento de software e alavancar dados empresariais
    - **Amazon Q Developer**: Assistente para desenvolvimento e manutenção de software.
    - **Amazon Q Business**: Assistente para consultas e geração de conteúdo.

### **10.13 Amazon Rekognition**
- Reconhecimento de imagens e vídeos.

### **10.14 Amazon Textract**
- Extração automática de texto e dados de documentos.

### **10.15 Amazon Transcribe**
- Converte entrada de áudio em texto.

### **10.16 Amazon Translate**
- Tradução automática fluente e precisa.

### **10.17 AWS Panorama**
- Processamento de vídeo local em tempo real.

### **10.18 AWS Trainium**
- Chip de ML desenvolvido pela AWS para treinamento de deep learning (DL) com grandes modelos de parâmetros.

## **11. Serviços que utilizam ou suportam **LLMs** diretamente:**

- **10.1 Amazon Bedrock**
**Por que está relacionado a LLMs**?
**É uma das soluções mais diretas da AWS para LLMs. Permite acessar modelos de linguagem pré-treinados e IA generativa** via uma API única, facilitando a integração com aplicações de negócios.
- **10.2 Amazon Comprehend**
**Por que está relacionado a LLMs**?
Focado em extração de insights de texto, como análise de sentimentos, classificação de documentos e extração de entidades. Internamente, pode ser baseado em LLMs menores para tarefas específicas de NLP.
- **10.10 Amazon Lex**
**Por que está relacionado a LLMs**?
Usa modelos de linguagem para criar bots conversacionais (chatbots e voicebots). Integra-se com LLMs para melhorar o entendimento e as respostas contextuais.
- **10.03 Amazon SageMaker**
**Por que está relacionado a LLMs**?
Oferece infraestrutura completa para treinar, ajustar (fine-tune) e implantar LLMs. É amplamente utilizado para personalizar modelos para casos de uso específicos, como geração de conteúdo ou análise de dados.

 - **10.14 Amazon Rekognition**: Integra reconhecimento de imagens/vídeos a aplicações baseadas em LLMs, como assistentes multimodais.
 - **12.7 Amazon Forecast**: Utiliza ML para previsões, que podem ser aprimoradas com insights gerados por LLMs.
 - **12.6 Amazon Fraud Detector**: Modelos especializados em detecção de fraudes podem usar dados analisados por LLMs para enriquecer insights.
 - **12.16 Amazon Textract**: Extrai texto estruturado de documentos que pode ser processado posteriormente por LLMs para análises detalhadas.
 - **12.16 Amazon Transcribe** e **12.18 Amazon Translate**: Resultados de transcrição e tradução podem ser alimentados a LLMs para análise e geração de respostas. 



## 12.[ Todos os Serviços AWS&Salesforce  -              Gé Tavares](https://rogtavares.github.io/AWS_getavares.github.io/)

## **Considerações Finais**
- "Queimando neurônios e explorando o futuro da IA."

getavares v7