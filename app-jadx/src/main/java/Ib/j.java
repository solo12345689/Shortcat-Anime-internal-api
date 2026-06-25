package Ib;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final com.bumptech.glide.j a(com.bumptech.glide.j jVar, k5.f fVar) {
        AbstractC5504s.h(jVar, "<this>");
        if (fVar == null) {
            return jVar;
        }
        com.bumptech.glide.j jVarA = jVar.a(fVar);
        AbstractC5504s.g(jVarA, "apply(...)");
        return jVarA;
    }

    public static final com.bumptech.glide.j b(com.bumptech.glide.j jVar, boolean z10, Function1 block) {
        AbstractC5504s.h(jVar, "<this>");
        AbstractC5504s.h(block, "block");
        return !z10 ? jVar : (com.bumptech.glide.j) block.invoke(jVar);
    }
}
