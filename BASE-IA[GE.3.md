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

---

## ⚖️ <span style="color:#DC143C">IA Responsável e Ética</span>
- Princípios: Justiça, Transparência, Explicabilidade, Privacidade
- Ferramentas: SageMaker Clarify, Explainability, Model Monitor
- Governança de IA

---

## 📚 Recursos de Estudo
- [Trailhead - Salesforce AI](https://trailhead.salesforce.com)
- [AWS AI & ML](https://aws.amazon.com/machine-learning/)
- Certificações: AWS Certified AI Practitioner, Machine Learning – Specialty

---

## 📖 Livros IA GE
- [Coleção de Livros de IA (GeTavares)](https://github.com/rogtavares/LLIVROS_GeTavares/tree/main/15%20%5BIA%5D)

---

### ➕📚 <span style="color:#1E90FF; font-weight:bold;">[MAPA AWS  GE TAVARES (Completo)](https://rogtavares.github.io/AWS_getavares.github.io/)</span>
🚀 Descubra o mapa completo sobre AWS e Arquitetura de Soluções!

{
  "workbench.colorCustomizations": {
    "textPreformat.foreground": "#FF4500"
  }
}

---

### 🖼️ Exemplos Visuais

#### Exemplo 1: Zero-shot
> **Prompt:**  
> "Traduza para inglês: Olá, mundo!"  
> **Saída esperada:**  
> "Hello, world!"

#### Exemplo 2: Few-shot
> **Prompt:**  
> Traduza para inglês:  
> 'Bom dia' → 'Good morning'  
> 'Boa tarde' → 'Good afternoon'  
> Frase: 'Boa noite'  
> **Saída esperada:**  
> 'Good night'

#### Exemplo 3: Chain of Thought (CoT)
> **Prompt:**  
> "Explique passo a passo como resolver 12 x 13."  
> **Saída esperada:**  
> "Primeiro, multiplique 10 x 13 = 130. Depois, 2 x 13 = 26. Some: 130 + 26 = 156."

#### Exemplo 4: Prompting para Código
> **Prompt:**  
> "Escreva uma função Python que retorna o quadrado de um número."  
> **Saída esperada:**  
> ```python
> def quadrado(x):
>     return x * x
> ```

---
