package Sg;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class b implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f16673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f16675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16676d;

    public b(a aVar, byte[] bArr) {
        if (bArr.length != 64) {
            throw new IllegalArgumentException("incorrect length for seed");
        }
        this.f16676d = true;
        this.f16675c = aVar;
        this.f16673a = Oh.a.f(bArr);
        this.f16674b = null;
    }

    public a a() {
        return this.f16675c;
    }

    public byte[] b() {
        if (e()) {
            throw new IllegalStateException("KeySpec represents seed");
        }
        return Oh.a.f(this.f16673a);
    }

    public byte[] c() {
        if (e()) {
            throw new IllegalStateException("KeySpec represents long form");
        }
        return Oh.a.f(this.f16674b);
    }

    public byte[] d() {
        if (e()) {
            return Oh.a.f(this.f16673a);
        }
        throw new IllegalStateException("KeySpec represents long form");
    }

    public boolean e() {
        return this.f16676d;
    }

    public b(a aVar, byte[] bArr, byte[] bArr2) {
        this.f16676d = false;
        this.f16675c = aVar;
        this.f16673a = Oh.a.f(bArr);
        this.f16674b = Oh.a.f(bArr2);
    }
}
