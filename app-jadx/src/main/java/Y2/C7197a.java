package y2;

import O9.o;
import android.net.Uri;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.util.concurrent.w;
import dg.C;
import dg.C4623d;
import dg.D;
import dg.E;
import dg.F;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import dg.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import q2.AbstractC6076H;
import t2.AbstractC6614a;
import t2.a0;
import w2.AbstractC6935b;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;
import w2.l;
import w2.v;
import w2.x;
import w2.y;
import w2.z;

/* JADX INFO: renamed from: y2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C7197a extends AbstractC6935b implements InterfaceC6940g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4624e.a f64737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f64738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f64739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C4623d f64740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y f64741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o f64742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w2.o f64743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private E f64744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InputStream f64745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f64746n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f64747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f64748p;

    /* JADX INFO: renamed from: y2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0977a implements InterfaceC4625f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f64749a;

        C0977a(w wVar) {
            this.f64749a = wVar;
        }

        @Override // dg.InterfaceC4625f
        public void h(InterfaceC4624e interfaceC4624e, E e10) {
            this.f64749a.F(e10);
        }

        @Override // dg.InterfaceC4625f
        public void j(InterfaceC4624e interfaceC4624e, IOException iOException) {
            this.f64749a.G(iOException);
        }
    }

    /* JADX INFO: renamed from: y2.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC6940g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f64751a = new y();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC4624e.a f64752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f64753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private InterfaceC6932F f64754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private C4623d f64755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private o f64756f;

        public b(InterfaceC4624e.a aVar) {
            this.f64752b = aVar;
        }

        @Override // w2.InterfaceC6940g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7197a a() {
            C7197a c7197a = new C7197a(this.f64752b, this.f64753c, this.f64755e, this.f64751a, this.f64756f, null);
            InterfaceC6932F interfaceC6932F = this.f64754d;
            if (interfaceC6932F != null) {
                c7197a.i(interfaceC6932F);
            }
            return c7197a;
        }

        public final b c(Map map) {
            this.f64751a.a(map);
            return this;
        }

        public b d(String str) {
            this.f64753c = str;
            return this;
        }
    }

    static {
        AbstractC6076H.a("media3.datasource.okhttp");
    }

    /* synthetic */ C7197a(InterfaceC4624e.a aVar, String str, C4623d c4623d, y yVar, o oVar, C0977a c0977a) {
        this(aVar, str, c4623d, yVar, oVar);
    }

    private void t() {
        E e10 = this.f64744l;
        if (e10 != null) {
            ((F) AbstractC6614a.e(e10.j())).close();
        }
        this.f64745m = null;
    }

    private E u(InterfaceC4624e interfaceC4624e) throws IOException {
        w wVarJ = w.J();
        interfaceC4624e.O1(new C0977a(wVarJ));
        try {
            return (E) wVarJ.get();
        } catch (InterruptedException unused) {
            interfaceC4624e.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    private C v(w2.o oVar) throws v {
        long j10 = oVar.f62831g;
        long j11 = oVar.f62832h;
        u uVarL = u.l(oVar.f62825a.toString());
        if (uVarL == null) {
            throw new v("Malformed URL", oVar, ErrorCodes.PROTOCOL_EXCEPTION, 1);
        }
        C.a aVarL = new C.a().l(uVarL);
        C4623d c4623d = this.f64740h;
        if (c4623d != null) {
            aVarL.c(c4623d);
        }
        HashMap map = new HashMap();
        y yVar = this.f64741i;
        if (yVar != null) {
            map.putAll(yVar.b());
        }
        map.putAll(this.f64738f.b());
        map.putAll(oVar.f62829e);
        for (Map.Entry entry : map.entrySet()) {
            aVarL.e((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = z.a(j10, j11);
        if (strA != null) {
            aVarL.a("Range", strA);
        }
        String str = this.f64739g;
        if (str != null) {
            aVarL.a("User-Agent", str);
        }
        if (!oVar.d(1)) {
            aVarL.a("Accept-Encoding", "identity");
        }
        byte[] bArr = oVar.f62828d;
        aVarL.g(oVar.b(), bArr != null ? D.c(bArr) : oVar.f62827c == 2 ? D.c(a0.f60567f) : null);
        return aVarL.b();
    }

    private int w(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f64747o;
        if (j10 != -1) {
            long j11 = j10 - this.f64748p;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) a0.l(this.f64745m)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f64748p += (long) i12;
        p(i12);
        return i12;
    }

    private void x(long j10, w2.o oVar) throws v {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            try {
                int i10 = ((InputStream) a0.l(this.f64745m)).read(bArr, 0, (int) Math.min(j10, 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i10 == -1) {
                    throw new v(oVar, 2008, 1);
                }
                j10 -= (long) i10;
                p(i10);
            } catch (IOException e10) {
                if (!(e10 instanceof v)) {
                    throw new v(oVar, 2000, 1);
                }
                throw ((v) e10);
            }
        }
    }

    @Override // w2.InterfaceC6940g
    public long a(w2.o oVar) throws v {
        byte[] bArrB;
        this.f64743k = oVar;
        long j10 = 0;
        this.f64748p = 0L;
        this.f64747o = 0L;
        r(oVar);
        try {
            E eU = u(this.f64737e.a(v(oVar)));
            this.f64744l = eU;
            F f10 = (F) AbstractC6614a.e(eU.j());
            this.f64745m = f10.a();
            int iO = eU.o();
            if (!eU.J()) {
                if (iO == 416) {
                    if (oVar.f62831g == z.c(eU.E().d("Content-Range"))) {
                        this.f64746n = true;
                        s(oVar);
                        long j11 = oVar.f62832h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                try {
                    bArrB = Q9.a.b((InputStream) AbstractC6614a.e(this.f64745m));
                } catch (IOException unused) {
                    bArrB = a0.f60567f;
                }
                byte[] bArr = bArrB;
                Map mapN = eU.E().n();
                t();
                throw new x(iO, eU.O(), iO == 416 ? new l(2008) : null, mapN, oVar, bArr);
            }
            dg.x xVarJ = f10.j();
            String string = xVarJ != null ? xVarJ.toString() : "";
            o oVar2 = this.f64742j;
            if (oVar2 != null && !oVar2.apply(string)) {
                t();
                throw new w2.w(string, oVar);
            }
            if (iO == 200) {
                long j12 = oVar.f62831g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            long j13 = oVar.f62832h;
            if (j13 != -1) {
                this.f64747o = j13;
            } else {
                long jH = f10.h();
                this.f64747o = jH != -1 ? jH - j10 : -1L;
            }
            this.f64746n = true;
            s(oVar);
            try {
                x(j10, oVar);
                return this.f64747o;
            } catch (v e10) {
                t();
                throw e10;
            }
        } catch (IOException e11) {
            throw v.c(e11, oVar, 1);
        }
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        E e10 = this.f64744l;
        if (e10 != null) {
            return Uri.parse(e10.F0().p().toString());
        }
        w2.o oVar = this.f64743k;
        if (oVar != null) {
            return oVar.f62825a;
        }
        return null;
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        if (this.f64746n) {
            this.f64746n = false;
            q();
            t();
        }
        this.f64744l = null;
        this.f64743k = null;
    }

    @Override // w2.InterfaceC6940g
    public Map f() {
        E e10 = this.f64744l;
        return e10 == null ? Collections.EMPTY_MAP : e10.E().n();
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) throws v {
        try {
            return w(bArr, i10, i11);
        } catch (IOException e10) {
            throw v.c(e10, (w2.o) a0.l(this.f64743k), 2);
        }
    }

    private C7197a(InterfaceC4624e.a aVar, String str, C4623d c4623d, y yVar, o oVar) {
        super(true);
        this.f64737e = (InterfaceC4624e.a) AbstractC6614a.e(aVar);
        this.f64739g = str;
        this.f64740h = c4623d;
        this.f64741i = yVar;
        this.f64742j = oVar;
        this.f64738f = new y();
    }
}
