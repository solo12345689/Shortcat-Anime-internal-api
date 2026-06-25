package Af;

import Ud.AbstractC2269j;
import Ud.AbstractC2273n;
import Ud.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends AbstractC2269j {

    /* JADX INFO: renamed from: c */
    public static final b f430c = new b(null);

    /* JADX INFO: renamed from: a */
    private Object f431a;

    /* JADX INFO: renamed from: b */
    private int f432b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a */
        private final Iterator f433a;

        public a(Object[] array) {
            AbstractC5504s.h(array, "array");
            this.f433a = AbstractC5489c.a(array);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f433a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f433a.next();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return new k(null);
        }

        public final k b(Collection set) {
            AbstractC5504s.h(set, "set");
            k kVar = new k(null);
            kVar.addAll(set);
            return kVar;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a */
        private final Object f434a;

        /* JADX INFO: renamed from: b */
        private boolean f435b = true;

        public c(Object obj) {
            this.f434a = obj;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f435b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f435b) {
                throw new NoSuchElementException();
            }
            this.f435b = false;
            return this.f434a;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final k d() {
        return f430c.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f431a = obj;
        } else if (size() == 1) {
            if (AbstractC5504s.c(this.f431a, obj)) {
                return false;
            }
            this.f431a = new Object[]{this.f431a, obj};
        } else if (size() < 5) {
            Object obj3 = this.f431a;
            AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (AbstractC2273n.R(objArr, obj)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetE = a0.e(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetE.add(obj);
                obj2 = linkedHashSetE;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f431a = obj2;
        } else {
            Object obj4 = this.f431a;
            AbstractC5504s.f(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!V.d(obj4).add(obj)) {
                return false;
            }
        }
        e(size() + 1);
        return true;
    }

    @Override // Ud.AbstractC2269j
    public int b() {
        return this.f432b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f431a = null;
        e(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC5504s.c(this.f431a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f431a;
            AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC2273n.R((Object[]) obj2, obj);
        }
        Object obj3 = this.f431a;
        AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public void e(int i10) {
        this.f432b = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new c(this.f431a);
        }
        if (size() < 5) {
            Object obj = this.f431a;
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f431a;
        AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return V.d(obj2).iterator();
    }

    private k() {
    }
}
