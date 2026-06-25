package Y;

import java.util.ArrayList;

/* JADX INFO: renamed from: Y.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2389a implements InterfaceC2398d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22264d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f22266b = g2.c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f22267c;

    public AbstractC2389a(Object obj) {
        this.f22265a = obj;
        this.f22267c = obj;
    }

    @Override // Y.InterfaceC2398d
    public Object a() {
        return this.f22267c;
    }

    @Override // Y.InterfaceC2398d
    public final void clear() {
        g2.a(this.f22266b);
        n(this.f22265a);
        m();
    }

    @Override // Y.InterfaceC2398d
    public void h(Object obj) {
        g2.j(this.f22266b, a());
        n(obj);
    }

    @Override // Y.InterfaceC2398d
    public void k() {
        n(g2.i(this.f22266b));
    }

    public final Object l() {
        return this.f22265a;
    }

    protected abstract void m();

    protected void n(Object obj) {
        this.f22267c = obj;
    }
}
