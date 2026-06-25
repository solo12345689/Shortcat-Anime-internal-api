package k3;

import java.nio.ByteBuffer;
import q2.C6078J;
import t2.C6608H;
import t2.C6609I;
import t2.O;

/* JADX INFO: renamed from: k3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5442c extends d3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f52013a = new C6609I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6608H f52014b = new C6608H();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private O f52015c;

    @Override // d3.c
    protected C6078J b(d3.b bVar, ByteBuffer byteBuffer) {
        O o10 = this.f52015c;
        if (o10 == null || bVar.f45011j != o10.f()) {
            O o11 = new O(bVar.f65557f);
            this.f52015c = o11;
            o11.a(bVar.f65557f - bVar.f45011j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f52013a.Z(bArrArray, iLimit);
        this.f52014b.o(bArrArray, iLimit);
        this.f52014b.r(39);
        long jH = (((long) this.f52014b.h(1)) << 32) | ((long) this.f52014b.h(32));
        this.f52014b.r(20);
        int iH = this.f52014b.h(12);
        int iH2 = this.f52014b.h(8);
        this.f52013a.c0(14);
        C6078J.a aVarD = iH2 != 0 ? iH2 != 255 ? iH2 != 4 ? iH2 != 5 ? iH2 != 6 ? null : g.d(this.f52013a, jH, this.f52015c) : C5443d.d(this.f52013a, jH, this.f52015c) : f.d(this.f52013a) : C5440a.d(this.f52013a, iH, jH) : new C5444e();
        return aVarD == null ? new C6078J(new C6078J.a[0]) : new C6078J(aVarD);
    }
}
