// Java process
const { spawn } = require('child_process')
const javaProcess = spawn('java', [
  '-jar',
  `${window.process.cwd()}/src/java/MusicGenerator/out/artifacts/MusicGenerator_jar/MusicGenerator.jar`
])

javaProcess.stdout.on('data', data => {
  console.log(`stdout: ${data}`)
})

javaProcess.stderr.on('data', data => {
  console.error(`stderr: ${data}`)
})

javaProcess.on('close', code => {
  console.log(`child process exited with code ${code}`)
})
