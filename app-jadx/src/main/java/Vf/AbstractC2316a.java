package Vf;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Vf.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2316a implements Rf.b {
    public /* synthetic */ AbstractC2316a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void i(AbstractC2316a abstractC2316a, Uf.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractC2316a.h(cVar, i10, obj, z10);
    }

    private final int j(Uf.c cVar, Object obj) {
        int iF = cVar.f(getDescriptor());
        c(obj, iF);
        return iF;
    }

    protected abstract Object a();

    protected abstract int b(Object obj);

    protected abstract void c(Object obj, int i10);

    protected abstract Iterator d(Object obj);

    @Override // Rf.a
    public Object deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return f(decoder, null);
    }

    protected abstract int e(Object obj);

    public final Object f(Uf.e decoder, Object obj) {
        Object objA;
        AbstractC5504s.h(decoder, "decoder");
        if (obj == null || (objA = k(obj)) == null) {
            objA = a();
        }
        Object obj2 = objA;
        int iB = b(obj2);
        Uf.c cVarB = decoder.b(getDescriptor());
        if (!cVarB.p()) {
            while (true) {
                int i10 = cVarB.i(getDescriptor());
                if (i10 == -1) {
                    break;
                }
                i(this, cVarB, iB + i10, obj2, false, 8, null);
            }
        } else {
            g(cVarB, obj2, iB, j(cVarB, obj2));
        }
        cVarB.c(getDescriptor());
        return l(obj2);
    }

    protected abstract void g(Uf.c cVar, Object obj, int i10, int i11);

    protected abstract void h(Uf.c cVar, int i10, Object obj, boolean z10);

    protected abstract Object k(Object obj);

    protected abstract Object l(Object obj);

    private AbstractC2316a() {
    }
}
