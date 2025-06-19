---
title: GE Tavares AWS -Mapas Mentais AWS 
markmap:
  colorFreezeLevel: 3 # Define o nível de profundidade em que as cores dos nós são congeladas
  initialExpandLevel: 2 # Determina o nível inicial de expansão do mapa mental
  htmlParser:
    selector: h1,h2,h3,ul,ol,li,table,pre # Elementos HTML que serão analisados para gerar o mapa mental
  color: '#FFA500' # Cor principal do mapa mental
  fontSize: 20 # Tamanho da fonte dos textos no mapa mental
  fontFamily: 'Arial, sans-serif' # Família de fontes usada no mapa mental
  lineWidth: 2 # Largura das linhas que conectam os nós
  theme: 'classic' # Tema visual do mapa mental
  autoFit: true # Ajusta automaticamente o mapa mental para caber na tela
  autoScroll: true # Habilita o deslocamento automático do mapa mental
  autoScrollDuration: 0.5 # Duração do deslocamento automático (em segundos)
  zoomable: true # Permite o zoom no mapa mental
search.searchOnType: true # Ativa a busca enquanto o usuário digita
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

## <span style="color:#32CE57">🔄 Ciclo da IA</span>

 **Etapas do Ciclo**:
  1. **Pré-Treinamento**  
     - Tipo "estudar muito"  
     - Treinamento inicial com **dados grandes e variados**  
     - 📚 **Aprendizado básico**
  2. **Continual Pre-Training**  
     - Tipo **"estudar sempre"**, Fazer pós-graduação, cursos constantes, ler artigos diários 
     - Atualiza o modelo com novos dados  
     - 🧠 **Sempre aprendendo**  

  3. **Fine-Tuning**  
     - Tipo - 🎨 **Customização** de "configurar celular novo"
     - Fazer pós-graduação, cursos constantes, ler artigos diários   
     - **Ajuste fino** para tarefas específicas q vc quer aprender
      - 🛠️ **Ajuste personalizado**  
     - 📲 Deixa o modelo do seu jeito  

  4. **Zero-Shot**  
     - Tipo **Adivinhao** e **"sabe tudo"**
     - Aprende sem exemplos específicos
     - Acerta sem exemplo ou treino específico  
     - 🎯 Já vem pronto pro jogo  

  5. **Chain of Thought**  
     - Tipo **Cadeia de Pensamento**  
     - **"resolver conta passo a passo"**
     - **Raciocínio lógico**
     - **Passo a passo**  
     - Ensina o modelo a pensar em etapas  
     - 🧾 Adriano F/  

  6. **RAG (Retrieval-Augmented Generation)**  
     - Tipo **"colar do Google" (lembra do Balsa?)**
     - **"sabe tudo com ajudas e Consulta pra não errar"** 
     - **Busca dados** antes de responder  

  7. **AWS**  
     - Tipo "montar a fábrica"  
     - Infraestrutura pra rodar tudo  
     - ☁️ Onde a **mágica acontece**

---

## <span style="color:#000000">🔄 Fluxo de Processamento de IA</span>

- **Descrição do Fluxo**:
  1. **Instruções (Prompt inicial)**  
     - O usuário fornece uma pergunta, comando ou instrução.  

  2. **Contexto (opcional)**  
     - O aplicativo pode enriquecer o prompt com informações adicionais (dados históricos, APIs, bancos de dados etc.).  

  3. **Consulta opcional a fontes de dados externas ou internas via plug-ins**  
     - Busca informações adicionais para complementar o contexto.  

  4. **Formatação do prompt com dados personalizados e contexto adicional**  
     - O prompt é ajustado com base nos dados coletados.  

  5. **Envio ao Modelo Fundamental (Foundation Model - FM)**  
     - O prompt formatado é enviado ao modelo de IA.  

  6. **FM gera a resposta (com ou sem fine-tuning)**  
     - O modelo processa o prompt e gera uma conclusão.  

  7. **Aplicativo processa a conclusão gerada pelo modelo**  
     - A resposta gerada é ajustada ou processada pelo aplicativo.  

  8. **Resposta final enviada ao usuário**  
     - O resultado final é entregue ao usuário.  

- **Etapas Principais**:
  - **Etapa de Contexto**: Enriquecimento do prompt com dados adicionais.  
  - **Etapa de Dados de Saída**: Processamento e entrega da resposta final.

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
- **Livros de IA**:
  - [Coleção de Livros de IA (GeTavares)](https://github.com/rogtavares/LLIVROS_GeTavares/tree/main/15%20%5BIA%5D)  

---

### ➕📚 <span style="color:#1E90FF; font-weight:bold;">**[MAPA AWS  GE TAVARES (Completo)](https://rogtavares.github.io/AWS_getavares.github.io/)**</span>  
🚀 **Descubra o mapa completo sobre AWS e Arquitetura de Soluções!**  
Explore conceitos avançados, ferramentas e práticas recomendadas para potencializar suas habilidades em IA e ML.

{
  "workbench.colorCustomizations": {
    "textPreformat.foreground": "#FF4500"
  }
}
