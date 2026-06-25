package F;

import F.C1537h;
import I0.AbstractC1678d;
import I0.InterfaceC1677c;
import Td.C2160k;
import i1.EnumC5027t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: F.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1538i implements J0.j, InterfaceC1677c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f6049g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f6050h = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1540k f6051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1537h f6052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC5027t f6054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z.q f6055f;

    /* JADX INFO: renamed from: F.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC1677c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f6056a;

        a() {
        }

        @Override // I0.InterfaceC1677c.a
        public boolean a() {
            return this.f6056a;
        }
    }

    /* JADX INFO: renamed from: F.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: F.i$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6057a;

        static {
            int[] iArr = new int[EnumC5027t.values().length];
            try {
                iArr[EnumC5027t.f48573a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5027t.f48574b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6057a = iArr;
        }
    }

    /* JADX INFO: renamed from: F.i$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC1677c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f6059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6060c;

        d(kotlin.jvm.internal.N n10, int i10) {
            this.f6059b = n10;
            this.f6060c = i10;
        }

        @Override // I0.InterfaceC1677c.a
        public boolean a() {
            return C1538i.this.j((C1537h.a) this.f6059b.f52259a, this.f6060c);
        }
    }

    public C1538i(InterfaceC1540k interfaceC1540k, C1537h c1537h, boolean z10, EnumC5027t enumC5027t, z.q qVar) {
        this.f6051b = interfaceC1540k;
        this.f6052c = c1537h;
        this.f6053d = z10;
        this.f6054e = enumC5027t;
        this.f6055f = qVar;
    }

    private final C1537h.a h(C1537h.a aVar, int i10) {
        int iB = aVar.b();
        int iA = aVar.a();
        if (k(i10)) {
            iA++;
        } else {
            iB--;
        }
        return this.f6052c.a(iB, iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(C1537h.a aVar, int i10) {
        if (l(i10)) {
            return false;
        }
        return k(i10) ? aVar.a() < this.f6051b.a() - 1 : aVar.b() > 0;
    }

    private final boolean k(int i10) {
        InterfaceC1677c.b.a aVar = InterfaceC1677c.b.f8691a;
        if (InterfaceC1677c.b.h(i10, aVar.c())) {
            return false;
        }
        if (InterfaceC1677c.b.h(i10, aVar.b())) {
            return true;
        }
        if (InterfaceC1677c.b.h(i10, aVar.a())) {
            return this.f6053d;
        }
        if (InterfaceC1677c.b.h(i10, aVar.d())) {
            return !this.f6053d;
        }
        if (InterfaceC1677c.b.h(i10, aVar.e())) {
            int i11 = c.f6057a[this.f6054e.ordinal()];
            if (i11 == 1) {
                return this.f6053d;
            }
            if (i11 == 2) {
                return !this.f6053d;
            }
            throw new Td.r();
        }
        if (!InterfaceC1677c.b.h(i10, aVar.f())) {
            AbstractC1539j.c();
            throw new C2160k();
        }
        int i12 = c.f6057a[this.f6054e.ordinal()];
        if (i12 == 1) {
            return !this.f6053d;
        }
        if (i12 == 2) {
            return this.f6053d;
        }
        throw new Td.r();
    }

    private final boolean l(int i10) {
        InterfaceC1677c.b.a aVar = InterfaceC1677c.b.f8691a;
        if (InterfaceC1677c.b.h(i10, aVar.a()) ? true : InterfaceC1677c.b.h(i10, aVar.d())) {
            return this.f6055f == z.q.Horizontal;
        }
        if (InterfaceC1677c.b.h(i10, aVar.e()) ? true : InterfaceC1677c.b.h(i10, aVar.f())) {
            return this.f6055f == z.q.Vertical;
        }
        if (InterfaceC1677c.b.h(i10, aVar.c()) ? true : InterfaceC1677c.b.h(i10, aVar.b())) {
            return false;
        }
        AbstractC1539j.c();
        throw new C2160k();
    }

    @Override // I0.InterfaceC1677c
    public Object a(int i10, Function1 function1) {
        if (this.f6051b.a() <= 0 || !this.f6051b.c()) {
            return function1.invoke(f6050h);
        }
        int iE = k(i10) ? this.f6051b.e() : this.f6051b.d();
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        n10.f52259a = this.f6052c.a(iE, iE);
        Object objInvoke = null;
        while (objInvoke == null && j((C1537h.a) n10.f52259a, i10)) {
            C1537h.a aVarH = h((C1537h.a) n10.f52259a, i10);
            this.f6052c.e((C1537h.a) n10.f52259a);
            n10.f52259a = aVarH;
            this.f6051b.b();
            objInvoke = function1.invoke(new d(n10, i10));
        }
        this.f6052c.e((C1537h.a) n10.f52259a);
        this.f6051b.b();
        return objInvoke;
    }

    @Override // J0.j
    public J0.l getKey() {
        return AbstractC1678d.a();
    }

    @Override // J0.j
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC1677c getValue() {
        return this;
    }
}
