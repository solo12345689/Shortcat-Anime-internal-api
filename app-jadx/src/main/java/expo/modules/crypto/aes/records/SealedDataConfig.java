package expo.modules.crypto.aes.records;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\b¨\u0006\u001b"}, d2 = {"Lexpo/modules/crypto/aes/records/SealedDataConfig;", "Ljc/b;", "", "ivLength", "tagLength", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lexpo/modules/crypto/aes/records/SealedDataConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIvLength", "getIvLength$annotations", "()V", "getTagLength", "getTagLength$annotations", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SealedDataConfig implements InterfaceC5364b {
    private final int ivLength;
    private final int tagLength;

    /* JADX WARN: Illegal instructions before constructor call */
    public SealedDataConfig() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public static /* synthetic */ SealedDataConfig copy$default(SealedDataConfig sealedDataConfig, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = sealedDataConfig.ivLength;
        }
        if ((i12 & 2) != 0) {
            i11 = sealedDataConfig.tagLength;
        }
        return sealedDataConfig.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIvLength() {
        return this.ivLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTagLength() {
        return this.tagLength;
    }

    public final SealedDataConfig copy(int ivLength, int tagLength) {
        return new SealedDataConfig(ivLength, tagLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SealedDataConfig)) {
            return false;
        }
        SealedDataConfig sealedDataConfig = (SealedDataConfig) other;
        return this.ivLength == sealedDataConfig.ivLength && this.tagLength == sealedDataConfig.tagLength;
    }

    public final int getIvLength() {
        return this.ivLength;
    }

    public final int getTagLength() {
        return this.tagLength;
    }

    public int hashCode() {
        return (Integer.hashCode(this.ivLength) * 31) + Integer.hashCode(this.tagLength);
    }

    public String toString() {
        return "SealedDataConfig(ivLength=" + this.ivLength + ", tagLength=" + this.tagLength + ")";
    }

    public SealedDataConfig(int i10, int i11) {
        this.ivLength = i10;
        this.tagLength = i11;
    }

    public /* synthetic */ SealedDataConfig(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 12 : i10, (i12 & 2) != 0 ? 16 : i11);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getIvLength$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getTagLength$annotations() {
    }
}
