package r2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;
import q2.C6088c;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a */
    private final int f58416a;

    /* JADX INFO: renamed from: b */
    private final AudioManager.OnAudioFocusChangeListener f58417b;

    /* JADX INFO: renamed from: c */
    private final Handler f58418c;

    /* JADX INFO: renamed from: d */
    private final C6088c f58419d;

    /* JADX INFO: renamed from: e */
    private final boolean f58420e;

    /* JADX INFO: renamed from: f */
    private final Object f58421f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private int f58422a;

        /* JADX INFO: renamed from: b */
        private AudioManager.OnAudioFocusChangeListener f58423b;

        /* JADX INFO: renamed from: c */
        private Handler f58424c;

        /* JADX INFO: renamed from: d */
        private C6088c f58425d;

        /* JADX INFO: renamed from: e */
        private boolean f58426e;

        /* synthetic */ b(g gVar, a aVar) {
            this(gVar);
        }

        public g a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f58423b;
            if (onAudioFocusChangeListener != null) {
                return new g(this.f58422a, onAudioFocusChangeListener, (Handler) AbstractC6614a.e(this.f58424c), this.f58425d, this.f58426e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(C6088c c6088c) {
            AbstractC6614a.e(c6088c);
            this.f58425d = c6088c;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            AbstractC6614a.e(onAudioFocusChangeListener);
            AbstractC6614a.e(handler);
            this.f58423b = onAudioFocusChangeListener;
            this.f58424c = handler;
            return this;
        }

        public b d(boolean z10) {
            this.f58426e = z10;
            return this;
        }

        public b(int i10) {
            this.f58425d = C6088c.f56745h;
            this.f58422a = i10;
        }

        private b(g gVar) {
            this.f58422a = gVar.e();
            this.f58423b = gVar.f();
            this.f58424c = gVar.d();
            this.f58425d = gVar.b();
            this.f58426e = gVar.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a */
        private final Handler f58427a;

        /* JADX INFO: renamed from: b */
        private final AudioManager.OnAudioFocusChangeListener f58428b;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f58428b = onAudioFocusChangeListener;
            this.f58427a = a0.B(handler.getLooper(), null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            a0.g1(this.f58427a, new Runnable() { // from class: r2.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f58429a.f58428b.onAudioFocusChange(i10);
                }
            });
        }
    }

    g(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C6088c c6088c, boolean z10) {
        this.f58416a = i10;
        this.f58418c = handler;
        this.f58419d = c6088c;
        this.f58420e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f58417b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.f58417b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f58421f = AbstractC6235a.a(i10).setAudioAttributes(c6088c.b().f56759a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f58421f = null;
        }
    }

    public b a() {
        return new b();
    }

    public C6088c b() {
        return this.f58419d;
    }

    AudioFocusRequest c() {
        return f.a(AbstractC6614a.e(this.f58421f));
    }

    public Handler d() {
        return this.f58418c;
    }

    public int e() {
        return this.f58416a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f58416a == gVar.f58416a && this.f58420e == gVar.f58420e && Objects.equals(this.f58417b, gVar.f58417b) && Objects.equals(this.f58418c, gVar.f58418c) && Objects.equals(this.f58419d, gVar.f58419d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f58417b;
    }

    public boolean g() {
        return this.f58420e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f58416a), this.f58417b, this.f58418c, this.f58419d, Boolean.valueOf(this.f58420e));
    }
}
