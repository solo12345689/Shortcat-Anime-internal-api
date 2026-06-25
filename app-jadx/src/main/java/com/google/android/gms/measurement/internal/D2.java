package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ E2 f40703d;

    public D2(E2 e22, String str, String str2) {
        Objects.requireNonNull(e22);
        this.f40703d = e22;
        AbstractC2115p.f(str);
        this.f40700a = str;
    }

    public final String a() {
        if (!this.f40701b) {
            this.f40701b = true;
            E2 e22 = this.f40703d;
            this.f40702c = e22.p().getString(this.f40700a, null);
        }
        return this.f40702c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f40703d.p().edit();
        editorEdit.putString(this.f40700a, str);
        editorEdit.apply();
        this.f40702c = str;
    }
}
