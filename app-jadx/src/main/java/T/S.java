package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import je.InterfaceC5371a;
import je.InterfaceC5376f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class S extends g0 implements Set, InterfaceC5376f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q f59984b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f59985a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f59986b;

        /* JADX INFO: renamed from: t.S$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0902a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f59988a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f59989b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f59990c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f59991d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f59992e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f59993f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f59994g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            long f59995h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f59996i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f59997j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ S f59998k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ a f59999l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0902a(S s10, a aVar, Zd.e eVar) {
                super(2, eVar);
                this.f59998k = s10;
                this.f59999l = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Cf.k kVar, Zd.e eVar) {
                return ((C0902a) create(kVar, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                C0902a c0902a = new C0902a(this.f59998k, this.f59999l, eVar);
                c0902a.f59997j = obj;
                return c0902a;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005d -> B:23:0x00b3). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0073). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:20:0x00a7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a4 -> B:20:0x00a7). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    r21 = this;
                    r0 = r21
                    java.lang.Object r1 = ae.AbstractC2605b.f()
                    int r2 = r0.f59996i
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L36
                    if (r2 != r5) goto L2e
                    int r2 = r0.f59994g
                    int r6 = r0.f59993f
                    long r7 = r0.f59995h
                    int r9 = r0.f59992e
                    int r10 = r0.f59991d
                    java.lang.Object r11 = r0.f59990c
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.f59989b
                    t.S r12 = (t.S) r12
                    java.lang.Object r13 = r0.f59988a
                    t.S$a r13 = (t.S.a) r13
                    java.lang.Object r14 = r0.f59997j
                    Cf.k r14 = (Cf.k) r14
                    Td.v.b(r22)
                    goto La7
                L2e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L36:
                    Td.v.b(r22)
                    java.lang.Object r2 = r0.f59997j
                    Cf.k r2 = (Cf.k) r2
                    t.S r6 = r0.f59998k
                    t.Q r6 = t.S.d(r6)
                    t.S$a r7 = r0.f59999l
                    t.S r8 = r0.f59998k
                    long[] r6 = r6.f60054a
                    int r9 = r6.length
                    int r9 = r9 + (-2)
                    if (r9 < 0) goto Lb8
                    r10 = 0
                L4f:
                    r11 = r6[r10]
                    long r13 = ~r11
                    r15 = 7
                    long r13 = r13 << r15
                    long r13 = r13 & r11
                    r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r13 = r13 & r15
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 == 0) goto Lb3
                    int r13 = r10 - r9
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    int r13 = 8 - r13
                    r14 = r10
                    r10 = r9
                    r9 = r14
                    r14 = r2
                    r2 = 0
                    r19 = r11
                    r11 = r6
                    r12 = r8
                    r6 = r13
                    r13 = r7
                    r7 = r19
                L73:
                    if (r2 >= r6) goto Laa
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r7
                    r17 = 128(0x80, double:6.32E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto La7
                    int r15 = r9 << 3
                    int r15 = r15 + r2
                    r13.b(r15)
                    t.Q r3 = t.S.d(r12)
                    java.lang.Object[] r3 = r3.f60055b
                    r3 = r3[r15]
                    r0.f59997j = r14
                    r0.f59988a = r13
                    r0.f59989b = r12
                    r0.f59990c = r11
                    r0.f59991d = r10
                    r0.f59992e = r9
                    r0.f59995h = r7
                    r0.f59993f = r6
                    r0.f59994g = r2
                    r0.f59996i = r5
                    java.lang.Object r3 = r14.d(r3, r0)
                    if (r3 != r1) goto La7
                    return r1
                La7:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L73
                Laa:
                    if (r6 != r4) goto Lb8
                    r2 = r10
                    r10 = r9
                    r9 = r2
                    r6 = r11
                    r8 = r12
                    r7 = r13
                    r2 = r14
                Lb3:
                    if (r10 == r9) goto Lb8
                    int r10 = r10 + 1
                    goto L4f
                Lb8:
                    Td.L r1 = Td.L.f17438a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: t.S.a.C0902a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        a() {
            this.f59986b = Cf.l.a(new C0902a(S.this, this, null));
        }

        public final void b(int i10) {
            this.f59985a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f59986b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f59986b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f59985a != -1) {
                S.this.f59984b.A(this.f59985a);
                this.f59985a = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Q parent) {
        super(parent);
        AbstractC5504s.h(parent, "parent");
        this.f59984b = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f59984b.h(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return this.f59984b.i(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f59984b.m();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f59984b.y(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return this.f59984b.z(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return this.f59984b.C(elements);
    }
}
