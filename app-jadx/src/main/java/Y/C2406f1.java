package Y;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6545K;
import t.C6550P;

/* JADX INFO: renamed from: Y.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2406f1 implements B1, InterfaceC2400d1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f22312h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22313i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC2412h1 f22314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2392b f22316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Function2 f22317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C6545K f22319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C6550P f22320g;

    /* JADX INFO: renamed from: Y.f1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(H1 h12, List list, InterfaceC2412h1 interfaceC2412h1) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objW0 = h12.W0((C2392b) list.get(i10), 0);
                C2406f1 c2406f1 = objW0 instanceof C2406f1 ? (C2406f1) objW0 : null;
                if (c2406f1 != null) {
                    c2406f1.c(interfaceC2412h1);
                }
            }
        }

        private a() {
        }
    }

    public C2406f1(InterfaceC2412h1 interfaceC2412h1) {
        this.f22314a = interfaceC2412h1;
    }

    private final void J(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | 32 : i10 & (-33);
    }

    private final void N(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | 16 : i10 & (-17);
    }

    private final boolean d(U u10, C6550P c6550p) {
        AbstractC5504s.f(u10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        T1 t1D = u10.d();
        if (t1D == null) {
            t1D = U1.q();
        }
        return !t1D.b(u10.o().a(), c6550p.e(u10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Td.L g(Y.C2406f1 r18, int r19, t.C6545K r20, Y.InterfaceC2457x r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            int r4 = r0.f22318e
            if (r4 != r1) goto L8a
            t.K r4 = r0.f22319f
            boolean r4 = kotlin.jvm.internal.AbstractC5504s.c(r2, r4)
            if (r4 == 0) goto L8a
            boolean r4 = r3 instanceof Y.B
            if (r4 == 0) goto L8a
            long[] r4 = r2.f60000a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8a
            r7 = 0
        L20:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L85
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L3a:
            if (r12 >= r10) goto L82
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L79
            int r13 = r7 << 3
            int r13 = r13 + r12
            java.lang.Object[] r14 = r2.f60001b
            r14 = r14[r13]
            int[] r15 = r2.f60002c
            r15 = r15[r13]
            if (r15 == r1) goto L54
            r15 = 1
            goto L55
        L54:
            r15 = 0
        L55:
            if (r15 == 0) goto L71
            r6 = r3
            Y.B r6 = (Y.B) r6
            r6.V(r14, r0)
            r17 = r11
            boolean r11 = r14 instanceof Y.U
            if (r11 == 0) goto L73
            r11 = r14
            Y.U r11 = (Y.U) r11
            r6.U(r11)
            t.P r6 = r0.f22320g
            if (r6 == 0) goto L73
            r6.u(r14)
            goto L73
        L71:
            r17 = r11
        L73:
            if (r15 == 0) goto L7b
            r2.s(r13)
            goto L7b
        L79:
            r17 = r11
        L7b:
            long r8 = r8 >> r17
            int r12 = r12 + 1
            r11 = r17
            goto L3a
        L82:
            r6 = r11
            if (r10 != r6) goto L8a
        L85:
            if (r7 == r5) goto L8a
            int r7 = r7 + 1
            goto L20
        L8a:
            Td.L r0 = Td.L.f17438a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2406f1.g(Y.f1, int, t.K, Y.x):Td.L");
    }

    private final boolean o() {
        return (this.f22315b & 32) != 0;
    }

    public final void A() {
        InterfaceC2412h1 interfaceC2412h1 = this.f22314a;
        if (interfaceC2412h1 != null) {
            interfaceC2412h1.g(this);
        }
        this.f22314a = null;
        this.f22319f = null;
        this.f22320g = null;
        this.f22317d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B() {
        /*
            r17 = this;
            r1 = r17
            Y.h1 r0 = r1.f22314a
            if (r0 == 0) goto L60
            t.K r2 = r1.f22319f
            if (r2 == 0) goto L60
            r3 = 1
            r1.J(r3)
            r3 = 0
            java.lang.Object[] r4 = r2.f60001b     // Catch: java.lang.Throwable -> L4b
            int[] r5 = r2.f60002c     // Catch: java.lang.Throwable -> L4b
            long[] r2 = r2.f60000a     // Catch: java.lang.Throwable -> L4b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L4b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L58
            r7 = r3
        L1b:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L4b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L4b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L53
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L4b
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L35:
            if (r12 >= r10) goto L51
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L4b
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L4b
            r0.a(r14)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L35
        L51:
            if (r10 != r11) goto L58
        L53:
            if (r7 == r6) goto L58
            int r7 = r7 + 1
            goto L1b
        L58:
            r1.J(r3)
            return
        L5c:
            r1.J(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2406f1.B():void");
    }

    public final void C() {
        if (r()) {
            return;
        }
        N(true);
    }

    public final void D(C2392b c2392b) {
        this.f22316c = c2392b;
    }

    public final void E(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | 2 : i10 & (-3);
    }

    public final void F(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | 4 : i10 & (-5);
    }

    public final void G(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | 64 : i10 & (-65);
    }

    public final void H(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : i10 & (-257);
    }

    public final void I(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | 8 : i10 & (-9);
    }

    public final void K(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET : i10 & (-1025);
    }

    public final void L(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING : i10 & (-513);
    }

    public final void M(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | 128 : i10 & (-129);
    }

    public final void O(boolean z10) {
        int i10 = this.f22315b;
        this.f22315b = z10 ? i10 | 1 : i10 & (-2);
    }

    public final void P(int i10) {
        this.f22318e = i10;
        N(false);
    }

    @Override // Y.B1
    public void a(Function2 function2) {
        this.f22317d = function2;
    }

    public final void c(InterfaceC2412h1 interfaceC2412h1) {
        this.f22314a = interfaceC2412h1;
    }

    public final void e(InterfaceC2425m interfaceC2425m) {
        Function2 function2 = this.f22317d;
        if (function2 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        function2.invoke(interfaceC2425m, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.jvm.functions.Function1 f(final int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            t.K r2 = r0.f22319f
            r3 = 0
            if (r2 == 0) goto L5b
            boolean r4 = r0.s()
            if (r4 != 0) goto L5b
            java.lang.Object[] r4 = r2.f60001b
            int[] r5 = r2.f60002c
            long[] r6 = r2.f60000a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L5b
            r8 = 0
            r9 = r8
        L1c:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L56
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L36:
            if (r14 >= r12) goto L54
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L50
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r4[r15]
            r15 = r5[r15]
            if (r15 == r1) goto L50
            Y.e1 r3 = new Y.e1
            r3.<init>()
            return r3
        L50:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L36
        L54:
            if (r12 != r13) goto L5b
        L56:
            if (r9 == r7) goto L5b
            int r9 = r9 + 1
            goto L1c
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2406f1.f(int):kotlin.jvm.functions.Function1");
    }

    public final C2392b h() {
        return this.f22316c;
    }

    public final boolean i() {
        return this.f22317d != null;
    }

    @Override // Y.InterfaceC2400d1
    public void invalidate() {
        InterfaceC2412h1 interfaceC2412h1 = this.f22314a;
        if (interfaceC2412h1 != null) {
            interfaceC2412h1.w(this, null);
        }
    }

    public final boolean j() {
        return (this.f22315b & 2) != 0;
    }

    public final boolean k() {
        return (this.f22315b & 4) != 0;
    }

    public final boolean l() {
        return (this.f22315b & 64) != 0;
    }

    public final boolean m() {
        return (this.f22315b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
    }

    public final boolean n() {
        return (this.f22315b & 8) != 0;
    }

    public final boolean p() {
        return (this.f22315b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
    }

    public final boolean q() {
        return (this.f22315b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
    }

    public final boolean r() {
        return (this.f22315b & 128) != 0;
    }

    public final boolean s() {
        return (this.f22315b & 16) != 0;
    }

    public final boolean t() {
        return (this.f22315b & 1) != 0;
    }

    public final boolean u() {
        if (this.f22314a != null) {
            C2392b c2392b = this.f22316c;
            if (c2392b != null ? c2392b.b() : false) {
                return true;
            }
        }
        return false;
    }

    public final EnumC2423l0 v(Object obj) {
        EnumC2423l0 enumC2423l0W;
        InterfaceC2412h1 interfaceC2412h1 = this.f22314a;
        return (interfaceC2412h1 == null || (enumC2423l0W = interfaceC2412h1.w(this, obj)) == null) ? EnumC2423l0.f22361a : enumC2423l0W;
    }

    public final boolean w() {
        return this.f22320g != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != 0) goto L8
            return r2
        L8:
            t.P r3 = r0.f22320g
            if (r3 != 0) goto Ld
            return r2
        Ld:
            boolean r4 = r1 instanceof Y.U
            if (r4 == 0) goto L18
            Y.U r1 = (Y.U) r1
            boolean r1 = r0.d(r1, r3)
            return r1
        L18:
            boolean r4 = r1 instanceof t.e0
            if (r4 == 0) goto L72
            t.e0 r1 = (t.e0) r1
            boolean r4 = r1.e()
            r5 = 0
            if (r4 == 0) goto L71
            java.lang.Object[] r4 = r1.f60055b
            long[] r1 = r1.f60054a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L71
            r7 = r5
        L2f:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L49:
            if (r12 >= r10) goto L6a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            boolean r14 = r13 instanceof Y.U
            if (r14 == 0) goto L65
            Y.U r13 = (Y.U) r13
            boolean r13 = r0.d(r13, r3)
            if (r13 == 0) goto L66
        L65:
            return r2
        L66:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L49
        L6a:
            if (r10 != r11) goto L71
        L6c:
            if (r7 == r6) goto L71
            int r7 = r7 + 1
            goto L2f
        L71:
            return r5
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2406f1.x(java.lang.Object):boolean");
    }

    public final void y(U u10, Object obj) {
        C6550P c6550p = this.f22320g;
        if (c6550p == null) {
            c6550p = new C6550P(0, 1, null);
            this.f22320g = c6550p;
        }
        c6550p.x(u10, obj);
    }

    public final boolean z(Object obj) {
        if (o()) {
            return false;
        }
        C6545K c6545k = this.f22319f;
        if (c6545k == null) {
            c6545k = new C6545K(0, 1, null);
            this.f22319f = c6545k;
        }
        return c6545k.q(obj, this.f22318e, -1) == this.f22318e;
    }
}
