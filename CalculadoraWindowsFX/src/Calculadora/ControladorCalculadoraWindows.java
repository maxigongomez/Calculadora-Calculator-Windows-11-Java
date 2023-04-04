package Calculadora;



import java.awt.Color;
import static java.lang.Math.sqrt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author maxi_
 */
public class ControladorCalculadoraWindows implements Initializable {

    @FXML
    private Button cero;
    @FXML
    private Button uno;
    @FXML
    private Button cuatro;
    @FXML
    private Button cinco;
    @FXML
    private Button dos;
    @FXML
    private Button seis;
    @FXML
    private Button tres;
    @FXML
    private Button punto;
    @FXML
    private Button siete;
    @FXML
    private Button ocho;
    @FXML
    private Button nueve;
    @FXML
    private Button clear;
    @FXML
    private TextField input;
    @FXML
    private Label prom;

    
    private double fnumero;
    private double snumero;
    private String operacion;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }   
    
    
    @FXML
    public void punto_click(){
        
        String oldvalor = input.getText();
        String set = ".";
        input.setText(oldvalor + set);
    
    }
    
    @FXML
    public void cero_click(){
        
        String oldvalor = input.getText();
        String set = "0";
        input.setText(oldvalor + set);
    }
    
    @FXML
    public void uno_click(){
        
        String oldvalor = input.getText();
        String set = "1";
        input.setText(oldvalor + set);
    }
    
    @FXML
    public void dos_click(){
        
        String oldvalor = input.getText();
        String set = "2";
        input.setText(oldvalor + set);
    
    }
    
    @FXML
    public void tres_click(){
        
        String oldvalor = input.getText();
        String set = "3";
        input.setText(oldvalor + set);
    
    }
    
    @FXML
    public void cuatro_click(){
        
        String oldvalor = input.getText();
        String set = "4";
        input.setText(oldvalor + set);
    
    }
    
    @FXML
    public void cinco_click(){
        
        String oldvalor = input.getText();
        String set = "5";
        input.setText(oldvalor + set);
    
    }
    
    @FXML
    public void seis_click(){
        
        String oldvalor = input.getText();
        String set = "6";
        input.setText(oldvalor + set);
    
    }
    
    @FXML
    public void siete_click(){
        
        String oldvalor = input.getText();
        String set = "7";
        input.setText(oldvalor + set);
    
    }
    
    @FXML
    public void ocho_click(){
        
        String oldvalor = input.getText();
        String set = "8";
        input.setText(oldvalor + set);
    
    }
    
    @FXML
    public void nueve_click(){
        
        String oldvalor = input.getText();
        String set = "9";
        input.setText(oldvalor + set);
    
    }
    
    @FXML
    public void suma_click(){
        
        String valor = input.getText();
        
        
        double valornumero = Double.parseDouble(valor);
        this.fnumero = valornumero;
        input.setText("");
        prom.setText(valor + " + ");
        operacion = "+";
    
    }
    
    @FXML
    public void resta_click(){
        
        String valor = input.getText();
        double valornumero = Double.parseDouble(valor);
        this.fnumero = valornumero;
        input.setText("");
        prom.setText(valor + " - ");
        operacion = "-";
    
    }
    
    @FXML
    public void multiplicacion_click(){
        
        String valor = input.getText();
        double valornumero = Double.parseDouble(valor);
        this.fnumero = valornumero;
        input.setText("");
        prom.setText(valor + " x ");
        operacion = "x";
    
    }
    
    @FXML
    public void division_click(){
        
        String valor = input.getText();
        
        double valornumero = Double.parseDouble(valor);
        this.fnumero = valornumero;
        input.setText("");
        prom.setText(valor + " ÷ ");
        operacion = "/";
    
    }
    
    
    @FXML
    public void clear_click(){
    
        input.setText("");
        prom.setText("");
        this.fnumero = 0;
        this.snumero = 0;
    }
    
    @FXML
    private void cambiosigno_click(ActionEvent event) {
        
        String valor = input.getText();
        double valornumero = Double.parseDouble(valor);
        this.fnumero = valornumero;
        input.setText("");
        operacion = "+/-";
        
        String valorcambiarsigno = input.getText();
        
        if(this.fnumero<0){
            double systemcambiarsigno = this. fnumero + (-1*this.fnumero) + (-1*this.fnumero);
            input.setText(String.valueOf(systemcambiarsigno));
            String oldpromcambiarsigno= prom.getText();
            prom.setText(oldpromcambiarsigno + valorcambiarsigno);} else {
            
            double systemcambiarsigno = this. fnumero - this.fnumero - this.fnumero;
            input.setText(String.valueOf(systemcambiarsigno));
            String oldpromcambiarsigno= prom.getText();
            prom.setText(oldpromcambiarsigno + valorcambiarsigno);
            
             }
        }

    @FXML
    private void sobreuno_click(ActionEvent event) {
        
        String valor = input.getText();
        double valornumero = Double.parseDouble(valor);
        this.fnumero = valornumero;
        input.setText("");
        prom.setText("1/(" + valor + ")");
        
        String valordivision = input.getText();
        
        if(this.fnumero == 0){
                    
                    input.setText("");
                    input.setText("No se puede dividir entre cero");
                       
                }else{
        
        double systemdivision = 1.000000/ this.fnumero;
        input.setText(String.valueOf(systemdivision));
        String oldpromdivision= prom.getText();
        prom.setText(oldpromdivision+ valordivision);
        
        }
    }

    @FXML
    private void ce_click(ActionEvent event) {
        
        input.setText("");
        this.snumero = 0;
        
    }

    @FXML
    private void delete_click(ActionEvent event) {
        
        if(!(input.getText().length() == 0)){
        
            input.setText(input.getText().substring(0,input.getText().length() - 1 ));
            //ve si hay algo en el la pantalla y lo va a poner al mismo solo que en menos 1
            
         }
        
    }

    @FXML
    private void cuadrado_click(ActionEvent event) {
        
        String valor = input.getText();
        double valornumero = Double.parseDouble(valor);
        this.fnumero = valornumero;
        input.setText("");
        prom.setText(valor + "²");
        operacion = "²";
        
        String valorcuadrado = input.getText();
        
        double systemcuadrado = this.fnumero * this.fnumero ;
        input.setText(String.valueOf(systemcuadrado));
        String oldpromcuadrado= prom.getText();
        prom.setText(oldpromcuadrado + valorcuadrado);
    }

    @FXML
    private void raiz_click(ActionEvent event) {
        
        String valor = input.getText();
        double valornumero = Double.parseDouble(valor);
        this.fnumero = valornumero;
        input.setText("");
        prom.setText("√(" + valor + ")");
        operacion = "²";
        
        String valorcuadrado = input.getText();
        
        double systemcuadrado = sqrt(this.fnumero) ;
        input.setText(String.valueOf(systemcuadrado));
        String oldpromcuadrado= prom.getText();
        prom.setText(oldpromcuadrado + valorcuadrado);
    }

    @FXML
    private void porcente_click(ActionEvent event) {
        
        String valor = input.getText();
        double valornumero = Double.parseDouble(valor);
        this.fnumero = valornumero;
        input.setText("");
        operacion = "%";
        
        String valordivision = input.getText();
        
        double systemdivision = this.fnumero/100.0000;
        input.setText(String.valueOf(systemdivision));
        String oldpromdivision= prom.getText();
        prom.setText(oldpromdivision+ valordivision);
        
    }
    
    @FXML
    public void igual_click(){
        
        switch(operacion){
            
            case "+":
                
                String valor = input.getText();
                this.snumero = Double.parseDouble(valor);
                double systemsuma = this.fnumero + this.snumero;
                input.setText(String.valueOf(systemsuma));
                String oldprom = prom.getText();
                prom.setText(oldprom + valor + " =");
                
                break;
                
            case "-":
                
                String valorresta = input.getText();
                this.snumero = Double.parseDouble(valorresta);
                double systemresta = this. fnumero - this.snumero;
                input.setText(String.valueOf(systemresta));
                String oldpromresta = prom.getText();
                prom.setText(oldpromresta + valorresta + " =");
                
                break;
        
            case "x":
                
                String valormultilicacion = input.getText();
                this.snumero = Double.parseDouble(valormultilicacion);
                double systemmultiplicacion = this. fnumero * this.snumero;
                input.setText(String.valueOf(systemmultiplicacion));
                String oldprommultiplicacion = prom.getText();
                prom.setText(oldprommultiplicacion + valormultilicacion + " =");
                
                break;
                
            case "/":
                
                String valordivision = input.getText();
                this.snumero = Double.parseDouble(valordivision);
                if(this.snumero == 0){
                    
                    input.setText("");
                    input.setText("No se puede dividir entre cero"); 
                     break;
                       
                }else{
                double systemdivision = (this.fnumero / this.snumero);
                input.setText(String.valueOf(systemdivision));               
                
                String oldpromdivision= prom.getText();
                prom.setText(oldpromdivision + valordivision + " =");
                
                break;
                
                }
        
        
        }
    
    }

    
}
