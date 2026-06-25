package Vf;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f20228a = AbstractC2323d0.a();

    public static final Tf.e a(String serialName, Tf.d kind) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(kind, "kind");
        b(serialName);
        return new q0(serialName, kind);
    }

    private static final void b(String str) {
        for (Rf.b bVar : f20228a.values()) {
            if (AbstractC5504s.c(str, bVar.getDescriptor().o())) {
                throw new IllegalArgumentException(Df.r.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + kotlin.jvm.internal.O.b(bVar.getClass()).v() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
