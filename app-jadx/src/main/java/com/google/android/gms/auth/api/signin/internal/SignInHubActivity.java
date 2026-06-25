package com.google.android.gms.auth.api.signin.internal;

import K8.r;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.AbstractActivityC2842v;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SignInHubActivity extends AbstractActivityC2842v {

    /* JADX INFO: renamed from: k */
    private static boolean f38902k = false;

    /* JADX INFO: renamed from: f */
    private boolean f38903f = false;

    /* JADX INFO: renamed from: g */
    private SignInConfiguration f38904g;

    /* JADX INFO: renamed from: h */
    private boolean f38905h;

    /* JADX INFO: renamed from: i */
    private int f38906i;

    /* JADX INFO: renamed from: j */
    private Intent f38907j;

    private final void L(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f38904g);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f38903f = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            N(17);
        }
    }

    private final void M() {
        D().c(0, null, new a(this, null));
        f38902k = false;
    }

    private final void N(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f38902k = false;
    }

    final /* synthetic */ int J() {
        return this.f38906i;
    }

    final /* synthetic */ Intent K() {
        return this.f38907j;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, androidx.activity.AbstractActivityC2640j, android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f38903f) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.c() != null) {
                GoogleSignInAccount googleSignInAccountC = signInAccount.c();
                if (googleSignInAccountC == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    N(12500);
                    return;
                }
                r.a(this).c(this.f38904g.c(), googleSignInAccountC);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountC);
                this.f38905h = true;
                this.f38906i = i11;
                this.f38907j = intent;
                M();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                N(intExtra);
                return;
            }
        }
        N(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            N(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            N(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f38904g = signInConfiguration;
        if (bundle == null) {
            if (f38902k) {
                setResult(0);
                N(12502);
                return;
            } else {
                f38902k = true;
                L(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.f38905h = z10;
        if (z10) {
            this.f38906i = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.f38907j = intent2;
                M();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2842v, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f38902k = false;
    }

    @Override // androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f38905h);
        if (this.f38905h) {
            bundle.putInt("signInResultCode", this.f38906i);
            bundle.putParcelable("signInResultData", this.f38907j);
        }
    }
}
