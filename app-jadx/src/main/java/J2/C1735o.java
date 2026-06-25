package J2;

import J2.C1735o;
import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: J2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1735o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f9394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f9395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f9396c;

    /* JADX INFO: renamed from: J2.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return C1735o.this.f9395b.a(bundle);
        }
    }

    public C1735o() {
        this(b.f9398a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f9396c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC6614a.g(this.f9394a.add(mediaCodec));
        }
    }

    public void c() {
        this.f9394a.clear();
        LoudnessCodecController loudnessCodecController = this.f9396c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f9394a.remove(mediaCodec) || (loudnessCodecController = this.f9396c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f9396c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f9396c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, com.google.common.util.concurrent.s.a(), new a());
        this.f9396c = loudnessCodecControllerCreate;
        Iterator it = this.f9394a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public C1735o(b bVar) {
        this.f9394a = new HashSet();
        this.f9395b = bVar;
    }

    /* JADX INFO: renamed from: J2.o$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9398a = new b() { // from class: J2.p
            @Override // J2.C1735o.b
            public final Bundle a(Bundle bundle) {
                return C1735o.b.b(bundle);
            }
        };

        Bundle a(Bundle bundle);

        static /* synthetic */ Bundle b(Bundle bundle) {
            return bundle;
        }
    }
}
