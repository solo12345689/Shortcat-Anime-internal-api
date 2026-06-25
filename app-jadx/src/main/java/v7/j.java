package v7;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f62001c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f62002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f62003b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(Charset charset) {
        AbstractC5504s.h(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        AbstractC5504s.g(charsetDecoderNewDecoder, "newDecoder(...)");
        this.f62002a = charsetDecoderNewDecoder;
    }

    public final String a(byte[] data, int i10) {
        AbstractC5504s.h(data, "data");
        byte[] bArr = this.f62003b;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length + i10];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(data, 0, bArr2, bArr.length, i10);
            i10 += bArr.length;
            data = bArr2;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data, 0, i10);
        byte[] bArr3 = null;
        boolean z10 = false;
        int i11 = 0;
        CharBuffer charBufferDecode = null;
        while (!z10 && i11 < 4) {
            try {
                charBufferDecode = this.f62002a.decode(byteBufferWrap);
                z10 = true;
            } catch (CharacterCodingException unused) {
                i11++;
                byteBufferWrap = ByteBuffer.wrap(data, 0, i10 - i11);
            }
        }
        if (z10 && i11 > 0) {
            bArr3 = new byte[i11];
            System.arraycopy(data, i10 - i11, bArr3, 0, i11);
        }
        this.f62003b = bArr3;
        if (!z10) {
            AbstractC7283a.I("ReactNative", "failed to decode string from byte array");
            return "";
        }
        if (charBufferDecode == null) {
            return "";
        }
        char[] cArrArray = charBufferDecode.array();
        AbstractC5504s.g(cArrArray, "array(...)");
        return new String(cArrArray, 0, charBufferDecode.length());
    }
}
