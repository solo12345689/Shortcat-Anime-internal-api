package Wf;

import Df.L;
import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class w implements Rf.b {

    /* JADX INFO: renamed from: a */
    public static final w f20945a = new w();

    /* JADX INFO: renamed from: b */
    private static final Tf.e f20946b = Tf.k.b("kotlinx.serialization.json.JsonLiteral", d.i.f17511a);

    private w() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a */
    public v deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        i iVarG = r.d(decoder).g();
        if (iVarG instanceof v) {
            return (v) iVarG;
        }
        throw Xf.C.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + O.b(iVarG.getClass()), iVarG.toString());
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: b */
    public void serialize(Uf.f encoder, v value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        r.h(encoder);
        if (value.d()) {
            encoder.F(value.b());
            return;
        }
        if (value.e() != null) {
            encoder.D(value.e()).F(value.b());
            return;
        }
        Long lT = Df.r.t(value.b());
        if (lT != null) {
            encoder.s(lT.longValue());
            return;
        }
        Td.F fH = L.h(value.b());
        if (fH != null) {
            encoder.D(Sf.a.u(Td.F.f17427b).getDescriptor()).s(fH.n());
            return;
        }
        Double dO = Df.r.o(value.b());
        if (dO != null) {
            encoder.i(dO.doubleValue());
            return;
        }
        Boolean boolJ1 = Df.r.j1(value.b());
        if (boolJ1 != null) {
            encoder.x(boolJ1.booleanValue());
        } else {
            encoder.F(value.b());
        }
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20946b;
    }
}
