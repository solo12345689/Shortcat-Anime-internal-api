package W4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o5.C5831h;
import o5.k;
import o5.l;
import p5.AbstractC5933a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5831h f20729a = new C5831h(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K1.d f20730b = AbstractC5933a.d(10, new a());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements AbstractC5933a.d {
        a() {
        }

        @Override // p5.AbstractC5933a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements AbstractC5933a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MessageDigest f20732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p5.c f20733b = p5.c.a();

        b(MessageDigest messageDigest) {
            this.f20732a = messageDigest;
        }

        @Override // p5.AbstractC5933a.f
        public p5.c h() {
            return this.f20733b;
        }
    }

    private String a(S4.f fVar) {
        b bVar = (b) k.e((b) this.f20730b.b());
        try {
            fVar.b(bVar.f20732a);
            return l.y(bVar.f20732a.digest());
        } finally {
            this.f20730b.a(bVar);
        }
    }

    public String b(S4.f fVar) {
        String strA;
        synchronized (this.f20729a) {
            strA = (String) this.f20729a.g(fVar);
        }
        if (strA == null) {
            strA = a(fVar);
        }
        synchronized (this.f20729a) {
            this.f20729a.k(fVar, strA);
        }
        return strA;
    }
}
