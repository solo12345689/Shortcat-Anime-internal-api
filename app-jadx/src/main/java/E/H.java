package E;

import F.InterfaceC1533d;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1289j f3804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f3805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f3810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f3811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3812i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3815a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f3816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f3817c;

        private b() {
        }

        public void a(int i10) {
            f3816b = i10;
        }

        public void b(int i10) {
            f3817c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f3819b;

        public c(int i10, List list) {
            this.f3818a = i10;
            this.f3819b = list;
        }

        public final int a() {
            return this.f3818a;
        }

        public final List b() {
            return this.f3819b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3820a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f3820a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(a aVar) {
            return Integer.valueOf(aVar.a() - this.f3820a);
        }
    }

    public H(C1289j c1289j) {
        this.f3804a = c1289j;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(new a(i10, i10, 2, null));
        this.f3805b = arrayList;
        this.f3809f = -1;
        this.f3810g = new ArrayList();
        this.f3811h = AbstractC2279u.m();
    }

    private final int a() {
        return ((int) Math.sqrt((((double) f()) * 1.0d) / ((double) this.f3812i))) + 1;
    }

    private final List b(int i10) {
        if (i10 == this.f3811h.size()) {
            return this.f3811h;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(C1282c.a(G.a(1)));
        }
        this.f3811h = arrayList;
        return arrayList;
    }

    private final void g() {
        this.f3805b.clear();
        int i10 = 0;
        this.f3805b.add(new a(i10, i10, 2, null));
        this.f3806c = 0;
        this.f3807d = 0;
        this.f3808e = 0;
        this.f3809f = -1;
        this.f3810g.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E.H.c c(int r11) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E.H.c(int):E.H$c");
    }

    public final int d(int i10) {
        int i11 = 0;
        if (f() <= 0) {
            return 0;
        }
        if (i10 >= f()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if (!this.f3804a.j()) {
            return i10 / this.f3812i;
        }
        int iK = AbstractC2279u.k(this.f3805b, 0, 0, new d(i10), 3, null);
        int i12 = 2;
        if (iK < 0) {
            iK = (-iK) - 2;
        }
        int iA = a() * iK;
        int iA2 = ((a) this.f3805b.get(iK)).a();
        if (iA2 > i10) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i13 = 0;
        while (true) {
            if (iA2 >= i10) {
                break;
            }
            int i14 = iA2 + 1;
            int i15 = i(iA2, this.f3812i - i13);
            i13 += i15;
            int i16 = this.f3812i;
            if (i13 >= i16) {
                if (i13 == i16) {
                    iA++;
                    i13 = 0;
                } else {
                    iA++;
                    i13 = i15;
                }
            }
            if (iA % a() == 0 && iA / a() >= this.f3805b.size()) {
                this.f3805b.add(new a(i14 - (i13 <= 0 ? 0 : 1), i11, i12, null));
            }
            iA2 = i14;
        }
        return i13 + i(i10, this.f3812i - i13) > this.f3812i ? iA + 1 : iA;
    }

    public final int e() {
        return this.f3812i;
    }

    public final int f() {
        return this.f3804a.g().getSize();
    }

    public final void h(int i10) {
        if (i10 != this.f3812i) {
            this.f3812i = i10;
            g();
        }
    }

    public final int i(int i10, int i11) {
        b bVar = b.f3815a;
        bVar.a(i11);
        bVar.b(this.f3812i);
        InterfaceC1533d.a aVar = this.f3804a.g().get(i10);
        return C1282c.d(((C1282c) ((C1288i) aVar.c()).b().invoke(bVar, Integer.valueOf(i10 - aVar.b()))).g());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3814b;

        public a(int i10, int i11) {
            this.f3813a = i10;
            this.f3814b = i11;
        }

        public final int a() {
            return this.f3813a;
        }

        public final int b() {
            return this.f3814b;
        }

        public /* synthetic */ a(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }
    }
}
