package Yf;

import Rf.k;
import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Rf.b c(e eVar, InterfaceC6014d interfaceC6014d, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = AbstractC2279u.m();
        }
        return eVar.b(interfaceC6014d, list);
    }

    public abstract void a(i iVar);

    public abstract Rf.b b(InterfaceC6014d interfaceC6014d, List list);

    public abstract Rf.a d(InterfaceC6014d interfaceC6014d, String str);

    public abstract k e(InterfaceC6014d interfaceC6014d, Object obj);

    private e() {
    }
}
