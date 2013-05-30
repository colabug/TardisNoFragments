package com.colabug.TardisNoFragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class OutsideTardisActivity extends Activity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.outside_tardis );

        View tardisImage = findViewById( R.id.tardis_image );
        tardisImage.setOnClickListener( new View.OnClickListener()
            {
                @Override
                public void onClick( View view )
                {
                    enterTardis();
                }
            }
        );
    }

    private void enterTardis()
    {
        startActivity( InsideTardisActivity.createIntent( this ) );
    }
}
