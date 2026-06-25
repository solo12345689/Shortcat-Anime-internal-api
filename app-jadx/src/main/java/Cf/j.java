package Cf;

import Td.L;
import Td.u;
import ae.AbstractC2605b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class j extends k implements Iterator, Zd.e, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    private int f3110a;

    /* JADX INFO: renamed from: b */
    private Object f3111b;

    /* JADX INFO: renamed from: c */
    private Iterator f3112c;

    /* JADX INFO: renamed from: d */
    private Zd.e f3113d;

    private final Throwable g() {
        int i10 = this.f3110a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3110a);
    }

    private final Object i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // Cf.k
    public Object d(Object obj, Zd.e eVar) {
        this.f3111b = obj;
        this.f3110a = 3;
        this.f3113d = eVar;
        Object objF = AbstractC2605b.f();
        if (objF == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objF == AbstractC2605b.f() ? objF : L.f17438a;
    }

    @Override // Cf.k
    public Object f(Iterator it, Zd.e eVar) {
        if (!it.hasNext()) {
            return L.f17438a;
        }
        this.f3112c = it;
        this.f3110a = 2;
        this.f3113d = eVar;
        Object objF = AbstractC2605b.f();
        if (objF == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objF == AbstractC2605b.f() ? objF : L.f17438a;
    }

    @Override // Zd.e
    public Zd.i getContext() {
        return Zd.j.f23275a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f3110a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator it = this.f3112c;
                AbstractC5504s.e(it);
                if (it.hasNext()) {
                    this.f3110a = 2;
                    return true;
                }
                this.f3112c = null;
            }
            this.f3110a = 5;
            Zd.e eVar = this.f3113d;
            AbstractC5504s.e(eVar);
            this.f3113d = null;
            u.a aVar = Td.u.f17466b;
            eVar.resumeWith(Td.u.b(L.f17438a));
        }
    }

    public final void k(Zd.e eVar) {
        this.f3113d = eVar;
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f3110a;
        if (i10 == 0 || i10 == 1) {
            return i();
        }
        if (i10 == 2) {
            this.f3110a = 1;
            Iterator it = this.f3112c;
            AbstractC5504s.e(it);
            return it.next();
        }
        if (i10 != 3) {
            throw g();
        }
        this.f3110a = 0;
        Object obj = this.f3111b;
        this.f3111b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // Zd.e
    public void resumeWith(Object obj) {
        Td.v.b(obj);
        this.f3110a = 4;
    }
}
