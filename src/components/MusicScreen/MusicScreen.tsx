import React from "react";
import { Button } from "../Button/Button";
import { Header } from "../Header/Header";
import path from 'path';

export interface MusicScreenProps {
  onRestart: () => void;
}


export function MusicScreen (props: MusicScreenProps) {  
  const { onRestart } = props;
  const midiFile = () => {
    // Código para salvar arquivo midi
    const fs = require('fs')
    const defaultPath =  `${window.process.cwd()}/src/java/MusicGenerator/out/artifacts/MusicGenerator_jar/output.txt`;
    fs.readFile(defaultPath, 'utf8', function(err: String, data: String) {
      if (err) throw err;
      const fileContent = data;
      const jarPath = path.join(window.process.cwd(), 'src', 'java', 'MusicGenerator', 'out', 'artifacts', 'SaveFil_jar', 'MusicGenerator.jar');
      const outputPath = path.join(jarPath, '..', 'output.txt');
      const command = `java -jar "${jarPath}" "${fileContent}"`;

      const { exec } = require('child_process');
      exec(command, (err: String, stdout: String, stderr: String) => {
        if (err) {
          console.error(`Erro ao executar a função Java: ${err}`);
          return -1;
        } else {
          console.log(stdout);
          return 0;
        }
      });
    });

  }
  return (
    <div className="row">
      <div className="col-12">
        <Header />
      </div>
      <div className="col-12 d-flex justify-content-around">
        <Button label="Voltar" onClick={onRestart} />
        <Button label="Salvar Arquivo midi" onClick={midiFile} />
      </div>
    </div>
  );
};