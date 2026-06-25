package Ke;

import Oe.InterfaceC1980a;
import Oe.InterfaceC1983d;
import Ud.AbstractC2279u;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.InterfaceC6043h;
import ve.o;
import ze.InterfaceC7369c;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements InterfaceC7374h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f11058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1983d f11059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6043h f11061d;

    public g(k c10, InterfaceC1983d annotationOwner, boolean z10) {
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(annotationOwner, "annotationOwner");
        this.f11058a = c10;
        this.f11059b = annotationOwner;
        this.f11060c = z10;
        this.f11061d = c10.a().u().d(new f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7369c d(g gVar, InterfaceC1980a annotation) {
        AbstractC5504s.h(annotation, "annotation");
        return Ie.d.f9087a.e(annotation, gVar.f11058a, gVar.f11060c);
    }

    @Override // ze.InterfaceC7374h
    public InterfaceC7369c h(Xe.c fqName) {
        InterfaceC7369c interfaceC7369c;
        AbstractC5504s.h(fqName, "fqName");
        InterfaceC1980a interfaceC1980aH = this.f11059b.h(fqName);
        return (interfaceC1980aH == null || (interfaceC7369c = (InterfaceC7369c) this.f11061d.invoke(interfaceC1980aH)) == null) ? Ie.d.f9087a.a(fqName, this.f11059b, this.f11058a) : interfaceC7369c;
    }

    @Override // ze.InterfaceC7374h
    public boolean isEmpty() {
        return this.f11059b.getAnnotations().isEmpty() && !this.f11059b.D();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Cf.l.B(Cf.l.O(Cf.l.K(AbstractC2279u.c0(this.f11059b.getAnnotations()), this.f11061d), Ie.d.f9087a.a(o.a.f62279y, this.f11059b, this.f11058a))).iterator();
    }

    @Override // ze.InterfaceC7374h
    public boolean k0(Xe.c cVar) {
        return InterfaceC7374h.b.b(this, cVar);
    }

    public /* synthetic */ g(k kVar, InterfaceC1983d interfaceC1983d, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC1983d, (i10 & 4) != 0 ? false : z10);
    }
}
