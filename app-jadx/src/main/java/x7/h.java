package x7;

import android.os.Handler;
import android.os.Looper;
import b7.C3026a;
import dg.C;
import dg.C4618A;
import dg.E;
import dg.I;
import dg.J;
import java.nio.channels.ClosedChannelException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6686k;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends J {

    /* JADX INFO: renamed from: i */
    private static final a f64037i = new a(null);

    /* JADX INFO: renamed from: j */
    private static final String f64038j;

    /* JADX INFO: renamed from: a */
    private final String f64039a;

    /* JADX INFO: renamed from: b */
    private c f64040b;

    /* JADX INFO: renamed from: c */
    private final b f64041c;

    /* JADX INFO: renamed from: d */
    private final Handler f64042d;

    /* JADX INFO: renamed from: e */
    private final C4618A f64043e;

    /* JADX INFO: renamed from: f */
    private boolean f64044f;

    /* JADX INFO: renamed from: g */
    private boolean f64045g;

    /* JADX INFO: renamed from: h */
    private I f64046h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a();

        void onConnected();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a(String str);

        void b(C6686k c6686k);
    }

    static {
        String simpleName = h.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        f64038j = simpleName;
    }

    public h(String url, c cVar, b bVar) {
        AbstractC5504s.h(url, "url");
        this.f64039a = url;
        this.f64040b = cVar;
        this.f64041c = bVar;
        this.f64042d = new Handler(Looper.getMainLooper());
        this.f64043e = C3026a.f33222a.b();
    }

    private final void h(String str, Throwable th2) {
        AbstractC7283a.n(f64038j, "Error occurred, shutting down websocket connection: " + str, th2);
        j();
    }

    private final void j() {
        try {
            I i10 = this.f64046h;
            if (i10 != null) {
                i10.e(1000, "End of session");
            }
        } catch (Exception unused) {
        }
        this.f64046h = null;
    }

    private final synchronized void l() {
        if (!this.f64044f) {
            k();
        }
    }

    private final void m() {
        if (this.f64044f) {
            throw new IllegalStateException("Can't reconnect closed client");
        }
        if (!this.f64045g) {
            AbstractC7283a.I(f64038j, "Couldn't connect to \"" + this.f64039a + "\", will silently retry");
            this.f64045g = true;
        }
        this.f64042d.postDelayed(new Runnable() { // from class: x7.g
            @Override // java.lang.Runnable
            public final void run() {
                h.n(this.f64036a);
            }
        }, 2000L);
    }

    public static final void n(h hVar) {
        hVar.l();
    }

    @Override // dg.J
    public synchronized void a(I webSocket, int i10, String reason) {
        try {
            AbstractC5504s.h(webSocket, "webSocket");
            AbstractC5504s.h(reason, "reason");
            this.f64046h = null;
            if (!this.f64044f) {
                b bVar = this.f64041c;
                if (bVar != null) {
                    bVar.a();
                }
                m();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // dg.J
    public synchronized void c(I webSocket, Throwable t10, E e10) {
        try {
            AbstractC5504s.h(webSocket, "webSocket");
            AbstractC5504s.h(t10, "t");
            if (this.f64046h != null) {
                h("Websocket exception", t10);
            }
            if (!this.f64044f) {
                b bVar = this.f64041c;
                if (bVar != null) {
                    bVar.a();
                }
                m();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // dg.J
    public synchronized void d(I webSocket, String text) {
        AbstractC5504s.h(webSocket, "webSocket");
        AbstractC5504s.h(text, "text");
        c cVar = this.f64040b;
        if (cVar != null) {
            cVar.a(text);
        }
    }

    @Override // dg.J
    public synchronized void e(I webSocket, C6686k bytes) {
        AbstractC5504s.h(webSocket, "webSocket");
        AbstractC5504s.h(bytes, "bytes");
        c cVar = this.f64040b;
        if (cVar != null) {
            cVar.b(bytes);
        }
    }

    @Override // dg.J
    public synchronized void f(I webSocket, E response) {
        AbstractC5504s.h(webSocket, "webSocket");
        AbstractC5504s.h(response, "response");
        this.f64046h = webSocket;
        this.f64045g = false;
        b bVar = this.f64041c;
        if (bVar != null) {
            bVar.onConnected();
        }
    }

    public final void i() {
        this.f64044f = true;
        j();
        this.f64040b = null;
        b bVar = this.f64041c;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void k() {
        if (this.f64044f) {
            throw new IllegalStateException("Can't connect closed client");
        }
        this.f64043e.G(new C.a().m(this.f64039a).b(), this);
    }

    public final synchronized void o(String message) {
        AbstractC5504s.h(message, "message");
        I i10 = this.f64046h;
        if (i10 == null) {
            throw new ClosedChannelException();
        }
        i10.send(message);
    }
}
