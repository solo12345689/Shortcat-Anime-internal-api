package expo.modules.notifications.notifications.model;

import Mc.d;
import android.os.Parcel;
import android.os.Parcelable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u001a\u0010$\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R \u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0017R \u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0017R \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u0017R \u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b4\u0010)\u001a\u0004\b3\u0010\u001dR\u0013\u00108\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b9\u0010\u0017¨\u0006;"}, d2 = {"Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;", "Ljc/b;", "Landroid/os/Parcelable;", "", "shouldShowAlert", "shouldShowBanner", "shouldShowList", "shouldPlaySound", "shouldSetBadge", "", "priority", "<init>", "(ZZZZZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/String;", "copy", "(ZZZZZLjava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldShowAlert", "getShouldShowAlert$annotations", "()V", "getShouldShowBanner", "getShouldShowBanner$annotations", "getShouldShowList", "getShouldShowList$annotations", "getShouldPlaySound", "getShouldPlaySound$annotations", "getShouldSetBadge", "getShouldSetBadge$annotations", "Ljava/lang/String;", "getPriority", "getPriority$annotations", "LMc/d;", "getPriorityOverride", "()LMc/d;", "priorityOverride", "getShouldPresentAlert", "shouldPresentAlert", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NotificationBehaviorRecord implements InterfaceC5364b, Parcelable {
    public static final Parcelable.Creator<NotificationBehaviorRecord> CREATOR = new a();
    private final String priority;
    private final boolean shouldPlaySound;
    private final boolean shouldSetBadge;
    private final boolean shouldShowAlert;
    private final boolean shouldShowBanner;
    private final boolean shouldShowList;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotificationBehaviorRecord createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            AbstractC5504s.h(parcel, "parcel");
            boolean z14 = false;
            boolean z15 = true;
            if (parcel.readInt() != 0) {
                z10 = false;
                z14 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z15 = z10;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
            } else {
                z12 = z11;
                z11 = z10;
            }
            if (parcel.readInt() != 0) {
                z13 = z12;
            } else {
                z13 = z12;
                z12 = z10;
            }
            if (parcel.readInt() == 0) {
                z13 = z10;
            }
            return new NotificationBehaviorRecord(z14, z15, z11, z12, z13, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NotificationBehaviorRecord[] newArray(int i10) {
            return new NotificationBehaviorRecord[i10];
        }
    }

    public NotificationBehaviorRecord() {
        this(false, false, false, false, false, null, 63, null);
    }

    public static /* synthetic */ NotificationBehaviorRecord copy$default(NotificationBehaviorRecord notificationBehaviorRecord, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = notificationBehaviorRecord.shouldShowAlert;
        }
        if ((i10 & 2) != 0) {
            z11 = notificationBehaviorRecord.shouldShowBanner;
        }
        if ((i10 & 4) != 0) {
            z12 = notificationBehaviorRecord.shouldShowList;
        }
        if ((i10 & 8) != 0) {
            z13 = notificationBehaviorRecord.shouldPlaySound;
        }
        if ((i10 & 16) != 0) {
            z14 = notificationBehaviorRecord.shouldSetBadge;
        }
        if ((i10 & 32) != 0) {
            str = notificationBehaviorRecord.priority;
        }
        boolean z15 = z14;
        String str2 = str;
        return notificationBehaviorRecord.copy(z10, z11, z12, z13, z15, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShouldShowAlert() {
        return this.shouldShowAlert;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShouldShowBanner() {
        return this.shouldShowBanner;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShouldShowList() {
        return this.shouldShowList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShouldPlaySound() {
        return this.shouldPlaySound;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShouldSetBadge() {
        return this.shouldSetBadge;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPriority() {
        return this.priority;
    }

    public final NotificationBehaviorRecord copy(boolean shouldShowAlert, boolean shouldShowBanner, boolean shouldShowList, boolean shouldPlaySound, boolean shouldSetBadge, String priority) {
        return new NotificationBehaviorRecord(shouldShowAlert, shouldShowBanner, shouldShowList, shouldPlaySound, shouldSetBadge, priority);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationBehaviorRecord)) {
            return false;
        }
        NotificationBehaviorRecord notificationBehaviorRecord = (NotificationBehaviorRecord) other;
        return this.shouldShowAlert == notificationBehaviorRecord.shouldShowAlert && this.shouldShowBanner == notificationBehaviorRecord.shouldShowBanner && this.shouldShowList == notificationBehaviorRecord.shouldShowList && this.shouldPlaySound == notificationBehaviorRecord.shouldPlaySound && this.shouldSetBadge == notificationBehaviorRecord.shouldSetBadge && AbstractC5504s.c(this.priority, notificationBehaviorRecord.priority);
    }

    public final String getPriority() {
        return this.priority;
    }

    public final d getPriorityOverride() {
        String str = this.priority;
        if (str != null) {
            return d.b(str);
        }
        return null;
    }

    public final boolean getShouldPlaySound() {
        return this.shouldPlaySound;
    }

    public final boolean getShouldPresentAlert() {
        return this.shouldShowBanner || this.shouldShowList || this.shouldShowAlert;
    }

    public final boolean getShouldSetBadge() {
        return this.shouldSetBadge;
    }

    public final boolean getShouldShowAlert() {
        return this.shouldShowAlert;
    }

    public final boolean getShouldShowBanner() {
        return this.shouldShowBanner;
    }

    public final boolean getShouldShowList() {
        return this.shouldShowList;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.shouldShowAlert) * 31) + Boolean.hashCode(this.shouldShowBanner)) * 31) + Boolean.hashCode(this.shouldShowList)) * 31) + Boolean.hashCode(this.shouldPlaySound)) * 31) + Boolean.hashCode(this.shouldSetBadge)) * 31;
        String str = this.priority;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NotificationBehaviorRecord(shouldShowAlert=" + this.shouldShowAlert + ", shouldShowBanner=" + this.shouldShowBanner + ", shouldShowList=" + this.shouldShowList + ", shouldPlaySound=" + this.shouldPlaySound + ", shouldSetBadge=" + this.shouldSetBadge + ", priority=" + this.priority + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC5504s.h(dest, "dest");
        dest.writeInt(this.shouldShowAlert ? 1 : 0);
        dest.writeInt(this.shouldShowBanner ? 1 : 0);
        dest.writeInt(this.shouldShowList ? 1 : 0);
        dest.writeInt(this.shouldPlaySound ? 1 : 0);
        dest.writeInt(this.shouldSetBadge ? 1 : 0);
        dest.writeString(this.priority);
    }

    public NotificationBehaviorRecord(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str) {
        this.shouldShowAlert = z10;
        this.shouldShowBanner = z11;
        this.shouldShowList = z12;
        this.shouldPlaySound = z13;
        this.shouldSetBadge = z14;
        this.priority = str;
    }

    public /* synthetic */ NotificationBehaviorRecord(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? null : str);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getPriority$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShouldPlaySound$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShouldSetBadge$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShouldShowAlert$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShouldShowBanner$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShouldShowList$annotations() {
    }
}
