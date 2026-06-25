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
public class c extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f20275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f20276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f20277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f20278e;

    public c(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, d dVar) {
        this.f20274a = i10;
        this.f20275b = bArr;
        this.f20276c = bArr2;
        this.f20277d = bArr3;
        this.f20278e = dVar;
    }

    public static c p(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(new C7420o(this.f20274a));
        c7402f.a(new C7419n0(this.f20275b));
        c7402f.a(new C7419n0(this.f20276c));
        c7402f.a(new C7419n0(this.f20277d));
        d dVar = this.f20278e;
        if (dVar != null) {
            c7402f.a(new d(dVar.l()));
        }
        return new r0(c7402f);
    }

    public byte[] l() {
        return Oh.a.f(this.f20277d);
    }

    public byte[] n() {
        return Oh.a.f(this.f20276c);
    }

    public d r() {
        return this.f20278e;
    }

    public byte[] s() {
        return Oh.a.f(this.f20275b);
    }

    private c(AbstractC7387B abstractC7387B) {
        int iG = C7420o.z(abstractC7387B.B(0)).G();
        this.f20274a = iG;
        if (iG != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f20275b = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(1)).B());
        this.f20276c = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(2)).B());
        this.f20277d = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(3)).B());
        if (abstractC7387B.size() == 5) {
            this.f20278e = d.n(abstractC7387B.B(4));
        }
    }
}
