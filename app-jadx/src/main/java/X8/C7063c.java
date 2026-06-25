package x8;

import A8.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p8.InterfaceC5945j;
import r8.AbstractC6283i;
import r8.AbstractC6289o;
import r8.C6294t;
import s8.m;
import y8.x;
import z8.InterfaceC7327d;

/* JADX INFO: renamed from: x8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7063c implements InterfaceC7065e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f64054f = Logger.getLogger(C6294t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f64055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f64056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s8.e f64057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC7327d f64058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A8.b f64059e;

    public C7063c(Executor executor, s8.e eVar, x xVar, InterfaceC7327d interfaceC7327d, A8.b bVar) {
        this.f64056b = executor;
        this.f64057c = eVar;
        this.f64055a = xVar;
        this.f64058d = interfaceC7327d;
        this.f64059e = bVar;
    }

    public static /* synthetic */ Object b(C7063c c7063c, AbstractC6289o abstractC6289o, AbstractC6283i abstractC6283i) {
        c7063c.f64058d.P0(abstractC6289o, abstractC6283i);
        c7063c.f64055a.a(abstractC6289o, 1);
        return null;
    }

    public static /* synthetic */ void c(final C7063c c7063c, final AbstractC6289o abstractC6289o, InterfaceC5945j interfaceC5945j, AbstractC6283i abstractC6283i) {
        c7063c.getClass();
        try {
            m mVarB = c7063c.f64057c.b(abstractC6289o.b());
            if (mVarB == null) {
                String str = String.format("Transport backend '%s' is not registered", abstractC6289o.b());
                f64054f.warning(str);
                interfaceC5945j.a(new IllegalArgumentException(str));
            } else {
                final AbstractC6283i abstractC6283iB = mVarB.b(abstractC6283i);
                c7063c.f64059e.g(new b.a() { // from class: x8.b
                    @Override // A8.b.a
                    public final Object b() {
                        return C7063c.b(this.f64051a, abstractC6289o, abstractC6283iB);
                    }
                });
                interfaceC5945j.a(null);
            }
        } catch (Exception e10) {
            f64054f.warning("Error scheduling event " + e10.getMessage());
            interfaceC5945j.a(e10);
        }
    }

    @Override // x8.InterfaceC7065e
    public void a(final AbstractC6289o abstractC6289o, final AbstractC6283i abstractC6283i, final InterfaceC5945j interfaceC5945j) {
        this.f64056b.execute(new Runnable() { // from class: x8.a
            @Override // java.lang.Runnable
            public final void run() {
                C7063c.c(this.f64047a, abstractC6289o, interfaceC5945j, abstractC6283i);
            }
        });
    }
}
