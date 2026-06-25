package jf;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.a0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ye.D;
import ye.InterfaceC7230h;
import ye.InterfaceC7231i;
import zf.AbstractC7385a;

/* JADX INFO: renamed from: jf.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5378b implements InterfaceC5387k {

    /* JADX INFO: renamed from: d */
    public static final a f51753d = new a(null);

    /* JADX INFO: renamed from: b */
    private final String f51754b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5387k[] f51755c;

    /* JADX INFO: renamed from: jf.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC5387k a(String debugName, Iterable scopes) {
            AbstractC5504s.h(debugName, "debugName");
            AbstractC5504s.h(scopes, "scopes");
            Af.j jVar = new Af.j();
            Iterator it = scopes.iterator();
            while (it.hasNext()) {
                InterfaceC5387k interfaceC5387k = (InterfaceC5387k) it.next();
                if (interfaceC5387k != InterfaceC5387k.b.f51800b) {
                    if (interfaceC5387k instanceof C5378b) {
                        AbstractC2279u.E(jVar, ((C5378b) interfaceC5387k).f51755c);
                    } else {
                        jVar.add(interfaceC5387k);
                    }
                }
            }
            return b(debugName, jVar);
        }

        public final InterfaceC5387k b(String debugName, List scopes) {
            AbstractC5504s.h(debugName, "debugName");
            AbstractC5504s.h(scopes, "scopes");
            int size = scopes.size();
            return size != 0 ? size != 1 ? new C5378b(debugName, (InterfaceC5387k[]) scopes.toArray(new InterfaceC5387k[0]), null) : (InterfaceC5387k) scopes.get(0) : InterfaceC5387k.b.f51800b;
        }

        private a() {
        }
    }

    public /* synthetic */ C5378b(String str, InterfaceC5387k[] interfaceC5387kArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC5387kArr);
    }

    @Override // jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        InterfaceC5387k[] interfaceC5387kArr = this.f51755c;
        int length = interfaceC5387kArr.length;
        if (length == 0) {
            return AbstractC2279u.m();
        }
        if (length == 1) {
            return interfaceC5387kArr[0].a(name, location);
        }
        Collection collectionA = null;
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArr) {
            collectionA = AbstractC7385a.a(collectionA, interfaceC5387k.a(name, location));
        }
        return collectionA == null ? a0.d() : collectionA;
    }

    @Override // jf.InterfaceC5387k
    public Set b() {
        InterfaceC5387k[] interfaceC5387kArr = this.f51755c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArr) {
            AbstractC2279u.D(linkedHashSet, interfaceC5387k.b());
        }
        return linkedHashSet;
    }

    @Override // jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        InterfaceC5387k[] interfaceC5387kArr = this.f51755c;
        int length = interfaceC5387kArr.length;
        if (length == 0) {
            return AbstractC2279u.m();
        }
        if (length == 1) {
            return interfaceC5387kArr[0].c(name, location);
        }
        Collection collectionA = null;
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArr) {
            collectionA = AbstractC7385a.a(collectionA, interfaceC5387k.c(name, location));
        }
        return collectionA == null ? a0.d() : collectionA;
    }

    @Override // jf.InterfaceC5387k
    public Set d() {
        InterfaceC5387k[] interfaceC5387kArr = this.f51755c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArr) {
            AbstractC2279u.D(linkedHashSet, interfaceC5387k.d());
        }
        return linkedHashSet;
    }

    @Override // jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        InterfaceC7230h interfaceC7230h = null;
        for (InterfaceC5387k interfaceC5387k : this.f51755c) {
            InterfaceC7230h interfaceC7230hE = interfaceC5387k.e(name, location);
            if (interfaceC7230hE != null) {
                if (!(interfaceC7230hE instanceof InterfaceC7231i) || !((D) interfaceC7230hE).m0()) {
                    return interfaceC7230hE;
                }
                if (interfaceC7230h == null) {
                    interfaceC7230h = interfaceC7230hE;
                }
            }
        }
        return interfaceC7230h;
    }

    @Override // jf.InterfaceC5387k
    public Set f() {
        return AbstractC5389m.a(AbstractC2273n.L(this.f51755c));
    }

    @Override // jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        InterfaceC5387k[] interfaceC5387kArr = this.f51755c;
        int length = interfaceC5387kArr.length;
        if (length == 0) {
            return AbstractC2279u.m();
        }
        if (length == 1) {
            return interfaceC5387kArr[0].g(kindFilter, nameFilter);
        }
        Collection collectionA = null;
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArr) {
            collectionA = AbstractC7385a.a(collectionA, interfaceC5387k.g(kindFilter, nameFilter));
        }
        return collectionA == null ? a0.d() : collectionA;
    }

    public String toString() {
        return this.f51754b;
    }

    private C5378b(String str, InterfaceC5387k[] interfaceC5387kArr) {
        this.f51754b = str;
        this.f51755c = interfaceC5387kArr;
    }
}
