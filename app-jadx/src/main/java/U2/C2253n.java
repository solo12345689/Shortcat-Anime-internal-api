package U2;

import U2.O;
import java.io.EOFException;
import q2.C6109x;
import q2.InterfaceC6098m;
import t2.C6609I;

/* JADX INFO: renamed from: U2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2253n implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f19076a = new byte[4096];

    @Override // U2.O
    public int b(InterfaceC6098m interfaceC6098m, int i10, boolean z10, int i11) throws EOFException {
        int i12 = interfaceC6098m.read(this.f19076a, 0, Math.min(this.f19076a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // U2.O
    public void g(C6609I c6609i, int i10, int i11) {
        c6609i.c0(i10);
    }

    @Override // U2.O
    public void c(C6109x c6109x) {
    }

    @Override // U2.O
    public void a(long j10, int i10, int i11, int i12, O.a aVar) {
    }
}
