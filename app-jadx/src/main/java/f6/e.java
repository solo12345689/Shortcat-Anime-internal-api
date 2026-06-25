package f6;

import Td.AbstractC2163n;
import Td.r;
import android.os.Handler;
import android.os.HandlerThread;
import f6.l;
import ie.InterfaceC5082a;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f46908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f46909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicInteger f46910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f46911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f46912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f46913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Runnable f46914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Runnable f46915h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46916a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.f46944a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.f46945b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.f46946c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46916a = iArr;
        }
    }

    static {
        e eVar = new e();
        f46908a = eVar;
        f46909b = new AtomicInteger(0);
        f46910c = new AtomicInteger(0);
        f46911d = new AtomicInteger(0);
        f46912e = new ConcurrentHashMap();
        f46913f = AbstractC2163n.b(new InterfaceC5082a() { // from class: f6.b
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return e.g();
            }
        });
        Runnable runnable = new Runnable() { // from class: f6.c
            @Override // java.lang.Runnable
            public final void run() {
                e.d();
            }
        };
        f46914g = runnable;
        Runnable runnable2 = new Runnable() { // from class: f6.d
            @Override // java.lang.Runnable
            public final void run() {
                e.e();
            }
        };
        f46915h = runnable2;
        eVar.f().post(runnable);
        eVar.f().post(runnable2);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
        float andSet = f46909b.getAndSet(0);
        float andSet2 = f46910c.getAndSet(0);
        float andSet3 = f46911d.getAndSet(0);
        float f10 = andSet + andSet2 + andSet3;
        if (f10 > 0.0f) {
            float f11 = andSet / f10;
            float f12 = andSet3 / f10;
            if (andSet2 / f10 > 0.25f || f12 > 0.1f) {
                for (Map.Entry entry : f46912e.entrySet()) {
                    f46908a.k((i) entry.getKey(), -((Number) entry.getValue()).intValue());
                }
            } else if (f11 > 0.98f) {
                for (Map.Entry entry2 : f46912e.entrySet()) {
                    f46908a.k((i) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                }
            }
            f46912e.clear();
        }
        f46908a.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        k.f46937d.a(new Date(System.currentTimeMillis() - 10000));
        f46908a.i();
    }

    private final Handler f() {
        return (Handler) f46913f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler g() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    private final boolean i() {
        return f().postDelayed(f46915h, 10000L);
    }

    private final boolean j() {
        return f().postDelayed(f46914g, 2000L);
    }

    private final void k(i iVar, int i10) {
        int iM = AbstractC5874j.m(iVar.a() + i10, (int) AbstractC5874j.d(iVar.c() * 0.5f, 1.0f), iVar.c());
        if (iM != iVar.a()) {
            iVar.b(iM);
        }
    }

    public final void h(i animation, l frameResult) {
        AbstractC5504s.h(animation, "animation");
        AbstractC5504s.h(frameResult, "frameResult");
        ConcurrentHashMap concurrentHashMap = f46912e;
        if (!concurrentHashMap.contains(animation)) {
            concurrentHashMap.put(animation, Integer.valueOf((int) (animation.c() * 0.2f)));
        }
        int i10 = a.f46916a[frameResult.b().ordinal()];
        if (i10 == 1) {
            f46909b.incrementAndGet();
        } else if (i10 == 2) {
            f46910c.incrementAndGet();
        } else {
            if (i10 != 3) {
                throw new r();
            }
            f46911d.incrementAndGet();
        }
    }
}
