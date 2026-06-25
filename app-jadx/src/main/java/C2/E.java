package C2;

import C2.C1163k;
import C2.P;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import q2.AbstractC6079K;
import q2.C6088c;
import q2.C6109x;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E implements P.d {

    /* JADX INFO: renamed from: a */
    private final Context f2547a;

    /* JADX INFO: renamed from: b */
    private Boolean f2548b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public static C1163k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? C1163k.f2758d : new C1163k.b().e(true).g(z10).d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public static C1163k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return C1163k.f2758d;
            }
            return new C1163k.b().e(true).f(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).g(z10).d();
        }
    }

    public E(Context context) {
        this.f2547a = context == null ? null : context.getApplicationContext();
    }

    private boolean b(Context context) {
        Boolean bool = this.f2548b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = r2.m.c(context).getParameters("offloadVariableRateSupported");
            this.f2548b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f2548b = Boolean.FALSE;
        }
        return this.f2548b.booleanValue();
    }

    @Override // C2.P.d
    public C1163k a(C6109x c6109x, C6088c c6088c) {
        AbstractC6614a.e(c6109x);
        AbstractC6614a.e(c6088c);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || c6109x.f56998H == -1) {
            return C1163k.f2758d;
        }
        boolean zB = b(this.f2547a);
        int iF = AbstractC6079K.f((String) AbstractC6614a.e(c6109x.f57022o), c6109x.f57018k);
        if (iF == 0 || i10 < t2.a0.M(iF)) {
            return C1163k.f2758d;
        }
        int iO = t2.a0.O(c6109x.f56997G);
        if (iO == 0) {
            return C1163k.f2758d;
        }
        try {
            AudioFormat audioFormatN = t2.a0.N(c6109x.f56998H, iO, iF);
            return i10 >= 31 ? b.a(audioFormatN, c6088c.b().f56759a, zB) : a.a(audioFormatN, c6088c.b().f56759a, zB);
        } catch (IllegalArgumentException unused) {
            return C1163k.f2758d;
        }
    }
}
