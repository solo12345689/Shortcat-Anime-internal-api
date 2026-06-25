package K;

import U0.T0;
import U0.W0;
import U0.Y0;
import Y.AbstractC2409g1;
import Y.C0;
import Y.InterfaceC2425m;
import a1.C2527U;
import i1.AbstractC5016i;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6358h0;

/* JADX INFO: renamed from: K.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1753c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final M.b f9916a = e.f9943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f9917b;

    /* JADX INFO: renamed from: K.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9918a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T0) obj);
            return Td.L.f17438a;
        }

        public final void invoke(T0 t02) {
        }
    }

    /* JADX INFO: renamed from: K.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2527U f9919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0 f9920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2527U c2527u, C0 c02) {
            super(0);
            this.f9919a = c2527u;
            this.f9920b = c02;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m11invoke() {
            if (W0.g(this.f9919a.k(), AbstractC1753c.b(this.f9920b).k()) && AbstractC5504s.c(this.f9919a.j(), AbstractC1753c.b(this.f9920b).j())) {
                return;
            }
            AbstractC1753c.c(this.f9920b, this.f9919a);
        }
    }

    /* JADX INFO: renamed from: K.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0154c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f9921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0 f9922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0 f9923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0154c(Function1 function1, C0 c02, C0 c03) {
            super(1);
            this.f9921a = function1;
            this.f9922b = c02;
            this.f9923c = c03;
        }

        public final void a(C2527U c2527u) {
            AbstractC1753c.c(this.f9922b, c2527u);
            boolean zC = AbstractC5504s.c(AbstractC1753c.d(this.f9923c), c2527u.l());
            AbstractC1753c.e(this.f9923c, c2527u.l());
            if (zC) {
                return;
            }
            this.f9921a.invoke(c2527u.l());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2527U) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: K.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f9925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f9926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y0 f9929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C1773x f9930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ C1772w f9931h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f9932i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f9933j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f9934k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ a1.f0 f9935l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1 f9936m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ B.m f9937n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ AbstractC6358h0 f9938o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f9939p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f9940q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f9941r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f9942s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Function1 function1, androidx.compose.ui.e eVar, boolean z10, boolean z11, Y0 y02, C1773x c1773x, C1772w c1772w, boolean z12, int i10, int i11, a1.f0 f0Var, Function1 function12, B.m mVar, AbstractC6358h0 abstractC6358h0, InterfaceC5096o interfaceC5096o, int i12, int i13, int i14) {
            super(2);
            this.f9924a = str;
            this.f9925b = function1;
            this.f9926c = eVar;
            this.f9927d = z10;
            this.f9928e = z11;
            this.f9929f = y02;
            this.f9930g = c1773x;
            this.f9931h = c1772w;
            this.f9932i = z12;
            this.f9933j = i10;
            this.f9934k = i11;
            this.f9935l = f0Var;
            this.f9936m = function12;
            this.f9937n = mVar;
            this.f9938o = abstractC6358h0;
            this.f9939p = interfaceC5096o;
            this.f9940q = i12;
            this.f9941r = i13;
            this.f9942s = i14;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1753c.a(this.f9924a, this.f9925b, this.f9926c, this.f9927d, this.f9928e, this.f9929f, this.f9930g, this.f9931h, this.f9932i, this.f9933j, this.f9934k, this.f9935l, this.f9936m, this.f9937n, this.f9938o, this.f9939p, interfaceC2425m, AbstractC2409g1.a(this.f9940q | 1), AbstractC2409g1.a(this.f9941r), this.f9942s);
        }
    }

    /* JADX INFO: renamed from: K.c$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e implements M.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f9943a = new e();

        e() {
        }
    }

    static {
        float f10 = 40;
        f9917b = AbstractC5016i.b(C5015h.n(f10), C5015h.n(f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r37, kotlin.jvm.functions.Function1 r38, androidx.compose.ui.e r39, boolean r40, boolean r41, U0.Y0 r42, K.C1773x r43, K.C1772w r44, boolean r45, int r46, int r47, a1.f0 r48, kotlin.jvm.functions.Function1 r49, B.m r50, s0.AbstractC6358h0 r51, ie.InterfaceC5096o r52, Y.InterfaceC2425m r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K.AbstractC1753c.a(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.e, boolean, boolean, U0.Y0, K.x, K.w, boolean, int, int, a1.f0, kotlin.jvm.functions.Function1, B.m, s0.h0, ie.o, Y.m, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2527U b(C0 c02) {
        return (C2527U) c02.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0 c02, C2527U c2527u) {
        c02.setValue(c2527u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(C0 c02) {
        return (String) c02.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C0 c02, String str) {
        c02.setValue(str);
    }
}
