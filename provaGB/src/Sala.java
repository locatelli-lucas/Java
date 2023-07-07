import java.util.Arrays;
import java.util.Random;

public class Sala {
    private String nome;
    private Cadeira[] cadeiras;

    public Sala(String nome, int quantMaxCadeiras) {
        Random random = new Random();
        this.nome = nome;
        this.cadeiras = new Cadeira[quantMaxCadeiras];

        for(int i = 0; i < cadeiras.length; i++) {
            int opcaoCadeira = (int)(Math.random()*2+1);
            if(opcaoCadeira == 1) {
                cadeiras[i] = new CadeiraComMesa(new Cor((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)),
                        (Math.random()*0.5 + 1), (Math.random()*1.5 + 1));
            } else {
                cadeiras[i] = new CadeiraComRodinhas(new Cor((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)),
                        random.nextInt(21) + 2000, (int)(Math.random()*12 + 1), (int)(Math.random()*31 + 1));
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cadeira[] getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(Cadeira[] cadeiras) {
        this.cadeiras = cadeiras;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nome='" + nome + '\'' +
                ", cadeiras=" + Arrays.toString(cadeiras) +
                '}';
    }

    public String cadeirasComMesaDisponiveis() {
        int soma = 0;
        for(Cadeira cadeira : cadeiras) {
            if(cadeira instanceof CadeiraComMesa && cadeira.getAluno() == null)
                soma++;
        }
        return "Há "+soma+" cadeiras com mesa disponíveis";
    }

    public String cadeirasComRodinhasDisponiveis() {
        int soma = 0;
        for(Cadeira cadeira : cadeiras) {
            if(cadeira instanceof CadeiraComRodinhas && cadeira.getAluno() == null)
                soma++;
        }
        return "Há "+soma+" cadeiras com rodinha disponíveis";
    }

    public String entraAluno(Aluno a, String cadeiraTipo) {
        if(cadeiraTipo.toLowerCase() == "mesa") {
            for(Cadeira cadeira: cadeiras) {
                if(cadeira instanceof CadeiraComMesa && cadeira.getAluno() == null) {
                    cadeira.setAluno(a);
                    return "Ocupou a cadeira desejada";
                }
            }
        } else if (cadeiraTipo.toLowerCase().equals("rodinhas")) {
            for(Cadeira cadeira: cadeiras) {
                if(cadeira instanceof CadeiraComRodinhas && cadeira.getAluno() == null) {
                    cadeira.setAluno(a);
                    return "Ocupou a cadeira desejada";
                }
            }
        } else {
            for(Cadeira cadeira: cadeiras) {
                if(cadeira == null) {
                    cadeira.setAluno(a);
                    return "Ocupou outro tipo de cadeira";
                }
            }
        }
        return "Não ocupou cadeira alguma";
    }
}
