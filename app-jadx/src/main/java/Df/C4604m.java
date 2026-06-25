package df;

import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import ye.H;

/* JADX INFO: renamed from: df.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4604m extends AbstractC4598g {
    public C4604m(float f10) {
        super(Float.valueOf(f10));
    }

    @Override // df.AbstractC4598g
    /* JADX INFO: renamed from: c */
    public AbstractC6183d0 a(H module) {
        AbstractC5504s.h(module, "module");
        AbstractC6183d0 abstractC6183d0C = module.n().C();
        AbstractC5504s.g(abstractC6183d0C, "getFloatType(...)");
        return abstractC6183d0C;
    }

    @Override // df.AbstractC4598g
    public String toString() {
        return ((Number) b()).floatValue() + ".toFloat()";
    }
}
