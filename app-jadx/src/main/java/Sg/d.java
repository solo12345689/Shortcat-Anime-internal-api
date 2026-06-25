package sg;

import Df.r;
import Td.L;
import Ud.AbstractC2279u;
import com.adjust.sdk.network.ErrorCodes;
import dg.C;
import dg.C4618A;
import dg.E;
import dg.EnumC4619B;
import dg.I;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import dg.J;
import fg.AbstractC4807e;
import ig.AbstractC5097a;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.C5870f;
import sg.g;
import tg.C6686k;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements I, g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f59742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J f59743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f59744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f59745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sg.e f59746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f59747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f59748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC4624e f59749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC5097a f59750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private sg.g f59751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private sg.h f59752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ig.d f59753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f59754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AbstractC0900d f59755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque f59756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayDeque f59757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f59758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f59759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f59760s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f59761t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f59762u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f59763v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f59764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f59765x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f59766y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f59741z = new b(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final List f59740A = AbstractC2279u.e(EnumC4619B.HTTP_1_1);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f59767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C6686k f59768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f59769c;

        public a(int i10, C6686k c6686k, long j10) {
            this.f59767a = i10;
            this.f59768b = c6686k;
            this.f59769c = j10;
        }

        public final long a() {
            return this.f59769c;
        }

        public final int b() {
            return this.f59767a;
        }

        public final C6686k c() {
            return this.f59768b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f59770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C6686k f59771b;

        public c(int i10, C6686k data) {
            AbstractC5504s.h(data, "data");
            this.f59770a = i10;
            this.f59771b = data;
        }

        public final C6686k a() {
            return this.f59771b;
        }

        public final int b() {
            return this.f59770a;
        }
    }

    /* JADX INFO: renamed from: sg.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractC0900d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f59772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC6685j f59773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC6684i f59774c;

        public AbstractC0900d(boolean z10, InterfaceC6685j source, InterfaceC6684i sink) {
            AbstractC5504s.h(source, "source");
            AbstractC5504s.h(sink, "sink");
            this.f59772a = z10;
            this.f59773b = source;
            this.f59774c = sink;
        }

        public final boolean a() {
            return this.f59772a;
        }

        public final InterfaceC6684i b() {
            return this.f59774c;
        }

        public final InterfaceC6685j g() {
            return this.f59773b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class e extends AbstractC5097a {
        public e() {
            super(d.this.f59754m + " writer", false, 2, null);
        }

        @Override // ig.AbstractC5097a
        public long f() {
            try {
                return d.this.w() ? 0L : -1L;
            } catch (IOException e10) {
                d.this.p(e10, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC4625f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f59777b;

        f(C c10) {
            this.f59777b = c10;
        }

        @Override // dg.InterfaceC4625f
        public void h(InterfaceC4624e call, E response) throws Throwable {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(response, "response");
            jg.c cVarQ = response.q();
            try {
                d.this.m(response, cVarQ);
                AbstractC5504s.e(cVarQ);
                AbstractC0900d abstractC0900dN = cVarQ.n();
                sg.e eVarA = sg.e.f59781g.a(response.E());
                d.this.f59746e = eVarA;
                if (!d.this.s(eVarA)) {
                    d dVar = d.this;
                    synchronized (dVar) {
                        dVar.f59757p.clear();
                        dVar.e(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    d.this.r(AbstractC4807e.f47070i + " WebSocket " + this.f59777b.p().o(), abstractC0900dN);
                    d.this.q().f(d.this, response);
                    d.this.t();
                } catch (Exception e10) {
                    d.this.p(e10, null);
                }
            } catch (IOException e11) {
                d.this.p(e11, response);
                AbstractC4807e.m(response);
                if (cVarQ != null) {
                    cVarQ.v();
                }
            }
        }

        @Override // dg.InterfaceC4625f
        public void j(InterfaceC4624e call, IOException e10) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(e10, "e");
            d.this.p(e10, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AbstractC5097a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f59778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f59779f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, d dVar, long j10) {
            super(str, false, 2, null);
            this.f59778e = dVar;
            this.f59779f = j10;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            this.f59778e.x();
            return this.f59779f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends AbstractC5097a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f59780e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, d dVar) {
            super(str, z10);
            this.f59780e = dVar;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            this.f59780e.l();
            return -1L;
        }
    }

    public d(ig.e taskRunner, C originalRequest, J listener, Random random, long j10, sg.e eVar, long j11) {
        AbstractC5504s.h(taskRunner, "taskRunner");
        AbstractC5504s.h(originalRequest, "originalRequest");
        AbstractC5504s.h(listener, "listener");
        AbstractC5504s.h(random, "random");
        this.f59742a = originalRequest;
        this.f59743b = listener;
        this.f59744c = random;
        this.f59745d = j10;
        this.f59746e = eVar;
        this.f59747f = j11;
        this.f59753l = taskRunner.i();
        this.f59756o = new ArrayDeque();
        this.f59757p = new ArrayDeque();
        this.f59760s = -1;
        if (!AbstractC5504s.c("GET", originalRequest.l())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.l()).toString());
        }
        C6686k.a aVar = C6686k.f61044d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        L l10 = L.f17438a;
        this.f59748g = C6686k.a.j(aVar, bArr, 0, 0, 3, null).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s(sg.e eVar) {
        if (!eVar.f59787f && eVar.f59783b == null) {
            return eVar.f59785d == null || new C5870f(8, 15).H(eVar.f59785d.intValue());
        }
        return false;
    }

    private final void u() {
        if (!AbstractC4807e.f47069h || Thread.holdsLock(this)) {
            AbstractC5097a abstractC5097a = this.f59750i;
            if (abstractC5097a != null) {
                ig.d.j(this.f59753l, abstractC5097a, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final synchronized boolean v(C6686k c6686k, int i10) {
        if (!this.f59762u && !this.f59759r) {
            if (this.f59758q + ((long) c6686k.K()) > 16777216) {
                e(ErrorCodes.SERVER_RETRY_IN, null);
                return false;
            }
            this.f59758q += (long) c6686k.K();
            this.f59757p.add(new c(i10, c6686k));
            u();
            return true;
        }
        return false;
    }

    @Override // sg.g.a
    public void a(String text) {
        AbstractC5504s.h(text, "text");
        this.f59743b.d(this, text);
    }

    @Override // dg.I
    public boolean b(C6686k bytes) {
        AbstractC5504s.h(bytes, "bytes");
        return v(bytes, 2);
    }

    @Override // sg.g.a
    public synchronized void c(C6686k payload) {
        AbstractC5504s.h(payload, "payload");
        this.f59765x++;
        this.f59766y = false;
    }

    @Override // sg.g.a
    public void d(C6686k bytes) {
        AbstractC5504s.h(bytes, "bytes");
        this.f59743b.e(this, bytes);
    }

    @Override // dg.I
    public boolean e(int i10, String str) {
        return n(i10, str, 60000L);
    }

    @Override // sg.g.a
    public synchronized void f(C6686k payload) {
        try {
            AbstractC5504s.h(payload, "payload");
            if (!this.f59762u && (!this.f59759r || !this.f59757p.isEmpty())) {
                this.f59756o.add(payload);
                u();
                this.f59764w++;
            }
        } finally {
        }
    }

    @Override // sg.g.a
    public void g(int i10, String reason) {
        AbstractC0900d abstractC0900d;
        sg.g gVar;
        sg.h hVar;
        AbstractC5504s.h(reason, "reason");
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.f59760s != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f59760s = i10;
                this.f59761t = reason;
                abstractC0900d = null;
                if (this.f59759r && this.f59757p.isEmpty()) {
                    AbstractC0900d abstractC0900d2 = this.f59755n;
                    this.f59755n = null;
                    gVar = this.f59751j;
                    this.f59751j = null;
                    hVar = this.f59752k;
                    this.f59752k = null;
                    this.f59753l.n();
                    abstractC0900d = abstractC0900d2;
                } else {
                    gVar = null;
                    hVar = null;
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.f59743b.b(this, i10, reason);
            if (abstractC0900d != null) {
                this.f59743b.a(this, i10, reason);
            }
        } finally {
            if (abstractC0900d != null) {
                AbstractC4807e.m(abstractC0900d);
            }
            if (gVar != null) {
                AbstractC4807e.m(gVar);
            }
            if (hVar != null) {
                AbstractC4807e.m(hVar);
            }
        }
    }

    public void l() {
        InterfaceC4624e interfaceC4624e = this.f59749h;
        AbstractC5504s.e(interfaceC4624e);
        interfaceC4624e.cancel();
    }

    public final void m(E response, jg.c cVar) throws ProtocolException {
        AbstractC5504s.h(response, "response");
        if (response.o() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.o() + ' ' + response.O() + '\'');
        }
        String strD = E.D(response, "Connection", null, 2, null);
        if (!r.B("Upgrade", strD, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strD + '\'');
        }
        String strD2 = E.D(response, "Upgrade", null, 2, null);
        if (!r.B("websocket", strD2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strD2 + '\'');
        }
        String strD3 = E.D(response, "Sec-WebSocket-Accept", null, 2, null);
        String strB = C6686k.f61044d.g(this.f59748g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").I().b();
        if (AbstractC5504s.c(strB, strD3)) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strB + "' but was '" + strD3 + '\'');
    }

    public final synchronized boolean n(int i10, String str, long j10) {
        C6686k c6686kG;
        try {
            sg.f.f59788a.c(i10);
            if (str != null) {
                c6686kG = C6686k.f61044d.g(str);
                if (c6686kG.K() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                c6686kG = null;
            }
            if (!this.f59762u && !this.f59759r) {
                this.f59759r = true;
                this.f59757p.add(new a(i10, c6686kG, j10));
                u();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void o(C4618A client) {
        AbstractC5504s.h(client, "client");
        if (this.f59742a.h("Sec-WebSocket-Extensions") != null) {
            p(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        C4618A c4618aC = client.F().h(dg.r.f45571b).O(f59740A).c();
        C cB = this.f59742a.m().e("Upgrade", "websocket").e("Connection", "Upgrade").e("Sec-WebSocket-Key", this.f59748g).e("Sec-WebSocket-Version", "13").e("Sec-WebSocket-Extensions", "permessage-deflate").b();
        jg.e eVar = new jg.e(c4618aC, cB, true);
        this.f59749h = eVar;
        AbstractC5504s.e(eVar);
        eVar.O1(new f(cB));
    }

    public final void p(Exception e10, E e11) {
        AbstractC5504s.h(e10, "e");
        synchronized (this) {
            if (this.f59762u) {
                return;
            }
            this.f59762u = true;
            AbstractC0900d abstractC0900d = this.f59755n;
            this.f59755n = null;
            sg.g gVar = this.f59751j;
            this.f59751j = null;
            sg.h hVar = this.f59752k;
            this.f59752k = null;
            this.f59753l.n();
            L l10 = L.f17438a;
            try {
                this.f59743b.c(this, e10, e11);
            } finally {
                if (abstractC0900d != null) {
                    AbstractC4807e.m(abstractC0900d);
                }
                if (gVar != null) {
                    AbstractC4807e.m(gVar);
                }
                if (hVar != null) {
                    AbstractC4807e.m(hVar);
                }
            }
        }
    }

    public final J q() {
        return this.f59743b;
    }

    public final void r(String name, AbstractC0900d streams) throws Throwable {
        Throwable th2;
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(streams, "streams");
        sg.e eVar = this.f59746e;
        AbstractC5504s.e(eVar);
        synchronized (this) {
            try {
                this.f59754m = name;
                this.f59755n = streams;
                this.f59752k = new sg.h(streams.a(), streams.b(), this.f59744c, eVar.f59782a, eVar.a(streams.a()), this.f59747f);
                this.f59750i = new e();
                long j10 = this.f59745d;
                if (j10 != 0) {
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                        this.f59753l.i(new g(name + " ping", this, nanos), nanos);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (!this.f59757p.isEmpty()) {
                    u();
                }
                L l10 = L.f17438a;
                this.f59751j = new sg.g(streams.a(), streams.g(), this, eVar.f59782a, eVar.a(!streams.a()));
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    @Override // dg.I
    public boolean send(String text) {
        AbstractC5504s.h(text, "text");
        return v(C6686k.f61044d.g(text), 1);
    }

    public final void t() throws IOException {
        while (this.f59760s == -1) {
            sg.g gVar = this.f59751j;
            AbstractC5504s.e(gVar);
            gVar.a();
        }
    }

    public final boolean w() {
        String str;
        sg.g gVar;
        sg.h hVar;
        int i10;
        AbstractC0900d abstractC0900d;
        synchronized (this) {
            try {
                if (this.f59762u) {
                    return false;
                }
                sg.h hVar2 = this.f59752k;
                Object objPoll = this.f59756o.poll();
                Object obj = null;
                if (objPoll == null) {
                    Object objPoll2 = this.f59757p.poll();
                    if (objPoll2 instanceof a) {
                        i10 = this.f59760s;
                        str = this.f59761t;
                        if (i10 != -1) {
                            abstractC0900d = this.f59755n;
                            this.f59755n = null;
                            gVar = this.f59751j;
                            this.f59751j = null;
                            hVar = this.f59752k;
                            this.f59752k = null;
                            this.f59753l.n();
                        } else {
                            long jA = ((a) objPoll2).a();
                            this.f59753l.i(new h(this.f59754m + " cancel", true, this), TimeUnit.MILLISECONDS.toNanos(jA));
                            abstractC0900d = null;
                            gVar = null;
                            hVar = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        gVar = null;
                        hVar = null;
                        i10 = -1;
                        abstractC0900d = null;
                    }
                    obj = objPoll2;
                } else {
                    str = null;
                    gVar = null;
                    hVar = null;
                    i10 = -1;
                    abstractC0900d = null;
                }
                L l10 = L.f17438a;
                try {
                    if (objPoll != null) {
                        AbstractC5504s.e(hVar2);
                        hVar2.j((C6686k) objPoll);
                    } else if (obj instanceof c) {
                        c cVar = (c) obj;
                        AbstractC5504s.e(hVar2);
                        hVar2.g(cVar.b(), cVar.a());
                        synchronized (this) {
                            this.f59758q -= (long) cVar.a().K();
                        }
                    } else {
                        if (!(obj instanceof a)) {
                            throw new AssertionError();
                        }
                        a aVar = (a) obj;
                        AbstractC5504s.e(hVar2);
                        hVar2.a(aVar.b(), aVar.c());
                        if (abstractC0900d != null) {
                            J j10 = this.f59743b;
                            AbstractC5504s.e(str);
                            j10.a(this, i10, str);
                        }
                    }
                    return true;
                } finally {
                    if (abstractC0900d != null) {
                        AbstractC4807e.m(abstractC0900d);
                    }
                    if (gVar != null) {
                        AbstractC4807e.m(gVar);
                    }
                    if (hVar != null) {
                        AbstractC4807e.m(hVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        synchronized (this) {
            try {
                if (this.f59762u) {
                    return;
                }
                sg.h hVar = this.f59752k;
                if (hVar == null) {
                    return;
                }
                int i10 = this.f59766y ? this.f59763v : -1;
                this.f59763v++;
                this.f59766y = true;
                L l10 = L.f17438a;
                if (i10 == -1) {
                    try {
                        hVar.h(C6686k.f61045e);
                        return;
                    } catch (IOException e10) {
                        p(e10, null);
                        return;
                    }
                }
                p(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f59745d + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
