package Fd;

import android.os.Handler;
import android.os.Looper;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;

/* JADX INFO: renamed from: Fd.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1576o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f6644e = {kotlin.jvm.internal.O.e(new kotlin.jvm.internal.z(C1576o.class, "interval", "getInterval()J", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f6645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f6646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Gd.b f6647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6648d;

    public C1576o(InterfaceC1577p emitter) {
        AbstractC5504s.h(emitter, "emitter");
        this.f6645a = new WeakReference(emitter);
        this.f6646b = new Handler(Looper.getMainLooper());
        this.f6647c = new Gd.b(0L, null, new Function2() { // from class: Fd.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C1576o.e(this.f6641a, ((Long) obj).longValue(), (Long) obj2);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L e(C1576o c1576o, long j10, Long l10) {
        if (j10 <= 0) {
            c1576o.k();
        } else {
            c1576o.j();
        }
        return Td.L.f17438a;
    }

    private final void f() {
        if (d() <= 0) {
            return;
        }
        final InterfaceC5082a interfaceC5082a = new InterfaceC5082a() { // from class: Fd.m
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C1576o.g(this.f6642a);
            }
        };
        this.f6646b.postDelayed(new Runnable() { // from class: Fd.n
            @Override // java.lang.Runnable
            public final void run() {
                C1576o.h(interfaceC5082a);
            }
        }, d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L g(C1576o c1576o) {
        InterfaceC1577p interfaceC1577p = (InterfaceC1577p) c1576o.f6645a.get();
        if (interfaceC1577p != null) {
            interfaceC1577p.a();
        }
        c1576o.f();
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5082a interfaceC5082a) {
        interfaceC5082a.invoke();
    }

    private final void j() {
        if (this.f6648d) {
            this.f6646b.removeCallbacksAndMessages(null);
        } else {
            InterfaceC1577p interfaceC1577p = (InterfaceC1577p) this.f6645a.get();
            if (interfaceC1577p != null) {
                interfaceC1577p.a();
            }
        }
        this.f6648d = true;
        f();
    }

    private final void k() {
        this.f6646b.removeCallbacksAndMessages(null);
        this.f6648d = false;
    }

    public final long d() {
        return ((Number) this.f6647c.c(this, f6644e[0])).longValue();
    }

    public final void i(long j10) {
        this.f6647c.d(this, f6644e[0], Long.valueOf(j10));
    }
}
