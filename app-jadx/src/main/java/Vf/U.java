package Vf;

import Ud.AbstractC2279u;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class U extends A0 {
    protected abstract String e0(String str, String str2);

    protected String f0(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return descriptor.l(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final String Z(Tf.e eVar, int i10) {
        AbstractC5504s.h(eVar, "<this>");
        return h0(f0(eVar, i10));
    }

    protected final String h0(String nestedName) {
        AbstractC5504s.h(nestedName, "nestedName");
        String str = (String) Y();
        if (str == null) {
            str = "";
        }
        return e0(str, nestedName);
    }

    protected final String i0() {
        return a0().isEmpty() ? "$" : AbstractC2279u.w0(a0(), ".", "$.", null, 0, null, null, 60, null);
    }
}
