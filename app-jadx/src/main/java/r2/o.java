package r2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import q2.C6109x;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f58441a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f58442e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f58443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f58444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f58445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f58446d;

        public a(C6109x c6109x) {
            this(c6109x.f56998H, c6109x.f56997G, c6109x.f56999I);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f58443a == aVar.f58443a && this.f58444b == aVar.f58444b && this.f58445c == aVar.f58445c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f58443a), Integer.valueOf(this.f58444b), Integer.valueOf(this.f58445c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f58443a + ", channelCount=" + this.f58444b + ", encoding=" + this.f58445c + ']';
        }

        public a(int i10, int i11, int i12) {
            this.f58443a = i10;
            this.f58444b = i11;
            this.f58445c = i12;
            this.f58446d = a0.L0(i12) ? a0.o0(i12, i11) : -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f58447a;

        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
            this.f58447a = aVar;
        }
    }

    ByteBuffer a();

    boolean b();

    void c(ByteBuffer byteBuffer);

    boolean d();

    void e();

    a f(a aVar);

    void flush();

    void reset();
}
