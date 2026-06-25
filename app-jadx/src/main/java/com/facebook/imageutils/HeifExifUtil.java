package com.facebook.imageutils;

import androidx.exifinterface.media.a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/imageutils/HeifExifUtil;", "", "<init>", "()V", "Ljava/io/InputStream;", "inputStream", "", "getOrientation", "(Ljava/io/InputStream;)I", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeifExifUtil {
    public static final HeifExifUtil INSTANCE = new HeifExifUtil();

    private HeifExifUtil() {
    }

    public static final int getOrientation(InputStream inputStream) {
        if (inputStream == null) {
            AbstractC7283a.b("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new a(inputStream).c("Orientation", 1);
        } catch (IOException e10) {
            AbstractC7283a.g("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e10);
            return 0;
        }
    }
}
