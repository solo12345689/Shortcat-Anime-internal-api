package c0;

import Ud.AbstractC2273n;
import b0.InterfaceC2966c;
import b0.e;
import f0.AbstractC4747a;
import f0.C4750d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC3058c implements InterfaceC2966c {

    /* JADX INFO: renamed from: c */
    public static final a f33410c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f33411d = 8;

    /* JADX INFO: renamed from: e */
    private static final l f33412e = new l(new Object[0]);

    /* JADX INFO: renamed from: b */
    private final Object[] f33413b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a() {
            return l.f33412e;
        }

        private a() {
        }
    }

    public l(Object[] objArr) {
        this.f33413b = objArr;
        AbstractC4747a.a(objArr.length <= 32);
    }

    private final Object[] p(int i10) {
        return new Object[i10];
    }

    @Override // java.util.Collection, java.util.List, b0.e
    public b0.e add(Object obj) {
        if (size() >= 32) {
            return new C3061f(this.f33413b, n.c(obj), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f33413b, size() + 1);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size()] = obj;
        return new l(objArrCopyOf);
    }

    @Override // c0.AbstractC3058c, java.util.Collection, java.util.List, b0.e
    public b0.e addAll(Collection collection) {
        if (size() + collection.size() > 32) {
            e.a aVarBuilder = builder();
            aVarBuilder.addAll(collection);
            return aVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f33413b, size() + collection.size());
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new l(objArrCopyOf);
    }

    @Override // b0.e
    public e.a builder() {
        return new h(this, null, this.f33413b, 0);
    }

    @Override // Ud.AbstractC2261b
    public int d() {
        return this.f33413b.length;
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public Object get(int i10) {
        C4750d.a(i10, size());
        return this.f33413b[i10];
    }

    @Override // b0.e
    public b0.e h0(int i10) {
        C4750d.a(i10, size());
        if (size() == 1) {
            return f33412e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f33413b, size() - 1);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        AbstractC2273n.m(this.f33413b, objArrCopyOf, i10, i10 + 1, size());
        return new l(objArrCopyOf);
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public int indexOf(Object obj) {
        return AbstractC2273n.n0(this.f33413b, obj);
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC2273n.B0(this.f33413b, obj);
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public ListIterator listIterator(int i10) {
        C4750d.b(i10, size());
        return new C3059d(this.f33413b, i10, size());
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public b0.e set(int i10, Object obj) {
        C4750d.a(i10, size());
        Object[] objArr = this.f33413b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new l(objArrCopyOf);
    }

    @Override // b0.e
    public b0.e t1(Function1 function1) {
        Object[] objArrCopyOf = this.f33413b;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.f33413b[i10];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.f33413b;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f33412e : new l(AbstractC2273n.t(objArrCopyOf, 0, size));
    }

    @Override // java.util.List, b0.e
    public b0.e add(int i10, Object obj) {
        C4750d.b(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] objArrP = p(size() + 1);
            AbstractC2273n.r(this.f33413b, objArrP, 0, 0, i10, 6, null);
            AbstractC2273n.m(this.f33413b, objArrP, i10 + 1, i10, size());
            objArrP[i10] = obj;
            return new l(objArrP);
        }
        Object[] objArr = this.f33413b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        AbstractC2273n.m(this.f33413b, objArrCopyOf, i10 + 1, i10, size() - 1);
        objArrCopyOf[i10] = obj;
        return new C3061f(objArrCopyOf, n.c(this.f33413b[31]), size() + 1, 0);
    }
}
