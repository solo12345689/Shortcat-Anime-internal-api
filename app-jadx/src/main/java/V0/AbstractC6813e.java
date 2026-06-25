package v0;

import r0.C6224f;
import r0.C6226h;
import r0.C6228j;
import r0.C6230l;
import s0.AbstractC6362i1;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: v0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6813e {
    public static final void a(InterfaceC6711f interfaceC6711f, C6811c c6811c) {
        c6811c.h(interfaceC6711f.n1().b(), interfaceC6711f.n1().g());
    }

    public static final void b(C6811c c6811c, AbstractC6362i1 abstractC6362i1) {
        if (abstractC6362i1 instanceof AbstractC6362i1.b) {
            AbstractC6362i1.b bVar = (AbstractC6362i1.b) abstractC6362i1;
            long jE = C6224f.e((((long) Float.floatToRawIntBits(bVar.b().i())) << 32) | (((long) Float.floatToRawIntBits(bVar.b().l())) & 4294967295L));
            C6226h c6226hB = bVar.b();
            float fJ = c6226hB.j() - c6226hB.i();
            C6226h c6226hB2 = bVar.b();
            c6811c.U(jE, C6230l.d((((long) Float.floatToRawIntBits(c6226hB2.e() - c6226hB2.l())) & 4294967295L) | (Float.floatToRawIntBits(fJ) << 32)));
            return;
        }
        if (abstractC6362i1 instanceof AbstractC6362i1.a) {
            c6811c.R(((AbstractC6362i1.a) abstractC6362i1).b());
            return;
        }
        if (!(abstractC6362i1 instanceof AbstractC6362i1.c)) {
            throw new Td.r();
        }
        AbstractC6362i1.c cVar = (AbstractC6362i1.c) abstractC6362i1;
        if (cVar.c() != null) {
            c6811c.R(cVar.c());
            return;
        }
        C6228j c6228jB = cVar.b();
        long jE2 = C6224f.e((((long) Float.floatToRawIntBits(c6228jB.e())) << 32) | (((long) Float.floatToRawIntBits(c6228jB.g())) & 4294967295L));
        float fJ2 = c6228jB.j();
        c6811c.Z(jE2, C6230l.d((((long) Float.floatToRawIntBits(c6228jB.d())) & 4294967295L) | (Float.floatToRawIntBits(fJ2) << 32)), Float.intBitsToFloat((int) (c6228jB.b() >> 32)));
    }
}
