package B4;

import A4.m;
import B4.b;
import E4.c;
import G4.p;
import G4.q;
import Gf.AbstractC1613i;
import Gf.O;
import L4.j;
import L4.r;
import Td.L;
import Td.v;
import Ud.AbstractC2273n;
import ae.AbstractC2605b;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import v4.C6842a;
import v4.InterfaceC6843b;
import v4.InterfaceC6845d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements B4.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0017a f1478d = new C0017a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6845d f1479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f1480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E4.d f1481c;

    /* JADX INFO: renamed from: B4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0017a {
        public /* synthetic */ C0017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0017a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable f1482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f1483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x4.f f1484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f1485d;

        public b(Drawable drawable, boolean z10, x4.f fVar, String str) {
            this.f1482a = drawable;
            this.f1483b = z10;
            this.f1484c = fVar;
            this.f1485d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, x4.f fVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f1482a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f1483b;
            }
            if ((i10 & 4) != 0) {
                fVar = bVar.f1484c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f1485d;
            }
            return bVar.a(drawable, z10, fVar, str);
        }

        public final b a(Drawable drawable, boolean z10, x4.f fVar, String str) {
            return new b(drawable, z10, fVar, str);
        }

        public final x4.f c() {
            return this.f1484c;
        }

        public final String d() {
            return this.f1485d;
        }

        public final Drawable e() {
            return this.f1482a;
        }

        public final boolean f() {
            return this.f1483b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f1487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f1488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f1489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f1491f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f1492g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f1493h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f1494i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f1495j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f1497l;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1495j = obj;
            this.f1497l |= Integer.MIN_VALUE;
            return a.this.g(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f1499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f1500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f1501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f1503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f1504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f1505h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f1506i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f1508k;

        d(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1506i = obj;
            this.f1508k |= Integer.MIN_VALUE;
            return a.this.h(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1509a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f1511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f1512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ G4.h f1513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f1514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ N f1515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6843b f1516h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(N n10, N n11, G4.h hVar, Object obj, N n12, InterfaceC6843b interfaceC6843b, Zd.e eVar) {
            super(2, eVar);
            this.f1511c = n10;
            this.f1512d = n11;
            this.f1513e = hVar;
            this.f1514f = obj;
            this.f1515g = n12;
            this.f1516h = interfaceC6843b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new e(this.f1511c, this.f1512d, this.f1513e, this.f1514f, this.f1515g, this.f1516h, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f1509a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            a aVar = a.this;
            m mVar = (m) this.f1511c.f52259a;
            C6842a c6842a = (C6842a) this.f1512d.f52259a;
            G4.h hVar = this.f1513e;
            Object obj2 = this.f1514f;
            G4.m mVar2 = (G4.m) this.f1515g.f52259a;
            InterfaceC6843b interfaceC6843b = this.f1516h;
            this.f1509a = 1;
            Object objG = aVar.g(mVar, c6842a, hVar, obj2, mVar2, interfaceC6843b, this);
            return objG == objF ? objF : objG;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f1518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f1519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f1520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f1522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f1523g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1524h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f1525i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f1527k;

        f(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1525i = obj;
            this.f1527k |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f1529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f1530c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1532e;

        g(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1530c = obj;
            this.f1532e |= Integer.MIN_VALUE;
            return a.this.intercept(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1533a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ G4.h f1535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f1536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ G4.m f1537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6843b f1538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.b f1539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b.a f1540h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(G4.h hVar, Object obj, G4.m mVar, InterfaceC6843b interfaceC6843b, c.b bVar, b.a aVar, Zd.e eVar) {
            super(2, eVar);
            this.f1535c = hVar;
            this.f1536d = obj;
            this.f1537e = mVar;
            this.f1538f = interfaceC6843b;
            this.f1539g = bVar;
            this.f1540h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new h(this.f1535c, this.f1536d, this.f1537e, this.f1538f, this.f1539g, this.f1540h, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((h) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objH;
            Object objF = AbstractC2605b.f();
            int i10 = this.f1533a;
            if (i10 == 0) {
                v.b(obj);
                a aVar = a.this;
                G4.h hVar = this.f1535c;
                Object obj2 = this.f1536d;
                G4.m mVar = this.f1537e;
                InterfaceC6843b interfaceC6843b = this.f1538f;
                this.f1533a = 1;
                objH = aVar.h(hVar, obj2, mVar, interfaceC6843b, this);
                if (objH == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                objH = obj;
            }
            b bVar = (b) objH;
            boolean zH = a.this.f1481c.h(this.f1539g, this.f1535c, bVar);
            Drawable drawableE = bVar.e();
            G4.h hVar2 = this.f1535c;
            x4.f fVarC = bVar.c();
            c.b bVar2 = this.f1539g;
            if (!zH) {
                bVar2 = null;
            }
            return new q(drawableE, hVar2, fVarC, bVar2, bVar.d(), bVar.f(), j.s(this.f1540h));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f1542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f1546f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f1548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ G4.m f1549i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ List f1550j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC6843b f1551k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ G4.h f1552l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(b bVar, G4.m mVar, List list, InterfaceC6843b interfaceC6843b, G4.h hVar, Zd.e eVar) {
            super(2, eVar);
            this.f1548h = bVar;
            this.f1549i = mVar;
            this.f1550j = list;
            this.f1551k = interfaceC6843b;
            this.f1552l = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            i iVar = a.this.new i(this.f1548h, this.f1549i, this.f1550j, this.f1551k, this.f1552l, eVar);
            iVar.f1546f = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((i) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0070 -> B:13:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r10.f1545e
                r2 = 1
                if (r1 == 0) goto L27
                if (r1 != r2) goto L1f
                int r1 = r10.f1544d
                int r3 = r10.f1543c
                java.lang.Object r4 = r10.f1542b
                G4.m r4 = (G4.m) r4
                java.lang.Object r5 = r10.f1541a
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r10.f1546f
                Gf.O r6 = (Gf.O) r6
                Td.v.b(r11)
                goto L73
            L1f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L27:
                Td.v.b(r11)
                java.lang.Object r11 = r10.f1546f
                Gf.O r11 = (Gf.O) r11
                B4.a r1 = B4.a.this
                B4.a$b r3 = r10.f1548h
                android.graphics.drawable.Drawable r3 = r3.e()
                G4.m r4 = r10.f1549i
                java.util.List r5 = r10.f1550j
                android.graphics.Bitmap r1 = B4.a.a(r1, r3, r4, r5)
                v4.b r3 = r10.f1551k
                G4.h r4 = r10.f1552l
                r3.f(r4, r1)
                java.util.List r3 = r10.f1550j
                G4.m r4 = r10.f1549i
                int r5 = r3.size()
                r6 = 0
                r9 = r6
                r6 = r11
                r11 = r1
                r1 = r5
                r5 = r3
                r3 = r9
            L54:
                if (r3 >= r1) goto L7a
                java.lang.Object r7 = r5.get(r3)
                J4.a r7 = (J4.a) r7
                H4.h r8 = r4.n()
                r10.f1546f = r6
                r10.f1541a = r5
                r10.f1542b = r4
                r10.f1543c = r3
                r10.f1544d = r1
                r10.f1545e = r2
                java.lang.Object r11 = r7.b(r11, r8, r10)
                if (r11 != r0) goto L73
                return r0
            L73:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                Gf.P.f(r6)
                int r3 = r3 + r2
                goto L54
            L7a:
                v4.b r0 = r10.f1551k
                G4.h r1 = r10.f1552l
                r0.j(r1, r11)
                B4.a$b r2 = r10.f1548h
                G4.h r0 = r10.f1552l
                android.content.Context r0 = r0.l()
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
                r3.<init>(r0, r11)
                r7 = 14
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                B4.a$b r11 = B4.a.b.b(r2, r3, r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: B4.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(InterfaceC6845d interfaceC6845d, p pVar, r rVar) {
        this.f1479a = interfaceC6845d;
        this.f1480b = pVar;
        this.f1481c = new E4.d(interfaceC6845d, pVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap f(Drawable drawable, G4.m mVar, List list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (AbstractC2273n.R(j.n(), L4.a.c(bitmap))) {
                return bitmap;
            }
        }
        return L4.l.f11282a.a(drawable, mVar.f(), mVar.n(), mVar.m(), mVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(A4.m r8, v4.C6842a r9, G4.h r10, java.lang.Object r11, G4.m r12, v4.InterfaceC6843b r13, Zd.e r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.a.g(A4.m, v4.a, G4.h, java.lang.Object, G4.m, v4.b, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ff, code lost:
    
        if (r0 == r9) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(G4.h r33, java.lang.Object r34, G4.m r35, v4.InterfaceC6843b r36, Zd.e r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.a.h(G4.h, java.lang.Object, G4.m, v4.b, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(v4.C6842a r8, G4.h r9, java.lang.Object r10, G4.m r11, v4.InterfaceC6843b r12, Zd.e r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.a.i(v4.a, G4.h, java.lang.Object, G4.m, v4.b, Zd.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // B4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object intercept(B4.b.a r14, Zd.e r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof B4.a.g
            if (r0 == 0) goto L13
            r0 = r15
            B4.a$g r0 = (B4.a.g) r0
            int r1 = r0.f1532e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1532e = r1
            goto L18
        L13:
            B4.a$g r0 = new B4.a$g
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f1530c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f1532e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r14 = r0.f1529b
            B4.b$a r14 = (B4.b.a) r14
            java.lang.Object r0 = r0.f1528a
            r1 = r0
            B4.a r1 = (B4.a) r1
            Td.v.b(r15)     // Catch: java.lang.Throwable -> L32
            return r15
        L32:
            r0 = move-exception
            r15 = r0
            r5 = r13
            goto Lae
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3f:
            Td.v.b(r15)
            G4.h r6 = r14.c()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r15 = r6.m()     // Catch: java.lang.Throwable -> La9
            H4.h r2 = r14.getSize()     // Catch: java.lang.Throwable -> La9
            v4.b r9 = L4.j.g(r14)     // Catch: java.lang.Throwable -> La9
            G4.p r4 = r13.f1480b     // Catch: java.lang.Throwable -> La9
            G4.m r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> La9
            H4.g r4 = r8.m()     // Catch: java.lang.Throwable -> La9
            r9.m(r6, r15)     // Catch: java.lang.Throwable -> La9
            v4.d r5 = r13.f1479a     // Catch: java.lang.Throwable -> La9
            v4.a r5 = r5.getComponents()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> La9
            r9.l(r6, r7)     // Catch: java.lang.Throwable -> La9
            E4.d r15 = r13.f1481c     // Catch: java.lang.Throwable -> La9
            E4.c$b r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La9
            if (r10 == 0) goto L80
            E4.d r15 = r13.f1481c     // Catch: java.lang.Throwable -> L7b
            E4.c$c r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L7b
            goto L81
        L7b:
            r0 = move-exception
            r15 = r0
            r1 = r13
            r5 = r1
            goto Lae
        L80:
            r15 = 0
        L81:
            if (r15 == 0) goto L8a
            E4.d r0 = r13.f1481c     // Catch: java.lang.Throwable -> L7b
            G4.q r14 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L7b
            return r14
        L8a:
            Gf.K r15 = r6.v()     // Catch: java.lang.Throwable -> La9
            B4.a$h r4 = new B4.a$h     // Catch: java.lang.Throwable -> La9
            r12 = 0
            r5 = r13
            r11 = r14
            r4.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La4
            r0.f1528a = r5     // Catch: java.lang.Throwable -> La4
            r0.f1529b = r11     // Catch: java.lang.Throwable -> La4
            r0.f1532e = r3     // Catch: java.lang.Throwable -> La4
            java.lang.Object r14 = Gf.AbstractC1613i.g(r15, r4, r0)     // Catch: java.lang.Throwable -> La4
            if (r14 != r1) goto La3
            return r1
        La3:
            return r14
        La4:
            r0 = move-exception
            r15 = r0
            r1 = r5
            r14 = r11
            goto Lae
        La9:
            r0 = move-exception
            r5 = r13
            r11 = r14
            r15 = r0
            r1 = r5
        Lae:
            boolean r0 = r15 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lbd
            G4.p r0 = r1.f1480b
            G4.h r14 = r14.c()
            G4.f r14 = r0.b(r14, r15)
            return r14
        Lbd:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.a.intercept(B4.b$a, Zd.e):java.lang.Object");
    }

    public final Object j(b bVar, G4.h hVar, G4.m mVar, InterfaceC6843b interfaceC6843b, Zd.e eVar) {
        List listO = hVar.O();
        return listO.isEmpty() ? bVar : ((bVar.e() instanceof BitmapDrawable) || hVar.g()) ? AbstractC1613i.g(hVar.N(), new i(bVar, mVar, listO, interfaceC6843b, hVar, null), eVar) : bVar;
    }
}
