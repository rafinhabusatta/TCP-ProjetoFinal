import React, { useState } from "react";
import "./TextInput.css";

interface TextInputProps {
  id: string;
  value?: string;
  onChange?: (event: React.ChangeEvent<HTMLTextAreaElement>) => void;
}

export const TextInput: React.FC<TextInputProps> = ({ id, value, onChange }) => {
  //const [value, setValue] = useState("");

  //const handleChange = (event: React.ChangeEvent<HTMLTextAreaElement>) => {
    //setValue(event.target.value);
 // };
  return (
    <textarea 
      name="" 
      className="form-control text-input" 
      id={id} 
      value={value}
      onChange={onChange} 
    />
  );
};