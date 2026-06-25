package Vg;

import zg.AbstractC7387B;
import zg.AbstractC7428u;
import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7419n0;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class d extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f20279a;

    public d(AbstractC7387B abstractC7387B) {
        this.f20279a = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(0)).B());
    }

    public static d n(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(new C7419n0(this.f20279a));
        return new r0(c7402f);
    }

    public byte[] l() {
        return this.f20279a;
    }

    public d(byte[] bArr) {
        this.f20279a = bArr;
    }
}
