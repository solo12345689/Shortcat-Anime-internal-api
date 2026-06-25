package Fd;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import expo.modules.video.VideoThumbnail;
import expo.modules.video.records.VideoThumbnailOptions;
import ke.AbstractC5466a;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Fd.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1578q {

    /* JADX INFO: renamed from: Fd.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6651c;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6650b = obj;
            this.f6651c |= Integer.MIN_VALUE;
            return AbstractC1578q.e(null, null, this);
        }
    }

    private static final long a(MediaMetadataRetriever mediaMetadataRetriever, long j10) {
        Double dC = c(mediaMetadataRetriever);
        if (dC == null) {
            return j10;
        }
        return Ef.c.r(AbstractC5466a.e(Ef.a.v(j10) / r0) * dC.doubleValue(), Ef.d.f5969c);
    }

    private static final Bitmap b(Bitmap bitmap, int i10, int i11) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(width / i10, height / i11);
        if (fMax <= 1.0f) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), true);
        AbstractC5504s.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    private static final Double c(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata;
        if (Build.VERSION.SDK_INT >= 28 && (strExtractMetadata = mediaMetadataRetriever.extractMetadata(9)) != null) {
            double d10 = Double.parseDouble(strExtractMetadata);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(32);
            if (strExtractMetadata2 != null) {
                return Double.valueOf((d10 * ((double) 1000)) / Double.parseDouble(strExtractMetadata2));
            }
        }
        return null;
    }

    public static final VideoThumbnail d(MediaMetadataRetriever generateThumbnailAtTime, long j10, VideoThumbnailOptions videoThumbnailOptions) {
        MediaMetadataRetriever mediaMetadataRetriever;
        AbstractC5504s.h(generateThumbnailAtTime, "$this$generateThumbnailAtTime");
        Bitmap frameAtTime = null;
        Pair<Integer, Integer> nativeSizeLimit = videoThumbnailOptions != null ? videoThumbnailOptions.toNativeSizeLimit() : null;
        if (nativeSizeLimit != null) {
            int iIntValue = ((Number) nativeSizeLimit.getFirst()).intValue();
            int iIntValue2 = ((Number) nativeSizeLimit.getSecond()).intValue();
            if (Build.VERSION.SDK_INT >= 27) {
                mediaMetadataRetriever = generateThumbnailAtTime;
                frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(Ef.a.v(j10), 3, iIntValue, iIntValue2);
            } else {
                mediaMetadataRetriever = generateThumbnailAtTime;
                Bitmap frameAtTime2 = mediaMetadataRetriever.getFrameAtTime(Ef.a.v(j10), 3);
                if (frameAtTime2 != null) {
                    frameAtTime = b(frameAtTime2, iIntValue, iIntValue2);
                }
            }
        } else {
            mediaMetadataRetriever = generateThumbnailAtTime;
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(Ef.a.v(j10), 3);
        }
        Bitmap bitmap = frameAtTime;
        if (bitmap != null) {
            return new VideoThumbnail(bitmap, j10, a(mediaMetadataRetriever, j10), null);
        }
        throw new IllegalStateException("Failed to generate thumbnail");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(android.media.MediaMetadataRetriever r4, kotlin.jvm.functions.Function2 r5, Zd.e r6) throws java.lang.Exception {
        /*
            boolean r0 = r6 instanceof Fd.AbstractC1578q.a
            if (r0 == 0) goto L13
            r0 = r6
            Fd.q$a r0 = (Fd.AbstractC1578q.a) r0
            int r1 = r0.f6651c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6651c = r1
            goto L18
        L13:
            Fd.q$a r0 = new Fd.q$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6650b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f6651c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f6649a
            android.media.MediaMetadataRetriever r4 = (android.media.MediaMetadataRetriever) r4
            Td.v.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L49
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Td.v.b(r6)
            r0.f6649a = r4     // Catch: java.lang.Throwable -> L2d
            r0.f6651c = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r5.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2d
            if (r6 != r1) goto L45
            return r1
        L45:
            z1.e.a(r4)
            return r6
        L49:
            z1.e.a(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Fd.AbstractC1578q.e(android.media.MediaMetadataRetriever, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }
}
