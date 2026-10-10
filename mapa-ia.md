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

### 🎯 **IA Fraca vs IA Forte**
- **IA Fraca (Narrow AI)** → Especializada em tarefas específicas (ex: Siri, AlphaGo)
- **IA Forte (AGI)** → Inteligência geral como humanos (ainda não existe)
- **Teste de Turing** → Marco para avaliar inteligência artificial
- 💡 **Frase-chave**: "Especialista vs Generalista"

### ⚙️ **Tipos de IA (Russell & Norvig)**
- **Reativa** → Responde a estímulos imediatos (ex: Deep Blue)
- **Limitada** → Memória limitada para decisões (ex: carros autônomos)
- **Teoria da Mente** → Compreensão de emoções e intenções (em desenvolvimento)
- **Autoconsciente** → Consciência própria e aprendizado avançado (conceitual)  

---

## <span style="color:#8A2BE2">🤖 IA Tradicional vs. Agentes de IA</span>

### 🔄 **IA Tradicional**
- **Modelo**: Você pergunta, ela responde
- **Interação**: Um comando → Uma resposta
- **Controle**: Humano define cada passo
- **Limitação**: Ferramenta que executa instruções
- 💡 **Frase-chave**: "Pergunta e resposta simples"

### 🧠 **Agentes de IA**
- **Modelo**: Você pede, eles pensam, planejam, agem e se adaptam
- **Processo**: Objetivo → Planejamento → Execução → Adaptação
- **Autonomia**: IA toma decisões até atingir o resultado
- **Capacidade**: Assumem liderança com base em objetivos e situação
- 💡 **Frase-chave**: "Pensam, planejam e agem autonomamente"

### ⚠️ **O que Agentes de IA NÃO são**
- **Não é agente**: Se você precisa instruir cada passo manualmente
- **Verdadeiro agente**: IA toma decisões, não você
- **Objetivo**: Você foca no panorama geral, IA cuida do processo
- 💡 **Frase-chave**: "Quem decide é a IA, não você"

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

## <span style="color:#228B22">🔄 Pipeline de Machine Learning</span>
1. **Engenharia de Recursos** → Preparar, limpar e transformar dados
2. **Treinamento** → Escolher algoritmo e treinar o modelo
3. **Avaliação** → Medir precisão e desempenho do modelo
4. **Monitoramento** → Acompanhar o modelo em produção
- 💡 **Frase-chave**: "Do dado ao modelo em produção"

### 🚀 **Treinamento × Inferência**
- **Treinamento** → Aprende (ajusta pesos)
- **Inferência** → Aplica (dados novos)
- 💡 **Frase-chave**: "Treinamento aprende, inferência aplica"

### ⚠️ **Problemas de Modelo**
- **Subajuste** → Modelo simples, não aprende padrão
- **Sobreajuste** → Aprende padrão + ruído (bom no treino, ruim em produção)
- **Viés** → Discriminação por dados enviesados

---

## <span style="color:#FF6347">🚀 MLOps e Conceitos Modernos</span>

### 🔄 **MLOps (Machine Learning Operations)**
- **CI/CD para ML** → Integração e deploy contínuo
- **Model Versioning** → Controle de versão de modelos
- **Monitoring** → Acompanhamento em produção
- **Rollback** → Reversão rápida de modelos
- 💡 **Frase-chave**: "DevOps para Machine Learning"

### 📈 **Drift e Degradação**
- **Data Drift** → Mudança na distribuição dos dados de entrada
- **Model Drift** → Degradação da performance do modelo
- **Concept Drift** → Mudança na relação entrada-saída
- 💡 **Frase-chave**: "Modelos envelhecem, dados mudam"

### 🎯 **Otimização e Engenharia**
- **Hyperparameter Tuning** → Otimização de hiperparâmetros
- **Feature Engineering** → Criação e seleção de atributos
- **AutoML** → Automatização do pipeline de ML
- **A/B Testing** → Testes comparativos de modelos

---

