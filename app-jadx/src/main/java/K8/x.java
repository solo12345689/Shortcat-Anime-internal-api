package K8;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10966a;

    public x(Context context) {
        this.f10966a = context;
    }

    private final void G3() {
        if (com.google.android.gms.common.util.q.a(this.f10966a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb2.append("Calling UID ");
        sb2.append(callingUid);
        sb2.append(" is not Google Play services.");
        throw new SecurityException(sb2.toString());
    }

    @Override // K8.t
    public final void Q() {
        G3();
        Context context = this.f10966a;
        c cVarB = c.b(context);
        GoogleSignInAccount googleSignInAccountC = cVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f38867l;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        com.google.android.gms.auth.api.signin.b bVarA = com.google.android.gms.auth.api.signin.a.a(context, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.z();
        } else {
            bVarA.A();
        }
    }

    @Override // K8.t
    public final void f0() {
        G3();
        r.a(this.f10966a).b();
    }
}
