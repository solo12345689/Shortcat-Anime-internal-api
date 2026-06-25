package expo.modules.crypto.aes.objects;

import Td.L;
import Ud.AbstractC2273n;
import expo.modules.crypto.aes.records.SealedDataConfig;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import xb.C7126f;
import yb.AbstractC7217b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0014\u0010$\u001a\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001bR\u0011\u0010&\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010(\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010*\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u0011\u0010,\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0014R\u0011\u0010/\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u00103\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010.¨\u00064"}, d2 = {"Lexpo/modules/crypto/aes/objects/SealedData;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lexpo/modules/crypto/aes/records/SealedDataConfig;", "config", "", "content", "<init>", "(Lexpo/modules/crypto/aes/records/SealedDataConfig;[B)V", "iv", "", "ciphertextLength", "tagLength", "([BII)V", "ciphertextWithTag", "([B[BI)V", "", "withTag", "J", "(Z)[B", "k", "()I", "c", "Lexpo/modules/crypto/aes/records/SealedDataConfig;", "d", "[B", "Ljava/nio/ByteBuffer;", "p0", "()Ljava/nio/ByteBuffer;", "ivBuffer", "G0", "tagBuffer", "h0", "combinedBuffer", "O", "ciphertextBuffer", "q1", "taggedCiphertextBuffer", "k0", "combinedSize", "F0", "ivSize", "a1", "tagSize", "S", "ciphertextSize", "B0", "()[B", "ivBytes", "M0", "tagBytes", "Y", "combinedArray", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SealedData extends SharedObject {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SealedDataConfig config;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final byte[] content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SealedData(SealedDataConfig config, byte[] content) throws C7126f {
        super(null, 1, 0 == true ? 1 : 0);
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(content, "content");
        this.config = config;
        this.content = content;
        if (content.length < F0() + a1()) {
            throw new C7126f();
        }
    }

    private final ByteBuffer G0() {
        byte[] bArr = this.content;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, bArr.length - a1(), a1());
        AbstractC5504s.g(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    private final ByteBuffer O() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.content, F0(), S());
        AbstractC5504s.g(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    private final ByteBuffer h0() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.content);
        AbstractC5504s.g(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    private final ByteBuffer p0() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.content, 0, F0());
        AbstractC5504s.g(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    public final byte[] B0() {
        return AbstractC7217b.c(p0());
    }

    public final int F0() {
        return this.config.getIvLength();
    }

    public final byte[] J(boolean withTag) {
        return AbstractC7217b.c(withTag ? q1() : O());
    }

    public final byte[] M0() {
        return AbstractC7217b.c(G0());
    }

    public final int S() {
        return (k0() - F0()) - a1();
    }

    public final byte[] Y() {
        byte[] bArrArray = h0().array();
        AbstractC5504s.g(bArrArray, "array(...)");
        return bArrArray;
    }

    public final int a1() {
        return this.config.getTagLength();
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public int k() {
        return this.content.length;
    }

    public final int k0() {
        return this.content.length;
    }

    public final ByteBuffer q1() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.content, F0(), S() + a1());
        AbstractC5504s.g(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    public SealedData(byte[] iv, int i10, int i11) {
        AbstractC5504s.h(iv, "iv");
        SealedDataConfig sealedDataConfig = new SealedDataConfig(iv.length, i11);
        byte[] bArr = new byte[iv.length + i10 + i11];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        AbstractC5504s.e(byteBufferWrap);
        byteBufferWrap.put(iv);
        L l10 = L.f17438a;
        this(sealedDataConfig, bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedData(byte[] iv, byte[] ciphertextWithTag, int i10) {
        this(new SealedDataConfig(iv.length, i10), AbstractC2273n.A(iv, ciphertextWithTag));
        AbstractC5504s.h(iv, "iv");
        AbstractC5504s.h(ciphertextWithTag, "ciphertextWithTag");
    }
}
