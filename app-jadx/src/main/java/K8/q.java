package K8;

import Q8.C2057e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U8.a f10961a = new U8.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f10961a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        f10961a.a("getFallbackSignInIntent()", new Object[0]);
        Intent intentA = a(context, googleSignInOptions);
        intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentA;
    }

    public static Intent c(Context context, GoogleSignInOptions googleSignInOptions) {
        f10961a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentA = a(context, googleSignInOptions);
        intentA.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentA;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static P8.g d(P8.f r6, android.content.Context r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8, boolean r9) {
        /*
            U8.a r0 = K8.q.f10961a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.a(r3, r2)
            java.lang.String r2 = "getEligibleSavedSignInResult()"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.a(r2, r3)
            R8.AbstractC2115p.l(r8)
            K8.r r2 = K8.r.a(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.e()
            r3 = 0
            if (r2 != 0) goto L22
        L1f:
            r4 = r3
            goto L89
        L22:
            android.accounts.Account r4 = r2.c()
            android.accounts.Account r5 = r8.c()
            if (r4 != 0) goto L2f
            if (r5 != 0) goto L1f
            goto L36
        L2f:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L36
            goto L1f
        L36:
            boolean r4 = r8.s()
            if (r4 == 0) goto L3d
            goto L1f
        L3d:
            boolean r4 = r8.r()
            if (r4 == 0) goto L59
            boolean r4 = r2.r()
            if (r4 != 0) goto L4a
            goto L1f
        L4a:
            java.lang.String r4 = r8.i()
            java.lang.String r5 = r2.i()
            boolean r4 = R8.AbstractC2113n.a(r4, r5)
            if (r4 != 0) goto L59
            goto L1f
        L59:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r2 = r2.f()
            r4.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r5 = r8.f()
            r2.<init>(r5)
            boolean r2 = r4.containsAll(r2)
            if (r2 != 0) goto L72
            goto L1f
        L72:
            K8.r r2 = K8.r.a(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r2.d()
            if (r2 == 0) goto L1f
            boolean r4 = r2.y()
            if (r4 != 0) goto L1f
            J8.b r4 = new J8.b
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.f38933f
            r4.<init>(r2, r5)
        L89:
            if (r4 == 0) goto L97
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Eligible saved sign in result found"
            r0.a(r8, r7)
            P8.g r6 = P8.i.b(r4, r6)
            return r6
        L97:
            if (r9 == 0) goto La9
            J8.b r7 = new J8.b
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r9 = 4
            r8.<init>(r9)
            r7.<init>(r3, r8)
            P8.g r6 = P8.i.b(r7, r6)
            return r6
        La9:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r1 = "trySilentSignIn()"
            r0.a(r1, r9)
            K8.k r9 = new K8.k
            r9.<init>(r6, r7, r8)
            com.google.android.gms.common.api.internal.a r6 = r6.a(r9)
            Q8.m r7 = new Q8.m
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K8.q.d(P8.f, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):P8.g");
    }

    public static P8.h e(P8.f fVar, Context context, boolean z10) {
        f10961a.a("Signing out", new Object[0]);
        h(context);
        return z10 ? P8.i.c(Status.f38933f, fVar) : fVar.b(new m(fVar));
    }

    public static P8.h f(P8.f fVar, Context context, boolean z10) {
        f10961a.a("Revoking access", new Object[0]);
        String strE = c.b(context).e();
        h(context);
        return z10 ? f.a(strE) : fVar.b(new o(fVar));
    }

    public static J8.b g(Intent intent) {
        if (intent == null) {
            return new J8.b(null, Status.f38935h);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new J8.b(googleSignInAccount, Status.f38933f);
        }
        if (status == null) {
            status = Status.f38935h;
        }
        return new J8.b(null, status);
    }

    private static void h(Context context) {
        r.a(context).b();
        Iterator it = P8.f.c().iterator();
        while (it.hasNext()) {
            ((P8.f) it.next()).f();
        }
        C2057e.a();
    }
}
