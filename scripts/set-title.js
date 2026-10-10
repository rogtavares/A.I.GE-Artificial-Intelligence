// Usa o "title" do front-matter do mapa como <title> do index.html gerado.
const fs = require('fs');

const md = fs.readFileSync('mapa-ia.md', 'utf8');
const match = md.match(/^---[\s\S]*?^title:\s*(.+)$/m);
if (!match) process.exit(0);

const html = fs.readFileSync('index.html', 'utf8');
fs.writeFileSync('index.html', html.replace(/<title>[^<]*<\/title>/, `<title>${match[1].trim()}</title>`));
