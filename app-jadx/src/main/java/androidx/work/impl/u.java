package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import n4.C5745u;
import n4.InterfaceC5746v;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: a */
    private static final String f32909a = i4.i.i("Schedulers");

    static t a(Context context, E e10) {
        androidx.work.impl.background.systemjob.g gVar = new androidx.work.impl.background.systemjob.g(context, e10);
        o4.p.a(context, SystemJobService.class, true);
        i4.i.e().a(f32909a, "Created SystemJobScheduler and enabled SystemJobService");
        return gVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC5746v interfaceC5746vJ = workDatabase.J();
        workDatabase.e();
        try {
            List listP = interfaceC5746vJ.p(aVar.h());
            List listL = interfaceC5746vJ.l(200);
            if (listP != null && listP.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    interfaceC5746vJ.n(((C5745u) it.next()).f53943a, jCurrentTimeMillis);
                }
            }
            workDatabase.B();
            workDatabase.i();
            if (listP != null && listP.size() > 0) {
                C5745u[] c5745uArr = (C5745u[]) listP.toArray(new C5745u[listP.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    t tVar = (t) it2.next();
                    if (tVar.d()) {
                        tVar.a(c5745uArr);
                    }
                }
            }
            if (listL == null || listL.size() <= 0) {
                return;
            }
            C5745u[] c5745uArr2 = (C5745u[]) listL.toArray(new C5745u[listL.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                t tVar2 = (t) it3.next();
                if (!tVar2.d()) {
                    tVar2.a(c5745uArr2);
                }
            }
        } catch (Throwable th2) {
            workDatabase.i();
            throw th2;
        }
    }
}
