package t;

import ae.AbstractC2605b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import je.InterfaceC5371a;
import je.InterfaceC5376f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: t.O, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6549O extends b0 implements Set, InterfaceC5376f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6548N f59970b;

    /* JADX INFO: renamed from: t.O$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f59971a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f59972b;

        /* JADX INFO: renamed from: t.O$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0901a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f59974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f59975b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f59976c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f59977d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f59978e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f59979f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ C6549O f59980g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ a f59981h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0901a(C6549O c6549o, a aVar, Zd.e eVar) {
                super(2, eVar);
                this.f59980g = c6549o;
                this.f59981h = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Cf.k kVar, Zd.e eVar) {
                return ((C0901a) create(kVar, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                C0901a c0901a = new C0901a(this.f59980g, this.f59981h, eVar);
                c0901a.f59979f = obj;
                return c0901a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C6549O c6549o;
                int i10;
                a aVar;
                long[] jArr;
                Cf.k kVar;
                Object objF = AbstractC2605b.f();
                int i11 = this.f59978e;
                if (i11 == 0) {
                    Td.v.b(obj);
                    Cf.k kVar2 = (Cf.k) this.f59979f;
                    C6548N c6548n = this.f59980g.f59970b;
                    a aVar2 = this.f59981h;
                    c6549o = this.f59980g;
                    long[] jArr2 = c6548n.f60019c;
                    i10 = c6548n.f60021e;
                    aVar = aVar2;
                    jArr = jArr2;
                    kVar = kVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f59977d;
                    jArr = (long[]) this.f59976c;
                    c6549o = (C6549O) this.f59975b;
                    aVar = (a) this.f59974a;
                    kVar = (Cf.k) this.f59979f;
                    Td.v.b(obj);
                }
                while (i10 != Integer.MAX_VALUE) {
                    int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
                    aVar.b(i10);
                    Object obj2 = c6549o.f59970b.f60018b[i10];
                    this.f59979f = kVar;
                    this.f59974a = aVar;
                    this.f59975b = c6549o;
                    this.f59976c = jArr;
                    this.f59977d = i12;
                    this.f59978e = 1;
                    if (kVar.d(obj2, this) == objF) {
                        return objF;
                    }
                    i10 = i12;
                }
                return Td.L.f17438a;
            }
        }

        a() {
            this.f59972b = Cf.l.a(new C0901a(C6549O.this, this, null));
        }

        public final void b(int i10) {
            this.f59971a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f59972b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f59972b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f59971a != -1) {
                C6549O.this.f59970b.z(this.f59971a);
                this.f59971a = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6549O(C6548N parent) {
        super(parent);
        AbstractC5504s.h(parent, "parent");
        this.f59970b = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f59970b.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return this.f59970b.h(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f59970b.k();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f59970b.x(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return this.f59970b.y(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return this.f59970b.B(elements);
    }
}
