package Vg;

import zg.AbstractC7387B;
import zg.AbstractC7428u;
import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7419n0;
import zg.C7420o;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f20384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20385b;

    private p(AbstractC7387B abstractC7387B) {
        if (!C7420o.z(abstractC7387B.B(0)).D(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f20384a = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(1)).B());
        this.f20385b = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(2)).B());
    }

    public static p l(Object obj) {
        if (obj instanceof p) {
            return (p) obj;
        }
        if (obj != null) {
            return new p(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(new C7420o(0L));
        c7402f.a(new C7419n0(this.f20384a));
        c7402f.a(new C7419n0(this.f20385b));
        return new r0(c7402f);
    }

    public byte[] n() {
        return Oh.a.f(this.f20384a);
    }

    public byte[] p() {
        return Oh.a.f(this.f20385b);
    }

    public p(byte[] bArr, byte[] bArr2) {
        this.f20384a = Oh.a.f(bArr);
        this.f20385b = Oh.a.f(bArr2);
    }
}
