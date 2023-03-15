export function createUserFile(id: string) {
  const fs = require('fs')
  const directory =  `${window.process.cwd()}/src/text`
  if (!fs.existsSync(directory)) {
    fs.mkdirSync(directory, { recursive: true })
  }

  const path = require('path');
  const fileName = 'soundcraft.txt'
  const defaultPath = path.join(directory, fileName);
  
  const fileContent = (document.getElementById(id)as HTMLTextAreaElement)?.value
  fs.writeFile(defaultPath, fileContent, (err: String) => {
    if (err) {
      console.error(err)
    } else {
      console.log('Arquivo salvo com sucesso em', defaultPath)
    }
  })
  }




