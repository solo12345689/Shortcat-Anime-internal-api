package Vg;

import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7419n0;
import zg.C7420o;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class n extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f20374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20375b;

    public n(byte[] bArr, byte[] bArr2) {
        this.f20374a = Oh.a.f(bArr);
        this.f20375b = Oh.a.f(bArr2);
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(new C7420o(0L));
        c7402f.a(new C7419n0(this.f20374a));
        c7402f.a(new C7419n0(this.f20375b));
        return new r0(c7402f);
    }
}
