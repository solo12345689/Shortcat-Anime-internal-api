package com.revenuecat.purchases.ui.revenuecatui.activity;

import android.os.Parcel;
import android.os.Parcelable;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "Landroid/os/Parcelable;", "()V", "Cancelled", "Error", "Purchased", "Restored", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Cancelled;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Purchased;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Restored;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PaywallResult implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Cancelled;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Cancelled extends PaywallResult implements Parcelable {
        public static final int $stable = 0;
        public static final Cancelled INSTANCE = new Cancelled();
        public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Cancelled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                parcel.readInt();
                return Cancelled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled[] newArray(int i10) {
                return new Cancelled[i10];
            }
        }

        private Cancelled() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Error;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "<init>", "(Lcom/revenuecat/purchases/PurchasesError;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/PurchasesError;", "getError", "()Lcom/revenuecat/purchases/PurchasesError;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Error extends PaywallResult implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        private final PurchasesError error;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new Error((PurchasesError) parcel.readParcelable(Error.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i10) {
                return new Error[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(PurchasesError error) {
            super(null);
            AbstractC5504s.h(error, "error");
            this.error = error;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && AbstractC5504s.c(this.error, ((Error) obj).error);
        }

        public final PurchasesError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeParcelable(this.error, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Purchased;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "<init>", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/CustomerInfo;", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Purchased extends PaywallResult implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Purchased> CREATOR = new Creator();
        private final CustomerInfo customerInfo;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Purchased> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Purchased createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new Purchased((CustomerInfo) parcel.readParcelable(Purchased.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Purchased[] newArray(int i10) {
                return new Purchased[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Purchased(CustomerInfo customerInfo) {
            super(null);
            AbstractC5504s.h(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Purchased) && AbstractC5504s.c(this.customerInfo, ((Purchased) obj).customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public String toString() {
            return "Purchased(customerInfo=" + this.customerInfo + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeParcelable(this.customerInfo, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Restored;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "<init>", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/CustomerInfo;", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Restored extends PaywallResult implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Restored> CREATOR = new Creator();
        private final CustomerInfo customerInfo;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Restored> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Restored createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new Restored((CustomerInfo) parcel.readParcelable(Restored.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Restored[] newArray(int i10) {
                return new Restored[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Restored(CustomerInfo customerInfo) {
            super(null);
            AbstractC5504s.h(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Restored) && AbstractC5504s.c(this.customerInfo, ((Restored) obj).customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public String toString() {
            return "Restored(customerInfo=" + this.customerInfo + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeParcelable(this.customerInfo, flags);
        }
    }

    public /* synthetic */ PaywallResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaywallResult() {
    }
}
