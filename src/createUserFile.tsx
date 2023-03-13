export function createUserFile( id: string) {
  const text = (document.getElementById(id ) as HTMLTextAreaElement)?.value;
  if (text) {
    const blob = new Blob([text], { type: "text/plain" });
    const link = document.createElement("a");
    link.href = URL.createObjectURL(blob);
    link.download = "soundcraft.txt";
    document.body.appendChild(link);
    link.click();
    document.body.removeChild(link);
    alert("Arquivo criado com sucesso!");
  }
}
