package C2;

import C2.InterfaceC1177z;
import C2.P;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;
import q2.C6088c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class Z implements P.f {
    private AudioTrack c(InterfaceC1177z.a aVar, C6088c c6088c, int i10, Context context) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(c6088c, aVar.f2801d)).setAudioFormat(t2.a0.N(aVar.f2799b, aVar.f2800c, aVar.f2798a)).setTransferMode(1).setBufferSizeInBytes(aVar.f2803f).setSessionId(i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            g(sessionId, aVar.f2802e);
        }
        if (i11 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return d(sessionId).build();
    }

    private AudioAttributes e(C6088c c6088c, boolean z10) {
        return z10 ? f() : c6088c.b().f56759a;
    }

    private AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void g(AudioTrack.Builder builder, boolean z10) {
        builder.setOffloadedPlayback(z10);
    }

    @Override // C2.P.f
    public final AudioTrack a(InterfaceC1177z.a aVar, C6088c c6088c, int i10, Context context) {
        return c(aVar, c6088c, i10, context);
    }

    protected AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }
}
