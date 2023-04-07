//package com.example.hangmanv2;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import javafx.scene.text.Text;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.ResourceBundle;
////import com.example.hangmanv2.HangmanController2;
//
//public class TicTacToeController2 implements Initializable{
//
//    @FXML
//    private Button Tile1;
//
//    @FXML
//    private Button Tile2;
//
//    @FXML
//    private Button Tile3;
//
//    @FXML
//    private Button Tile4;
//
//    @FXML
//    private Button Tile5;
//
//    @FXML
//    private Button Tile6;
//
//    @FXML
//    private Button Tile7;
//
//    @FXML
//    private Button Tile8;
//
//    @FXML
//    private Button Tile9;
//
//    @FXML
//    public Text winnerText;
//    static int token =0;
//
//    static int Winner = 0;
//
//    private StringBuilder secretWord = new StringBuilder();
//
//    private int lives = 0;
//
//    int tie = 0;
//    ArrayList<Button> buttons;
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        buttons = new ArrayList<>(Arrays.asList(Tile1,Tile2,Tile3,Tile4,Tile5,Tile6,Tile7,Tile8,Tile9));
//        buttons.forEach(button ->{
//            setupButton(button);
//            button.setFocusTraversable(false);
//        });
//    }
//
//    @FXML
//    void Exit(ActionEvent event) {
//        buttons.forEach(this::resetButton);
//    }
//    public void resetButton(Button button){
//        button.setDisable(false);
//        button.setText("");
//        System.exit(0);
//    }
//    public void setupButton(Button button) {
//        button.setOnMouseClicked(mouseEvent -> {
//            if(token == 1){
//                setPlayerSymbol(button);
//                button.setDisable(true);
//                checkIfGameIsOver();
//                CheckIfGameIsDraw();
//                token =  0;
//
//            }
//        });
//    }
//    public void setPlayerSymbol(Button button){
//        if(Winner == 0){
//            button.setText("♘");
//
//        } else {
//            button.setText("♕");
//
//        }
//    }
//    public void CheckIfGameIsDraw(){
//
//        if(Tile1.getText().equals("")){
//            tie = 0;
//        }
//        else if(Tile2.getText().equals("")){
//            tie = 0;
//        }
//        else if(Tile3.getText().equals("")){
//            tie = 0;
//        }
//        else if(Tile4.getText().equals("")){
//            tie = 0;
//        }
//        else if(Tile5.getText().equals("")){
//            tie = 0;
//        }
//        else if(Tile6.getText().equals("")){
//            tie = 0;
//        }
//        else if(Tile7.getText().equals("")){
//            tie = 0;
//        }
//        else if(Tile8.getText().equals("")){
//            tie = 0;
//        }
//        else if(Tile9.getText().equals("")){
//            tie = 0;
//        }
//        else{
//            tie = 1;
//        }
//        if(tie == 1){
//            winnerText.setText("♕  & ♘ Draw!");
//        }
//    }
//
//    public void checkIfGameIsOver(){
//        for (int a = 0; a < 8; a++) {
//            String line = switch (a) {
//                case 0 -> Tile1.getText() + Tile2.getText() + Tile3.getText();
//                case 1 -> Tile4.getText() + Tile5.getText() + Tile6.getText();
//                case 2 -> Tile7.getText() + Tile8.getText() + Tile9.getText();
//                case 3 -> Tile1.getText() + Tile5.getText() + Tile9.getText();
//                case 4 -> Tile3.getText() + Tile5.getText() + Tile7.getText();
//                case 5 -> Tile1.getText() + Tile4.getText() + Tile7.getText();
//                case 6 -> Tile2.getText() + Tile5.getText() + Tile8.getText();
//                case 7 -> Tile3.getText() + Tile6.getText() + Tile9.getText();
//                default -> null;
//            };
//
//            if (line.equals("♕♕♕")) {
//                winnerText.setText("♕ Won & ♘ Lost!");
//            }
//
//            else if (line.equals("♘♘♘")) {
//                winnerText.setText("♘ Won & ♕ Lost!");
//            }
//        }
//    }
//}