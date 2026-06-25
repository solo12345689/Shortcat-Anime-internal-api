package sf;

import Ud.AbstractC2279u;
import Ud.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import jf.C5380d;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class g implements InterfaceC5387k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f59612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59613c;

    public g(h kind, String... formatParams) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(formatParams, "formatParams");
        this.f59612b = kind;
        String strB = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC5504s.g(str, "format(...)");
        this.f59613c = str;
    }

    @Override // jf.InterfaceC5387k
    public Set b() {
        return a0.d();
    }

    @Override // jf.InterfaceC5387k
    public Set d() {
        return a0.d();
    }

    @Override // jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        String str = String.format(b.f59593b.b(), Arrays.copyOf(new Object[]{name}, 1));
        AbstractC5504s.g(str, "format(...)");
        Xe.f fVarQ = Xe.f.q(str);
        AbstractC5504s.g(fVarQ, "special(...)");
        return new C6529a(fVarQ);
    }

    @Override // jf.InterfaceC5387k
    public Set f() {
        return a0.d();
    }

    @Override // jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return AbstractC2279u.m();
    }

    @Override // jf.InterfaceC5387k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return a0.c(new c(l.f59724a.h()));
    }

    @Override // jf.InterfaceC5387k
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return l.f59724a.j();
    }

    protected final String j() {
        return this.f59613c;
    }

    public String toString() {
        return "ErrorScope{" + this.f59613c + '}';
    }
}
