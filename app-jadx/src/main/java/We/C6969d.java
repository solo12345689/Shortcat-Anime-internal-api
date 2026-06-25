package we;

import Ud.AbstractC2279u;
import java.util.List;
import jf.AbstractC5382f;
import kotlin.jvm.internal.AbstractC5504s;
import pf.n;
import we.AbstractC6971f;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: we.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6969d extends AbstractC5382f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6969d(n storageManager, C6967b containingClass) {
        super(storageManager, containingClass);
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(containingClass, "containingClass");
    }

    @Override // jf.AbstractC5382f
    protected List j() {
        InterfaceC7227e interfaceC7227eM = m();
        AbstractC5504s.f(interfaceC7227eM, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        AbstractC6971f abstractC6971fU0 = ((C6967b) interfaceC7227eM).U0();
        return AbstractC5504s.c(abstractC6971fU0, AbstractC6971f.a.f63187f) ? AbstractC2279u.e(C6970e.f63181E.a((C6967b) m(), false)) : AbstractC5504s.c(abstractC6971fU0, AbstractC6971f.d.f63190f) ? AbstractC2279u.e(C6970e.f63181E.a((C6967b) m(), true)) : AbstractC2279u.m();
    }
}
