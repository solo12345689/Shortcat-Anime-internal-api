package Vf;

import Uf.c;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5868d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class T extends AbstractC2316a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rf.b f20170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rf.b f20171b;

    public /* synthetic */ T(Rf.b bVar, Rf.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public abstract Tf.e getDescriptor();

    public final Rf.b m() {
        return this.f20170a;
    }

    public final Rf.b n() {
        return this.f20171b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(Uf.c decoder, Map builder, int i10, int i11) {
        AbstractC5504s.h(decoder, "decoder");
        AbstractC5504s.h(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, i11 * 2), 2);
        int iF = c5868dV.f();
        int i12 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL <= 0 || iF > i12) && (iL >= 0 || i12 > iF)) {
            return;
        }
        while (true) {
            h(decoder, i10 + iF, builder, false);
            if (iF == i12) {
                return;
            } else {
                iF += iL;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(Uf.c decoder, int i10, Map builder, boolean z10) {
        int i11;
        AbstractC5504s.h(decoder, "decoder");
        AbstractC5504s.h(builder, "builder");
        Object objC = c.a.c(decoder, getDescriptor(), i10, this.f20170a, null, 8, null);
        if (z10) {
            i11 = decoder.i(getDescriptor());
            if (i11 != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + i11).toString());
            }
        } else {
            i11 = i10 + 1;
        }
        int i12 = i11;
        builder.put(objC, (!builder.containsKey(objC) || (this.f20171b.getDescriptor().h() instanceof Tf.d)) ? c.a.c(decoder, getDescriptor(), i12, this.f20171b, null, 8, null) : decoder.e(getDescriptor(), i12, this.f20171b, Ud.S.j(builder, objC)));
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, Object obj) {
        AbstractC5504s.h(encoder, "encoder");
        int iE = e(obj);
        Tf.e descriptor = getDescriptor();
        Uf.d dVarR = encoder.r(descriptor, iE);
        Iterator itD = d(obj);
        int i10 = 0;
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            dVarR.m(getDescriptor(), i10, m(), key);
            i10 += 2;
            dVarR.m(getDescriptor(), i11, n(), value);
        }
        dVarR.c(descriptor);
    }

    private T(Rf.b bVar, Rf.b bVar2) {
        super(null);
        this.f20170a = bVar;
        this.f20171b = bVar2;
    }
}
