package Q0;

import Gf.AbstractC1617k;
import Gf.O;
import Gf.O0;
import Gf.P;
import R0.s;
import R0.x;
import Td.C2160k;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import i1.C5023p;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import s0.s1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f14221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5023p f14222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f14223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f14224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O f14225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f14226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14227g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14228a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f14230c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, Zd.e eVar) {
            super(2, eVar);
            this.f14230c = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return c.this.new b(this.f14230c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f14228a;
            if (i10 == 0) {
                v.b(obj);
                g gVar = c.this.f14226f;
                this.f14228a = 1;
                if (gVar.g(0.0f, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            c.this.f14223c.b();
            this.f14230c.run();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Q0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0239c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14231a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f14233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Rect f14234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Consumer f14235e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0239c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, Zd.e eVar) {
            super(2, eVar);
            this.f14233c = scrollCaptureSession;
            this.f14234d = rect;
            this.f14235e = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return c.this.new C0239c(this.f14233c, this.f14234d, this.f14235e, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((C0239c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f14231a;
            if (i10 == 0) {
                v.b(obj);
                c cVar = c.this;
                ScrollCaptureSession scrollCaptureSession = this.f14233c;
                C5023p c5023pD = s1.d(this.f14234d);
                this.f14231a = 1;
                obj = cVar.e(scrollCaptureSession, c5023pD, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            this.f14235e.accept(s1.a((C5023p) obj));
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f14240e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f14242g;

        d(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14240e = obj;
            this.f14242g |= Integer.MIN_VALUE;
            return c.this.e(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f14244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ float f14246c;

        f(Zd.e eVar) {
            super(2, eVar);
        }

        public final Object a(float f10, Zd.e eVar) {
            return ((f) create(Float.valueOf(f10), eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            f fVar = c.this.new f(eVar);
            fVar.f14246c = ((Number) obj).floatValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), (Zd.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = AbstractC2605b.f();
            int i10 = this.f14245b;
            if (i10 == 0) {
                v.b(obj);
                float f10 = this.f14246c;
                Function2 function2C = m.c(c.this.f14221a);
                if (function2C == null) {
                    H0.a.c("Required value was null.");
                    throw new C2160k();
                }
                boolean zB = ((R0.j) c.this.f14221a.y().l(x.f15043a.O())).b();
                if (zB) {
                    f10 = -f10;
                }
                C6224f c6224fD = C6224f.d(C6224f.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)));
                this.f14244a = zB;
                this.f14245b = 1;
                obj = function2C.invoke(c6224fD, this);
                if (obj == objF) {
                    return objF;
                }
                z10 = zB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = this.f14244a;
                v.b(obj);
            }
            long jU = ((C6224f) obj).u();
            return kotlin.coroutines.jvm.internal.b.c(z10 ? -Float.intBitsToFloat((int) (jU & 4294967295L)) : Float.intBitsToFloat((int) (jU & 4294967295L)));
        }
    }

    public c(s sVar, C5023p c5023p, O o10, a aVar, View view) {
        this.f14221a = sVar;
        this.f14222b = c5023p;
        this.f14223c = aVar;
        this.f14224d = view;
        this.f14225e = P.h(o10, Q0.f.f14250a);
        this.f14226f = new g(c5023p.e(), new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.view.ScrollCaptureSession r8, i1.C5023p r9, Zd.e r10) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.c.e(android.view.ScrollCaptureSession, i1.p, Zd.e):java.lang.Object");
    }

    public void onScrollCaptureEnd(Runnable runnable) {
        AbstractC1617k.d(this.f14225e, O0.f7527b, null, new b(runnable, null), 2, null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        Q0.e.c(this.f14225e, cancellationSignal, new C0239c(scrollCaptureSession, rect, consumer, null));
    }

    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(s1.a(this.f14222b));
    }

    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f14226f.d();
        this.f14227g = 0;
        this.f14223c.a();
        runnable.run();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f14243a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return L.f17438a;
        }

        public final void a(long j10) {
        }
    }
}
