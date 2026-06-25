package w;

import Y.b2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y.C0 f62664a;

    public /* synthetic */ q0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object a();

    public final boolean b() {
        return ((Boolean) this.f62664a.getValue()).booleanValue();
    }

    public abstract void c(Object obj);

    public final void d(boolean z10) {
        this.f62664a.setValue(Boolean.valueOf(z10));
    }

    public abstract void e(o0 o0Var);

    public abstract void f();

    private q0() {
        this.f62664a = b2.e(Boolean.FALSE, null, 2, null);
    }
}
