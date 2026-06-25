package ze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ze.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7382p implements InterfaceC7374h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7374h f66236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f66237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f66238c;

    public C7382p(InterfaceC7374h delegate, boolean z10, Function1 fqNameFilter) {
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(fqNameFilter, "fqNameFilter");
        this.f66236a = delegate;
        this.f66237b = z10;
        this.f66238c = fqNameFilter;
    }

    private final boolean b(InterfaceC7369c interfaceC7369c) {
        Xe.c cVarF = interfaceC7369c.f();
        return cVarF != null && ((Boolean) this.f66238c.invoke(cVarF)).booleanValue();
    }

    @Override // ze.InterfaceC7374h
    public InterfaceC7369c h(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        if (((Boolean) this.f66238c.invoke(fqName)).booleanValue()) {
            return this.f66236a.h(fqName);
        }
        return null;
    }

    @Override // ze.InterfaceC7374h
    public boolean isEmpty() {
        boolean z10;
        InterfaceC7374h interfaceC7374h = this.f66236a;
        if ((interfaceC7374h instanceof Collection) && ((Collection) interfaceC7374h).isEmpty()) {
            z10 = false;
        } else {
            Iterator it = interfaceC7374h.iterator();
            while (it.hasNext()) {
                if (b((InterfaceC7369c) it.next())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        return this.f66237b ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        InterfaceC7374h interfaceC7374h = this.f66236a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : interfaceC7374h) {
            if (b((InterfaceC7369c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // ze.InterfaceC7374h
    public boolean k0(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        if (((Boolean) this.f66238c.invoke(fqName)).booleanValue()) {
            return this.f66236a.k0(fqName);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7382p(InterfaceC7374h delegate, Function1 fqNameFilter) {
        this(delegate, false, fqNameFilter);
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(fqNameFilter, "fqNameFilter");
    }
}
