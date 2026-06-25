package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import i4.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import n4.InterfaceC5734j;
import n4.InterfaceC5739o;
import n4.InterfaceC5746v;
import n4.InterfaceC5750z;
import q4.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "o", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a o() {
        E eQ = E.q(a());
        AbstractC5504s.g(eQ, "getInstance(applicationContext)");
        WorkDatabase workDatabaseV = eQ.v();
        AbstractC5504s.g(workDatabaseV, "workManager.workDatabase");
        InterfaceC5746v interfaceC5746vJ = workDatabaseV.J();
        InterfaceC5739o interfaceC5739oH = workDatabaseV.H();
        InterfaceC5750z interfaceC5750zK = workDatabaseV.K();
        InterfaceC5734j interfaceC5734jG = workDatabaseV.G();
        List listD = interfaceC5746vJ.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listT = interfaceC5746vJ.t();
        List listL = interfaceC5746vJ.l(200);
        if (!listD.isEmpty()) {
            i.e().f(d.f57087a, "Recently completed work:\n\n");
            i.e().f(d.f57087a, d.d(interfaceC5739oH, interfaceC5750zK, interfaceC5734jG, listD));
        }
        if (!listT.isEmpty()) {
            i.e().f(d.f57087a, "Running work:\n\n");
            i.e().f(d.f57087a, d.d(interfaceC5739oH, interfaceC5750zK, interfaceC5734jG, listT));
        }
        if (!listL.isEmpty()) {
            i.e().f(d.f57087a, "Enqueued work:\n\n");
            i.e().f(d.f57087a, d.d(interfaceC5739oH, interfaceC5750zK, interfaceC5734jG, listL));
        }
        c.a aVarC = c.a.c();
        AbstractC5504s.g(aVarC, "success()");
        return aVarC;
    }
}
