package J2;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class s extends z2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f9406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9408c;

    public s(Throwable th2, t tVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(tVar == null ? null : tVar.f9409a);
        super(sb2.toString(), th2);
        this.f9406a = tVar;
        this.f9407b = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f9408c = a(th2);
    }

    private static int a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
