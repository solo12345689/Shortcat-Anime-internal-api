package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class l0 implements Collection, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    private final c0 f60091a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f60092a;

        /* JADX INFO: renamed from: b */
        Object f60093b;

        /* JADX INFO: renamed from: c */
        int f60094c;

        /* JADX INFO: renamed from: d */
        int f60095d;

        /* JADX INFO: renamed from: e */
        int f60096e;

        /* JADX INFO: renamed from: f */
        int f60097f;

        /* JADX INFO: renamed from: g */
        long f60098g;

        /* JADX INFO: renamed from: h */
        int f60099h;

        /* JADX INFO: renamed from: i */
        private /* synthetic */ Object f60100i;

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(Cf.k kVar, Zd.e eVar) {
            return ((a) create(kVar, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = l0.this.new a(eVar);
            aVar.f60100i = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0058 -> B:50:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x005a -> B:41:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0074 -> B:47:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0091 -> B:47:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f60099h
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.f60097f
                int r6 = r0.f60096e
                long r7 = r0.f60098g
                int r9 = r0.f60095d
                int r10 = r0.f60094c
                java.lang.Object r11 = r0.f60093b
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f60092a
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f60100i
                Cf.k r13 = (Cf.k) r13
                Td.v.b(r21)
                goto L94
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L33:
                Td.v.b(r21)
                java.lang.Object r2 = r0.f60100i
                Cf.k r2 = (Cf.k) r2
                t.l0 r6 = t.l0.this
                t.c0 r6 = t.l0.b(r6)
                java.lang.Object[] r7 = r6.f60045c
                long[] r6 = r6.f60043a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La2
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6b:
                if (r2 >= r6) goto L97
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.32E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L94
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f60100i = r13
                r0.f60092a = r12
                r0.f60093b = r11
                r0.f60094c = r10
                r0.f60095d = r9
                r0.f60098g = r7
                r0.f60096e = r6
                r0.f60097f = r2
                r0.f60099h = r5
                java.lang.Object r14 = r13.d(r14, r0)
                if (r14 != r1) goto L94
                return r1
            L94:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6b
            L97:
                if (r6 != r4) goto La2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9d:
                if (r9 == r8) goto La2
                int r9 = r9 + 1
                goto L4a
            La2:
                Td.L r1 = Td.L.f17438a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t.l0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l0(c0 parent) {
        AbstractC5504s.h(parent, "parent");
        this.f60091a = parent;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f60091a.d(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f60091a.d(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.f60091a.f60047e;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f60091a.h();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Cf.l.a(new a(null));
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        return AbstractC5496j.b(this, array);
    }
}
