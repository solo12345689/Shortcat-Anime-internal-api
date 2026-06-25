package mb;

import Td.L;
import Ud.AbstractC2273n;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final String b(File file) {
        MessageDigest messageDigest;
        byte[] bArr;
        FileInputStream fileInputStream;
        AbstractC5504s.h(file, "file");
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            bArr = new byte[8192];
            fileInputStream = new FileInputStream(file);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    L l10 = L.f17438a;
                    fe.c.a(fileInputStream, null);
                    byte[] bArrDigest = messageDigest.digest();
                    AbstractC5504s.g(bArrDigest, "digest(...)");
                    return AbstractC2273n.w0(bArrDigest, "", null, null, 0, null, new Function1() { // from class: mb.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return d.c(((Byte) obj).byteValue());
                        }
                    }, 30, null);
                }
                messageDigest.update(bArr, 0, i10);
            } finally {
            }
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }
}
