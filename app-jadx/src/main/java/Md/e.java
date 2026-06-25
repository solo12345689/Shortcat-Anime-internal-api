package Md;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f12385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f12386b;

    public e(Object obj, Function2 function2) {
        this.f12385a = function2;
        this.f12386b = new WeakReference(obj);
    }

    public final Object a() {
        return this.f12386b.get();
    }

    public final Object b(Object obj, InterfaceC6023m property) {
        AbstractC5504s.h(property, "property");
        return a();
    }

    public final void c(Object obj) {
        Object obj2 = this.f12386b.get();
        this.f12386b = new WeakReference(obj);
        Function2 function2 = this.f12385a;
        if (function2 != null) {
            function2.invoke(obj2, obj);
        }
    }

    public final void d(Object obj, InterfaceC6023m property, Object obj2) {
        AbstractC5504s.h(property, "property");
        c(obj2);
    }
}
