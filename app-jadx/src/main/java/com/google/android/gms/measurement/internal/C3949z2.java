package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3949z2 {

    /* JADX INFO: renamed from: a */
    private final String f41803a;

    /* JADX INFO: renamed from: b */
    private final boolean f41804b;

    /* JADX INFO: renamed from: c */
    private boolean f41805c;

    /* JADX INFO: renamed from: d */
    private boolean f41806d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ E2 f41807e;

    public C3949z2(E2 e22, String str, boolean z10) {
        Objects.requireNonNull(e22);
        this.f41807e = e22;
        AbstractC2115p.f(str);
        this.f41803a = str;
        this.f41804b = z10;
    }

    public final boolean a() {
        if (!this.f41805c) {
            this.f41805c = true;
            E2 e22 = this.f41807e;
            this.f41806d = e22.p().getBoolean(this.f41803a, this.f41804b);
        }
        return this.f41806d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f41807e.p().edit();
        editorEdit.putBoolean(this.f41803a, z10);
        editorEdit.apply();
        this.f41806d = z10;
    }
}
