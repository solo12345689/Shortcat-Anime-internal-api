package Y;

import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import t.AbstractC6563m;

/* JADX INFO: renamed from: Y.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2416j extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.V f22340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t.V f22341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6563m f22342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22343d;

    /* JADX INFO: renamed from: Y.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f22346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f22348e;

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Cf.k kVar, Zd.e eVar) {
            return ((a) create(kVar, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = C2416j.this.new a(eVar);
            aVar.f22348e = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Cf.k kVar;
            int i11;
            int i12;
            String str;
            int i13;
            int i14;
            Object objF = AbstractC2605b.f();
            int i15 = this.f22347d;
            if (i15 == 0) {
                Td.v.b(obj);
                i10 = 0;
                kVar = (Cf.k) this.f22348e;
                i11 = 0;
                i12 = 0;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i16 = this.f22346c;
                int i17 = this.f22345b;
                int i18 = this.f22344a;
                kVar = (Cf.k) this.f22348e;
                Td.v.b(obj);
                i11 = i17;
                i12 = i16;
                i10 = i18;
            }
            while (i10 < Math.min(C2416j.this.f22343d, C2416j.this.f22342c.f60103b)) {
                int i19 = i10 + 1;
                int iB = C2416j.this.f22342c.b(i10);
                switch (iB) {
                    case 0:
                        str = "up";
                        break;
                    case 1:
                        int i20 = i11 + 1;
                        str = "down " + C2416j.this.f22340a.c(i11);
                        i11 = i20;
                        break;
                    case 2:
                        str = "remove " + C2416j.this.f22342c.b(i19) + ' ' + C2416j.this.f22342c.b(i10 + 2);
                        i19 = i10 + 3;
                        break;
                    case 3:
                        str = "move " + C2416j.this.f22342c.b(i19) + ' ' + C2416j.this.f22342c.b(i10 + 2) + ' ' + C2416j.this.f22342c.b(i10 + 3);
                        i19 = i10 + 4;
                        break;
                    case 4:
                        str = "clear";
                        break;
                    case 5:
                        i13 = i10 + 2;
                        i14 = i11 + 1;
                        str = "insertBottomUp " + C2416j.this.f22342c.b(i19) + ' ' + C2416j.this.f22340a.c(i11);
                        i19 = i13;
                        i11 = i14;
                        break;
                    case 6:
                        i13 = i10 + 2;
                        i14 = i11 + 1;
                        str = "insertTopDown " + C2416j.this.f22342c.b(i19) + ' ' + C2416j.this.f22340a.c(i11);
                        i19 = i13;
                        i11 = i14;
                        break;
                    case 7:
                        int i21 = i11 + 1;
                        Object objC = C2416j.this.f22340a.c(i11);
                        AbstractC5504s.f(objC, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        i11 += 2;
                        str = "apply " + ((Function2) kotlin.jvm.internal.V.e(objC, 2)) + ' ' + C2416j.this.f22340a.c(i21);
                        break;
                    case 8:
                        str = "reuse " + C2416j.this.f22341b.c(i12);
                        i12++;
                        break;
                    default:
                        str = "unknown op: " + iB;
                        break;
                }
                String str2 = i10 + ": " + str;
                this.f22348e = kVar;
                this.f22344a = i19;
                this.f22345b = i11;
                this.f22346c = i12;
                this.f22347d = 1;
                if (kVar.d(str2, this) == objF) {
                    return objF;
                }
                i10 = i19;
            }
            return Td.L.f17438a;
        }
    }

    public C2416j(t.V v10, t.V v11, AbstractC6563m abstractC6563m, int i10, Throwable th2) {
        super(th2);
        this.f22340a = v10;
        this.f22341b = v11;
        this.f22342c = abstractC6563m;
        this.f22343d = i10;
    }

    private final Cf.i e() {
        return Cf.l.b(new a(null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return Df.r.l("\n            |Exception while applying pausable composition. Last 10 operations:\n            |" + AbstractC2279u.w0(AbstractC2279u.U0(Cf.l.T(e()), 10), "\n", null, null, 0, null, null, 62, null) + "\n            ", null, 1, null);
    }
}
