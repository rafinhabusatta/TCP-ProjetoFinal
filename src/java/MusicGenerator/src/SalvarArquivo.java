import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class SalvarArquivo{

    /**
     * Exibe um diálogo de salvar arquivo para que o usuário possa escolher um local de arquivo e retorna o caminho do arquivo selecionado.
     *
     * Retorna Uma String com o caminho do arquivo selecionado pelo usuário, ou null se nenhum local foi selecionado.
     */
    public static String EscolheLocaleNomedoArquivo() {
        // Configura a aparência para a aparência padrão do sistema operacional
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Cria um objeto JFileChooser e configura o título
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setDialogTitle("Salvar Arquivo TESTE");

        // Exibe o diálogo e espera pela seleção do usuário
        int userSelection = fileChooser.showSaveDialog(null);

        // Se o usuário selecionou um arquivo, retorna o caminho absoluto do arquivo com a extensão ".mid" adicionada
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String selectedFilePath = selectedFile.getAbsolutePath();
            if (!selectedFilePath.toLowerCase().endsWith(".mid")) { // Verifica se a extensão já está presente no nome do arquivo
                selectedFilePath += ".mid"; // Adiciona a extensão ".mid" ao nome do arquivo
            }
            return selectedFilePath;
        }
        // Retorna null se o usuário não selecionou um arquivo
        return null;
    }


}
