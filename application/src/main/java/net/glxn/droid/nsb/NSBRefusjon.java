package net.glxn.droid.nsb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class NSBRefusjon extends Activity implements View.OnClickListener {

    private static String TAG = "nsb-refusjon";

    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.main);

        View configButton = findViewById(R.id.configure_button);
        configButton.setOnClickListener(this);

        View newButton = findViewById(R.id.new_claim_button);
        newButton.setOnClickListener(this);

        View aboutButton = findViewById(R.id.help_button);
        aboutButton.setOnClickListener(this);

        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.configure_button:
                startActivity(new Intent(this, Configuration.class));
                break;
            case R.id.new_claim_button:
                startActivity(new Intent(this, Claim.class));
                break;
            case R.id.help_button:
                startActivity(new Intent(this, Configuration.class));
                break;
            case R.id.exit_button:
                finish();
                break;
        }
    }
}

