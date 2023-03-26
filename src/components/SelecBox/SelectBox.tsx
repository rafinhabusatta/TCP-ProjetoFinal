import React from "react";
import "./SelectBox.css";

export interface SelectBoxProps {
  id: string;
  options: { value: string; label: string }[];
  onChange: (event: React.ChangeEvent<HTMLSelectElement>) => void;
}

export function SelectBox(props: SelectBoxProps) {
  const { id, options, onChange } = props;
  return (
    
    <select id={id} className="form-select" onChange={onChange}>
      {options.map((option) => (
        <option key={option.value} value={option.value}>
          {option.label}
        </option>
      ))}
    </select>
  );
}