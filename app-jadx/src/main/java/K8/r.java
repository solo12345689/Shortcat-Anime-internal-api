package K8;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: d */
    private static r f10962d;

    /* JADX INFO: renamed from: a */
    final c f10963a;

    /* JADX INFO: renamed from: b */
    GoogleSignInAccount f10964b;

    /* JADX INFO: renamed from: c */
    GoogleSignInOptions f10965c;

    private r(Context context) {
        c cVarB = c.b(context);
        this.f10963a = cVarB;
        this.f10964b = cVarB.c();
        this.f10965c = cVarB.d();
    }

    public static synchronized r a(Context context) {
        return f(context.getApplicationContext());
    }

    private static synchronized r f(Context context) {
        r rVar = f10962d;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(context);
        f10962d = rVar2;
        return rVar2;
    }

    public final synchronized void b() {
        this.f10963a.a();
        this.f10964b = null;
        this.f10965c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f10963a.f(googleSignInAccount, googleSignInOptions);
        this.f10964b = googleSignInAccount;
        this.f10965c = googleSignInOptions;
    }

    public final synchronized GoogleSignInAccount d() {
        return this.f10964b;
    }

    public final synchronized GoogleSignInOptions e() {
        return this.f10965c;
    }
}
