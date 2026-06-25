package J2;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import q2.C6109x;
import z2.C7278c;

/* JADX INFO: renamed from: J2.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1737q {

    /* JADX INFO: renamed from: J2.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f9399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f9400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C6109x f9401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f9402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f9403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C1735o f9404f;

        private a(t tVar, MediaFormat mediaFormat, C6109x c6109x, Surface surface, MediaCrypto mediaCrypto, C1735o c1735o) {
            this.f9399a = tVar;
            this.f9400b = mediaFormat;
            this.f9401c = c6109x;
            this.f9402d = surface;
            this.f9403e = mediaCrypto;
            this.f9404f = c1735o;
        }

        public static a a(t tVar, MediaFormat mediaFormat, C6109x c6109x, MediaCrypto mediaCrypto, C1735o c1735o) {
            return new a(tVar, mediaFormat, c6109x, null, mediaCrypto, c1735o);
        }

        public static a b(t tVar, MediaFormat mediaFormat, C6109x c6109x, Surface surface, MediaCrypto mediaCrypto) {
            return new a(tVar, mediaFormat, c6109x, surface, mediaCrypto, null);
        }
    }

    /* JADX INFO: renamed from: J2.q$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9405a = new C1730j();

        static b a(Context context) {
            return new C1730j(context);
        }

        InterfaceC1737q b(a aVar);
    }

    /* JADX INFO: renamed from: J2.q$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: J2.q$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void a(InterfaceC1737q interfaceC1737q, long j10, long j11);
    }

    void a();

    void b(int i10, int i11, C7278c c7278c, long j10, int i12);

    void c(int i10, int i11, int i12, long j10, int i13);

    void d(Bundle bundle);

    MediaFormat e();

    void f();

    void flush();

    void g(d dVar, Handler handler);

    void h(int i10);

    ByteBuffer i(int i10);

    void j(Surface surface);

    boolean k();

    void l(int i10, long j10);

    int m();

    default boolean n(c cVar) {
        return false;
    }

    int o(MediaCodec.BufferInfo bufferInfo);

    void p(int i10, boolean z10);

    ByteBuffer q(int i10);
}