## <span style="color:#4169E1">📊 Avaliação de Modelos</span>

### 🎯 **Métricas de Classificação**
- **Matriz de Confusão** → Base (VP, VN, FP, FN)
- **Acurácia** → % de acertos totais (dados balanceados)
- **Precisão** → VP/(VP+FP) - evita falsos positivos
- **Recall** → VP/(VP+FN) - não perde positivos (fraude, saúde)
- **F1-Score** → Média harmônica Precisão × Recall
- **AUC-ROC** → Área sob a curva (0.5-1.0)

### 🔄 **Validação e Análise**
- **Cross-Validation** → Validação cruzada (k-fold)
- **Correlação** → Entender dados (EDA)
- 💡 **Frase-chave**: "Medir para melhorar"

### 📝 **Métricas NLP**
- **BLEU** → Tradução automática
- **ROUGE** → Resumo automático

---

## <span style="color:#8B4513">📈 Modelos Clássicos de ML</span>

### 🟢 **Regressão Linear**
- **Tipo**: Aprendizado supervisionado
- **Uso**: Previsões numéricas
- **Característica**: Alta interpretabilidade
- 💡 **Frase-chave**: "Coeficientes explicam o impacto das variáveis"

### 🟢 **K-Nearest Neighbors (KNN)**
- **Tipo**: Aprendizado supervisionado
- **Função**: Classifica com base nos vizinhos mais próximos
- **Casos**: Classificação simples, recomendação básica
- 💡 **Frase-chave**: "Decide com base nos vizinhos"

### 🔵 **K-Means**
- **Tipo**: Aprendizado não supervisionado
- **Função**: Agrupa dados em clusters por similaridade
- **Casos**: Segmentação de clientes, agrupamento de dados
- 💡 **Frase-chave**: "Agrupa dados sem rótulos"

---

## <span style="color:#FF4500">🧠 Deep Learning (DL)</span>

### 🧠 **Arquiteturas de Redes Neurais**
- **CNNs** → Visão computacional (convolução)
- **RNNs** → Sequências (LSTM, GRU)
- **Transformers** → Atenção e paralelização
- **Attention Mechanism** → Foco em partes relevantes

### 🔧 **Frameworks e Técnicas**
- **Frameworks**: TensorFlow, PyTorch, Keras
- **Transfer Learning** → Reutilização de modelos pré-treinados
- **Embeddings** → Representações vetoriais densas
- **Context Window** → Janela de contexto para processamento
- 💡 **Frase-chave**: "Redes profundas aprendem representações"

---

## <span style="color:#FF8C00">🎨 IA Generativa</span>
- **Modelos**: GANs, VAEs, Diffusion, LLMs (GPT-4, Claude, LLaMA, Gemini, Titan)
- **Aplicações**: Chatbots, Geração de Código, Assistentes Inteligentes
- **Guardrails**, **Amazon Bedrock**

---

### 🧩 <span style="color:#FF8C00">Engenharia de Prompt em LLMs</span>
- **Técnicas**: Zero-shot, One-shot, Few-shot, Chain of Thought, ReAct, APE, etc.
- **Boas Práticas**: Exemplos claros, design simples, instruções positivas, formatos estruturados

### 🧠 **Aprendizado por Prompt (Tradicional)**
- **Zero-shot** → Nenhum exemplo, apenas a instrução
- **One-shot (Single-shot)** → Um único exemplo antes da tarefa
- **Few-shot** → Poucos exemplos (2 a ~10) para guiar o modelo

### 🔗 **Prompts de Cadeia de Pensamento (Chain-of-Thought)**
- **Definição**: Prompts que solicitam raciocínio passo a passo
- **Objetivo**: Melhorar tarefas de lógica, matemática e raciocínio complexo
- **Benefício**: Respostas mais corretas e explicáveis
- 💡 **Frase-chave**: "Modelo explicita o raciocínio antes da resposta final"

