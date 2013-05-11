package com.colabug.TardisNoFragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Author: Corey Leigh Latislaw
 * Date: 5/11/13
 * Purpose:
 */
public class InsideTardisNoFragments extends Activity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.inside_tardis );
    }

    public static Intent createIntent( Context context )
    {
        return new Intent( context, InsideTardisNoFragments.class );
    }
}
