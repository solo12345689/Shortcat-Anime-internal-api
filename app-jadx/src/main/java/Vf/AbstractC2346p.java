package Vf;

import Uf.c;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Vf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2346p extends AbstractC2316a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rf.b f20222a;

    public /* synthetic */ AbstractC2346p(Rf.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Override // Vf.AbstractC2316a
    protected final void g(Uf.c decoder, Object obj, int i10, int i11) {
        AbstractC5504s.h(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h(decoder, i10 + i12, obj, false);
        }
    }

    @Override // Rf.b, Rf.k, Rf.a
    public abstract Tf.e getDescriptor();

    @Override // Vf.AbstractC2316a
    protected void h(Uf.c decoder, int i10, Object obj, boolean z10) {
        AbstractC5504s.h(decoder, "decoder");
        n(obj, i10, c.a.c(decoder, getDescriptor(), i10, this.f20222a, null, 8, null));
    }

    protected abstract void n(Object obj, int i10, Object obj2);

    @Override // Rf.k
    public void serialize(Uf.f encoder, Object obj) {
        AbstractC5504s.h(encoder, "encoder");
        int iE = e(obj);
        Tf.e descriptor = getDescriptor();
        Uf.d dVarR = encoder.r(descriptor, iE);
        Iterator itD = d(obj);
        for (int i10 = 0; i10 < iE; i10++) {
            dVarR.m(getDescriptor(), i10, this.f20222a, itD.next());
        }
        dVarR.c(descriptor);
    }

    private AbstractC2346p(Rf.b bVar) {
        super(null);
        this.f20222a = bVar;
    }
}
