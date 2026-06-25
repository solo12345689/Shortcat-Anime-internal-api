package b5;

import S4.g;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b0 implements S4.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S4.g f33148d = S4.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final S4.g f33149e = S4.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f33150f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f33151g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f33152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V4.d f33153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f33154c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f33155a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // S4.g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f33155a) {
                this.f33155a.position(0);
                messageDigest.update(this.f33155a.putLong(l10.longValue()).array());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f33156a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // S4.g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f33156a) {
                this.f33156a.position(0);
                messageDigest.update(this.f33156a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements e {
        private c() {
        }

        @Override // b5.b0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // b5.b0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface e {
        void a(MediaExtractor mediaExtractor, Object obj);

        void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g implements e {
        g() {
        }

        @Override // b5.b0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // b5.b0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    b0(V4.d dVar, e eVar) {
        this(dVar, eVar, f33150f);
    }

    public static S4.j c(V4.d dVar) {
        return new b0(dVar, new c(null));
    }

    public static S4.j d(V4.d dVar) {
        return new b0(dVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (j()) {
            try {
                if (i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                if (!Log.isLoggable("VideoDecoder", 3)) {
                    return bitmap;
                }
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                return bitmap;
            }
        }
        return bitmap;
    }

    private Bitmap f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, AbstractC3012n abstractC3012n) {
        if (l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapH = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || abstractC3012n == AbstractC3012n.f33179f) ? null : h(mediaMetadataRetriever, j10, i10, i11, i12, abstractC3012n);
        if (bitmapH == null) {
            bitmapH = g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap bitmapE = e(mediaMetadataRetriever, bitmapH);
        if (bitmapE != null) {
            return bitmapE;
        }
        throw new h();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, AbstractC3012n abstractC3012n) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fB = abstractC3012n.b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fB), Math.round(fB * i14));
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    private static boolean k() {
        Iterator it = f33151g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:23:0x0053, B:25:0x0059), top: B:40:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean l(java.lang.Object r6, android.media.MediaMetadataRetriever r7) {
        /*
            r5 = this;
            java.lang.String r0 = "VideoDecoder"
            java.lang.String r1 = android.os.Build.DEVICE
            r2 = 0
            if (r1 == 0) goto L6d
            java.lang.String r3 = ".+_cheets|cheets_.+"
            boolean r1 = r1.matches(r3)
            if (r1 == 0) goto L6d
            r1 = 12
            r3 = 0
            java.lang.String r7 = r7.extractMetadata(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "video/webm"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L1f
            return r2
        L1f:
            android.media.MediaExtractor r7 = new android.media.MediaExtractor     // Catch: java.lang.Throwable -> L51
            r7.<init>()     // Catch: java.lang.Throwable -> L51
            b5.b0$e r1 = r5.f33152a     // Catch: java.lang.Throwable -> L4a
            r1.a(r7, r6)     // Catch: java.lang.Throwable -> L4a
            int r6 = r7.getTrackCount()     // Catch: java.lang.Throwable -> L4a
            r1 = r2
        L2e:
            if (r1 >= r6) goto L4d
            android.media.MediaFormat r3 = r7.getTrackFormat(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "mime"
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "video/x-vnd.on2.vp8"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L47
            r7.release()
            r6 = 1
            return r6
        L47:
            int r1 = r1 + 1
            goto L2e
        L4a:
            r6 = move-exception
            r3 = r7
            goto L52
        L4d:
            r7.release()
            goto L66
        L51:
            r6 = move-exception
        L52:
            r7 = 3
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L61
            java.lang.String r7 = "Exception trying to extract track info for a webm video on CrOS."
            android.util.Log.d(r0, r7, r6)     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r6 = move-exception
            goto L67
        L61:
            if (r3 == 0) goto L66
            r3.release()
        L66:
            return r2
        L67:
            if (r3 == 0) goto L6c
            r3.release()
        L6c:
            throw r6
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.b0.l(java.lang.Object, android.media.MediaMetadataRetriever):boolean");
    }

    public static S4.j m(V4.d dVar) {
        return new b0(dVar, new g());
    }

    @Override // S4.j
    public U4.v a(Object obj, int i10, int i11, S4.h hVar) throws Exception {
        long jLongValue = ((Long) hVar.c(f33148d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) hVar.c(f33149e);
        if (num == null) {
            num = 2;
        }
        AbstractC3012n abstractC3012n = (AbstractC3012n) hVar.c(AbstractC3012n.f33181h);
        if (abstractC3012n == null) {
            abstractC3012n = AbstractC3012n.f33180g;
        }
        AbstractC3012n abstractC3012n2 = abstractC3012n;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f33154c.a();
        try {
            this.f33152a.b(mediaMetadataRetrieverA, obj);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Bitmap bitmapF = f(obj, mediaMetadataRetrieverA, jLongValue, num.intValue(), i10, i11, abstractC3012n2);
            if (Build.VERSION.SDK_INT >= 29) {
                z1.e.a(mediaMetadataRetrieverA);
            } else {
                mediaMetadataRetrieverA.release();
            }
            return C3005g.c(bitmapF, this.f33153b);
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            if (Build.VERSION.SDK_INT >= 29) {
                z1.e.a(mediaMetadataRetrieverA);
                throw th4;
            }
            mediaMetadataRetrieverA.release();
            throw th4;
        }
    }

    @Override // S4.j
    public boolean b(Object obj, S4.h hVar) {
        return true;
    }

    b0(V4.d dVar, e eVar, f fVar) {
        this.f33153b = dVar;
        this.f33152a = eVar;
        this.f33154c = fVar;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d implements e {
        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // b5.b0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // b5.b0.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends MediaDataSource {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f33157a;

            a(ByteBuffer byteBuffer) {
                this.f33157a = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f33157a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f33157a.limit()) {
                    return -1;
                }
                this.f33157a.position((int) j10);
                int iMin = Math.min(i11, this.f33157a.remaining());
                this.f33157a.get(bArr, i10, iMin);
                return iMin;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}
