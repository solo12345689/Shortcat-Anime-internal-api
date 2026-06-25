package u8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f61441c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f61442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f61443b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f61444a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f61445b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f61444a, Collections.unmodifiableList(this.f61445b));
        }

        public a b(List list) {
            this.f61445b = list;
            return this;
        }

        public a c(String str) {
            this.f61444a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f61442a = str;
        this.f61443b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f61443b;
    }

    public String b() {
        return this.f61442a;
    }
}
