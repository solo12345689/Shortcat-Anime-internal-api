package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3873o2 {

    /* JADX INFO: renamed from: a */
    private final int f41472a;

    /* JADX INFO: renamed from: b */
    private final boolean f41473b;

    /* JADX INFO: renamed from: c */
    private final boolean f41474c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C3887q2 f41475d;

    C3873o2(C3887q2 c3887q2, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(c3887q2);
        this.f41475d = c3887q2;
        this.f41472a = i10;
        this.f41473b = z10;
        this.f41474c = z11;
    }

    public final void a(String str) {
        this.f41475d.y(this.f41472a, this.f41473b, this.f41474c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f41475d.y(this.f41472a, this.f41473b, this.f41474c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f41475d.y(this.f41472a, this.f41473b, this.f41474c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f41475d.y(this.f41472a, this.f41473b, this.f41474c, str, obj, obj2, obj3);
    }
}