### 🧪 **Estereotipagem de Prompt (Prompt Stereotyping)**
- **Definição**: Avaliação da probabilidade de um FM codificar viéses
- **Objetivo**: Identificar estereótipos e discriminação gerados pelo modelo
- **Contexto AWS**: Avaliação de viés e IA responsável
- 💡 **Frase-chave**: "Testa se o FM responde de forma enviesada"

### 🧠 **Robustez Semântica**
- **Métrica**: Quanto a saída de um LLM muda após pequenas variações na entrada
- **Condição**: Variações preservam o significado (semântica)
- **Objetivo**: Garantir estabilidade e confiabilidade do modelo
- 💡 **Frase-chave**: "Mesma ideia, mesma resposta"

### 🧩 **Embeddings / RAG / Bedrock**
- **Embeddings** → Vetores que representam significado
- **RAG** → Busca contexto + LLM gera resposta
- **Fluxo RAG**: Pergunta → Embedding → Busca vetorial → Contexto → LLM
- **AWS**: Amazon Bedrock + Titan Embeddings

---

## <span style="color:#FF1493">🎆 Tendências e Tecnologias Emergentes</span>

### 🌍 **IA Multimodal e Foundation Models**
- **Multimodal AI** → Processa texto, imagem, áudio, vídeo simultaneamente
- **Foundation Models** → Modelos base grandes e generalistas
- **Vision-Language Models** → Combina visão e linguagem (CLIP, DALL-E)
- 💡 **Frase-chave**: "Uma IA, múltiplas modalidades"

### ⚡ **Edge AI e Computação Distribuída**
- **Edge AI** → IA executada em dispositivos locais
- **Federated Learning** → Treinamento distribuído sem centralizar dados
- **Model Compression** → Quantização e poda para dispositivos móveis
- **TinyML** → ML para microcontroladores
- 💡 **Frase-chave**: "IA na borda, privacidade no centro"

### 🔮 **IA Explicável e Responsável**
- **XAI (Explainable AI)** → IA que explica suas decisões
- **Fairness** → Equidade e justiça nos algoritmos
- **Privacy-Preserving ML** → ML que preserva privacidade
- **Differential Privacy** → Privacidade matemática garantida

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
- **Amazon Q**: Assistente de IA generativo para trabalho
  - **Capacidades**: Gera conteúdo, resolve problemas, executa tarefas
  - **Dados**: Usa dados e experiência da empresa
  - **Objetivo**: Respostas rápidas, simplifica tarefas, agiliza decisões
  - **Integração QuickSight**: Combina dados estruturados + não estruturados
  - **Exemplo**: "Qual é nossa tendência de receita e sua narrativa?"
  - 💡 **Frase-chave**: "IA generativa para produtividade empresarial"
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

## <span style="color:#B22222">☁️ Governança, Auditoria e Segurança (AWS)</span>

### 🔍 **Monitoramento e Conformidade**
- **AWS Config** → Monitoramento de configurações e conformidade de recursos
- **AWS Audit Manager** → Auditoria contínua e automatizada
- **AWS Artifact** → Acesso a relatórios de conformidade e certificações
- **AWS CloudTrail** → Auditoria, governança e conformidade operacional
  - Registra chamadas de API e atividades na conta

### 🔒 **Segurança e Otimização**
- **Amazon Inspector** → Avaliação automática de segurança e vulnerabilidades
- **AWS Trusted Advisor** → Boas práticas: custo, segurança, desempenho e confiabilidade
- 💡 **Frase-chave**: "Governança e conformidade na AWS"

---

## 📖 Livros IA GE
![Livros IA GE](https://img.icons8.com/fluency/48/000000/books.png)  
- [Coleção de Livros de IA (GeTavares)](https://github.com/rogtavares/LLIVROS_GeTavares/tree/main/15%20%5BIA%5D)
- [Repositório Completo de Livros (GeTavares)](https://github.com/rogtavares/LLIVROS_GeTavares)

---

## GE AWS - Mapas Mentais
- [GE AWS - Mapas Mentais](https://rogtavares.github.io/AWS_getavares.github.io/)