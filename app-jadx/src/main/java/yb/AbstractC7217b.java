package yb;

import Td.r;
import Ud.AbstractC2273n;
import android.util.Base64;
import expo.modules.crypto.aes.enums.DataFormat;
import expo.modules.crypto.aes.enums.KeyEncoding;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: yb.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7217b {

    /* JADX INFO: renamed from: yb.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64990a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f64991b;

        static {
            int[] iArr = new int[KeyEncoding.values().length];
            try {
                iArr[KeyEncoding.HEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyEncoding.BASE64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64990a = iArr;
            int[] iArr2 = new int[DataFormat.values().length];
            try {
                iArr2[DataFormat.BYTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DataFormat.BASE64.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f64991b = iArr2;
        }
    }

    public static final String b(byte[] bArr) {
        AbstractC5504s.h(bArr, "<this>");
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        AbstractC5504s.g(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static final byte[] c(ByteBuffer byteBuffer) {
        AbstractC5504s.h(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final String d(byte[] bArr, KeyEncoding encoding) {
        AbstractC5504s.h(bArr, "<this>");
        AbstractC5504s.h(encoding, "encoding");
        int i10 = a.f64990a[encoding.ordinal()];
        if (i10 == 1) {
            return f(bArr);
        }
        if (i10 == 2) {
            return b(bArr);
        }
        throw new r();
    }

    public static final Object e(byte[] bArr, DataFormat dataFormat) {
        AbstractC5504s.h(bArr, "<this>");
        int i10 = dataFormat == null ? -1 : a.f64991b[dataFormat.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return bArr;
        }
        if (i10 == 2) {
            return b(bArr);
        }
        throw new r();
    }

    public static final String f(byte[] bArr) {
        AbstractC5504s.h(bArr, "<this>");
        return AbstractC2273n.w0(bArr, "", null, null, 0, null, new Function1() { // from class: yb.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC7217b.g(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    public static final CharSequence g(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }
}
