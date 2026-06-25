package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ReplacementMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 com.revenuecat.purchases.models.GalaxyReplacementMode, still in use, count: 1, list:
  (r0v2 com.revenuecat.purchases.models.GalaxyReplacementMode) from 0x003d: SPUT (r0v2 com.revenuecat.purchases.models.GalaxyReplacementMode) (LINE:62) com.revenuecat.purchases.models.GalaxyReplacementMode.default com.revenuecat.purchases.models.GalaxyReplacementMode
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/models/GalaxyReplacementMode;", "", "Lcom/revenuecat/purchases/ReplacementMode;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Companion", "INSTANT_PRORATED_DATE", "INSTANT_PRORATED_CHARGE", "INSTANT_NO_PRORATION", "DEFERRED", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GalaxyReplacementMode implements ReplacementMode {
    INSTANT_PRORATED_DATE,
    INSTANT_PRORATED_CHARGE,
    INSTANT_NO_PRORATION,
    DEFERRED;


    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final GalaxyReplacementMode f0default = new GalaxyReplacementMode();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<GalaxyReplacementMode> CREATOR = new Parcelable.Creator<GalaxyReplacementMode>() { // from class: com.revenuecat.purchases.models.GalaxyReplacementMode.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalaxyReplacementMode createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return GalaxyReplacementMode.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalaxyReplacementMode[] newArray(int i10) {
            return new GalaxyReplacementMode[i10];
        }
    };

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/models/GalaxyReplacementMode$Companion;", "", "()V", "default", "Lcom/revenuecat/purchases/models/GalaxyReplacementMode;", "getDefault$annotations", "getDefault", "()Lcom/revenuecat/purchases/models/GalaxyReplacementMode;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GalaxyReplacementMode getDefault() {
            return GalaxyReplacementMode.f0default;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    static {
    }

    private GalaxyReplacementMode() {
    }

    public static GalaxyReplacementMode valueOf(String str) {
        return (GalaxyReplacementMode) Enum.valueOf(GalaxyReplacementMode.class, str);
    }

    public static GalaxyReplacementMode[] values() {
        return (GalaxyReplacementMode[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.revenuecat.purchases.ReplacementMode
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC5504s.h(parcel, "out");
        parcel.writeString(name());
    }
}
