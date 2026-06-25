package E0;

import Gf.AbstractC1617k;
import Gf.C0;
import Gf.C1627p;
import Gf.InterfaceC1623n;
import K0.AbstractC1796k;
import Td.u;
import a0.C2507c;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.A1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5025r;
import i1.InterfaceC5011d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6230l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Y extends e.c implements X, L, InterfaceC5011d {

    /* JADX INFO: renamed from: a */
    private Object f4096a;

    /* JADX INFO: renamed from: b */
    private Object f4097b;

    /* JADX INFO: renamed from: c */
    private Object[] f4098c;

    /* JADX INFO: renamed from: d */
    private Function2 f4099d;

    /* JADX INFO: renamed from: e */
    private PointerInputEventHandler f4100e;

    /* JADX INFO: renamed from: f */
    private C0 f4101f;

    /* JADX INFO: renamed from: g */
    private C1307q f4102g;

    /* JADX INFO: renamed from: h */
    private final C2507c f4103h;

    /* JADX INFO: renamed from: i */
    private final Object f4104i;

    /* JADX INFO: renamed from: j */
    private final C2507c f4105j;

    /* JADX INFO: renamed from: k */
    private C1307q f4106k;

    /* JADX INFO: renamed from: l */
    private long f4107l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a */
        public static final a f4108a = new a();

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(L l10, Zd.e eVar) {
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements InterfaceC1292b, InterfaceC5011d, Zd.e {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Y f4109a;

        /* JADX INFO: renamed from: b */
        private final Zd.e f4110b;

        /* JADX INFO: renamed from: c */
        private InterfaceC1623n f4111c;

        /* JADX INFO: renamed from: d */
        private EnumC1308s f4112d = EnumC1308s.f4179b;

        /* JADX INFO: renamed from: e */
        private final Zd.i f4113e = Zd.j.f23275a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a */
            Object f4115a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f4116b;

            /* JADX INFO: renamed from: d */
            int f4118d;

            a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4116b = obj;
                this.f4118d |= Integer.MIN_VALUE;
                return b.this.K(0L, null, this);
            }
        }

        /* JADX INFO: renamed from: E0.Y$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0047b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f4119a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ long f4120b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ b f4121c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0047b(long j10, b bVar, Zd.e eVar) {
                super(2, eVar);
                this.f4120b = j10;
                this.f4121c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0047b(this.f4120b, this.f4121c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((C0047b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
            
                if (Gf.Z.a(8, r8) == r0) goto L36;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = ae.AbstractC2605b.f()
                    int r1 = r8.f4119a
                    r2 = 8
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    Td.v.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    Td.v.b(r9)
                    goto L2f
                L20:
                    Td.v.b(r9)
                    long r6 = r8.f4120b
                    long r6 = r6 - r2
                    r8.f4119a = r5
                    java.lang.Object r9 = Gf.Z.a(r6, r8)
                    if (r9 != r0) goto L2f
                    goto L37
                L2f:
                    r8.f4119a = r4
                    java.lang.Object r9 = Gf.Z.a(r2, r8)
                    if (r9 != r0) goto L38
                L37:
                    return r0
                L38:
                    E0.Y$b r9 = r8.f4121c
                    Gf.n r9 = E0.Y.b.q(r9)
                    if (r9 == 0) goto L54
                    Td.u$a r0 = Td.u.f17466b
                    E0.t r0 = new E0.t
                    long r1 = r8.f4120b
                    r0.<init>(r1)
                    java.lang.Object r0 = Td.v.a(r0)
                    java.lang.Object r0 = Td.u.b(r0)
                    r9.resumeWith(r0)
                L54:
                    Td.L r9 = Td.L.f17438a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: E0.Y.b.C0047b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a */
            /* synthetic */ Object f4122a;

            /* JADX INFO: renamed from: c */
            int f4124c;

            c(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4122a = obj;
                this.f4124c |= Integer.MIN_VALUE;
                return b.this.d1(0L, null, this);
            }
        }

        public b(Zd.e eVar) {
            this.f4109a = Y.this;
            this.f4110b = eVar;
        }

        @Override // i1.InterfaceC5011d
        public float A(int i10) {
            return this.f4109a.A(i10);
        }

        @Override // E0.InterfaceC1292b
        public C1307q F0() {
            return Y.this.f4102g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [Gf.C0] */
        /* JADX WARN: Type inference failed for: r11v3, types: [Gf.C0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function2] */
        @Override // E0.InterfaceC1292b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object K(long r11, kotlin.jvm.functions.Function2 r13, Zd.e r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof E0.Y.b.a
                if (r0 == 0) goto L13
                r0 = r14
                E0.Y$b$a r0 = (E0.Y.b.a) r0
                int r1 = r0.f4118d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f4118d = r1
                goto L18
            L13:
                E0.Y$b$a r0 = new E0.Y$b$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f4116b
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f4118d
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r11 = r0.f4115a
                Gf.C0 r11 = (Gf.C0) r11
                Td.v.b(r14)     // Catch: java.lang.Throwable -> L2d
                goto L76
            L2d:
                r0 = move-exception
                r12 = r0
                goto L7c
            L30:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L38:
                Td.v.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L57
                Gf.n r14 = r10.f4111c
                if (r14 == 0) goto L57
                Td.u$a r2 = Td.u.f17466b
                E0.t r2 = new E0.t
                r2.<init>(r11)
                java.lang.Object r2 = Td.v.a(r2)
                java.lang.Object r2 = Td.u.b(r2)
                r14.resumeWith(r2)
            L57:
                E0.Y r14 = E0.Y.this
                Gf.O r4 = r14.getCoroutineScope()
                E0.Y$b$b r7 = new E0.Y$b$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                Gf.C0 r11 = Gf.AbstractC1613i.d(r4, r5, r6, r7, r8, r9)
                r0.f4115a = r11     // Catch: java.lang.Throwable -> L2d
                r0.f4118d = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L76
                return r1
            L76:
                E0.c r12 = E0.C1293c.f4130a
                r11.k(r12)
                return r14
            L7c:
                E0.c r13 = E0.C1293c.f4130a
                r11.k(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: E0.Y.b.K(long, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
        }

        @Override // i1.InterfaceC5019l
        public long O(float f10) {
            return this.f4109a.O(f10);
        }

        @Override // i1.InterfaceC5011d
        public long Q(long j10) {
            return this.f4109a.Q(j10);
        }

        @Override // i1.InterfaceC5019l
        public float T(long j10) {
            return this.f4109a.T(j10);
        }

        public final void W(Throwable th2) {
            InterfaceC1623n interfaceC1623n = this.f4111c;
            if (interfaceC1623n != null) {
                interfaceC1623n.L(th2);
            }
            this.f4111c = null;
        }

        public final void Y(C1307q c1307q, EnumC1308s enumC1308s) {
            InterfaceC1623n interfaceC1623n;
            if (enumC1308s != this.f4112d || (interfaceC1623n = this.f4111c) == null) {
                return;
            }
            this.f4111c = null;
            interfaceC1623n.resumeWith(Td.u.b(c1307q));
        }

        @Override // E0.InterfaceC1292b
        public long a() {
            return Y.this.f4107l;
        }

        @Override // i1.InterfaceC5011d
        public long d0(float f10) {
            return this.f4109a.d0(f10);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
        @Override // E0.InterfaceC1292b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object d1(long r5, kotlin.jvm.functions.Function2 r7, Zd.e r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof E0.Y.b.c
                if (r0 == 0) goto L13
                r0 = r8
                E0.Y$b$c r0 = (E0.Y.b.c) r0
                int r1 = r0.f4124c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f4124c = r1
                goto L18
            L13:
                E0.Y$b$c r0 = new E0.Y$b$c
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f4122a
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f4124c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Td.v.b(r8)     // Catch: E0.C1309t -> L3e
                return r8
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Td.v.b(r8)
                r0.f4124c = r3     // Catch: E0.C1309t -> L3e
                java.lang.Object r5 = r4.K(r5, r7, r0)     // Catch: E0.C1309t -> L3e
                if (r5 != r1) goto L3d
                return r1
            L3d:
                return r5
            L3e:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: E0.Y.b.d1(long, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
        }

        @Override // i1.InterfaceC5011d
        public float e1(float f10) {
            return this.f4109a.e1(f10);
        }

        @Override // Zd.e
        public Zd.i getContext() {
            return this.f4113e;
        }

        @Override // i1.InterfaceC5011d
        public float getDensity() {
            return this.f4109a.getDensity();
        }

        @Override // E0.InterfaceC1292b
        public A1 getViewConfiguration() {
            return Y.this.getViewConfiguration();
        }

        @Override // i1.InterfaceC5019l
        public float j1() {
            return this.f4109a.j1();
        }

        @Override // i1.InterfaceC5011d
        public float l1(float f10) {
            return this.f4109a.l1(f10);
        }

        @Override // E0.InterfaceC1292b
        public long n0() {
            return Y.this.n0();
        }

        @Override // E0.InterfaceC1292b
        public Object p0(EnumC1308s enumC1308s, Zd.e eVar) {
            C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
            c1627p.C();
            this.f4112d = enumC1308s;
            this.f4111c = c1627p;
            Object objV = c1627p.v();
            if (objV == AbstractC2605b.f()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objV;
        }

        @Override // Zd.e
        public void resumeWith(Object obj) {
            Object obj2 = Y.this.f4104i;
            Y y10 = Y.this;
            synchronized (obj2) {
                y10.f4103h.w(this);
                Td.L l10 = Td.L.f17438a;
            }
            this.f4110b.resumeWith(obj);
        }

        @Override // i1.InterfaceC5011d
        public int s0(float f10) {
            return this.f4109a.s0(f10);
        }

        @Override // i1.InterfaceC5011d
        public long w1(long j10) {
            return this.f4109a.w1(j10);
        }

        @Override // i1.InterfaceC5011d
        public float z0(long j10) {
            return this.f4109a.z0(j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4125a;

        static {
            int[] iArr = new int[EnumC1308s.values().length];
            try {
                iArr[EnumC1308s.f4178a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1308s.f4180c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1308s.f4179b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4125a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ b f4126a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.f4126a = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Td.L.f17438a;
        }

        public final void invoke(Throwable th2) {
            this.f4126a.W(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f4127a;

        e(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return Y.this.new e(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0037, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x004a, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r4.f4127a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                Td.v.b(r5)
                goto L4b
            L1b:
                Td.v.b(r5)
                E0.Y r5 = E0.Y.this
                kotlin.jvm.functions.Function2 r5 = E0.Y.I1(r5)
                if (r5 == 0) goto L3a
                E0.Y r5 = E0.Y.this
                kotlin.jvm.functions.Function2 r5 = E0.Y.I1(r5)
                kotlin.jvm.internal.AbstractC5504s.e(r5)
                E0.Y r1 = E0.Y.this
                r4.f4127a = r3
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L4b
                goto L4a
            L3a:
                E0.Y r5 = E0.Y.this
                androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = r5.K1()
                E0.Y r1 = E0.Y.this
                r4.f4127a = r2
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L4b
            L4a:
                return r0
            L4b:
                Td.L r5 = Td.L.f17438a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: E0.Y.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Y(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f4096a = obj;
        this.f4097b = obj2;
        this.f4098c = objArr;
        this.f4100e = pointerInputEventHandler;
        this.f4102g = V.f4093a;
        C2507c c2507c = new C2507c(new b[16], 0);
        this.f4103h = c2507c;
        this.f4104i = c2507c;
        this.f4105j = new C2507c(new b[16], 0);
        this.f4107l = C5025r.f48570b.a();
    }

    private final void J1(C1307q c1307q, EnumC1308s enumC1308s) {
        synchronized (this.f4104i) {
            C2507c c2507c = this.f4105j;
            c2507c.d(c2507c.p(), this.f4103h);
        }
        try {
            int i10 = c.f4125a[enumC1308s.ordinal()];
            if (i10 == 1 || i10 == 2) {
                C2507c c2507c2 = this.f4105j;
                Object[] objArr = c2507c2.f23496a;
                int iP = c2507c2.p();
                for (int i11 = 0; i11 < iP; i11++) {
                    ((b) objArr[i11]).Y(c1307q, enumC1308s);
                }
            } else {
                if (i10 != 3) {
                    throw new Td.r();
                }
                C2507c c2507c3 = this.f4105j;
                int iP2 = c2507c3.p() - 1;
                Object[] objArr2 = c2507c3.f23496a;
                if (iP2 < objArr2.length) {
                    while (iP2 >= 0) {
                        ((b) objArr2[iP2]).Y(c1307q, enumC1308s);
                        iP2--;
                    }
                }
            }
            this.f4105j.i();
        } catch (Throwable th2) {
            this.f4105j.i();
            throw th2;
        }
    }

    @Override // E0.X
    public void C0() {
        C0 c02 = this.f4101f;
        if (c02 != null) {
            c02.k(new K());
            this.f4101f = null;
        }
    }

    public PointerInputEventHandler K1() {
        return this.f4100e;
    }

    public final void L1(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        boolean z10 = !AbstractC5504s.c(this.f4096a, obj);
        this.f4096a = obj;
        if (!AbstractC5504s.c(this.f4097b, obj2)) {
            z10 = true;
        }
        this.f4097b = obj2;
        Object[] objArr2 = this.f4098c;
        if (objArr2 != null && objArr == null) {
            z10 = true;
        }
        if (objArr2 == null && objArr != null) {
            z10 = true;
        }
        if (objArr2 != null && objArr != null && !Arrays.equals(objArr, objArr2)) {
            z10 = true;
        }
        this.f4098c = objArr;
        if (K1().getClass() == pointerInputEventHandler.getClass() ? z10 : true) {
            C0();
        }
        this.f4100e = pointerInputEventHandler;
    }

    @Override // K0.v0
    public void S(C1307q c1307q, EnumC1308s enumC1308s, long j10) {
        this.f4107l = j10;
        if (enumC1308s == EnumC1308s.f4178a) {
            this.f4102g = c1307q;
        }
        if (this.f4101f == null) {
            this.f4101f = AbstractC1617k.d(getCoroutineScope(), null, Gf.Q.f7532d, new e(null), 1, null);
        }
        J1(c1307q, enumC1308s);
        List listC = c1307q.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!r.d((C) listC.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            c1307q = null;
        }
        this.f4106k = c1307q;
    }

    public long a() {
        return this.f4107l;
    }

    @Override // K0.v0
    public void a1() {
        C1307q c1307q = this.f4106k;
        if (c1307q == null) {
            return;
        }
        List listC = c1307q.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C) listC.get(i10)).i()) {
                List listC2 = c1307q.c();
                ArrayList arrayList = new ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    C c10 = (C) listC2.get(i11);
                    arrayList.add(new C(c10.f(), c10.o(), c10.h(), false, c10.j(), c10.o(), c10.h(), c10.i(), c10.i(), c10.n(), 0L, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, (DefaultConstructorMarker) null));
                }
                C1307q c1307q2 = new C1307q(arrayList);
                this.f4102g = c1307q2;
                J1(c1307q2, EnumC1308s.f4178a);
                J1(c1307q2, EnumC1308s.f4179b);
                J1(c1307q2, EnumC1308s.f4180c);
                this.f4106k = null;
                return;
            }
        }
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return AbstractC1796k.n(this).R().getDensity();
    }

    @Override // E0.L
    public A1 getViewConfiguration() {
        return AbstractC1796k.n(this).E0();
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return AbstractC1796k.n(this).R().j1();
    }

    @Override // E0.L
    public Object k1(Function2 function2, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        b bVar = new b(c1627p);
        synchronized (this.f4104i) {
            this.f4103h.c(bVar);
            Zd.e eVarA = Zd.g.a(function2, bVar, bVar);
            u.a aVar = Td.u.f17466b;
            eVarA.resumeWith(Td.u.b(Td.L.f17438a));
        }
        c1627p.p(new d(bVar));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    public long n0() {
        long jW1 = w1(getViewConfiguration().e());
        long jA = a();
        return C6230l.d((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jW1 >> 32)) - ((int) (jA >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jW1 & 4294967295L)) - ((int) (jA & 4294967295L))) / 2.0f)) & 4294967295L));
    }

    @Override // K0.InterfaceC1794j, K0.v0
    public void onDensityChange() {
        C0();
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        C0();
        super.onDetach();
    }

    @Override // K0.v0
    public void x1() {
        C0();
    }

    public Y(Object obj, Object obj2, Object[] objArr, Function2 function2) {
        this(obj, obj2, objArr, a.f4108a);
        this.f4099d = function2;
    }
}
