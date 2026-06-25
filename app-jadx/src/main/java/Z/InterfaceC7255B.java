package z;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: z.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7255B extends n {
    static /* synthetic */ Object c(InterfaceC7255B interfaceC7255B, u uVar, float f10, Zd.e eVar) {
        return interfaceC7255B.b(uVar, f10, AbstractC7256C.f65253a, eVar);
    }

    @Override // z.n
    default Object a(u uVar, float f10, Zd.e eVar) {
        return c(this, uVar, f10, eVar);
    }

    Object b(u uVar, float f10, Function1 function1, Zd.e eVar);
}
