package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3746w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3742v f40579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3742v f40580c;

    /* synthetic */ C3746w(String str, AbstractC3750x abstractC3750x) {
        C3742v c3742v = new C3742v();
        this.f40579b = c3742v;
        this.f40580c = c3742v;
        str.getClass();
        this.f40578a = str;
    }

    public final C3746w a(Object obj) {
        C3742v c3742v = new C3742v();
        this.f40580c.f40573b = c3742v;
        this.f40580c = c3742v;
        c3742v.f40572a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f40578a);
        sb2.append('{');
        C3742v c3742v = this.f40579b.f40573b;
        String str = "";
        while (c3742v != null) {
            Object obj = c3742v.f40572a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c3742v = c3742v.f40573b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
