---
title: GE Tavares AWS - Mapas Mentais AWS
markmap:
  colorFreezeLevel: 3
  initialExpandLevel: 2
  htmlParser:
    selector: h1,h2,h3,ul,ol,li,table,pre
  color: '#FFA500'
  fontSize: 20
  fontFamily: 'Arial, sans-serif'
  lineWidth: 2
  theme: 'classic'
  autoFit: true
  autoScroll: true
  autoScrollDuration: 0.5
  zoomable: true
search.searchOnType: true
---

# <span style="color:#000010B">🤖 GE-Artificial-Intelligence (IA)</span>

## 🧠 Conceitos Fundamentais
- **IA**: Sistemas que simulam a inteligência humana  
  - *Computação Cognitiva*, *Sistemas Especialistas*, *Robótica*
- ⚙️ **Tipos**:
  - **Reativa** → Responde a estímulos imediatos  
  - **Limitada** → Memória limitada para decisões  
  - **Teoria da Mente** → Compreensão de emoções e intenções  
  - **Autoconsciente** → Consciência própria e aprendizado avançado  

---

## <span style="color:#000080">📊 Machine Learning (ML)</span>
- **Definição**: Algoritmos que aprendem com dados  
- 🔁 **Tipos de Aprendizado**:
  - **Supervisionado** → Modelo treinado em **dados rotulados**  
  - **Não supervisionado** → Aprende padrões em **dados não rotulados**  
  - **Semi-Supervisionado** → Combina **dados rotulados e não rotulados**  
  - **Aprendizado por Reforço** → Agente aprende por recompensas  
- 🛠️ **Técnicas**:
  - *Engenharia de Atributos*, *Validação Cruzada*, *Otimização de Hiperparâmetros*, **MLOps**, **Data Lineage**
- ⚖️ **Problemas Comuns**:
  - **Bias (Viés)**, **Imparcialidade**, **Overfitting**, **Underfitting**, **Explicabilidade**

---

## <span style="color:#FF4500">🧠 Deep Learning (DL)</span>
- **Redes Neurais**: CNNs, RNNs
- **Frameworks**: TensorFlow, PyTorch, Keras
- **Aplicações**: NLP, Visão Computacional, Tradução Automática
- **Embeddings**, **Context Window**

---

## <span style="color:#FF8C00">🎨 IA Generativa</span>
- **Modelos**: GANs, VAEs, Diffusion, LLMs (GPT-4, Claude, LLaMA, Gemini, Titan)
- **Aplicações**: Chatbots, Geração de Código, Assistentes Inteligentes
- **Guardrails**, **Amazon Bedrock**

---

### 🧩 <span style="color:#FF8C00">Engenharia de Prompt em LLMs</span>
- **Técnicas**: Zero-shot, One-shot, Few-shot, Chain of Thought, ReAct, APE, etc.
- **Boas Práticas**: Exemplos claros, design simples, instruções positivas, formatos estruturados

---

## <span style="color:#9370DB">☁️ AWS para IA & ML</span>

### 🧰 Serviços de Preparação de Dados
- 📦 **Amazon SageMaker Data Wrangler**
- 📊 **Amazon SageMaker Feature Store**

### 🚀 Treinamento e Deploy
- 💻 **Amazon SageMaker Studio**
- ⚙️ **SageMaker AutoPilot**
- 🧮 **SageMaker Batch Transform**
- 🔍 **SageMaker Clarify**
- 🧠 **SageMaker Distributed Training**
- 🌍 **SageMaker Edge Manager**
- 📊 **SageMaker Model Monitor**
- 📋 **Model Registry**

### 🤖 Modelos Prontos e GenAI
- **Amazon Bedrock** (Claude, Titan, LLaMA)
  - 🎯 **Amazon Nova** (multimodal): Nova Micro, Nova Lite, Nova Pro, Nova Premier

### 🔊 Visão Computacional & Voz
- 📷 **Amazon Rekognition**
- 📝 **Amazon Textract**
- 🗣️ **Amazon Transcribe**
- 🌐 **Amazon Translate**
- 🧠 **Amazon Comprehend**

---

## <span style="color:#32CE57">🔄 Ciclo da IA</span>
1. **Pré-Treinamento**  
   - Treinamento inicial do modelo com grandes volumes de dados gerais.
2. **Continual Pre-Training**  
   - Atualização contínua do modelo com novos dados para manter relevância.
3. **Fine-Tuning**  
   - Ajuste fino do modelo para tarefas ou domínios específicos.
4. **RAG (Retrieval-Augmented Generation)**  
   - Integração de busca em bases externas para enriquecer as respostas do modelo.
