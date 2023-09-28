package seminars.seminar_7.decorator;

public class BoilingWashingProgram extends SpecialWashingProgram {

  public BoilingWashingProgram(WashingProgram washingProgram) {
    super(washingProgram);
  }

  @Override
  public void executeProgram() {
    warmerSetTemperature(95);
    washingProgram.executeProgram();
  }
}
