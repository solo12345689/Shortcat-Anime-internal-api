package expo.modules.kotlin.traits;

import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: expo.modules.kotlin.traits.SavableTrait$Companion$SavableBitmapOptions, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"expo/modules/kotlin/traits/SavableTrait$Companion$SavableBitmapOptions", "Ljc/b;", "", "compression", "<init>", "(I)V", "component1", "()I", "Lexpo/modules/kotlin/traits/SavableTrait$Companion$SavableBitmapOptions;", "copy", "(I)Lexpo/modules/kotlin/traits/SavableTrait$Companion$SavableBitmapOptions;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCompression", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SavableBitmapOptions implements InterfaceC5364b {
    private final int compression;

    public SavableBitmapOptions() {
        this(0, 1, null);
    }

    public static /* synthetic */ SavableBitmapOptions copy$default(SavableBitmapOptions savableBitmapOptions, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = savableBitmapOptions.compression;
        }
        return savableBitmapOptions.copy(i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCompression() {
        return this.compression;
    }

    public final SavableBitmapOptions copy(int compression) {
        return new SavableBitmapOptions(compression);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SavableBitmapOptions) && this.compression == ((SavableBitmapOptions) other).compression;
    }

    public final int getCompression() {
        return this.compression;
    }

    public int hashCode() {
        return Integer.hashCode(this.compression);
    }

    public String toString() {
        return "SavableBitmapOptions(compression=" + this.compression + ")";
    }

    public SavableBitmapOptions(int i10) {
        this.compression = i10;
    }

    public /* synthetic */ SavableBitmapOptions(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 100 : i10);
    }
}
