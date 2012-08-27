package com.akomachi.hashcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.akomachi.hashcalculator.encrypt;

public class HashCalculatorActivity extends Activity {
	/** **/
    private EditText stringValue;
    private TextView tvMd5Hash, tvSha1Hash, tvSha256Hash, tvSha384Hash, tvSha512Hash;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        stringValue=(EditText)findViewById(R.id.editTextString);
        
        tvMd5Hash=(TextView)findViewById(R.id.textViewMD5Hash);
        tvSha1Hash=(TextView)findViewById(R.id.textViewSHA1Hash);
        tvSha256Hash=(TextView)findViewById(R.id.textViewSHA256Hash);
        tvSha384Hash=(TextView)findViewById(R.id.textViewSHA384Hash);
        tvSha512Hash=(TextView)findViewById(R.id.textViewSHA512Hash);
        
    }
    
    public void calculateHash(View view) throws Exception {
    	Editable str = stringValue.getText();
    	if ( str.toString() == "" ) {
    		// do nothing or show a Toast message
    	}else {
        	tvMd5Hash.setText(encrypt.hashStr(str, "MD5"));
        	tvSha1Hash.setText(encrypt.hashStr(str, "SHA-1"));
        	tvSha256Hash.setText(encrypt.hashStr(str, "SHA-256"));
        	tvSha384Hash.setText(encrypt.hashStr(str, "SHA-384"));
        	tvSha512Hash.setText(encrypt.hashStr(str, "SHA-512"));
    	}
    }
}