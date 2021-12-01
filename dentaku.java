package dentaku3;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class dentaku extends Application{
	String Sans = "";
	String Sin="";
	String Sin2="";
    @Override
    public void start(Stage primaryStage) {
        // プログラムを作成
    	
    	//window構造作成
    	Label lb = new Label("");
    	TextField tf = new TextField("");
    	tf.setEditable(false);
    	Button btnAC = new Button("AC");
    	btnAC.setOnAction((ActionEvent event) ->{
    		Sin = "";
    		Sin2="";
    		tf.setText(Sin);
    		lb.setText(Sin);
    		
    	});
    	Button btnc = new Button("C");
    	btnc.setOnAction((ActionEvent event) ->{
    		if(Sin.length()>0) {
    			if(Sin.substring(Sin.length()-1).equals("+")||Sin.substring(Sin.length()-1).equals("-")||Sin.substring(Sin.length()-1).equals("×")||Sin.substring(Sin.length()-1).equals("÷"))
    			{
    				Sin = Sin.substring(0,Sin.length()-1);
    				Sin2 = Sin2.substring(0,Sin2.length()-3);
    			}
    			else if(Sin.substring(Sin.length()-1).equals("(")||Sin.substring(Sin.length()-1).equals(")")) {
    				Sin = Sin.substring(0,Sin.length()-1);
    				Sin2 = Sin2.substring(0,Sin2.length()-2);
    				}
    			else {
	    		Sin = Sin.substring(0,Sin.length()-1);
	    		Sin2 = Sin2.substring(0,Sin2.length()-1);
	    		}
	    		tf.setText(Sin);
    		}
    		
    	});
    	
    	
    	Button btnp = new Button("+");
    	btnp.setOnAction((ActionEvent event) ->{
    		Sin = Sin + "+";
    		Sin2 = Sin2 + " + ";
    		tf.setText(Sin);
    	});
    	Button btnm = new Button("-");
    	btnm.setOnAction((ActionEvent event) ->{
    		Sin = Sin + "-";
    		Sin2 = Sin2 + " - ";
    		tf.setText(Sin);
    		tf.setText(Sin);
    	});
    	Button btnk = new Button("×");
    	btnk.setOnAction((ActionEvent event) ->{
    		Sin = Sin + "×";
    		Sin2 = Sin2 + " * ";
    		tf.setText(Sin);
    	});
    	Button btnw = new Button("÷");
    	btnw.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"÷";
    		Sin2 = Sin2 + " / ";
    		tf.setText(Sin);
    	});
    	Button btnt = new Button(".");
    	btnt.setOnAction((ActionEvent event) ->{
    		Sin = Sin +".";
    		Sin2 = Sin2 + ".";
    		tf.setText(Sin);
    	});
    	Button btne = new Button("=");
    	btne.setOnAction((ActionEvent event) ->{
    		try {
    		//文字を逆ポーランド記法に
    		String[] gp = henkan.gyakup(Sin2);
    		
    		//計算
    		float ans = keisan.gpkeisan(gp);
    		
    		lb.setText(Sin+"="+String.valueOf(ans));
    		}catch(Exception e){
    			lb.setText("エラー");
    		}
    	});
    	Button btn0 = new Button("0");
    	btn0.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"0";
    		Sin2 = Sin2 + "0";
    		tf.setText(Sin);
    	});
    	Button btn1 = new Button("1");
    	btn1.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"1";
    		Sin2 = Sin2 + "1";
    		tf.setText(Sin);
    	});
    	Button btn2 = new Button("2");
    	btn2.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"2";
    		Sin2 = Sin2 + "2";
    		tf.setText(Sin);
    	});
    	Button btn3 = new Button("3");
    	btn3.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"3";
    		Sin2 = Sin2 + "3";
    		tf.setText(Sin);
    	});
    	Button btn4 = new Button("4");
    	btn4.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"4";
    		Sin2 = Sin2 + "4";
    		tf.setText(Sin);
    	});
    	Button btn5 = new Button("5");
    	btn5.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"5";
    		Sin2 = Sin2 + "5";
    		tf.setText(Sin);
    	});
    	Button btn6 = new Button("6");
    	btn6.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"6";
    		Sin2 = Sin2 + "6";
    		tf.setText(Sin);
    	});
    	Button btn7 = new Button("7");
    	btn7.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"7";
    		Sin2 = Sin2 + "7";
    		tf.setText(Sin);
    	});
    	Button btn8 = new Button("8");
    	btn8.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"8";
    		Sin2 = Sin2 + "8";
    		tf.setText(Sin);
    	});
    	Button btn9 = new Button("9");
    	btn9.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"9";
    		Sin2 = Sin2 + "9";
    		tf.setText(Sin);
    	});
    	Button btnl = new Button("(");
    	btnl.setOnAction((ActionEvent event) ->{
    		Sin = Sin +"(";
    		Sin2 = Sin2 + "( ";
    		tf.setText(Sin);
    	});
    	Button btnr = new Button(")");
    	btnr.setOnAction((ActionEvent event) ->{
    		Sin = Sin +")";
    		Sin2 = Sin2 + " )";
    		tf.setText(Sin);
    	});
    	HBox h1= new HBox(10,btnAC,btnc,btnl,btnr);
    	HBox h2= new HBox(10,btn7,btn8,btn9,btnw);
    	HBox h3= new HBox(10,btn4,btn5,btn6,btnk);
    	HBox h4= new HBox(10,btn1,btn2,btn3,btnp);
    	HBox h5 = new HBox(10,btn0,btnt,btne,btnm);
    	h1.setAlignment(Pos.CENTER);
    	h2.setAlignment(Pos.CENTER);
    	h3.setAlignment(Pos.CENTER);
    	h4.setAlignment(Pos.CENTER);
    	h5.setAlignment(Pos.CENTER);
    	
    	VBox v1 = new VBox(10,lb,tf,h1,h2,h3,h4,h5);
    	v1.setAlignment(Pos.CENTER);
    	Scene scene = new Scene(v1,200,250);
    	
        primaryStage.setScene(scene);
        primaryStage.setTitle("電卓");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        // アプリケーションを起動する
        Application.launch(args);
    }
}
