import React from "react";
import "./TextInput.css";

export interface TextInputProps {
  content: string;
}

export const TextInput: React.FC<TextInputProps> = ({ content }) => {
  return (
    <form className="text-input">
      <input 
        type="text"
        id="title"
        placeholder="digite o texto aqui"
        autoFocus
        value={content}
        onChange={event => setTitle(event.target.value)}  
      />
    </form>

    
  );
};