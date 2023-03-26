export function createUserFile(id: string, selectId: string) {
  const fs = require('fs')
  const directory =  `${window.process.cwd()}/src/text`
  if (!fs.existsSync(directory)) {
    fs.mkdirSync(directory, { recursive: true })
  }

  const path = require('path');
  const fileName = 'soundcraft.txt'
  const defaultPath = path.join(directory, fileName);

  const fileContent = (document.getElementById(id)as HTMLTextAreaElement)?.value.toUpperCase()
  fs.writeFile(defaultPath, fileContent, (err: String) => {
    if (err) {
      console.error(err)
    } else {
      console.log('Arquivo salvo com sucesso em', defaultPath)
    }
  })

  const select = document.getElementById(selectId) as HTMLSelectElement;
  const instrument = select.options[select.selectedIndex].value;
  console.log(instrument);
  JavaCall(directory, instrument);
}

function JavaCall(directory: string, instrument: string) {
  const { exec } = require('child_process');
  const javaFunction = 'main';
  //const pathToJar = path.join(__dirname, '/src/java/MusicGenerator/out/artifacts/MusicGenerator_jar/MusicGenerator.jar');

  const jarPath = `${window.process.cwd()}/src/java/MusicGenerator/out/artifacts/MusicGenerator_jar/MusicGenerator.jar`;
  
  const command = `java -jar ${jarPath} ${directory}/soundcraft.txt ${instrument}`;

  exec(command, (err: String, stdout: String, stderr: String) => {
    if (err) {
      console.error(`Erro ao executar a função Java: ${err}`);
      return -1;
    } else {
      console.log(stdout);
      return 0;
    }
  });

}




