package o4;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import n4.AbstractC5748x;
import n4.C5745u;
import n4.InterfaceC5746v;
import p4.InterfaceC5931b;

/* JADX INFO: renamed from: o4.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5817B implements i4.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f54463d = i4.i.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5931b f54464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.work.impl.foreground.a f54465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InterfaceC5746v f54466c;

    /* JADX INFO: renamed from: o4.B$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f54467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f54468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i4.e f54469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f54470d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, i4.e eVar, Context context) {
            this.f54467a = cVar;
            this.f54468b = uuid;
            this.f54469c = eVar;
            this.f54470d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f54467a.isCancelled()) {
                    String string = this.f54468b.toString();
                    C5745u c5745uH = C5817B.this.f54466c.h(string);
                    if (c5745uH == null || c5745uH.f53944b.b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C5817B.this.f54465b.c(string, this.f54469c);
                    this.f54470d.startService(androidx.work.impl.foreground.b.c(this.f54470d, AbstractC5748x.a(c5745uH), this.f54469c));
                }
                this.f54467a.q(null);
            } catch (Throwable th2) {
                this.f54467a.r(th2);
            }
        }
    }

    public C5817B(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, InterfaceC5931b interfaceC5931b) {
        this.f54465b = aVar;
        this.f54464a = interfaceC5931b;
        this.f54466c = workDatabase.J();
    }

    @Override // i4.f
    public com.google.common.util.concurrent.p a(Context context, UUID uuid, i4.e eVar) {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        this.f54464a.c(new a(cVarU, uuid, eVar, context));
        return cVarU;
    }
}
