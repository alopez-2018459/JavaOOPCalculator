
package org.alanlopez.system;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {

    Float datos = 0f;

    int operacion = -1;

    int actionCE = 1;

    Float thirdOperand = 0f;

    boolean isFirstNum = true;

    @FXML
    private Button btnUno;
    @FXML
    private Button btnDos;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnCuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnSiete;
    @FXML
    private Button btnOcho;
    @FXML
    private Button btnNueve;
    @FXML
    private Button btnCero;
    @FXML
    private Button btnMasMenos;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnMas;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnMulti;
    @FXML
    private Button btnDivi;
    @FXML
    private Button btnUnoX;
    @FXML
    private Button btnCuadrado;
    @FXML
    private Button btnRaiz;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btnCE;
    @FXML
    private Button btnC;
    @FXML
    private Button btnPunto;
    @FXML
    private TextField txtPantalla;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "1");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "1");
            }
        } else if (event.getSource() == btnDos) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "2");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "2");
            }
        } else if (event.getSource() == btnTres) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "3");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "3");
            }
        } else if (event.getSource() == btnCuatro) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "4");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "4");
            }
        } else if (event.getSource() == btnCinco) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "5");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "5");
            }
        } else if (event.getSource() == btnSeis) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "6");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "6");
            }
        } else if (event.getSource() == btnSiete) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "7");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "7");
            }
        } else if (event.getSource() == btnOcho) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "8");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "8");
            }

        } else if (event.getSource() == btnNueve) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "9");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "9");
            }

        } else if (event.getSource() == btnCero) {
            if (actionCE == 0) {
                txtPantalla.clear();
                actionCE = 1;
                txtPantalla.setText(txtPantalla.getText() + "0");
            } else {
                txtPantalla.setText(txtPantalla.getText() + "0");
            }

            // OPERACIONES

        } else if (event.getSource() == btnMas) {
            try {
                btnPunto.setDisable(false);
                datos = Float.parseFloat(txtPantalla.getText());
                // SUMA
                operacion = 1;
                txtPantalla.clear();
                thirdOperand = thirdOperand + datos;

            } catch (Exception e) {
                System.out.println("No se puede realizar esta entrada.");
            }

        } else if (event.getSource() == btnMenos) {
            try {
                btnPunto.setDisable(false);
                // SRESTA
                operacion = 2;
                datos = Float.parseFloat(txtPantalla.getText());
                txtPantalla.setText("");
                thirdOperand = isFirstNum ? datos : thirdOperand - datos;
                isFirstNum = false;
            } catch (Exception e) {
                System.out.println("No se puede realizar esta entrada.");
            }

        } else if (event.getSource() == btnMulti) {
            try {
                btnPunto.setDisable(false);
                datos = Float.parseFloat(txtPantalla.getText());
                // MULTIPLICACION
                operacion = 3;
                txtPantalla.setText("");
            } catch (Exception e) {
                System.out.println("No se puede realizar esta entrada.");
            }

        } else if (event.getSource() == btnDivi) {
            try {
                btnPunto.setDisable(false);
                datos = Float.parseFloat(txtPantalla.getText());
                // DIVISION
                operacion = 4;
                txtPantalla.setText("");
            } catch (Exception e) {
                System.out.println("No se puede realizar esta entrada.");
            }

        } else if (event.getSource() == btnC) {
            // Boton C
            try {
                datos = 0f;
                thirdOperand = 0f;
                txtPantalla.setText("");
                isFirstNum = true;
            } catch (Exception e) {
                System.out.println("La pantalla esta limpia");
            }

        } else if (event.getSource() == btnCE) {
            // Boton CE
            actionCE = 0;
            txtPantalla.setText(String.valueOf(actionCE));

        } else if (event.getSource() == btnPorcentaje) {
            // PORCENTAJE
            btnPunto.setDisable(false);
            Double por, ans;
            por = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            ans = datos * por / 100;
            txtPantalla.setText(String.valueOf(ans));

        } else if (event.getSource() == btnUnoX) {

            datos = Float.parseFloat(txtPantalla.getText());
            // 1/X
            Float unox = 1 / datos;
            txtPantalla.setText(String.valueOf(unox));

        } else if (event.getSource() == btnCuadrado) {

            datos = Float.parseFloat(txtPantalla.getText());
            // X^2
            Float x2 = datos * datos;
            txtPantalla.setText(String.valueOf(x2));

        } else if (event.getSource() == btnRaiz) {

            datos = Float.parseFloat(txtPantalla.getText());
            // RAIZ
            Double raiz = Math.sqrt(datos);

            txtPantalla.setText(String.valueOf(raiz));

        } else if (event.getSource() == btnMasMenos) {

            datos = Float.parseFloat(txtPantalla.getText());
            // MAS MENOS
            Float MasMenos = datos * (-1);
            txtPantalla.setText(String.valueOf(MasMenos));

        } else if (event.getSource() == btnPunto) {

            if (txtPantalla.getText().length() == 0) {
                txtPantalla.setText("0.");
            } else {
                datos = Float.parseFloat(txtPantalla.getText());
                int ValorPunto;
                ValorPunto = datos.intValue();
                txtPantalla.setText(String.valueOf(ValorPunto + "."));
                btnPunto.setDisable(true);
            }

        } else if (event.getSource() == btnIgual) {
            try {
                // Resultado
                btnPunto.setDisable(false);

                Float secondOperand = Float.parseFloat(txtPantalla.getText());
                Float ans = 0f;
                switch (operacion) {
                    case 1: // SUMA
                        ans = thirdOperand + secondOperand;
                        txtPantalla.setText(String.valueOf(ans));
                        thirdOperand = 0f;

                        break;

                    case 2: // Resta
                        ans = thirdOperand - secondOperand;
                        txtPantalla.setText(String.valueOf(ans));

                        break;
                    case 3: // Multiplicacion
                        ans = datos * secondOperand;
                        txtPantalla.setText(String.valueOf(ans));
                        break;
                    case 4: // Div
                        if (secondOperand == 0) {
                            JOptionPane.showMessageDialog(null, "No es posible dividr entre 0");
                        } else {
                            ans = datos / secondOperand;
                            txtPantalla.setText(String.valueOf(ans));
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Oh no! ha ocurrido un error inesperado :(");
                        txtPantalla.setText("");
                        break;
                }
            } catch (Exception e) {
                System.out.println("No se puede realizar esta entrada.");
            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
