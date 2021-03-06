package grafica;
import javax.swing.JFrame;
import logica.JogoMemoria; 
import java.awt.Dimension;
import java.awt.GridLayout;
public class FrmJogoMemoria extends JFrame {

    // Utilizar o BtnPeca que eu criei
    // Matriz que vai armazenar os botoes
    private BtnPeca [] [] tabuleiro;
    private JogoMemoria jogo;

    public FrmJogoMemoria(){
        //setar propriedades de funcionamento geral

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(new Dimension(400, 400));
        setLocationRelativeTo(null); // setLocation é depois, pois primeiramente é preciso saber o setZise para calcular o po
        setTitle("Jogo da Memória");

        // iniciar logica do jogo
        jogo = new JogoMemoria();

        int [] [] tabuleiroNumero = jogo.getTabuleiroNumero(); // foi criado o jogoMemoria get

        //construção da parte visual.
        tabuleiro = new BtnPeca [4][4];
        setLayout(new GridLayout (4,4,10,10));

        ActionConferir action = new ActionConferir(tabuleiro);

        for (int i = 0; i<4; i++ ){
            for (int j = 0; j< 4 ; j++){
                BtnPeca btn = new BtnPeca(tabuleiroNumero[i] [j]);
                add(btn); // add botaõ no Jframe RootPane
                tabuleiro [i][j] = btn;
                btn.addActionListener(action);
            }
        }
    }

    public void mostarTabuleiro() {

        for (int i = 0; i<4; i++ ){
            for (int j = 0; j< 4 ; j++){
                tabuleiro [i][j].mostrar();
            }
        }
    }
    
    public void ocultarTabuleiro() {

        for (int i = 0; i<4; i++ ){
            for (int j = 0; j< 4 ; j++){
                tabuleiro [i][j].ocultar();
            }
        }
    }
}