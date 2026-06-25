package sh;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f59922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f59923b;

    protected u(int i10, byte[] bArr) {
        this.f59922a = i10;
        this.f59923b = bArr;
    }

    public int a() {
        return this.f59922a;
    }

    public byte[] b() {
        return AbstractC6533A.c(this.f59923b);
    }
}
