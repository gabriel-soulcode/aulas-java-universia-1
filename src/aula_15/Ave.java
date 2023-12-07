package aula_15;

public class Ave extends Animal {
  // Ave - Subclasse (Filho)
  // Animal - Superclasse (Pai)
  private float envergaduraAsa;
  private float mediaPesoOvo;

  Ave() {
    setEspecie("Ave");
    setVertebrado(true);
    setSimetrico(true);
  }

  // sobre escrita
  public void emitirSom() {
    System.out.println("có-có-có-có");
  }

  public float getEnvergaduraAsa() {
    return envergaduraAsa;
  }

  public void setEnvergaduraAsa(float envergaduraAsa) {
    this.envergaduraAsa = envergaduraAsa;
  }

  public float getMediaPesoOvo() {
    return mediaPesoOvo;
  }

  public void setMediaPesoOvo(float mediaPesoOvo) {
    this.mediaPesoOvo = mediaPesoOvo;
  }
}
