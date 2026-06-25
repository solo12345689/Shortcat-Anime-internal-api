package Vg;

import zg.AbstractC7387B;
import zg.AbstractC7428u;
import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7419n0;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class j extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f20357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f20358b;

    public j(AbstractC7387B abstractC7387B) {
        this.f20357a = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(0)).B());
        this.f20358b = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(1)).B());
    }

    public static j l(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(new C7419n0(this.f20357a));
        c7402f.a(new C7419n0(this.f20358b));
        return new r0(c7402f);
    }

    public byte[] n() {
        return Oh.a.f(this.f20358b);
    }

    public byte[] p() {
        return Oh.a.f(this.f20357a);
    }

    public j(byte[] bArr, byte[] bArr2) {
        this.f20357a = bArr;
        this.f20358b = bArr2;
    }
}
