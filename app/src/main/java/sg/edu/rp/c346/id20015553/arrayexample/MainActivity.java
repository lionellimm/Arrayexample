package sg.edu.rp.c346.id20015553.arrayexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add(3, "Durian");
        fruits.remove(fruits.size()-1);

        String total = "";
        for(int i = 0; i < fruits.size(); i++){
            if(fruits.get(i).isEmpty() == false){
                total += fruits.get(i) + "\n";
            }
        }
        tv.setText(total);

//        String thefruit = fruits.get(1);
//        tv.setText(thefruit);
    }
}