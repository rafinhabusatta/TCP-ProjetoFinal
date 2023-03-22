const { app, BrowserWindow } = require('electron')
const path = require('path')

let mainWindow

function createWindow() {
  mainWindow = new BrowserWindow({
    width: 800,
    height: 600
  })

  // Carrega um arquivo HTML que contém um script que chama a função jar.js
  mainWindow.loadFile(path.join(__dirname, 'index.html'))

  mainWindow.on('closed', function () {
    mainWindow = null
  })
}

app.on('ready', createWindow)