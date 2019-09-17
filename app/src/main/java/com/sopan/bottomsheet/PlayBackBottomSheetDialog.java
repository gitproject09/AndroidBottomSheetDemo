package com.sopan.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class PlayBackBottomSheetDialog extends BottomSheetDialog {

    public Window window;
    //public Button btnCross;
    public PlayBackClickListener dialogClickListener;
    private ImageView cvTwoFive, cvFive, cvSevenFive, cvNormal, cvOneTwoFive, cvOneFive, cvOneSevenFive, cvTwo;

    public PlayBackBottomSheetDialog(Context activity, PlayBackClickListener dialogClickListener) {
        super(activity);
        // TODO Auto-generated constructor stub

        this.dialogClickListener = dialogClickListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //this.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        setContentView(R.layout.fragment_bottom_sheet_dialog);
       /* View view = getLayoutInflater().inflate(R.layout.fragment_bottom_sheet_dialog, null);
        setContentView(view);*/

        /*BottomSheetDialog dialog = new BottomSheetDialog(this);
        dialog.setContentView(view);*/

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();

        window = this.getWindow();

        lp.copyFrom(window.getAttributes());

        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        window.setAttributes(lp);

        /*WindowManager.LayoutParams wmlp = dialog.getWindow().getAttributes();

        wmlp.gravity = Gravity.TOP | Gravity.LEFT;
        wmlp.x = 100;   //x position
        wmlp.y = 100;*/

        //btnCross = findViewById(R.id.btnCross);
       // btnCross.setOnClickListener(this);

    }
}