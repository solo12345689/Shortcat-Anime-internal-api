package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3893r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f41573d;

    public C3893r2(String str, String str2, Bundle bundle, long j10) {
        this.f41570a = str;
        this.f41571b = str2;
        this.f41573d = bundle;
        this.f41572c = j10;
    }

    public static C3893r2 a(G g10) {
        return new C3893r2(g10.f40764a, g10.f40766c, g10.f40765b.l(), g10.f40767d);
    }

    public final G b() {
        return new G(this.f41570a, new E(new Bundle(this.f41573d)), this.f41571b, this.f41572c);
    }

    public final String toString() {
        String str = this.f41571b;
        String string = this.f41573d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f41570a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(string);
        return sb2.toString();
    }
}
