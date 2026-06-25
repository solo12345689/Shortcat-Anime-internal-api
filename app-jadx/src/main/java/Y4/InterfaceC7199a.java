package y4;

import Gf.C1608f0;
import Gf.K;
import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import oe.AbstractC5874j;
import tg.AbstractC6690o;
import tg.P;

/* JADX INFO: renamed from: y4.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7199a {

    /* JADX INFO: renamed from: y4.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0978a {

        /* JADX INFO: renamed from: a */
        private P f64764a;

        /* JADX INFO: renamed from: f */
        private long f64769f;

        /* JADX INFO: renamed from: b */
        private AbstractC6690o f64765b = AbstractC6690o.f61068b;

        /* JADX INFO: renamed from: c */
        private double f64766c = 0.02d;

        /* JADX INFO: renamed from: d */
        private long f64767d = 10485760;

        /* JADX INFO: renamed from: e */
        private long f64768e = 262144000;

        /* JADX INFO: renamed from: g */
        private K f64770g = C1608f0.b();

        public final InterfaceC7199a a() {
            long jO;
            P p10 = this.f64764a;
            if (p10 == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.f64766c > 0.0d) {
                try {
                    File file = p10.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jO = AbstractC5874j.o((long) (this.f64766c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f64767d, this.f64768e);
                } catch (Exception unused) {
                    jO = this.f64767d;
                }
            } else {
                jO = this.f64769f;
            }
            return new C7202d(jO, p10, this.f64765b, this.f64770g);
        }

        public final C0978a b(File file) {
            return c(P.a.d(P.f60968b, file, false, 1, null));
        }

        public final C0978a c(P p10) {
            this.f64764a = p10;
            return this;
        }

        public final C0978a d(long j10) {
            if (j10 <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.f64766c = 0.0d;
            this.f64769f = j10;
            return this;
        }
    }

    /* JADX INFO: renamed from: y4.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a();

        c b();

        P e();

        P getMetadata();
    }

    /* JADX INFO: renamed from: y4.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c extends Closeable {
        P e();

        P getMetadata();

        b o1();
    }

    b a(String str);

    c b(String str);

    AbstractC6690o getFileSystem();
}
