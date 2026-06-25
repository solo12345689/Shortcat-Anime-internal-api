package com.google.android.gms.common.api;

import Q8.C2057e;
import R8.AbstractC2115p;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C3333a;
import com.google.android.gms.common.ConnectionResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    protected int f38929a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    private final void b() {
        GoogleApiActivity googleApiActivity;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get(DiagnosticsTracker.ERROR_CODE_KEY);
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            C3333a.n().p(this, ((Integer) AbstractC2115p.l(num)).intValue(), 2, this);
            this.f38929a = 1;
            return;
        }
        try {
            googleApiActivity = this;
        } catch (ActivityNotFoundException e10) {
            e = e10;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
        try {
            googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            googleApiActivity.f38929a = 1;
        } catch (ActivityNotFoundException e12) {
            e = e12;
            if (extras.getBoolean("notify_manager", true)) {
                C2057e.u(this).D(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String strConcat = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (Build.FINGERPRINT.contains("generic")) {
                    strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", strConcat, e);
            }
            googleApiActivity.f38929a = 1;
            finish();
        } catch (IntentSender.SendIntentException e13) {
            e = e13;
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f38929a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                C2057e c2057eU = C2057e.u(this);
                if (i11 == -1) {
                    c2057eU.E();
                } else if (i11 == 0) {
                    c2057eU.D(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f38929a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f38929a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f38929a = bundle.getInt("resolution");
        }
        if (this.f38929a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f38929a);
        super.onSaveInstanceState(bundle);
    }
}
