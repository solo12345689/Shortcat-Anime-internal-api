package Sg;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class c implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16678b;

    public c(a aVar, byte[] bArr) {
        this.f16677a = aVar;
        this.f16678b = Oh.a.f(bArr);
    }

    public a a() {
        return this.f16677a;
    }

    public byte[] b() {
        return Oh.a.f(this.f16678b);
    }
}
