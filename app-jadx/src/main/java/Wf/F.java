package Wf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class F implements Rf.b {

    /* JADX INFO: renamed from: a */
    public static final F f20888a = new F();

    /* JADX INFO: renamed from: b */
    private static final Tf.e f20889b = Tf.k.e("kotlinx.serialization.json.JsonPrimitive", d.i.f17511a, new Tf.e[0], null, 8, null);

    private F() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a */
    public E deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        i iVarG = r.d(decoder).g();
        if (iVarG instanceof E) {
            return (E) iVarG;
        }
        throw Xf.C.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + O.b(iVarG.getClass()), iVarG.toString());
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: b */
    public void serialize(Uf.f encoder, E value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        r.h(encoder);
        if (value instanceof z) {
            encoder.t(A.f20880a, z.INSTANCE);
        } else {
            encoder.t(w.f20945a, (v) value);
        }
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20889b;
    }
}
