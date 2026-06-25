package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C3431c3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3431c3 f41622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f41623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f41624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j9.G f41625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f41626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f41627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f41628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41629i;

    /* synthetic */ t6(long j10, C3431c3 c3431c3, String str, Map map, j9.G g10, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f41621a = j10;
        this.f41622b = c3431c3;
        this.f41623c = str;
        this.f41624d = map;
        this.f41625e = g10;
        this.f41626f = j11;
        this.f41627g = j12;
        this.f41628h = j13;
        this.f41629i = i10;
    }

    public final C3785c6 a() {
        return new C3785c6(this.f41623c, this.f41624d, this.f41625e, null);
    }

    public final X5 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f41624d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f41621a;
        C3431c3 c3431c3 = this.f41622b;
        String str = this.f41623c;
        j9.G g10 = this.f41625e;
        return new X5(j10, c3431c3.b(), str, bundle, g10.zza(), this.f41627g, "");
    }

    public final long c() {
        return this.f41621a;
    }

    public final C3431c3 d() {
        return this.f41622b;
    }

    public final String e() {
        return this.f41623c;
    }

    public final j9.G f() {
        return this.f41625e;
    }

    public final long g() {
        return this.f41626f;
    }

    public final long h() {
        return this.f41628h;
    }

    public final int i() {
        return this.f41629i;
    }
}
