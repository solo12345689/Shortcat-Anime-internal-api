package ua;

import aa.C2595c;
import aa.InterfaceC2596d;
import aa.q;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ua.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6748c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f61460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f61461b;

    C6748c(Set set, d dVar) {
        this.f61460a = d(set);
        this.f61461b = dVar;
    }

    public static /* synthetic */ i b(InterfaceC2596d interfaceC2596d) {
        return new C6748c(interfaceC2596d.c(f.class), d.a());
    }

    public static C2595c c() {
        return C2595c.e(i.class).b(q.m(f.class)).f(new aa.g() { // from class: ua.b
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return C6748c.b(interfaceC2596d);
            }
        }).d();
    }

    private static String d(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append('/');
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // ua.i
    public String a() {
        if (this.f61461b.b().isEmpty()) {
            return this.f61460a;
        }
        return this.f61460a + ' ' + d(this.f61461b.b());
    }
}
