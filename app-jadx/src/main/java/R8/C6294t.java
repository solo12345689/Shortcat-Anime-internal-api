package r8;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p8.C5938c;
import p8.InterfaceC5944i;
import p8.InterfaceC5945j;
import x8.InterfaceC7065e;

/* JADX INFO: renamed from: r8.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6294t implements InterfaceC6293s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile AbstractC6295u f58713e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.a f58714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.a f58715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC7065e f58716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y8.r f58717d;

    C6294t(B8.a aVar, B8.a aVar2, InterfaceC7065e interfaceC7065e, y8.r rVar, y8.v vVar) {
        this.f58714a = aVar;
        this.f58715b = aVar2;
        this.f58716c = interfaceC7065e;
        this.f58717d = rVar;
        vVar.c();
    }

    private AbstractC6283i b(AbstractC6288n abstractC6288n) {
        return AbstractC6283i.a().i(this.f58714a.a()).k(this.f58715b.a()).j(abstractC6288n.g()).h(new C6282h(abstractC6288n.b(), abstractC6288n.d())).g(abstractC6288n.c().a()).d();
    }

    public static C6294t c() {
        AbstractC6295u abstractC6295u = f58713e;
        if (abstractC6295u != null) {
            return abstractC6295u.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(InterfaceC6280f interfaceC6280f) {
        return interfaceC6280f instanceof InterfaceC6281g ? Collections.unmodifiableSet(((InterfaceC6281g) interfaceC6280f).a()) : Collections.singleton(C5938c.b("proto"));
    }

    public static void f(Context context) {
        if (f58713e == null) {
            synchronized (C6294t.class) {
                try {
                    if (f58713e == null) {
                        f58713e = C6279e.g().a(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // r8.InterfaceC6293s
    public void a(AbstractC6288n abstractC6288n, InterfaceC5945j interfaceC5945j) {
        this.f58716c.a(abstractC6288n.f().f(abstractC6288n.c().c()), b(abstractC6288n), interfaceC5945j);
    }

    public y8.r e() {
        return this.f58717d;
    }

    public InterfaceC5944i g(InterfaceC6280f interfaceC6280f) {
        return new C6290p(d(interfaceC6280f), AbstractC6289o.a().b(interfaceC6280f.getName()).c(interfaceC6280f.getExtras()).a(), this);
    }
}
