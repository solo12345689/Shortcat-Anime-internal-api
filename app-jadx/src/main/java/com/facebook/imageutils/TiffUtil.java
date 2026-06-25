package com.facebook.imageutils;

import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"Lcom/facebook/imageutils/TiffUtil;", "", "<init>", "()V", "", "orientation", "getAutoRotateAngleFromOrientation", "(I)I", "Ljava/io/InputStream;", "stream", "length", "readOrientationFromTIFF", "(Ljava/io/InputStream;I)I", "Lcom/facebook/imageutils/TiffUtil$a;", "tiffHeader", "c", "(Ljava/io/InputStream;ILcom/facebook/imageutils/TiffUtil$a;)I", "", "isLittleEndian", "tagToFind", "b", "(Ljava/io/InputStream;IZI)I", "a", "(Ljava/io/InputStream;IZ)I", "Ljava/lang/Class;", "Ljava/lang/Class;", "TAG", "TIFF_BYTE_ORDER_BIG_END", "I", "TIFF_BYTE_ORDER_LITTLE_END", "TIFF_TAG_ORIENTATION", "TIFF_TYPE_SHORT", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TiffUtil {
    public static final int TIFF_BYTE_ORDER_BIG_END = 1296891946;
    public static final int TIFF_BYTE_ORDER_LITTLE_END = 1229531648;
    public static final int TIFF_TAG_ORIENTATION = 274;
    public static final int TIFF_TYPE_SHORT = 3;
    public static final TiffUtil INSTANCE = new TiffUtil();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final Class TAG = TiffUtil.class;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f36333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f36335c;

        public final int a() {
            return this.f36334b;
        }

        public final int b() {
            return this.f36335c;
        }

        public final boolean c() {
            return this.f36333a;
        }

        public final void d(int i10) {
            this.f36334b = i10;
        }

        public final void e(int i10) {
            this.f36335c = i10;
        }

        public final void f(boolean z10) {
            this.f36333a = z10;
        }
    }

    private TiffUtil() {
    }

    private final int a(InputStream stream, int length, boolean isLittleEndian) {
        if (length >= 10 && StreamProcessor.readPackedInt(stream, 2, isLittleEndian) == 3 && StreamProcessor.readPackedInt(stream, 4, isLittleEndian) == 1) {
            return StreamProcessor.readPackedInt(stream, 2, isLittleEndian);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int b(java.io.InputStream r7, int r8, boolean r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 14
            r1 = 0
            if (r8 >= r0) goto L6
            return r1
        L6:
            r0 = 2
            int r2 = com.facebook.imageutils.StreamProcessor.readPackedInt(r7, r0, r9)
            int r8 = r8 + (-2)
        Ld:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L27
            r2 = 12
            if (r8 < r2) goto L27
            int r2 = com.facebook.imageutils.StreamProcessor.readPackedInt(r7, r0, r9)
            int r4 = r8 + (-2)
            if (r2 != r10) goto L1e
            return r4
        L1e:
            r4 = 10
            r7.skip(r4)
            int r8 = r8 + (-12)
            r2 = r3
            goto Ld
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.TiffUtil.b(java.io.InputStream, int, boolean, int):int");
    }

    private final int c(InputStream stream, int length, a tiffHeader) {
        if (length <= 8) {
            return 0;
        }
        tiffHeader.d(StreamProcessor.readPackedInt(stream, 4, false));
        if (tiffHeader.a() != 1229531648 && tiffHeader.a() != 1296891946) {
            AbstractC7283a.i(TAG, "Invalid TIFF header");
            return 0;
        }
        tiffHeader.f(tiffHeader.a() == 1229531648);
        tiffHeader.e(StreamProcessor.readPackedInt(stream, 4, tiffHeader.c()));
        int i10 = length - 8;
        if (tiffHeader.b() >= 8 && tiffHeader.b() - 8 <= i10) {
            return i10;
        }
        AbstractC7283a.i(TAG, "Invalid offset");
        return 0;
    }

    public static final int getAutoRotateAngleFromOrientation(int orientation) {
        if (orientation == 0 || orientation == 1) {
            return 0;
        }
        if (orientation == 3) {
            return SensibleDefaults.X_OFFSET;
        }
        if (orientation != 6) {
            return orientation != 8 ? 0 : 270;
        }
        return 90;
    }

    public static final int readOrientationFromTIFF(InputStream stream, int length) throws IOException {
        AbstractC5504s.h(stream, "stream");
        a aVar = new a();
        TiffUtil tiffUtil = INSTANCE;
        int iC = tiffUtil.c(stream, length, aVar);
        int iB = aVar.b() - 8;
        if (iC == 0 || iB > iC) {
            return 0;
        }
        stream.skip(iB);
        return tiffUtil.a(stream, tiffUtil.b(stream, iC - iB, aVar.c(), TIFF_TAG_ORIENTATION), aVar.c());
    }
}
