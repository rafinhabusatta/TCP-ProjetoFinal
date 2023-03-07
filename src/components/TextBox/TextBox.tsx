import React from "react";
import "./TextBox.css";

export interface TextBoxProps {
  title: string;
  content: string;
}

export const TextBox: React.FC<TextBoxProps> = ({ title, content }) => {
  return (
    <div className="text-box">
      <h1>{title}</h1>
      <p>{content}</p>
    </div>
  );
};