5. **Zero-Shot**  
   - Capacidade do modelo de responder a tarefas sem exemplos prévios.
6. **Chain of Thought**  
   - Raciocínio passo a passo para respostas mais explicativas e detalhadas.
7. **Deploy em AWS**  
   - Implementação e operacionalização do modelo em ambiente de nuvem AWS.

---

## <span style="color:#000000">🔄 Fluxo de Processamento de IA</span>
1. Instruções (Prompt inicial)
2. Contexto (opcional)
3. Consulta a fontes externas/internas
4. Formatação do prompt
5. Envio ao Modelo Fundamental
6. Geração da resposta
7. Processamento da resposta
8. Resposta final ao usuário
9. Feedback do usuário (opcional)

---

## ⚖️ <span style="color:#DC143C">IA Responsável e Ética</span>
- Princípios: Justiça, Transparência, Explicabilidade, Privacidade
- Ferramentas: SageMaker Clarify, Explainability, Model Monitor
- Governança de IA

- **Avaliação de Viés**: Identificação e mitigação de viés em modelos
- 
## 🧠 IA Generativa: Fundamentos e Tecnologias-Chave

- **Modelos Generativos**: Criam conteúdo novo (texto, imagem, áudio, vídeo).
- **Tokens e Chunking**: Unidades de texto processadas pelos modelos.
- **Embeddings e Vetores**: Representações numéricas que capturam significado semântico.
- **Engenharia de Prompts**: Criação de entradas eficazes para guiar respostas (zero-shot, few-shot, chain of thought).
- **LLMs (Transformers)**: Grandes modelos de linguagem, base de aplicações generativas.
- **Modelos Multimodais/Difusão**: Lidam com múltiplos tipos de dados ou geram conteúdo a partir de ruído.
- **Ciclo de Vida do Modelo**: Seleção de dados/modelos, pré-treinamento, fine-tuning, avaliação, implantação, feedback.

### 🔄 Tecnologias de Personalização e Geração de Respostas

- **RAG (Retrieval Augmented Generation)**: LLMs acessam bases externas para respostas precisas (ex: Amazon Bedrock).
- **Fine-tuning**: Treinamento adicional de modelos para tarefas/domínios específicos.
- **Pré-treinamento**: Treinamento inicial com grandes volumes de dados.
- **Engenharia de Prompts**: Personalização rápida sem alterar o modelo.
- **Seleção de LLM**: Uso direto de modelos pré-treinados.
- **Modelos Open Source vs. Personalizados**: Avaliar custo, modalidade, latência, suporte, personalização.

### ☁️ Serviços AWS para IA Generativa

- **Amazon SageMaker JumpStart**: Modelos pré-treinados e soluções ML.
- **Amazon Bedrock**: Modelos de base de várias empresas, personalização e geração.
- **PartyRock**: Playground para experimentação com modelos de base.
- **Amazon Q**: Assistente de IA para trabalho.
- **Agentes do Bedrock**: Automatizam tarefas complexas.
- **Bancos de dados de vetores**: OpenSearch, Aurora, Neptune, DocumentDB, RDS PostgreSQL.

### ☁️ Serviços AWS para ML

- **SageMaker**: Plataforma completa para ML.
- **Transcribe**: Voz para texto.
- **Translate**: Tradução de idiomas.
- **Comprehend**: PLN para análise de texto.
- **Lex**: Chatbots.
- **Polly**: Texto para fala.
- **Rekognition**: Imagem e vídeo.
- **Textract**: Extração de texto de documentos.
- **Fraud Detector**: Detecção de fraude.
- **Kendra**: Pesquisa inteligente.
- **Personalize**: Sistemas de recomendação.

#### Serviços AWS para Pipeline de ML

- **SageMaker Data Wrangler**: Preparação de dados.
- **SageMaker Feature Store**: Armazenamento de atributos.
- **SageMaker Model Monitor**: Monitoramento em produção.
- **SageMaker Clarify**: Detecção de viés e explicabilidade.
- **Amazon Augmented AI (A2I)**: Revisão humana em ML.

---

## 📖 Livros IA GE
![Livros IA GE](https://img.icons8.com/fluency/48/000000/books.png)  
- [Coleção de Livros de IA (GeTavares)](https://github.com/rogtavares/LLIVROS_GeTavares/tree/main/15%20%5BIA%5D)
- [Repositório Completo de Livros (GeTavares)](https://github.com/rogtavares/LLIVROS_GeTavares)

---

## GE AWS - Mapas Mentais
- [GE AWS - Mapas Mentais](https://rogtavares.github.io/AWS_getavares.github.io/)