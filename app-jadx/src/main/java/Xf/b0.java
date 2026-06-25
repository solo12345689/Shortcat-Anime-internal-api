package Xf;

import Wf.AbstractC2358b;
import Wf.C2359c;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b0 {
    public static final Object a(AbstractC2358b json, Wf.i element, Rf.a deserializer) {
        Uf.e g10;
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(element, "element");
        AbstractC5504s.h(deserializer, "deserializer");
        if (element instanceof Wf.C) {
            g10 = new K(json, (Wf.C) element, null, null, 12, null);
        } else if (element instanceof C2359c) {
            g10 = new M(json, (C2359c) element);
        } else {
            if (!(element instanceof Wf.v) && !AbstractC5504s.c(element, Wf.z.INSTANCE)) {
                throw new Td.r();
            }
            g10 = new G(json, (Wf.E) element, null, 4, null);
        }
        return g10.C(deserializer);
    }

    public static final Object b(AbstractC2358b abstractC2358b, String discriminator, Wf.C element, Rf.a deserializer) {
        AbstractC5504s.h(abstractC2358b, "<this>");
        AbstractC5504s.h(discriminator, "discriminator");
        AbstractC5504s.h(element, "element");
        AbstractC5504s.h(deserializer, "deserializer");
        return new K(abstractC2358b, element, discriminator, deserializer.getDescriptor()).C(deserializer);
    }
}
