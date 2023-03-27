import React, { useState } from 'react';

interface InputNumberProps {
id?: string;
}

function MeuComponente( { id }: InputNumberProps) {
const [valor, setValor] = useState<number>(0);

function handleValorChange(event: React.ChangeEvent<HTMLInputElement>) {
setValor(parseInt(event.target.value));
}

return (
<div>
<label>
Selecione um valor:
<input type="number" id={id} value={valor} onChange={handleValorChange} />
</label>
</div>
);
}

export default MeuComponente;
