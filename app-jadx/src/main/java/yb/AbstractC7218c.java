package yb;

import expo.modules.crypto.aes.objects.SealedData;
import java.nio.ByteBuffer;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: yb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7218c {
    public static final ByteBuffer a(Cipher cipher, SealedData sealedData) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        AbstractC5504s.h(cipher, "<this>");
        AbstractC5504s.h(sealedData, "sealedData");
        ByteBuffer byteBufferQ1 = sealedData.q1();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(cipher.getOutputSize(byteBufferQ1.remaining()));
        cipher.doFinal(byteBufferQ1, byteBufferAllocate);
        AbstractC5504s.g(byteBufferAllocate, "also(...)");
        return byteBufferAllocate;
    }

    public static final SealedData b(Cipher cipher, ByteBuffer plaintext) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        AbstractC5504s.h(cipher, "<this>");
        AbstractC5504s.h(plaintext, "plaintext");
        int iRemaining = plaintext.remaining();
        int outputSize = cipher.getOutputSize(iRemaining) - iRemaining;
        byte[] iv = cipher.getIV();
        AbstractC5504s.g(iv, "getIV(...)");
        SealedData sealedData = new SealedData(iv, iRemaining, outputSize);
        cipher.doFinal(plaintext, sealedData.q1());
        return sealedData;
    }
}
