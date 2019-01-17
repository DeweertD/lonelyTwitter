package ca.ualberta.cs.lonelytwitter;

//import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
//import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;
	private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
				bodyText.setText("",TextView.BufferType.EDITABLE);
				Tweet tweet = new Tweet(text);
				tweetList.add(tweet);
				adapter.notifyDataSetChanged();
				saveInFile();

			}
		});

		clearButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				setResult(RESULT_OK);
				bodyText.setText("",TextView.BufferType.EDITABLE);
				tweetList.clear();
				adapter.notifyDataSetChanged();
				clearFile();

			}
		});

	}

	@Override
	protected void onStart() {
		// TO DO Auto-generated method stub
		super.onStart();
		loadFromFile();
		adapter =  new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

	private void loadFromFile() {

		try {

			FileReader in = new FileReader(new File(getFilesDir(), FILENAME));
			Gson gson = new Gson();
			Type type = new TypeToken<ArrayList<Tweet>>(){}.getType();
			tweetList = gson.fromJson(in, type);
			in.close();

		} catch (FileNotFoundException e) {
			// TO DO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TO DO Auto-generated catch block
			e.printStackTrace();
		}
//		return;
	}
	
	private void saveInFile() {
		try {

			FileWriter out = new FileWriter(new File(getFilesDir(), FILENAME));
			Gson gson = new Gson();
			gson.toJson(tweetList, out);
			out.close();

		} catch (FileNotFoundException e) {
			// TO DO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TO DO Auto-generated catch block
			e.printStackTrace();
		}
//		return;
	}

	private  void clearFile(){
		try{
			FileWriter out = new FileWriter(new File(getFilesDir(), FILENAME));
			Gson gson = new Gson();
			gson.toJson(tweetList, out);
			out.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
//		return;
	}
}