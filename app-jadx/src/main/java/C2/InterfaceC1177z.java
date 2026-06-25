package C2;

import B2.K1;
import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import q2.C6083O;
import q2.C6088c;
import q2.C6092g;
import q2.C6109x;
import t2.InterfaceC6623j;

/* JADX INFO: renamed from: C2.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1177z {

    /* JADX INFO: renamed from: C2.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f2801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f2802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2803f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f2798a = i10;
            this.f2799b = i11;
            this.f2800c = i12;
            this.f2801d = z10;
            this.f2802e = z11;
            this.f2803f = i13;
        }
    }

    /* JADX INFO: renamed from: C2.z$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void a(long j10);

        void b();

        void c(a aVar);

        void d(int i10);

        void e(a aVar);

        void f(boolean z10);

        void g(Exception exc);

        void h();

        void i(int i10, long j10, long j11);

        void j();

        void k();

        void l();
    }

    /* JADX INFO: renamed from: C2.z$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2809b;

        public e(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f2808a = j10;
            this.f2809b = j11;
        }
    }

    /* JADX INFO: renamed from: C2.z$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C6109x f2812c;

        public f(int i10, C6109x c6109x, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f2811b = z10;
            this.f2810a = i10;
            this.f2812c = c6109x;
        }
    }

    void A(C6092g c6092g);

    void B(int i10);

    void C();

    int D(C6109x c6109x);

    void E(d dVar);

    C1163k F(C6109x c6109x);

    boolean G(ByteBuffer byteBuffer, long j10, int i10);

    void H(InterfaceC6623j interfaceC6623j);

    void I();

    void J(int i10, int i11);

    void K(C6109x c6109x, int i10, int[] iArr);

    long L(boolean z10);

    void N();

    void O();

    void P(C6088c c6088c);

    void Q(K1 k12);

    void R(boolean z10);

    void a();

    boolean b(C6109x c6109x);

    C6083O c();

    boolean d();

    void e(C6083O c6083o);

    void flush();

    void pause();

    void reset();

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void u();

    void w(float f10);

    boolean x();

    void y(int i10);

    long z();

    /* JADX INFO: renamed from: C2.z$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6109x f2804a;

        public b(Throwable th2, C6109x c6109x) {
            super(th2);
            this.f2804a = c6109x;
        }

        public b(String str, C6109x c6109x) {
            super(str);
            this.f2804a = c6109x;
        }
    }

    /* JADX INFO: renamed from: C2.z$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C6109x f2807c;

        public c(String str, int i10, C6109x c6109x, boolean z10, Throwable th2) {
            super(str, th2);
            this.f2805a = i10;
            this.f2806b = z10;
            this.f2807c = c6109x;
        }

        public c(int i10, int i11, int i12, int i13, int i14, C6109x c6109x, boolean z10, Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(", ");
            sb2.append(i14);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(c6109x);
            sb2.append(z10 ? " (recoverable)" : "");
            this(sb2.toString(), i10, c6109x, z10, exc);
        }
    }

    default void M(long j10) {
    }
}
