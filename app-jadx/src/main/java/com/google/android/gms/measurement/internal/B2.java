package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f40634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f40636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f40637e;

    public B2(E2 e22, String str, long j10) {
        Objects.requireNonNull(e22);
        this.f40637e = e22;
        AbstractC2115p.f(str);
        this.f40633a = str;
        this.f40634b = j10;
    }

    public final long a() {
        if (!this.f40635c) {
            this.f40635c = true;
            E2 e22 = this.f40637e;
            this.f40636d = e22.p().getLong(this.f40633a, this.f40634b);
        }
        return this.f40636d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f40637e.p().edit();
        editorEdit.putLong(this.f40633a, j10);
        editorEdit.apply();
        this.f40636d = j10;
    }
}
