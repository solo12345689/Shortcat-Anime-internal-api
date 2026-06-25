package expo.modules.crypto.aes.records;

import expo.modules.crypto.aes.enums.DataFormat;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001f"}, d2 = {"Lexpo/modules/crypto/aes/records/CiphertextOptions;", "Ljc/b;", "", "includeTag", "Lexpo/modules/crypto/aes/enums/DataFormat;", "outputFormat", "<init>", "(ZLexpo/modules/crypto/aes/enums/DataFormat;)V", "component1", "()Z", "component2", "()Lexpo/modules/crypto/aes/enums/DataFormat;", "copy", "(ZLexpo/modules/crypto/aes/enums/DataFormat;)Lexpo/modules/crypto/aes/records/CiphertextOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getIncludeTag", "getIncludeTag$annotations", "()V", "Lexpo/modules/crypto/aes/enums/DataFormat;", "getOutputFormat", "getOutputFormat$annotations", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CiphertextOptions implements InterfaceC5364b {
    private final boolean includeTag;
    private final DataFormat outputFormat;

    public CiphertextOptions() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CiphertextOptions copy$default(CiphertextOptions ciphertextOptions, boolean z10, DataFormat dataFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = ciphertextOptions.includeTag;
        }
        if ((i10 & 2) != 0) {
            dataFormat = ciphertextOptions.outputFormat;
        }
        return ciphertextOptions.copy(z10, dataFormat);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIncludeTag() {
        return this.includeTag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataFormat getOutputFormat() {
        return this.outputFormat;
    }

    public final CiphertextOptions copy(boolean includeTag, DataFormat outputFormat) {
        AbstractC5504s.h(outputFormat, "outputFormat");
        return new CiphertextOptions(includeTag, outputFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CiphertextOptions)) {
            return false;
        }
        CiphertextOptions ciphertextOptions = (CiphertextOptions) other;
        return this.includeTag == ciphertextOptions.includeTag && this.outputFormat == ciphertextOptions.outputFormat;
    }

    public final boolean getIncludeTag() {
        return this.includeTag;
    }

    public final DataFormat getOutputFormat() {
        return this.outputFormat;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeTag) * 31) + this.outputFormat.hashCode();
    }

    public String toString() {
        return "CiphertextOptions(includeTag=" + this.includeTag + ", outputFormat=" + this.outputFormat + ")";
    }

    public CiphertextOptions(boolean z10, DataFormat outputFormat) {
        AbstractC5504s.h(outputFormat, "outputFormat");
        this.includeTag = z10;
        this.outputFormat = outputFormat;
    }

    public /* synthetic */ CiphertextOptions(boolean z10, DataFormat dataFormat, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? DataFormat.BYTES : dataFormat);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getIncludeTag$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getOutputFormat$annotations() {
    }
}
