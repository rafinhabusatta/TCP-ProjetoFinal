import React from "react";
import "./Button.css";

export interface ButtonProps {
  label: string;
  icon?: JSX.Element;
  onClick: () => void;
}

export const Button: React.FC<ButtonProps> = ({ label, icon, onClick }) => {
  return (
    <button className="btnApp" onClick={onClick}>
      {icon}
      {label}
    </button>
  );
};
