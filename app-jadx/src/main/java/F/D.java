package F;

import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.InterfaceC2425m;
import Y.X;
import Y.Y;
import Y.b2;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import h0.p;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class D implements h0.p, h0.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5989d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.p f5990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f5991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f5992c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0.p f5993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0.p pVar) {
            super(1);
            this.f5993a = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            h0.p pVar = this.f5993a;
            return Boolean.valueOf(pVar != null ? pVar.a(obj) : true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f5994a = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map invoke(h0.z zVar, D d10) {
                Map mapD = d10.d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
            }
        }

        /* JADX INFO: renamed from: F.D$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0062b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0.p f5995a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0062b(h0.p pVar) {
                super(1);
                this.f5995a = pVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D invoke(Map map) {
                return new D(this.f5995a, map);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h0.v a(h0.p pVar) {
            return h0.y.e(a.f5994a, new C0062b(pVar));
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f5997b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements X {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ D f5998a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f5999b;

            public a(D d10, Object obj) {
                this.f5998a = d10;
                this.f5999b = obj;
            }

            @Override // Y.X
            public void dispose() {
                this.f5998a.f5992c.add(this.f5999b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f5997b = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final X invoke(Y y10) {
            D.this.f5992c.remove(this.f5997b);
            return new a(D.this, this.f5997b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f6001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f6002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6003d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Function2 function2, int i10) {
            super(2);
            this.f6001b = obj;
            this.f6002c = function2;
            this.f6003d = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            D.this.c(this.f6001b, this.f6002c, interfaceC2425m, AbstractC2409g1.a(this.f6003d | 1));
        }
    }

    public D(h0.p pVar) {
        this.f5990a = pVar;
        this.f5991b = b2.e(null, null, 2, null);
        this.f5992c = new LinkedHashSet();
    }

    @Override // h0.p
    public boolean a(Object obj) {
        return this.f5990a.a(obj);
    }

    @Override // h0.g
    public void b(Object obj) {
        h0.g gVarH = h();
        if (gVarH == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        gVarH.b(obj);
    }

    @Override // h0.g
    public void c(Object obj, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-697180401);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(this) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-697180401, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            h0.g gVarH = h();
            if (gVarH == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            int i12 = i11 & 14;
            gVarH.c(obj, function2, interfaceC2425mG, i11 & 126);
            boolean zF = interfaceC2425mG.F(this) | interfaceC2425mG.F(obj);
            Object objD = interfaceC2425mG.D();
            if (zF || objD == InterfaceC2425m.f22370a.a()) {
                objD = new c(obj);
                interfaceC2425mG.u(objD);
            }
            AbstractC2393b0.b(obj, (Function1) objD, interfaceC2425mG, i12);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new d(obj, function2, i10));
        }
    }

    @Override // h0.p
    public Map d() {
        h0.g gVarH = h();
        if (gVarH != null) {
            Iterator it = this.f5992c.iterator();
            while (it.hasNext()) {
                gVarH.b(it.next());
            }
        }
        return this.f5990a.d();
    }

    @Override // h0.p
    public Object e(String str) {
        return this.f5990a.e(str);
    }

    @Override // h0.p
    public p.a f(String str, InterfaceC5082a interfaceC5082a) {
        return this.f5990a.f(str, interfaceC5082a);
    }

    public final h0.g h() {
        return (h0.g) this.f5991b.getValue();
    }

    public final void i(h0.g gVar) {
        this.f5991b.setValue(gVar);
    }

    public D(h0.p pVar, Map map) {
        this(h0.s.c(map, new a(pVar)));
    }
}
