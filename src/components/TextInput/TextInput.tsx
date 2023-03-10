import React from "react";
import "./TextInput.css";

export interface TextInputProps {
  id: string;
}

export const TextInput: React.FC<TextInputProps> = ({ id }) => {
  return (
    <textarea name="" className="form-control text-input" id={id}></textarea>  
  );
};