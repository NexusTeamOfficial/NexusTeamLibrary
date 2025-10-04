package com.nexusteam.library;

import android.content.Context;
import android.widget.Toast;

public class NexusUtils {
    public static void showToast(Context c, String msg) {
        Toast.makeText(c, "NexusTeamOfficial: " + msg, Toast.LENGTH_SHORT).show();
    }
    public static String getDeveloper() {
        return "Made by NexusTeamOfficial 💎";
    }
}
