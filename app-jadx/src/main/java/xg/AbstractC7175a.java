package xg;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: xg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7175a {
    private static byte[] a(MessageDigest messageDigest, InputStream inputStream) {
        return e(messageDigest, inputStream).digest();
    }

    public static MessageDigest b(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static MessageDigest c() {
        return b("MD5");
    }

    public static byte[] d(InputStream inputStream) {
        return a(c(), inputStream);
    }

    public static MessageDigest e(MessageDigest messageDigest, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
        int i10 = inputStream.read(bArr, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        while (i10 > -1) {
            messageDigest.update(bArr, 0, i10);
            i10 = inputStream.read(bArr, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        return messageDigest;
    }
}
