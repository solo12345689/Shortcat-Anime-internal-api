package ia;

import ga.InterfaceC4870a;
import ga.InterfaceC4871b;
import ia.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a */
    private final Map f48756a;

    /* JADX INFO: renamed from: b */
    private final Map f48757b;

    /* JADX INFO: renamed from: c */
    private final fa.d f48758c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC4871b {

        /* JADX INFO: renamed from: d */
        private static final fa.d f48759d = new fa.d() { // from class: ia.g
            @Override // fa.d
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (fa.e) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        private final Map f48760a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Map f48761b = new HashMap();

        /* JADX INFO: renamed from: c */
        private fa.d f48762c = f48759d;

        public static /* synthetic */ void b(Object obj, fa.e eVar) {
            throw new fa.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f48760a), new HashMap(this.f48761b), this.f48762c);
        }

        public a d(InterfaceC4870a interfaceC4870a) {
            interfaceC4870a.a(this);
            return this;
        }

        @Override // ga.InterfaceC4871b
        /* JADX INFO: renamed from: e */
        public a a(Class cls, fa.d dVar) {
            this.f48760a.put(cls, dVar);
            this.f48761b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, fa.d dVar) {
        this.f48756a = map;
        this.f48757b = map2;
        this.f48758c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new C5051f(outputStream, this.f48756a, this.f48757b, this.f48758c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
