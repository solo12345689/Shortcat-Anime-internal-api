package io.sentry.android.core.internal.tombstone;

import io.sentry.EnumC5215i3;
import io.sentry.V2;
import io.sentry.protocol.B;
import io.sentry.protocol.C;
import io.sentry.protocol.C5254d;
import io.sentry.protocol.D;
import io.sentry.protocol.s;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f49817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f49818b;

    public a(InputStream inputStream) {
        HashMap map = new HashMap();
        this.f49818b = map;
        this.f49817a = inputStream;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    private io.sentry.protocol.m a(m mVar) {
        String str;
        io.sentry.protocol.m mVar2 = new io.sentry.protocol.m();
        k kVarK = mVar.K();
        String strA = H2.h.a(" ", mVar.H());
        if (!mVar.N()) {
            mVar2.f(String.format(Locale.ROOT, "Fatal exit pid = %d (%s)", Integer.valueOf(mVar.J()), strA));
            return mVar2;
        }
        String strG = mVar.G();
        Locale locale = Locale.ROOT;
        if (strG.isEmpty()) {
            str = "";
        } else {
            str = strG + ": ";
        }
        mVar2.f(String.format(locale, "%sFatal signal %s (%d), %s (%d), pid = %d (%s)", str, kVarK.J(), Integer.valueOf(kVarK.K()), kVarK.H(), Integer.valueOf(kVarK.G()), Integer.valueOf(mVar.J()), strA));
        return mVar2;
    }

    private C5254d b(m mVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = mVar.I().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        C5254d c5254d = new C5254d();
        c5254d.e(arrayList);
        return c5254d;
    }

    private List g(m mVar) {
        s sVar = new s();
        if (mVar.N()) {
            k kVarK = mVar.K();
            sVar.p(kVarK.J());
            sVar.r((String) this.f49818b.get(kVarK.J()));
            sVar.l(h(kVarK));
        }
        sVar.o(Long.valueOf(mVar.M()));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(sVar);
        return arrayList;
    }

    private static io.sentry.protocol.l h(k kVar) {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.r("signalhandler");
        lVar.n(Boolean.FALSE);
        lVar.q(Boolean.TRUE);
        HashMap map = new HashMap();
        map.put("number", Integer.valueOf(kVar.K()));
        map.put("name", kVar.J());
        map.put("code", Integer.valueOf(kVar.G()));
        map.put("code_name", kVar.H());
        lVar.o(map);
        return lVar;
    }

    private static C j(l lVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = lVar.G().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            new B();
            throw null;
        }
        C c10 = new C();
        c10.f(arrayList);
        c10.g(C.b.NONE);
        HashMap map = new HashMap();
        Iterator it2 = lVar.K().iterator();
        if (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            throw null;
        }
        c10.h(map);
        return c10;
    }

    private List k(m mVar, s sVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = mVar.L().entrySet().iterator();
        while (it.hasNext()) {
            l lVar = (l) ((Map.Entry) it.next()).getValue();
            D d10 = new D();
            d10.u(Long.valueOf(((Integer) r2.getKey()).intValue()));
            d10.w(lVar.J());
            C cJ = j(lVar);
            d10.y(cJ);
            if (mVar.M() == lVar.I()) {
                d10.q(Boolean.TRUE);
                sVar.n(cJ);
            }
            arrayList.add(d10);
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f49817a.close();
    }

    public V2 l() {
        m mVarP = m.P(this.f49817a);
        V2 v22 = new V2();
        v22.C0(EnumC5215i3.FATAL);
        v22.Y("native");
        v22.D0(a(mVarP));
        v22.T(b(mVarP));
        v22.A0(g(mVarP));
        List listP0 = v22.p0();
        Objects.requireNonNull(listP0);
        v22.F0(k(mVarP, (s) listP0.get(0)));
        return v22;
    }
}
