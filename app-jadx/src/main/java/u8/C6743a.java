package u8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r8.AbstractC6286l;

/* JADX INFO: renamed from: u8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6743a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C6743a f61415e = new C0919a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f61416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f61417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f61418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f61419d;

    /* JADX INFO: renamed from: u8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0919a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f61420a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f61421b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f61422c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f61423d = "";

        C0919a() {
        }

        public C0919a a(d dVar) {
            this.f61421b.add(dVar);
            return this;
        }

        public C6743a b() {
            return new C6743a(this.f61420a, Collections.unmodifiableList(this.f61421b), this.f61422c, this.f61423d);
        }

        public C0919a c(String str) {
            this.f61423d = str;
            return this;
        }

        public C0919a d(b bVar) {
            this.f61422c = bVar;
            return this;
        }

        public C0919a e(f fVar) {
            this.f61420a = fVar;
            return this;
        }
    }

    C6743a(f fVar, List list, b bVar, String str) {
        this.f61416a = fVar;
        this.f61417b = list;
        this.f61418c = bVar;
        this.f61419d = str;
    }

    public static C0919a e() {
        return new C0919a();
    }

    public String a() {
        return this.f61419d;
    }

    public b b() {
        return this.f61418c;
    }

    public List c() {
        return this.f61417b;
    }

    public f d() {
        return this.f61416a;
    }

    public byte[] f() {
        return AbstractC6286l.a(this);
    }
}
