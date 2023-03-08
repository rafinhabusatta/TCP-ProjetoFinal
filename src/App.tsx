import { useState } from 'react'
import reactLogo from './assets/sound-craft-logo.svg'
import './App.css'
import { Button } from './components/Button/Button'
import { TextInput } from './components/TextInput/TextInput'
import { TextBox } from './components/TextBox/TextBox'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.bundle.min';
import { FileText, MusicNotesPlus, MusicNoteSimple } from 'phosphor-react'
import { createUserFile } from './createUserFile'

function App() {
  const [count, setCount] = useState(0)
  const InputId = "userText"

  return (
    <div className="App">
      <header className="App-header">
        <img src={reactLogo} className="App-logo" alt="logo" />
      </header>
      <div>
        <TextBox title="Bem-vindo ao SoundCraft!" content="Com essa ferramenta você pode criar música através de texto! Para começar, basta você digitar o texto na caixa abaixo, ou então carregar um arquivo texto pronto, e selecionar um instrumento. Por fim, clique em Gerar música para você conseguir ouvir a música criada por você! Você pode salvá-la para compartilhar com seus amigos." />
      </div>
      <div className="grid">
        <div className="text">
          <TextInput id={InputId} />
        </div>
        <div className="buttons">
          <Button icon={<FileText className='me-2' />} label="Carregar Arquivo" onClick={() => setCount((count) => count + 1)} />
          <Button icon={<MusicNoteSimple className='me-2' />} label="Instrumento" onClick={() => setCount((count) => count + 1)} />
          <Button icon={<MusicNotesPlus className='me-2' />} label="Gerar Música" onClick={() => createUserFile(InputId)} />
        </div>
      </div>
    </div>
  )
}

export default App

