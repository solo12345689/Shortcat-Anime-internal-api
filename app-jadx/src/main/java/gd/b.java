package Gd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f7451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f7452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function2 f7453c;

    public b(Object obj, Function1 propertyMapper, Function2 function2) {
        AbstractC5504s.h(propertyMapper, "propertyMapper");
        this.f7451a = obj;
        this.f7452b = propertyMapper;
        this.f7453c = function2;
    }

    public final Object c(Object obj, InterfaceC6023m property) {
        AbstractC5504s.h(property, "property");
        return this.f7451a;
    }

    public final void d(Object obj, InterfaceC6023m property, Object obj2) {
        AbstractC5504s.h(property, "property");
        Object obj3 = this.f7451a;
        if (obj3 != null ? obj3.equals(this.f7452b.invoke(obj2)) : false) {
            return;
        }
        Object obj4 = this.f7451a;
        Object objInvoke = this.f7452b.invoke(obj2);
        this.f7451a = objInvoke;
        Function2 function2 = this.f7453c;
        if (function2 != null) {
            function2.invoke(objInvoke, obj4);
        }
    }

    public /* synthetic */ b(Object obj, Function1 function1, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? new Function1() { // from class: Gd.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return b.b(obj2);
            }
        } : function1, (i10 & 4) != 0 ? null : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b(Object obj) {
        return obj;
    }
}
