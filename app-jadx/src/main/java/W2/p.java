package w2;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;
import w2.InterfaceC6940g;
import w2.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements InterfaceC6940g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f62847b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6940g f62848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC6940g f62849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC6940g f62850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC6940g f62851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC6940g f62852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC6940g f62853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC6940g f62854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC6940g f62855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC6940g f62856k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC6940g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f62857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC6940g.a f62858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InterfaceC6932F f62859c;

        public a(Context context) {
            this(context, new q.b());
        }

        @Override // w2.InterfaceC6940g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a() {
            p pVar = new p(this.f62857a, this.f62858b.a());
            InterfaceC6932F interfaceC6932F = this.f62859c;
            if (interfaceC6932F != null) {
                pVar.i(interfaceC6932F);
            }
            return pVar;
        }

        public a(Context context, InterfaceC6940g.a aVar) {
            this.f62857a = context.getApplicationContext();
            this.f62858b = (InterfaceC6940g.a) AbstractC6614a.e(aVar);
        }
    }

    public p(Context context, InterfaceC6940g interfaceC6940g) {
        this.f62846a = context.getApplicationContext();
        this.f62848c = (InterfaceC6940g) AbstractC6614a.e(interfaceC6940g);
    }

    private void p(InterfaceC6940g interfaceC6940g) {
        for (int i10 = 0; i10 < this.f62847b.size(); i10++) {
            interfaceC6940g.i((InterfaceC6932F) this.f62847b.get(i10));
        }
    }

    private InterfaceC6940g q() {
        if (this.f62850e == null) {
            C6934a c6934a = new C6934a(this.f62846a);
            this.f62850e = c6934a;
            p(c6934a);
        }
        return this.f62850e;
    }

    private InterfaceC6940g r() {
        if (this.f62851f == null) {
            C6937d c6937d = new C6937d(this.f62846a);
            this.f62851f = c6937d;
            p(c6937d);
        }
        return this.f62851f;
    }

    private InterfaceC6940g s() {
        if (this.f62854i == null) {
            C6938e c6938e = new C6938e();
            this.f62854i = c6938e;
            p(c6938e);
        }
        return this.f62854i;
    }

    private InterfaceC6940g t() {
        if (this.f62849d == null) {
            t tVar = new t();
            this.f62849d = tVar;
            p(tVar);
        }
        return this.f62849d;
    }

    private InterfaceC6940g u() {
        if (this.f62855j == null) {
            C6929C c6929c = new C6929C(this.f62846a);
            this.f62855j = c6929c;
            p(c6929c);
        }
        return this.f62855j;
    }

    private InterfaceC6940g v() {
        if (this.f62852g == null) {
            try {
                InterfaceC6940g interfaceC6940g = (InterfaceC6940g) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f62852g = interfaceC6940g;
                p(interfaceC6940g);
            } catch (ClassNotFoundException unused) {
                AbstractC6635w.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f62852g == null) {
                this.f62852g = this.f62848c;
            }
        }
        return this.f62852g;
    }

    private InterfaceC6940g w() {
        if (this.f62853h == null) {
            C6933G c6933g = new C6933G();
            this.f62853h = c6933g;
            p(c6933g);
        }
        return this.f62853h;
    }

    private void x(InterfaceC6940g interfaceC6940g, InterfaceC6932F interfaceC6932F) {
        if (interfaceC6940g != null) {
            interfaceC6940g.i(interfaceC6932F);
        }
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) {
        AbstractC6614a.g(this.f62856k == null);
        String scheme = oVar.f62825a.getScheme();
        if (a0.O0(oVar.f62825a)) {
            String path = oVar.f62825a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f62856k = t();
            } else {
                this.f62856k = q();
            }
        } else if ("asset".equals(scheme)) {
            this.f62856k = q();
        } else if ("content".equals(scheme)) {
            this.f62856k = r();
        } else if ("rtmp".equals(scheme)) {
            this.f62856k = v();
        } else if ("udp".equals(scheme)) {
            this.f62856k = w();
        } else if ("data".equals(scheme)) {
            this.f62856k = s();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f62856k = u();
        } else {
            this.f62856k = this.f62848c;
        }
        return this.f62856k.a(oVar);
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        InterfaceC6940g interfaceC6940g = this.f62856k;
        if (interfaceC6940g == null) {
            return null;
        }
        return interfaceC6940g.c();
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        InterfaceC6940g interfaceC6940g = this.f62856k;
        if (interfaceC6940g != null) {
            try {
                interfaceC6940g.close();
            } finally {
                this.f62856k = null;
            }
        }
    }

    @Override // w2.InterfaceC6940g
    public Map f() {
        InterfaceC6940g interfaceC6940g = this.f62856k;
        return interfaceC6940g == null ? Collections.EMPTY_MAP : interfaceC6940g.f();
    }

    @Override // w2.InterfaceC6940g
    public void i(InterfaceC6932F interfaceC6932F) {
        AbstractC6614a.e(interfaceC6932F);
        this.f62848c.i(interfaceC6932F);
        this.f62847b.add(interfaceC6932F);
        x(this.f62849d, interfaceC6932F);
        x(this.f62850e, interfaceC6932F);
        x(this.f62851f, interfaceC6932F);
        x(this.f62852g, interfaceC6932F);
        x(this.f62853h, interfaceC6932F);
        x(this.f62854i, interfaceC6932F);
        x(this.f62855j, interfaceC6932F);
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) {
        return ((InterfaceC6940g) AbstractC6614a.e(this.f62856k)).read(bArr, i10, i11);
    }
}
