package com.example.homework_123lmw;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	Button submitButton, cancelButton;
	EditText nameText, otherText;
	RadioButton radioButton1, radioButton2, radioButton3, radioButtonMale,
			radioButtonFamale;
	CheckBox checkBox1, checkBox2, checkBox3;
	TextView summary;
	String sumMGS = "";
	RadioGroup radioGroup1;
	String sex = "男";

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		submitButton = (Button) findViewById(R.id.button1);
		cancelButton = (Button) findViewById(R.id.button2);
		nameText = (EditText) findViewById(R.id.editText1);
		otherText = (EditText) findViewById(R.id.editText2);
		otherText.setEnabled(false);
		summary = (TextView) findViewById(R.id.textView5);
		radioButton1 = (RadioButton) findViewById(R.id.radio0);
		radioButton2 = (RadioButton) findViewById(R.id.radio1);
		radioButton3 = (RadioButton) findViewById(R.id.radio2);
		radioButtonMale = (RadioButton) findViewById(R.id.radio11);
		radioButtonFamale = (RadioButton) findViewById(R.id.radio12);
		checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
		checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
		checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
		radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
		submitButton.setOnClickListener(this);
		cancelButton.setOnClickListener(this);
		radioButtonMale.setOnClickListener(this);
		radioButtonFamale.setOnClickListener(this);
		checkBox3.setOnClickListener(this);
		// radioGroup1.setOnCheckedChangeListener(new OnCheckedChangeListener()
		// {
		//
		// // TODO Auto-generated method stub
		//
		// @Override
		// public void onCheckedChanged(RadioGroup arg0, int checkedId) {
		// if (checkedId == R.id.radio11) {
		// Toast.makeText(getApplicationContext(), "男", 0).show();
		// radioButtonFamale.setChecked(false);
		// // sex="男";
		//
		// }
		// if (checkedId == R.id.radio12) {
		// Toast.makeText(getApplicationContext(), "女", 0).show();
		// radioButtonMale.setChecked(false);// sex="女";
		// }
		//
		// }
		// });

		radioButton1.setOnClickListener(this);
		radioButton2.setOnClickListener(this);
		radioButton3.setOnClickListener(this);

		// radioButton1
		// .setOnCheckedChangeListener((android.widget.CompoundButton.OnCheckedChangeListener)
		// this);
		//
		// radioButton2
		// .setOnCheckedChangeListener((android.widget.CompoundButton.OnCheckedChangeListener)
		// this);
		//
		// radioButton3
		// .setOnCheckedChangeListener((android.widget.CompoundButton.OnCheckedChangeListener)
		// this);
		//
		// checkBox1.setOnClickListener(this);
		// checkBox2.setOnClickListener(this);
		// checkBox3.setOnClickListener(this);
		//
		// radioButtonMale
		// .setOnCheckedChangeListener((android.widget.CompoundButton.OnCheckedChangeListener)
		// this);
		// radioButtonFamale
		// .setOnCheckedChangeListener((android.widget.CompoundButton.OnCheckedChangeListener)
		// this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		Log.d("TTTT1", " t111");
		switch (arg0.getId()) {
		case R.id.button1:
			Log.d("T1", " t1");
			checkC();
			summary.setText("  Name: " + nameText.getText() + "\n性别：" + sex
					+ "\n 系别： " + sumMGS + " ");
			// summary.setTextColor(25500);
			Log.d("TTTT", summary.getText() + "");

			// summary.setText("HHHHH");
			Log.d("TTTT", "KKKK");
			break;
		case R.id.button2:
			nameText.setText("");
			otherText.setText("");
			radioButton1.setChecked(false);
			radioButton2.setChecked(false);
			radioButton3.setChecked(false);
			checkBox1.setChecked(false);
			checkBox2.setChecked(false);
			checkBox3.setChecked(false);
			summary.setText("请填写" + " ");
			break;
		case R.id.checkBox3:
			if (checkBox3.isChecked()) {
				otherText.setEnabled(true);
			} else {
				otherText.setEnabled(false);
				otherText.setText("");
			}

			break;
		case R.id.radio11:
			radioButtonFamale.setChecked(false);
			if (radioButtonMale.isChecked()) {
				sex = "男";
			}
			break;
		case R.id.radio12:
			radioButtonMale.setChecked(false);
			if (radioButtonFamale.isChecked()) {
				sex = "女";
			}
			break;
		default:
			break;
		}
		sumMGS = "";

	}

	public void checkC() {
		String msg = "";
		if (radioButton1.isChecked()) {
			msg += " 计算机系";

		} else if (radioButton2.isChecked()) {
			msg += " 英语系";
		} else if (radioButton3.isChecked()) {
			msg += " 艺术系";
		}
		msg += "\n爱好：";
		if (checkBox1.isChecked()) {
			msg += " 篮球 ";
		}
		if (checkBox2.isChecked()) {
			msg += " 足球";
		}
		if (checkBox3.isChecked()) {
			msg += " 其他：" + otherText.getText() + "\n";
		}
		// if (radioButtonFamale.isChecked()) {
		// msg += " " + "女";
		// }
		// if (radioButtonMale.isChecked()) {
		// msg += " " + "男";
		// }
		sumMGS += msg;
	}

	
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	// public void onCheckedChanged(RadioGroup arg0, int checkedId) {
	//
	// // TODO Auto-generated method stub
	//
	// if (checkedId == R.id.radio11) {
	// Toast.makeText(getApplicationContext(), "男", 0).show();
	// radioButtonFamale.setChecked(false);
	//
	// }
	// if (checkedId == R.id.radio12) {
	// Toast.makeText(getApplicationContext(), "女", 0).show();
	// radioButtonMale.setChecked(false);
	//
	// }
	// }

}
