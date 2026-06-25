package df;

import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import ye.H;

/* JADX INFO: renamed from: df.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4595d extends AbstractC4609r {
    public C4595d(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // df.AbstractC4598g
    /* JADX INFO: renamed from: c */
    public AbstractC6183d0 a(H module) {
        AbstractC5504s.h(module, "module");
        AbstractC6183d0 abstractC6183d0U = module.n().u();
        AbstractC5504s.g(abstractC6183d0U, "getByteType(...)");
        return abstractC6183d0U;
    }

    @Override // df.AbstractC4598g
    public String toString() {
        return ((Number) b()).intValue() + ".toByte()";
    }
}
