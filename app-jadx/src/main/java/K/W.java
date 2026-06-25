package K;

import U0.Y0;
import Y0.AbstractC2485u;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC5027t f9877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5011d f9878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC2485u.b f9879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Y0 f9880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f9881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9882f = a();

    public W(EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, Y0 y02, Object obj) {
        this.f9877a = enumC5027t;
        this.f9878b = interfaceC5011d;
        this.f9879c = bVar;
        this.f9880d = y02;
        this.f9881e = obj;
    }

    private final long a() {
        return M.b(this.f9880d, this.f9878b, this.f9879c, null, 0, 24, null);
    }

    public final long b() {
        return this.f9882f;
    }

    public final void c(EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, Y0 y02, Object obj) {
        if (enumC5027t == this.f9877a && AbstractC5504s.c(interfaceC5011d, this.f9878b) && AbstractC5504s.c(bVar, this.f9879c) && AbstractC5504s.c(y02, this.f9880d) && AbstractC5504s.c(obj, this.f9881e)) {
            return;
        }
        this.f9877a = enumC5027t;
        this.f9878b = interfaceC5011d;
        this.f9879c = bVar;
        this.f9880d = y02;
        this.f9881e = obj;
        this.f9882f = a();
    }
}
