package x0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: x0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7040l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f63555a;

    public /* synthetic */ AbstractC7040l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(InterfaceC6711f interfaceC6711f);

    public Function1 b() {
        return this.f63555a;
    }

    public final void c() {
        Function1 function1B = b();
        if (function1B != null) {
            function1B.invoke(this);
        }
    }

    public void d(Function1 function1) {
        this.f63555a = function1;
    }

    private AbstractC7040l() {
    }
}
