import React from "react";
import "./Button.css";

interface ButtonProps {
  label: string;
  icon?: JSX.Element;
  onClick: React.MouseEventHandler<HTMLButtonElement>;
}

export const Button: React.FC<ButtonProps> = ({ label, icon, onClick }) => {
  return (
    <button className="btnApp" onClick={onClick}>
      {icon}
      {label}
    </button>
  );
};
