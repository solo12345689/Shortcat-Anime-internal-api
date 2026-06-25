package mg;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import dg.C;
import dg.C4618A;
import dg.E;
import dg.EnumC4619B;
import dg.t;
import fg.AbstractC4807e;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kg.AbstractC5482e;
import kg.InterfaceC5481d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.X;
import tg.Z;
import tg.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements InterfaceC5481d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f53617g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f53618h = AbstractC4807e.w("connection", DiagnosticsTracker.HOST_KEY, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f53619i = AbstractC4807e.w("connection", DiagnosticsTracker.HOST_KEY, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jg.f f53620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kg.g f53621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f53622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile i f53623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC4619B f53624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f53625f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(C request) {
            AbstractC5504s.h(request, "request");
            t tVarI = request.i();
            ArrayList arrayList = new ArrayList(tVarI.size() + 4);
            arrayList.add(new c(c.f53507g, request.l()));
            arrayList.add(new c(c.f53508h, kg.i.f52219a.c(request.p())));
            String strH = request.h("Host");
            if (strH != null) {
                arrayList.add(new c(c.f53510j, strH));
            }
            arrayList.add(new c(c.f53509i, request.p().q()));
            int size = tVarI.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strF = tVarI.f(i10);
                Locale US = Locale.US;
                AbstractC5504s.g(US, "US");
                String lowerCase = strF.toLowerCase(US);
                AbstractC5504s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!g.f53618h.contains(lowerCase) || (AbstractC5504s.c(lowerCase, "te") && AbstractC5504s.c(tVarI.p(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, tVarI.p(i10)));
                }
            }
            return arrayList;
        }

        public final E.a b(t headerBlock, EnumC4619B protocol) throws ProtocolException {
            AbstractC5504s.h(headerBlock, "headerBlock");
            AbstractC5504s.h(protocol, "protocol");
            t.a aVar = new t.a();
            int size = headerBlock.size();
            kg.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strF = headerBlock.f(i10);
                String strP = headerBlock.p(i10);
                if (AbstractC5504s.c(strF, ":status")) {
                    kVarA = kg.k.f52222d.a("HTTP/1.1 " + strP);
                } else if (!g.f53619i.contains(strF)) {
                    aVar.c(strF, strP);
                }
            }
            if (kVarA != null) {
                return new E.a().p(protocol).g(kVarA.f52224b).m(kVarA.f52225c).k(aVar.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public g(C4618A client, jg.f connection, kg.g chain, f http2Connection) {
        AbstractC5504s.h(client, "client");
        AbstractC5504s.h(connection, "connection");
        AbstractC5504s.h(chain, "chain");
        AbstractC5504s.h(http2Connection, "http2Connection");
        this.f53620a = connection;
        this.f53621b = chain;
        this.f53622c = http2Connection;
        List listI = client.I();
        EnumC4619B enumC4619B = EnumC4619B.H2_PRIOR_KNOWLEDGE;
        this.f53624e = listI.contains(enumC4619B) ? enumC4619B : EnumC4619B.HTTP_2;
    }

    @Override // kg.InterfaceC5481d
    public void a() {
        i iVar = this.f53623d;
        AbstractC5504s.e(iVar);
        iVar.n().close();
    }

    @Override // kg.InterfaceC5481d
    public void b(C request) throws IOException {
        AbstractC5504s.h(request, "request");
        if (this.f53623d != null) {
            return;
        }
        this.f53623d = this.f53622c.D1(f53617g.a(request), request.e() != null);
        if (this.f53625f) {
            i iVar = this.f53623d;
            AbstractC5504s.e(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f53623d;
        AbstractC5504s.e(iVar2);
        a0 a0VarV = iVar2.v();
        long jG = this.f53621b.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a0VarV.g(jG, timeUnit);
        i iVar3 = this.f53623d;
        AbstractC5504s.e(iVar3);
        iVar3.E().g(this.f53621b.i(), timeUnit);
    }

    @Override // kg.InterfaceC5481d
    public jg.f c() {
        return this.f53620a;
    }

    @Override // kg.InterfaceC5481d
    public void cancel() {
        this.f53625f = true;
        i iVar = this.f53623d;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // kg.InterfaceC5481d
    public Z d(E response) {
        AbstractC5504s.h(response, "response");
        i iVar = this.f53623d;
        AbstractC5504s.e(iVar);
        return iVar.p();
    }

    @Override // kg.InterfaceC5481d
    public E.a e(boolean z10) throws IOException {
        i iVar = this.f53623d;
        if (iVar == null) {
            throw new IOException("stream wasn't created");
        }
        E.a aVarB = f53617g.b(iVar.C(), this.f53624e);
        if (z10 && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // kg.InterfaceC5481d
    public long f(E response) {
        AbstractC5504s.h(response, "response");
        if (AbstractC5482e.b(response)) {
            return AbstractC4807e.v(response);
        }
        return 0L;
    }

    @Override // kg.InterfaceC5481d
    public X g(C request, long j10) {
        AbstractC5504s.h(request, "request");
        i iVar = this.f53623d;
        AbstractC5504s.e(iVar);
        return iVar.n();
    }

    @Override // kg.InterfaceC5481d
    public void h() {
        this.f53622c.flush();
    }
}
