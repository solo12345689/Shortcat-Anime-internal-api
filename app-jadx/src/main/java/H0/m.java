package h0;

import Td.L;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.C2397c1;
import Y.H;
import Y.InterfaceC2425m;
import Y.X;
import Y.Y;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6550P;
import t.d0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class m implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f47565e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v f47566f = y.e(new Function2() { // from class: h0.k
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return m.j((z) obj, (m) obj2);
        }
    }, new Function1() { // from class: h0.l
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return m.k((Map) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f47567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6550P f47568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p f47569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f47570d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a() {
            return m.f47566f;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements X {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f47572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f47573c;

        public b(Object obj, u uVar) {
            this.f47572b = obj;
            this.f47573c = uVar;
        }

        @Override // Y.X
        public void dispose() {
            Object objU = m.this.f47568b.u(this.f47572b);
            u uVar = this.f47573c;
            if (objU == uVar) {
                m mVar = m.this;
                mVar.r(uVar, mVar.f47567a, this.f47572b);
            }
        }
    }

    public m(Map map) {
        this.f47567a = map;
        this.f47568b = d0.b();
        this.f47570d = new Function1() { // from class: h0.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.p(this.f47557a, obj));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X h(m mVar, Object obj, u uVar, Y y10) {
        if (!mVar.f47568b.b(obj)) {
            mVar.f47567a.remove(obj);
            mVar.f47568b.x(obj, uVar);
            return mVar.new b(obj, uVar);
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L i(m mVar, Object obj, Function2 function2, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        mVar.c(obj, function2, interfaceC2425m, AbstractC2409g1.a(i10 | 1));
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j(z zVar, m mVar) {
        return mVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m k(Map map) {
        return new m(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(m mVar, Object obj) {
        p pVar = mVar.f47569c;
        if (pVar != null) {
            return pVar.a(obj);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Map q() {
        /*
            r17 = this;
            r0 = r17
            java.util.Map r1 = r0.f47567a
            t.P r2 = r0.f47568b
            java.lang.Object[] r3 = r2.f60044b
            java.lang.Object[] r4 = r2.f60045c
            long[] r2 = r2.f60043a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L4f
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L48
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L44
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            h0.p r13 = (h0.p) r13
            r0.r(r13, r1, r14)
        L44:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L48:
            if (r10 != r11) goto L4f
        L4a:
            if (r7 == r5) goto L4f
            int r7 = r7 + 1
            goto L13
        L4f:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L56
            r1 = 0
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.q():java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(p pVar, Map map, Object obj) {
        Map mapD = pVar.d();
        if (mapD.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapD);
        }
    }

    @Override // h0.g
    public void b(Object obj) {
        if (this.f47568b.u(obj) == null) {
            this.f47567a.remove(obj);
        }
    }

    @Override // h0.g
    public void c(final Object obj, final Function2 function2, InterfaceC2425m interfaceC2425m, final int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(533563200);
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
        if (interfaceC2425mG.p((i11 & 147) != 146, i11 & 1)) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(533563200, i11, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            interfaceC2425mG.J(207, obj);
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                if (!((Boolean) this.f47570d.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objD = new u(s.c((Map) this.f47567a.get(obj), this.f47570d));
                interfaceC2425mG.u(objD);
            }
            final u uVar = (u) objD;
            H.d(new C2397c1[]{s.g().d(uVar), Q3.b.c().d(uVar)}, function2, interfaceC2425mG, (i11 & 112) | C2397c1.f22274i);
            L l10 = L.f17438a;
            boolean zF = interfaceC2425mG.F(this) | interfaceC2425mG.F(obj) | interfaceC2425mG.F(uVar);
            Object objD2 = interfaceC2425mG.D();
            if (zF || objD2 == aVar.a()) {
                objD2 = new Function1() { // from class: h0.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return m.h(this.f47558a, obj, uVar, (Y) obj2);
                    }
                };
                interfaceC2425mG.u(objD2);
            }
            AbstractC2393b0.b(l10, (Function1) objD2, interfaceC2425mG, 6);
            interfaceC2425mG.B();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        } else {
            interfaceC2425mG.K();
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new Function2() { // from class: h0.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return m.i(this.f47561a, obj, function2, i10, (InterfaceC2425m) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final void s(p pVar) {
        this.f47569c = pVar;
    }

    public /* synthetic */ m(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
