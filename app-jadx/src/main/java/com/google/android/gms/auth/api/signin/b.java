package com.google.android.gms.auth.api.signin;

import K8.q;
import P8.e;
import Q8.C2053a;
import R8.AbstractC2114o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.C3333a;
import com.google.android.gms.dynamite.DynamiteModule;
import n9.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends P8.e {

    /* JADX INFO: renamed from: k */
    private static final f f38898k = new f(null);

    /* JADX INFO: renamed from: l */
    static int f38899l = 1;

    b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, H8.a.f8171b, googleSignInOptions, new C2053a());
    }

    private final synchronized int C() {
        int i10;
        try {
            i10 = f38899l;
            if (i10 == 1) {
                Context contextQ = q();
                C3333a c3333aN = C3333a.n();
                int iH = c3333aN.h(contextQ, 12451000);
                if (iH == 0) {
                    i10 = 4;
                    f38899l = 4;
                } else if (c3333aN.b(contextQ, iH, null) != null || DynamiteModule.a(contextQ, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f38899l = 2;
                } else {
                    i10 = 3;
                    f38899l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    public i A() {
        return AbstractC2114o.b(q.e(g(), q(), C() == 3));
    }

    public i B() {
        return AbstractC2114o.a(q.d(g(), q(), (GoogleSignInOptions) p(), C() == 3), f38898k);
    }

    public Intent y() {
        Context contextQ = q();
        int iC = C();
        int i10 = iC - 1;
        if (iC != 0) {
            return i10 != 2 ? i10 != 3 ? q.c(contextQ, (GoogleSignInOptions) p()) : q.a(contextQ, (GoogleSignInOptions) p()) : q.b(contextQ, (GoogleSignInOptions) p());
        }
        throw null;
    }

    public i z() {
        return AbstractC2114o.b(q.f(g(), q(), C() == 3));
    }

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, H8.a.f8171b, googleSignInOptions, new e.a.C0218a().c(new C2053a()).a());
    }
}
