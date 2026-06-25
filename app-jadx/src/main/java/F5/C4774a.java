package f5;

import P4.a;
import a5.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import o5.AbstractC5830g;
import o5.l;

/* JADX INFO: renamed from: f5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4774a implements S4.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0752a f46854f = new C0752a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f46855g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f46856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f46857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f46858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0752a f46859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4775b f46860e;

    /* JADX INFO: renamed from: f5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C0752a {
        C0752a() {
        }

        P4.a a(a.InterfaceC0215a interfaceC0215a, P4.c cVar, ByteBuffer byteBuffer, int i10) {
            return new P4.e(interfaceC0215a, cVar, byteBuffer, i10);
        }
    }

    /* JADX INFO: renamed from: f5.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f46861a = l.g(0);

        b() {
        }

        synchronized P4.d a(ByteBuffer byteBuffer) {
            P4.d dVar;
            try {
                dVar = (P4.d) this.f46861a.poll();
                if (dVar == null) {
                    dVar = new P4.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVar.p(byteBuffer);
        }

        synchronized void b(P4.d dVar) {
            dVar.a();
            this.f46861a.offer(dVar);
        }
    }

    public C4774a(Context context, List list, V4.d dVar, V4.b bVar) {
        this(context, list, dVar, bVar, f46855g, f46854f);
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, P4.d dVar, S4.h hVar) {
        StringBuilder sb2;
        long jB = AbstractC5830g.b();
        try {
            P4.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = hVar.c(i.f46901a) == S4.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                P4.a aVarA = this.f46859d.a(this.f46860e, cVarC, byteBuffer, e(cVarC, i10, i11));
                aVarA.h(config);
                aVarA.g();
                Bitmap bitmapF = aVarA.f();
                if (bitmapF == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder();
                    }
                    return null;
                }
                e eVar = new e(new C4776c(this.f46856a, aVarA, k.c(), i10, i11, bitmapF));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC5830g.a(jB));
                }
                return eVar;
            }
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                return null;
            }
            sb2 = new StringBuilder();
            sb2.append("Decoded GIF from stream in ");
            sb2.append(AbstractC5830g.a(jB));
            Log.v("BufferGifDecoder", sb2.toString());
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC5830g.a(jB));
            }
            throw th2;
        }
    }

    private static int e(P4.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.a() / i11, cVar.d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a(ByteBuffer byteBuffer, int i10, int i11, S4.h hVar) {
        P4.d dVarA = this.f46858c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, dVarA, hVar);
        } finally {
            this.f46858c.b(dVarA);
        }
    }

    @Override // S4.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, S4.h hVar) {
        return !((Boolean) hVar.c(i.f46902b)).booleanValue() && com.bumptech.glide.load.a.g(this.f46857b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    C4774a(Context context, List list, V4.d dVar, V4.b bVar, b bVar2, C0752a c0752a) {
        this.f46856a = context.getApplicationContext();
        this.f46857b = list;
        this.f46859d = c0752a;
        this.f46860e = new C4775b(dVar, bVar);
        this.f46858c = bVar2;
    }
}
