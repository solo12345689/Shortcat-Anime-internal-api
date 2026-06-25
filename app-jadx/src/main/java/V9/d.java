package V9;

import V9.e;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f19951b = new d(new e.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f19952c = new d(new e.C0345e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f19953d = new d(new e.g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f19954e = new d(new e.f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f19955f = new d(new e.b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f19956g = new d(new e.d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f19957h = new d(new e.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f19958a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V9.e f19959a;

        @Override // V9.d.e
        public Object a(String str) {
            Iterator it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f19959a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f19959a.a(str, null);
        }

        private b(V9.e eVar) {
            this.f19959a = eVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V9.e f19960a;

        @Override // V9.d.e
        public Object a(String str) {
            return this.f19960a.a(str, null);
        }

        private c(V9.e eVar) {
            this.f19960a = eVar;
        }
    }

    /* JADX INFO: renamed from: V9.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0344d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V9.e f19961a;

        @Override // V9.d.e
        public Object a(String str) throws GeneralSecurityException {
            Iterator it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f19961a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        private C0344d(V9.e eVar) {
            this.f19961a = eVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface e {
        Object a(String str);
    }

    public d(V9.e eVar) {
        if (U9.b.c()) {
            this.f19958a = new C0344d(eVar);
        } else if (h.a()) {
            this.f19958a = new b(eVar);
        } else {
            this.f19958a = new c(eVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f19958a.a(str);
    }
}
