import React from "react";

export interface MusicScreenProps {
  onRestart: () => void;
}


export function MusicScreen (props: MusicScreenProps) {  
  const { onRestart } = props;
  return (
    <div>
      <h1>Music Screen</h1>
      <button>Teste.</button>
      <button onClick={onRestart}>Voltar</button>
    </div>
  );
};