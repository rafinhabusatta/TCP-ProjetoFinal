import React from "react";
import { Button } from "../Button/Button";

export interface MusicScreenProps {
  onRestart: () => void;
}


export function MusicScreen (props: MusicScreenProps) {  
  const { onRestart } = props;
  const midiFile = () => {
    // Código para salvar arquivo midi
  }
  return (
    <div>
      <h1>Music Screen</h1>
      <button>Teste.</button>
      <Button label="Voltar" onClick={onRestart} />
      <Button label="Salvar Arquivo midi" onClick={onRestart} />
    </div>
  );
};