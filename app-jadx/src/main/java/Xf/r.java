package Xf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r extends C2377n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC2385w writer, boolean z10) {
        super(writer);
        AbstractC5504s.h(writer, "writer");
        this.f22006c = z10;
    }

    @Override // Xf.C2377n
    public void e(byte b10) {
        boolean z10 = this.f22006c;
        String strK = Td.B.k(Td.B.b(b10));
        if (z10) {
            n(strK);
        } else {
            k(strK);
        }
    }

    @Override // Xf.C2377n
    public void i(int i10) {
        boolean z10 = this.f22006c;
        String string = Long.toString(((long) Td.D.b(i10)) & 4294967295L, 10);
        if (z10) {
            n(string);
        } else {
            k(string);
        }
    }

    @Override // Xf.C2377n
    public void j(long j10) {
        boolean z10 = this.f22006c;
        long jB = Td.F.b(j10);
        if (z10) {
            n(AbstractC2371h.a(jB, 10));
        } else {
            k(AbstractC2371h.a(jB, 10));
        }
    }

    @Override // Xf.C2377n
    public void l(short s10) {
        boolean z10 = this.f22006c;
        String strK = Td.I.k(Td.I.b(s10));
        if (z10) {
            n(strK);
        } else {
            k(strK);
        }
    }
}
