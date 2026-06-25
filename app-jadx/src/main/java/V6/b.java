package v6;

import Td.L;
import Td.z;
import Ud.S;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.AbstractC3184d;
import com.facebook.imagepipeline.producers.AbstractC3186f;
import com.facebook.imagepipeline.producers.C;
import com.facebook.imagepipeline.producers.InterfaceC3194n;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.e0;
import dg.C;
import dg.C4618A;
import dg.C4623d;
import dg.E;
import dg.F;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v6.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends AbstractC3184d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f61969d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4624e.a f61970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f61971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4623d f61972c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: v6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0932b extends C {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f61973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f61974g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f61975h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0932b(InterfaceC3194n consumer, e0 producerContext) {
            super(consumer, producerContext);
            AbstractC5504s.h(consumer, "consumer");
            AbstractC5504s.h(producerContext, "producerContext");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC3186f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4624e f61976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f61977b;

        c(InterfaceC4624e interfaceC4624e, b bVar) {
            this.f61976a = interfaceC4624e;
            this.f61977b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(InterfaceC4624e interfaceC4624e) {
            interfaceC4624e.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            if (!AbstractC5504s.c(Looper.myLooper(), Looper.getMainLooper())) {
                this.f61976a.cancel();
                return;
            }
            Executor executor = this.f61977b.f61971b;
            final InterfaceC4624e interfaceC4624e = this.f61976a;
            executor.execute(new Runnable() { // from class: v6.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.f(interfaceC4624e);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC4625f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0932b f61978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f61979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ X.a f61980c;

        d(C0932b c0932b, b bVar, X.a aVar) {
            this.f61978a = c0932b;
            this.f61979b = bVar;
            this.f61980c = aVar;
        }

        @Override // dg.InterfaceC4625f
        public void h(InterfaceC4624e call, E response) throws IOException {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(response, "response");
            this.f61978a.f61974g = SystemClock.elapsedRealtime();
            F fJ = response.j();
            if (fJ == null) {
                b bVar = this.f61979b;
                bVar.m(call, bVar.n("Response body null: " + response, response), this.f61980c);
                return;
            }
            b bVar2 = this.f61979b;
            X.a aVar = this.f61980c;
            C0932b c0932b = this.f61978a;
            try {
                try {
                    if (response.J()) {
                        y6.b bVarC = y6.b.f64832c.c(response.z("Content-Range"));
                        if (bVarC != null && (bVarC.f64834a != 0 || bVarC.f64835b != Integer.MAX_VALUE)) {
                            c0932b.j(bVarC);
                            c0932b.i(8);
                        }
                        aVar.c(fJ.a(), fJ.h() < 0 ? 0 : (int) fJ.h());
                    } else {
                        bVar2.m(call, bVar2.n("Unexpected HTTP code " + response, response), aVar);
                    }
                } catch (Exception e10) {
                    bVar2.m(call, e10, aVar);
                }
                L l10 = L.f17438a;
                fe.c.a(fJ, null);
            } finally {
            }
        }

        @Override // dg.InterfaceC4625f
        public void j(InterfaceC4624e call, IOException e10) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(e10, "e");
            this.f61979b.m(call, e10, this.f61980c);
        }
    }

    public /* synthetic */ b(InterfaceC4624e.a aVar, Executor executor, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, executor, (i10 & 4) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(InterfaceC4624e interfaceC4624e, Exception exc, X.a aVar) {
        if (interfaceC4624e.u1()) {
            aVar.b();
        } else {
            aVar.a(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IOException n(String str, E e10) {
        return new IOException(str, v6.d.f61982c.a(e10));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0932b e(InterfaceC3194n consumer, e0 context) {
        AbstractC5504s.h(consumer, "consumer");
        AbstractC5504s.h(context, "context");
        return new C0932b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(C0932b fetchState, X.a callback) {
        AbstractC5504s.h(fetchState, "fetchState");
        AbstractC5504s.h(callback, "callback");
        fetchState.f61973f = SystemClock.elapsedRealtime();
        Uri uriG = fetchState.g();
        AbstractC5504s.g(uriG, "getUri(...)");
        try {
            C.a aVarD = new C.a().m(uriG.toString()).d();
            C4623d c4623d = this.f61972c;
            if (c4623d != null) {
                aVarD.c(c4623d);
            }
            y6.b bVarB = fetchState.b().q().b();
            if (bVarB != null) {
                aVarD.a("Range", bVarB.f());
            }
            dg.C cB = aVarD.b();
            AbstractC5504s.g(cB, "build(...)");
            k(fetchState, callback, cB);
        } catch (Exception e10) {
            callback.a(e10);
        }
    }

    protected void k(C0932b fetchState, X.a callback, dg.C request) {
        AbstractC5504s.h(fetchState, "fetchState");
        AbstractC5504s.h(callback, "callback");
        AbstractC5504s.h(request, "request");
        InterfaceC4624e interfaceC4624eA = this.f61970a.a(request);
        fetchState.b().b(new c(interfaceC4624eA, this));
        interfaceC4624eA.O1(new d(fetchState, this, callback));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Map d(C0932b fetchState, int i10) {
        AbstractC5504s.h(fetchState, "fetchState");
        return S.l(z.a("queue_time", String.valueOf(fetchState.f61974g - fetchState.f61973f)), z.a("fetch_time", String.valueOf(fetchState.f61975h - fetchState.f61974g)), z.a("total_time", String.valueOf(fetchState.f61975h - fetchState.f61973f)), z.a("image_size", String.valueOf(i10)));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(C0932b fetchState, int i10) {
        AbstractC5504s.h(fetchState, "fetchState");
        fetchState.f61975h = SystemClock.elapsedRealtime();
    }

    public b(InterfaceC4624e.a callFactory, Executor cancellationExecutor, boolean z10) {
        AbstractC5504s.h(callFactory, "callFactory");
        AbstractC5504s.h(cancellationExecutor, "cancellationExecutor");
        this.f61970a = callFactory;
        this.f61971b = cancellationExecutor;
        this.f61972c = z10 ? new C4623d.a().e().a() : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(C4618A okHttpClient) {
        AbstractC5504s.h(okHttpClient, "okHttpClient");
        ExecutorService executorServiceC = okHttpClient.t().c();
        AbstractC5504s.g(executorServiceC, "executorService(...)");
        this(okHttpClient, executorServiceC, false, 4, null);
    }
}
