import "../Button/Button.css";

export function SelectBox() {
  return (
    <select id="selectBox" className="form-select" aria-label="Select box" >
      <option className='text-center' selected>Instrumento</option>
      <option value="0">Piano</option>
      <option value="24">Violão</option>
      <option value="27">Guitarra</option>
      <option value="79">Ocarina</option>
      <option value="40">Violino</option>
    </select>
  );
}