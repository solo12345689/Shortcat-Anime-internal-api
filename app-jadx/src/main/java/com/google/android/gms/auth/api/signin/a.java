package com.google.android.gms.auth.api.signin;

import K8.q;
import K8.r;
import R8.AbstractC2101b;
import R8.AbstractC2115p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import n9.i;
import n9.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) AbstractC2115p.l(googleSignInOptions));
    }

    public static GoogleSignInAccount b(Context context) {
        return r.a(context).d();
    }

    public static i c(Intent intent) {
        J8.b bVarG = q.g(intent);
        GoogleSignInAccount googleSignInAccountA = bVarG.a();
        return (!bVarG.b().l() || googleSignInAccountA == null) ? l.e(AbstractC2101b.a(bVarG.b())) : l.f(googleSignInAccountA);
    }

    public static void d(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        AbstractC2115p.m(activity, "Please provide a non-null Activity");
        AbstractC2115p.m(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(e(activity, googleSignInAccount, scopeArr), i10);
    }

    private static Intent e(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a();
        if (scopeArr.length > 0) {
            aVar.e(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.d())) {
            aVar.g((String) AbstractC2115p.l(googleSignInAccount.d()));
        }
        return new b(activity, aVar.a()).y();
    }
}
