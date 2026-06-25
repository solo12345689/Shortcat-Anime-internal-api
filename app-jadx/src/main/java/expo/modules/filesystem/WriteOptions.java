package expo.modules.filesystem;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001f"}, d2 = {"Lexpo/modules/filesystem/WriteOptions;", "Ljc/b;", "Lexpo/modules/filesystem/EncodingType;", "encoding", "", "append", "<init>", "(Lexpo/modules/filesystem/EncodingType;Z)V", "component1", "()Lexpo/modules/filesystem/EncodingType;", "component2", "()Z", "copy", "(Lexpo/modules/filesystem/EncodingType;Z)Lexpo/modules/filesystem/WriteOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lexpo/modules/filesystem/EncodingType;", "getEncoding", "getEncoding$annotations", "()V", "Z", "getAppend", "getAppend$annotations", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WriteOptions implements InterfaceC5364b {
    private final boolean append;
    private final EncodingType encoding;

    public WriteOptions() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WriteOptions copy$default(WriteOptions writeOptions, EncodingType encodingType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            encodingType = writeOptions.encoding;
        }
        if ((i10 & 2) != 0) {
            z10 = writeOptions.append;
        }
        return writeOptions.copy(encodingType, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EncodingType getEncoding() {
        return this.encoding;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAppend() {
        return this.append;
    }

    public final WriteOptions copy(EncodingType encoding, boolean append) {
        AbstractC5504s.h(encoding, "encoding");
        return new WriteOptions(encoding, append);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WriteOptions)) {
            return false;
        }
        WriteOptions writeOptions = (WriteOptions) other;
        return this.encoding == writeOptions.encoding && this.append == writeOptions.append;
    }

    public final boolean getAppend() {
        return this.append;
    }

    public final EncodingType getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return (this.encoding.hashCode() * 31) + Boolean.hashCode(this.append);
    }

    public String toString() {
        return "WriteOptions(encoding=" + this.encoding + ", append=" + this.append + ")";
    }

    public WriteOptions(EncodingType encoding, boolean z10) {
        AbstractC5504s.h(encoding, "encoding");
        this.encoding = encoding;
        this.append = z10;
    }

    public /* synthetic */ WriteOptions(EncodingType encodingType, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EncodingType.UTF8 : encodingType, (i10 & 2) != 0 ? false : z10);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getAppend$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getEncoding$annotations() {
    }
}
