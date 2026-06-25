package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.i0 f39587a;

    U3(t.i0 i0Var) {
        this.f39587a = i0Var;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        t.i0 i0Var = uri != null ? (t.i0) this.f39587a.get(uri.toString()) : null;
        if (i0Var == null) {
            return null;
        }
        return (String) i0Var.get("".concat(str3));
    }
}
