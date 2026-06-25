package gf;

import Be.K;
import Ke.k;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: gf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4878a implements InterfaceC4883f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f47449b;

    public C4878a(List inner) {
        AbstractC5504s.h(inner, "inner");
        this.f47449b = inner;
    }

    @Override // gf.InterfaceC4883f
    public void a(InterfaceC7227e thisDescriptor, List result, k c10) {
        AbstractC5504s.h(thisDescriptor, "thisDescriptor");
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(c10, "c");
        Iterator it = this.f47449b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4883f) it.next()).a(thisDescriptor, result, c10);
        }
    }

    @Override // gf.InterfaceC4883f
    public List b(InterfaceC7227e thisDescriptor, k c10) {
        AbstractC5504s.h(thisDescriptor, "thisDescriptor");
        AbstractC5504s.h(c10, "c");
        List list = this.f47449b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList, ((InterfaceC4883f) it.next()).b(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // gf.InterfaceC4883f
    public void c(InterfaceC7227e thisDescriptor, Xe.f name, Collection result, k c10) {
        AbstractC5504s.h(thisDescriptor, "thisDescriptor");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(c10, "c");
        Iterator it = this.f47449b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4883f) it.next()).c(thisDescriptor, name, result, c10);
        }
    }

    @Override // gf.InterfaceC4883f
    public void d(InterfaceC7227e thisDescriptor, Xe.f name, List result, k c10) {
        AbstractC5504s.h(thisDescriptor, "thisDescriptor");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(c10, "c");
        Iterator it = this.f47449b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4883f) it.next()).d(thisDescriptor, name, result, c10);
        }
    }

    @Override // gf.InterfaceC4883f
    public K e(InterfaceC7227e thisDescriptor, K propertyDescriptor, k c10) {
        AbstractC5504s.h(thisDescriptor, "thisDescriptor");
        AbstractC5504s.h(propertyDescriptor, "propertyDescriptor");
        AbstractC5504s.h(c10, "c");
        Iterator it = this.f47449b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((InterfaceC4883f) it.next()).e(thisDescriptor, propertyDescriptor, c10);
        }
        return propertyDescriptor;
    }

    @Override // gf.InterfaceC4883f
    public void f(InterfaceC7227e thisDescriptor, Xe.f name, Collection result, k c10) {
        AbstractC5504s.h(thisDescriptor, "thisDescriptor");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(c10, "c");
        Iterator it = this.f47449b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4883f) it.next()).f(thisDescriptor, name, result, c10);
        }
    }

    @Override // gf.InterfaceC4883f
    public List g(InterfaceC7227e thisDescriptor, k c10) {
        AbstractC5504s.h(thisDescriptor, "thisDescriptor");
        AbstractC5504s.h(c10, "c");
        List list = this.f47449b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList, ((InterfaceC4883f) it.next()).g(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // gf.InterfaceC4883f
    public List h(InterfaceC7227e thisDescriptor, k c10) {
        AbstractC5504s.h(thisDescriptor, "thisDescriptor");
        AbstractC5504s.h(c10, "c");
        List list = this.f47449b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList, ((InterfaceC4883f) it.next()).h(thisDescriptor, c10));
        }
        return arrayList;
    }
}
