package O2;

import java.util.Objects;
import q2.C6109x;
import r3.k;
import r3.r;
import s3.C6415a;
import s3.C6417c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f12909a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r3.g f12910b = new r3.g();

        a() {
        }

        @Override // O2.g
        public k a(C6109x c6109x) {
            String str = c6109x.f57022o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new C6415a(str, c6109x.f57002L, 16000L);
                    case "application/cea-708":
                        return new C6417c(c6109x.f57002L, c6109x.f57025r);
                }
            }
            if (!this.f12910b.b(c6109x)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            r rVarA = this.f12910b.a(c6109x);
            return new b(rVarA.getClass().getSimpleName() + "Decoder", rVarA);
        }

        @Override // O2.g
        public boolean b(C6109x c6109x) {
            String str = c6109x.f57022o;
            return this.f12910b.b(c6109x) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }
    }

    k a(C6109x c6109x);

    boolean b(C6109x c6109x);
}
