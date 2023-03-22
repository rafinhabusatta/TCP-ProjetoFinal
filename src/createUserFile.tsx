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
  JavaCall();
}

function JavaCall() {
  const { exec } = require('child_process');
  const javaFunction = 'main';
  const jarPath = `${window.process.cwd()}/src/java/MusicGenerator/out/artifacts/MusicGenerator_jar/MusicGenerator.jar`;
  
  const command = `echo ${javaFunction} | java -jar ${jarPath}`;

  exec(command, (err: String, stdout: String, stderr: String) => {
    if (err) {
      console.error(`Erro ao executar a função Java: ${err}`);
      return;
    } else {
      console.log(stdout);
    }
  });

}




