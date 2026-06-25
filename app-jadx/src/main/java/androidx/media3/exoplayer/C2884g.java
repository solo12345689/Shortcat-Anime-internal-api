package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.Objects;
import q2.C6088c;
import r2.g;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2884g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O9.t f30764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f30765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f30766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C6088c f30767d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30769f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r2.g f30771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30772i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f30770g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30768e = 0;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void f(float f10);

        void g(int i10);
    }

    public C2884g(final Context context, Looper looper, a aVar) {
        this.f30764a = O9.u.a(new O9.t() { // from class: androidx.media3.exoplayer.f
            @Override // O9.t
            public final Object get() {
                return r2.m.c(context);
            }
        });
        this.f30766c = aVar;
        this.f30765b = new Handler(looper);
    }

    private void c() {
        int i10 = this.f30768e;
        if (i10 == 1 || i10 == 0 || this.f30771h == null) {
            return;
        }
        r2.m.b((AudioManager) this.f30764a.get(), this.f30771h);
    }

    private static int d(C6088c c6088c) {
        if (c6088c == null) {
            return 0;
        }
        switch (c6088c.f56754c) {
            case 0:
                AbstractC6635w.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c6088c.f56752a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
                return 3;
            case 15:
            default:
                AbstractC6635w.i("AudioFocusManager", "Unidentified audio usage: " + c6088c.f56754c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void e(int i10) {
        a aVar = this.f30766c;
        if (aVar != null) {
            aVar.g(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            c();
            l(1);
        } else if (i10 == 1) {
            l(2);
            e(1);
        } else {
            AbstractC6635w.i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private int i() {
        if (this.f30768e == 2) {
            return 1;
        }
        if (j() == 1) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    private int j() {
        r2.g gVar = this.f30771h;
        if (gVar == null || this.f30772i) {
            this.f30771h = (gVar == null ? new g.b(this.f30769f) : gVar.a()).b((C6088c) AbstractC6614a.e(this.f30767d)).d(o()).c(new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.e
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i10) {
                    this.f30747a.g(i10);
                }
            }, this.f30765b).a();
            this.f30772i = false;
        }
        return r2.m.h((AudioManager) this.f30764a.get(), this.f30771h);
    }

    private void l(int i10) {
        if (this.f30768e == i10) {
            return;
        }
        this.f30768e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f30770g == f10) {
            return;
        }
        this.f30770g = f10;
        a aVar = this.f30766c;
        if (aVar != null) {
            aVar.f(f10);
        }
    }

    private boolean m(int i10) {
        return i10 != 1 && this.f30769f == 1;
    }

    private boolean o() {
        C6088c c6088c = this.f30767d;
        return c6088c != null && c6088c.f56752a == 1;
    }

    public float f() {
        return this.f30770g;
    }

    public void h() {
        this.f30766c = null;
        c();
        l(0);
    }

    public void k(C6088c c6088c) {
        if (Objects.equals(this.f30767d, c6088c)) {
            return;
        }
        this.f30767d = c6088c;
        int iD = d(c6088c);
        this.f30769f = iD;
        boolean z10 = true;
        if (iD != 1 && iD != 0) {
            z10 = false;
        }
        AbstractC6614a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int n(boolean z10, int i10) {
        if (!m(i10)) {
            c();
            l(0);
            return 1;
        }
        if (z10) {
            return i();
        }
        int i11 = this.f30768e;
        if (i11 != 1) {
            return i11 != 3 ? 1 : 0;
        }
        return -1;
    }
}
