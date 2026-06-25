package x6;

import android.net.Uri;
import s5.InterfaceC6433d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class p implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p f63983a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f63984b = false;

    protected p() {
    }

    public static synchronized p f() {
        try {
            if (f63983a == null) {
                f63983a = new p();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63983a;
    }

    @Override // x6.k
    public InterfaceC6433d a(K6.b bVar, Object obj) {
        C7057b c7057b = new C7057b(e(bVar.v()).toString(), bVar.r(), bVar.t(), bVar.h(), null, null);
        if (f63984b) {
            c7057b.d(null);
            return c7057b;
        }
        c7057b.d(obj);
        return c7057b;
    }

    @Override // x6.k
    public InterfaceC6433d b(K6.b bVar, Object obj) {
        InterfaceC6433d interfaceC6433d;
        String name;
        K6.d dVarL = bVar.l();
        if (dVarL != null) {
            InterfaceC6433d interfaceC6433dB = dVarL.b();
            name = dVarL.getClass().getName();
            interfaceC6433d = interfaceC6433dB;
        } else {
            interfaceC6433d = null;
            name = null;
        }
        C7057b c7057b = new C7057b(e(bVar.v()).toString(), bVar.r(), bVar.t(), bVar.h(), interfaceC6433d, name);
        if (f63984b) {
            c7057b.d(null);
            return c7057b;
        }
        c7057b.d(obj);
        return c7057b;
    }

    @Override // x6.k
    public InterfaceC6433d c(K6.b bVar, Uri uri, Object obj) {
        return new s5.i(e(uri).toString());
    }

    @Override // x6.k
    public InterfaceC6433d d(K6.b bVar, Object obj) {
        return c(bVar, bVar.v(), obj);
    }

    protected Uri e(Uri uri) {
        return uri;
    }
}
