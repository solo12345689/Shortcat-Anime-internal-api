package z;

import kotlin.jvm.functions.Function2;
import x.EnumC6992L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface x {
    static /* synthetic */ Object d(x xVar, EnumC6992L enumC6992L, Function2 function2, Zd.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            enumC6992L = EnumC6992L.Default;
        }
        return xVar.b(enumC6992L, function2, eVar);
    }

    boolean a();

    Object b(EnumC6992L enumC6992L, Function2 function2, Zd.e eVar);

    default boolean c() {
        return true;
    }

    default boolean e() {
        return true;
    }

    float f(float f10);
}
