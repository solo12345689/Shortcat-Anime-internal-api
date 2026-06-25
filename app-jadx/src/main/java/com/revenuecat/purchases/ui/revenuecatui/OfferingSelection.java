package com.revenuecat.purchases.ui.revenuecatui;

import Td.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.PresentedOfferingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "", "()V", "offering", "Lcom/revenuecat/purchases/Offering;", "getOffering", "()Lcom/revenuecat/purchases/Offering;", "offeringIdentifier", "", "getOfferingIdentifier", "()Ljava/lang/String;", "IdAndPresentedOfferingContext", "None", "OfferingType", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$OfferingType;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OfferingSelection {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "", "offeringId", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOfferingId", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IdAndPresentedOfferingContext extends OfferingSelection implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<IdAndPresentedOfferingContext> CREATOR = new Creator();
        private final String offeringId;
        private final PresentedOfferingContext presentedOfferingContext;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IdAndPresentedOfferingContext> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdAndPresentedOfferingContext createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new IdAndPresentedOfferingContext(parcel.readString(), (PresentedOfferingContext) parcel.readParcelable(IdAndPresentedOfferingContext.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdAndPresentedOfferingContext[] newArray(int i10) {
                return new IdAndPresentedOfferingContext[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdAndPresentedOfferingContext(String offeringId, PresentedOfferingContext presentedOfferingContext) {
            super(null);
            AbstractC5504s.h(offeringId, "offeringId");
            this.offeringId = offeringId;
            this.presentedOfferingContext = presentedOfferingContext;
        }

        public static /* synthetic */ IdAndPresentedOfferingContext copy$default(IdAndPresentedOfferingContext idAndPresentedOfferingContext, String str, PresentedOfferingContext presentedOfferingContext, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = idAndPresentedOfferingContext.offeringId;
            }
            if ((i10 & 2) != 0) {
                presentedOfferingContext = idAndPresentedOfferingContext.presentedOfferingContext;
            }
            return idAndPresentedOfferingContext.copy(str, presentedOfferingContext);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOfferingId() {
            return this.offeringId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }

        public final IdAndPresentedOfferingContext copy(String offeringId, PresentedOfferingContext presentedOfferingContext) {
            AbstractC5504s.h(offeringId, "offeringId");
            return new IdAndPresentedOfferingContext(offeringId, presentedOfferingContext);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdAndPresentedOfferingContext)) {
                return false;
            }
            IdAndPresentedOfferingContext idAndPresentedOfferingContext = (IdAndPresentedOfferingContext) other;
            return AbstractC5504s.c(this.offeringId, idAndPresentedOfferingContext.offeringId) && AbstractC5504s.c(this.presentedOfferingContext, idAndPresentedOfferingContext.presentedOfferingContext);
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public final PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }

        public int hashCode() {
            int iHashCode = this.offeringId.hashCode() * 31;
            PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
            return iHashCode + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode());
        }

        public String toString() {
            return "IdAndPresentedOfferingContext(offeringId=" + this.offeringId + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeString(this.offeringId);
            parcel.writeParcelable(this.presentedOfferingContext, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "()V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class None extends OfferingSelection {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$OfferingType;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "offeringType", "Lcom/revenuecat/purchases/Offering;", "(Lcom/revenuecat/purchases/Offering;)V", "getOfferingType", "()Lcom/revenuecat/purchases/Offering;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class OfferingType extends OfferingSelection {
        public static final int $stable = 0;
        private final Offering offeringType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferingType(Offering offeringType) {
            super(null);
            AbstractC5504s.h(offeringType, "offeringType");
            this.offeringType = offeringType;
        }

        public static /* synthetic */ OfferingType copy$default(OfferingType offeringType, Offering offering, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                offering = offeringType.offeringType;
            }
            return offeringType.copy(offering);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Offering getOfferingType() {
            return this.offeringType;
        }

        public final OfferingType copy(Offering offeringType) {
            AbstractC5504s.h(offeringType, "offeringType");
            return new OfferingType(offeringType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OfferingType) && AbstractC5504s.c(this.offeringType, ((OfferingType) other).offeringType);
        }

        public final Offering getOfferingType() {
            return this.offeringType;
        }

        public int hashCode() {
            return this.offeringType.hashCode();
        }

        public String toString() {
            return "OfferingType(offeringType=" + this.offeringType + ')';
        }
    }

    public /* synthetic */ OfferingSelection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Offering getOffering() {
        if (this instanceof OfferingType) {
            return ((OfferingType) this).getOfferingType();
        }
        if ((this instanceof IdAndPresentedOfferingContext) || AbstractC5504s.c(this, None.INSTANCE)) {
            return null;
        }
        throw new r();
    }

    public final String getOfferingIdentifier() {
        if (this instanceof OfferingType) {
            return ((OfferingType) this).getOfferingType().getIdentifier();
        }
        if (this instanceof IdAndPresentedOfferingContext) {
            return ((IdAndPresentedOfferingContext) this).getOfferingId();
        }
        if (AbstractC5504s.c(this, None.INSTANCE)) {
            return null;
        }
        throw new r();
    }

    private OfferingSelection() {
    }
}
