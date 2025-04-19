---
title: markmap
markmap:
  colorFreezeLevel: 4 
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
  - **Supervisionado** → Tipo de ML onde o modelo é treinado em **dados rotulados** (Ex.: Regressão, Classificação)  
  - **Não supervisionado** → Tipo de ML onde o modelo aprende padrões a partir de **dados não rotulados** (Ex.: Clustering, Redução de Dimensão)  
  - **Semi-Supervisionado** → Tipo de ML que combina **dados rotulados e não rotulados** para treinamento  
  - **Aprendizado por Reforço** → Tipo de aprendizado onde um agente aprende a tomar decisões interagindo com um ambiente para maximizar recompensas  
- 🛠️ **Técnicas**:
  - *Engenharia de Atributos (Feature Engineering)* → Processo de criação, seleção ou transformação de recursos para melhorar o desempenho do modelo  
  - *Validação Cruzada*, *Otimização de Hiperparâmetros*  
  - **MLOps** → Práticas para gerenciar o ciclo de vida do aprendizado de máquina (desenvolvimento, implantação, monitoramento e manutenção)  
  - **Data Lineage** → Rastreamento de onde vêm os dados e como eles são transformados ao longo do tempo  
- ⚖️ **Problemas Comuns**:
  - **Bias (Viés)** → Erro sistemático na amostra de dados ou no modelo, levando a resultados injustos  
    - *Exemplo*: Um modelo de crédito que favorece um grupo específico devido a dados históricos enviesados.  
    - "Viés": Visão Torta: modelo vê o mundo com óculos tortos. Viés é quando o modelo favorece um lado injustamente.  
  - **Imparcialidade** → Justiça: Balança da justiça equilibrada. Impessoalidade é tratar todos de forma justa.  
    - *Exemplo*: Garantir que um modelo de recrutamento avalie candidatos com base apenas em qualificações, sem discriminação.  
  - **Overfitting (Sobreajuste)** → Quando um modelo se ajusta muito bem aos dados de treinamento, mas não generaliza bem para dados não vistos  
    - *Exemplo*: Um modelo que acerta 100% no treino, mas falha em novos dados.  
    - "Sobreajuste": Sabichão do treino: Aluno que decora a apostila, mas não acerta na prova. Sobreajuste aprende demais o treino e falha no teste.  
  - **Underfitting (Subajuste)** → Quando o modelo não captura a complexidade dos dados e tem baixo desempenho em treinamento e dados não vistos  
    - *Exemplo*: Um modelo linear tentando prever dados com padrões não lineares.  
    - "Subajuste": Aluno distraído: Nem estuda direito, nem aprende nada. Subajuste não aprende nem o básico.  
  - **Explicabilidade** → Caixa de vidro: Você consegue ver como o modelo pensa. Explicabilidade é entender como a IA decide.  
    - *Exemplo*: Usar SHAP ou LIME para explicar as previsões de um modelo de classificação.

---

## <span style="color:#FF4500">🧠 Deep Learning (DL)</span>
- **Redes Neurais Artificiais (RNA)**  
  - **CNNs** → Visão computacional (Ex.: Reconhecimento de Imagens)  
  - **RNNs** → Sequências e séries temporais (Ex.: Previsão de Texto)  
- ⚙️ **Frameworks**:
  - *TensorFlow*, *PyTorch*, *Keras*  
- 🌐 **Aplicações Avançadas**:
  - Processamento de Linguagem Natural (NLP), Reconhecimento Facial, Tradução Automática  
- 🛠️ **Conceitos Importantes**:
  - **Embeddings** → Representações numéricas de dados, como texto, em vetores que preservam relações semânticas  
  - **Context Window** → O número de tokens (palavras ou partes de palavras) que um modelo de linguagem pode considerar para gerar texto  

---

## <span style="color:#FF8C00">🎨 IA Generativa</span>
- **Definição**: Geração de conteúdo criativo (texto, imagem, áudio, código)  
- ✨ **Modelos**:
  - **GANs**, **VAEs**, **Diffusion Models**  
  - **LLMs (Large Language Models)**:
    - Exemplos: GPT-4, Claude, LLaMA, Gemini, Amazon Titan  
- 🛠️ **Ferramentas e Aplicações**:
  - Chatbots, Geração de Código, Assistentes Inteligentes  
  - **Guardrails** → Mecanismos de controle para prevenir o uso indevido de modelos de IA, como filtros de conteúdo inadequado  
  - **Amazon Bedrock** → Integração com modelos generativos  

---

## <span style="color:#9370DB">☁️ AWS para IA & ML</span>

### 🧰 <span style="color:#9370DB">Serviços de Preparação de Dados</span>
- 📦 **Amazon SageMaker Data Wrangler** → Agrega e prepara dados em minutos  
- 📊 **Amazon SageMaker Feature Store** → Repositório para recursos reutilizáveis  

### 🚀 <span style="color:#9370DB">Treinamento e Deploy</span>
- 💻 **Amazon SageMaker Studio** → Ambiente visual completo para ML  
- ⚙️ **SageMaker AutoPilot** → Automação do treinamento  
- 🧮 **SageMaker Batch Transform** → Inferência em lote  
- 🔍 **SageMaker Clarify** → Identifica vieses automaticamente  
- 🧠 **SageMaker Distributed Training** → Clusters para grandes modelos  
- 🌍 **SageMaker Edge Manager** → Modelos em dispositivos de borda  
- 📊 **SageMaker Model Monitor** → Monitora modelos em produção  
- 📋 **Model Registry** → Repositório centralizado para rastrear, gerenciar e versionar modelos  

### 🤖 <span style="color:#9370DB">Modelos Prontos e GenAI</span>
- **Amazon Bedrock** → Acesso a FMs como Claude, Titan, LLaMA  
  - 🎯 **Amazon Nova** (multimodal):  
    - ⚡ Nova Micro, 🧠 Nova Lite, 🚀 Nova Pro, 🔮 Nova Premier *(lançamento em 2025)*  

### 🔊 <span style="color:#9370DB">Visão Computacional & Voz</span>
- 📷 **Amazon Rekognition** → Imagem e vídeo  
- 📝 **Amazon Textract** → OCR e extração de documentos  
- 🗣️ **Amazon Transcribe** → Áudio para texto  
- 🌐 **Amazon Translate** → Tradução automática  
- 🧠 **Amazon Comprehend** → NLP e análise de sentimentos  

---

## ⚖️ <span style="color:#DC143C">IA Responsável e Ética</span>
- **Princípios**: Justiça, Transparência, Explicabilidade, Privacidade  
- 🧠 **Ferramentas**:
  - *SageMaker Clarify*, *Explainability*, *Model Monitor*  
- 📜 **Governança de IA**: Responsabilidade social e ética  

---

## 📚 Recursos de Estudo
- [Trailhead - Salesforce AI](https://trailhead.salesforce.com)  
- [AWS AI & ML](https://aws.amazon.com/machine-learning/)  
- **Certificações**:
  - 🏅 AWS Certified AI Practitioner (AIF-C01)  
  - 🏅 AWS Certified Machine Learning – Specialty  

---

### ➕ <span style="color:#FF4500">**+1 [MAPA IMPERDÍVEL GE TAVARES](https://rogtavares.github.io/AWS_getavares.github.io/)**</span>  
🚀 Explore o mapa completo sobre AWS e Arquitetura de Soluções
