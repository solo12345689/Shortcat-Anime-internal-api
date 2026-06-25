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
public class a extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f20267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f20268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f20269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f20270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f20271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f20272g;

    public a(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, b bVar) {
        this.f20266a = i10;
        if (i10 != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f20267b = Oh.a.f(bArr);
        this.f20268c = Oh.a.f(bArr2);
        this.f20269d = Oh.a.f(bArr3);
        this.f20270e = Oh.a.f(bArr4);
        this.f20271f = Oh.a.f(bArr5);
        this.f20272g = bVar;
    }

    public static a s(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(new C7420o(this.f20266a));
        c7402f.a(new C7419n0(this.f20267b));
        c7402f.a(new C7419n0(this.f20268c));
        c7402f.a(new C7419n0(this.f20269d));
        c7402f.a(new C7419n0(this.f20270e));
        c7402f.a(new C7419n0(this.f20271f));
        b bVar = this.f20272g;
        if (bVar != null) {
            c7402f.a(new b(bVar.n()));
        }
        return new r0(c7402f);
    }

    public byte[] l() {
        return Oh.a.f(this.f20270e);
    }

    public byte[] n() {
        return Oh.a.f(this.f20268c);
    }

    public byte[] p() {
        return Oh.a.f(this.f20267b);
    }

    public byte[] r() {
        return Oh.a.f(this.f20269d);
    }

    public byte[] t() {
        return Oh.a.f(this.f20271f);
    }

    private a(AbstractC7387B abstractC7387B) {
        int iG = C7420o.z(abstractC7387B.B(0)).G();
        this.f20266a = iG;
        if (iG != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f20267b = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(1)).B());
        this.f20268c = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(2)).B());
        this.f20269d = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(3)).B());
        this.f20270e = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(4)).B());
        this.f20271f = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(5)).B());
        if (abstractC7387B.size() == 7) {
            this.f20272g = b.l(abstractC7387B.B(6));
        }
    }
}
