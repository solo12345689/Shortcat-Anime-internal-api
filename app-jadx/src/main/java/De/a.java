package De;

import Be.C1121p;
import Qe.n;
import Qe.w;
import Qe.x;
import Re.a;
import Ud.AbstractC2279u;
import Xe.b;
import gf.C4881d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jf.C5378b;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    private final n f3693a;

    /* JADX INFO: renamed from: b */
    private final g f3694b;

    /* JADX INFO: renamed from: c */
    private final ConcurrentHashMap f3695c;

    public a(n resolver, g kotlinClassFinder) {
        AbstractC5504s.h(resolver, "resolver");
        AbstractC5504s.h(kotlinClassFinder, "kotlinClassFinder");
        this.f3693a = resolver;
        this.f3694b = kotlinClassFinder;
        this.f3695c = new ConcurrentHashMap();
    }

    public final InterfaceC5387k a(f fileClass) {
        Collection collectionE;
        AbstractC5504s.h(fileClass, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.f3695c;
        Xe.b bVarG = fileClass.g();
        Object obj = concurrentHashMap.get(bVarG);
        if (obj == null) {
            Xe.c cVarF = fileClass.g().f();
            if (fileClass.d().c() == a.EnumC0265a.f15482h) {
                List<String> listF = fileClass.d().f();
                collectionE = new ArrayList();
                for (String str : listF) {
                    b.a aVar = Xe.b.f21759d;
                    Xe.c cVarE = C4881d.d(str).e();
                    AbstractC5504s.g(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    x xVarB = w.b(this.f3694b, aVar.c(cVarE), this.f3693a.f().g().d());
                    if (xVarB != null) {
                        collectionE.add(xVarB);
                    }
                }
            } else {
                collectionE = AbstractC2279u.e(fileClass);
            }
            C1121p c1121p = new C1121p(this.f3693a.f().q(), cVarF);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                InterfaceC5387k interfaceC5387kC = this.f3693a.c(c1121p, (x) it.next());
                if (interfaceC5387kC != null) {
                    arrayList.add(interfaceC5387kC);
                }
            }
            List listB1 = AbstractC2279u.b1(arrayList);
            InterfaceC5387k interfaceC5387kA = C5378b.f51753d.a("package " + cVarF + " (" + fileClass + ')', listB1);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarG, interfaceC5387kA);
            obj = objPutIfAbsent == null ? interfaceC5387kA : objPutIfAbsent;
        }
        AbstractC5504s.g(obj, "getOrPut(...)");
        return (InterfaceC5387k) obj;
    }
}
