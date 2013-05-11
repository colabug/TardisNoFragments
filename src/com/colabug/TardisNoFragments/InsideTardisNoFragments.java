package com.colabug.TardisNoFragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Author: Corey Leigh Latislaw
 * Date: 5/11/13
 * Purpose:
 */
public class InsideTardisNoFragments extends Activity
{
    public static Intent createIntent( Context context )
    {
        return new Intent( context, InsideTardisNoFragments.class );
    }
}
