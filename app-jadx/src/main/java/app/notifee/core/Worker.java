package app.notifee.core;

import android.content.Context;
import androidx.concurrent.futures.c;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.common.util.concurrent.p;
import r4.E0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Worker extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.a f32990e;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(c.a aVar) {
        this.f32990e = aVar;
        String strM = g().m("workType");
        if (strM == null) {
            Logger.d("Worker", "received task with no input key type.");
            aVar.b(c.a.c());
            return "Worker.startWork operation cancelled - no input.";
        }
        if (strM.equals("app.notifee.core.BlockStateBroadcastReceiver.WORKER")) {
            Logger.d("Worker", "received task with type " + strM);
            BlockStateBroadcastReceiver.d(g(), aVar);
            return "Worker.startWork operation created successfully.";
        }
        if (strM.equals("app.notifee.core.NotificationManager.TRIGGER")) {
            E0.t(g(), aVar);
            return "Worker.startWork operation created successfully.";
        }
        Logger.d("Worker", "unknown work type received: " + strM);
        aVar.b(c.a.c());
        return "Worker.startWork operation cancelled - unknown work type.";
    }

    @Override // androidx.work.c
    public void k() {
        c.a aVar = this.f32990e;
        if (aVar != null) {
            aVar.b(c.a.a());
        }
        this.f32990e = null;
    }

    @Override // androidx.work.c
    public p m() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0486c() { // from class: r4.h
            @Override // androidx.concurrent.futures.c.InterfaceC0486c
            public final Object a(c.a aVar) {
                return this.f58577a.p(aVar);
            }
        });
    }
}
