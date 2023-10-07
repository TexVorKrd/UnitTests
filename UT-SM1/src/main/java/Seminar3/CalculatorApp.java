package Seminar3;

import Seminar3.Controler.CalculatorController;
import Seminar3.Model.CalculatorModel;
import Seminar3.View.CalculatorView;

public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        controller.run();
    }
}
