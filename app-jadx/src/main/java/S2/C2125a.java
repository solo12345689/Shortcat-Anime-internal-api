package S2;

import java.nio.ByteBuffer;
import java.util.List;
import u2.AbstractC6727i;

/* JADX INFO: renamed from: S2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2125a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC6727i.e f15663a;

    private boolean a(AbstractC6727i.d dVar, boolean z10) {
        AbstractC6727i.e eVar;
        AbstractC6727i.b bVarB;
        int i10 = dVar.f61319a;
        if (i10 == 2 || i10 == 15) {
            return true;
        }
        if (i10 != 3 || z10) {
            return ((i10 != 6 && i10 != 3) || (eVar = this.f15663a) == null || (bVarB = AbstractC6727i.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    private void e(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((AbstractC6727i.d) list.get(i10)).f61319a == 1) {
                this.f15663a = AbstractC6727i.e.a((AbstractC6727i.d) list.get(i10));
            }
        }
    }

    public void b(ByteBuffer byteBuffer) {
        e(AbstractC6727i.e(byteBuffer));
    }

    public void c() {
        this.f15663a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z10) {
        List listE = AbstractC6727i.e(byteBuffer);
        e(listE);
        int size = listE.size() - 1;
        int i10 = 0;
        while (size >= 0 && a((AbstractC6727i.d) listE.get(size), z10)) {
            if (((AbstractC6727i.d) listE.get(size)).f61319a == 6 || ((AbstractC6727i.d) listE.get(size)).f61319a == 3) {
                i10++;
            }
            size--;
        }
        return (i10 > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((AbstractC6727i.d) listE.get(size)).f61320b.limit() : byteBuffer.position();
    }
}
