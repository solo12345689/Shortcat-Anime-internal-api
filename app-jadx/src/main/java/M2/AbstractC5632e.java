package m2;

import androidx.lifecycle.U;
import androidx.lifecycle.W;
import he.AbstractC4945a;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: m2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5632e {
    public static final U a(W.c factory, InterfaceC6014d modelClass, AbstractC5628a extras) {
        AbstractC5504s.h(factory, "factory");
        AbstractC5504s.h(modelClass, "modelClass");
        AbstractC5504s.h(extras, "extras");
        try {
            try {
                return factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.create(AbstractC4945a.b(modelClass), extras);
            }
        } catch (AbstractMethodError unused2) {
            return factory.create(AbstractC4945a.b(modelClass));
        }
    }
}
