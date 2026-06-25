package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2 {

    /* JADX INFO: renamed from: a */
    final String f40687a;

    /* JADX INFO: renamed from: b */
    private final String f40688b;

    /* JADX INFO: renamed from: c */
    private final String f40689c;

    /* JADX INFO: renamed from: d */
    private final long f40690d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ E2 f40691e;

    /* synthetic */ C2(E2 e22, String str, long j10, byte[] bArr) {
        Objects.requireNonNull(e22);
        this.f40691e = e22;
        AbstractC2115p.f("health_monitor");
        AbstractC2115p.a(j10 > 0);
        this.f40687a = "health_monitor:start";
        this.f40688b = "health_monitor:count";
        this.f40689c = "health_monitor:value";
        this.f40690d = j10;
    }

    private final void c() {
        E2 e22 = this.f40691e;
        e22.h();
        long jA = e22.f40611a.e().a();
        SharedPreferences.Editor editorEdit = e22.p().edit();
        editorEdit.remove(this.f40688b);
        editorEdit.remove(this.f40689c);
        editorEdit.putLong(this.f40687a, jA);
        editorEdit.apply();
    }

    private final long d() {
        return this.f40691e.p().getLong(this.f40687a, 0L);
    }

    public final void a(String str, long j10) {
        E2 e22 = this.f40691e;
        e22.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesP = e22.p();
        String str2 = this.f40688b;
        long j11 = sharedPreferencesP.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = e22.p().edit();
            editorEdit.putString(this.f40689c, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = e22.f40611a.C().q0().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = e22.p().edit();
        if (jNextLong < j13) {
            editorEdit2.putString(this.f40689c, str);
        }
        editorEdit2.putLong(str2, j12);
        editorEdit2.apply();
    }

    public final Pair b() {
        long jAbs;
        E2 e22 = this.f40691e;
        e22.h();
        e22.h();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - e22.f40611a.e().a());
        }
        long j10 = this.f40690d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > j10 + j10) {
            c();
            return null;
        }
        String string = e22.p().getString(this.f40689c, null);
        long j11 = e22.p().getLong(this.f40688b, 0L);
        c();
        return (string == null || j11 <= 0) ? E2.f40713A : new Pair(string, Long.valueOf(j11));
    }
}
