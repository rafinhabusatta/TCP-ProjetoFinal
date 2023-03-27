import { useState } from "react";
import path from 'path';


export function createUserFile(id: string, selectId: string, inputNumber: string) {
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
  const inputNum = document.getElementById(inputNumber) as HTMLInputElement;
  console.log(instrument);
  JavaCall(directory, instrument, inputNum);
}

function JavaCall(directory: string, instrument: string, inputNum: HTMLInputElement) {
  const { exec } = require('child_process');
  const inputNumber = Number(inputNum.value);

  const jarPath = path.join(window.process.cwd(), 'src', 'java', 'MusicGenerator', 'out', 'artifacts', 'MusicGenerator_jar', 'MusicGenerator.jar');
  const outputPath = path.join(jarPath, '..', 'output.txt');
  const command = `java -jar "${jarPath}" "${directory}/soundcraft.txt" "${instrument}" "${inputNumber}" > "${outputPath}"`;


  exec(command, (err: String, stdout: String, stderr: String) => {
    if (err) {
      console.error(`Erro ao executar a função Java: ${err}`);
      return -1;
    } else {
      console.log(stdout);
      return 0;
    }
  });
  const fs = require('fs');
  const pattern = fs.readFile('output.txt', 'utf8', function(err: String, data: String) {
    if (err) throw err;
  });
}




