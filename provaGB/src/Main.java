public class Main {
    public static void main(String[] args) {
        Sala s = new Sala("201", 30);
        for(Cadeira cadeira : s.getCadeiras()) {
            System.out.println(cadeira);
        }
        System.out.println(s.cadeirasComMesaDisponiveis());
        System.out.println(s.cadeirasComRodinhasDisponiveis());
        System.out.println(s.entraAluno(new Aluno("Lucas", 21), "mesa"));
    }
}
