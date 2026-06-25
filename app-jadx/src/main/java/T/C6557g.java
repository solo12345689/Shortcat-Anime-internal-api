package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: t.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6557g implements Set, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    private final c0 f60061a;

    /* JADX INFO: renamed from: t.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f60062a;

        /* JADX INFO: renamed from: b */
        Object f60063b;

        /* JADX INFO: renamed from: c */
        int f60064c;

        /* JADX INFO: renamed from: d */
        int f60065d;

        /* JADX INFO: renamed from: e */
        int f60066e;

        /* JADX INFO: renamed from: f */
        int f60067f;

        /* JADX INFO: renamed from: g */
        long f60068g;

        /* JADX INFO: renamed from: h */
        int f60069h;

        /* JADX INFO: renamed from: i */
        private /* synthetic */ Object f60070i;

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
            a aVar = C6557g.this.new a(eVar);
            aVar.f60070i = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0059 -> B:44:0x006a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0073 -> B:50:0x00a8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00a5 -> B:51:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00b8 -> B:56:0x00b9). Please report as a decompilation issue!!! */
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
                int r2 = r0.f60069h
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L32
                if (r2 != r5) goto L2a
                int r2 = r0.f60067f
                int r6 = r0.f60066e
                long r7 = r0.f60068g
                int r9 = r0.f60065d
                int r10 = r0.f60064c
                java.lang.Object r11 = r0.f60063b
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f60062a
                t.g r12 = (t.C6557g) r12
                java.lang.Object r13 = r0.f60070i
                Cf.k r13 = (Cf.k) r13
                Td.v.b(r21)
                goto La8
            L2a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L32:
                Td.v.b(r21)
                java.lang.Object r2 = r0.f60070i
                Cf.k r2 = (Cf.k) r2
                t.g r6 = t.C6557g.this
                t.c0 r6 = t.C6557g.b(r6)
                t.g r7 = t.C6557g.this
                long[] r6 = r6.f60043a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Lbf
                r9 = 0
            L49:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto Lb8
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = 0
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6a:
                if (r2 >= r6) goto Lb0
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.32E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto La8
                int r14 = r9 << 3
                int r14 = r14 + r2
                t.A r15 = new t.A
                t.c0 r3 = t.C6557g.b(r12)
                java.lang.Object[] r3 = r3.f60044b
                r3 = r3[r14]
                r17 = r4
                t.c0 r4 = t.C6557g.b(r12)
                java.lang.Object[] r4 = r4.f60045c
                r4 = r4[r14]
                r15.<init>(r3, r4)
                r0.f60070i = r13
                r0.f60062a = r12
                r0.f60063b = r11
                r0.f60064c = r10
                r0.f60065d = r9
                r0.f60068g = r7
                r0.f60066e = r6
                r0.f60067f = r2
                r0.f60069h = r5
                java.lang.Object r3 = r13.d(r15, r0)
                if (r3 != r1) goto Laa
                return r1
            La8:
                r17 = r4
            Laa:
                long r7 = r7 >> r17
                int r2 = r2 + r5
                r4 = r17
                goto L6a
            Lb0:
                r3 = r4
                if (r6 != r3) goto Lbf
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
                goto Lb9
            Lb8:
                r3 = r4
            Lb9:
                if (r9 == r8) goto Lbf
                int r9 = r9 + 1
                r4 = r3
                goto L49
            Lbf:
                Td.L r1 = Td.L.f17438a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t.C6557g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C6557g(c0 parent) {
        AbstractC5504s.h(parent, "parent");
        this.f60061a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return d((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Collection<Map.Entry> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : collection) {
            if (!AbstractC5504s.c(this.f60061a.e(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public boolean d(Map.Entry element) {
        AbstractC5504s.h(element, "element");
        return AbstractC5504s.c(this.f60061a.e(element.getKey()), element.getValue());
    }

    public int e() {
        return this.f60061a.f60047e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f60061a.h();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Cf.l.a(new a(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        return AbstractC5496j.b(this, array);
    }
}
