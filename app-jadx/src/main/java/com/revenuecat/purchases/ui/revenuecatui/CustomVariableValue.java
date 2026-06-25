package com.revenuecat.purchases.ui.revenuecatui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u0000 \b2\u00020\u0001:\u0004\u0007\b\t\nB\u0007\b\u0000¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "Landroid/os/Parcelable;", "()V", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "Boolean", "Companion", "Number", "String", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CustomVariableValue implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue$Boolean;", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getValue", "()Z", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Boolean extends CustomVariableValue implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Boolean> CREATOR = new Creator();
        private final boolean value;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Boolean> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Boolean createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new Boolean(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Boolean[] newArray(int i10) {
                return new Boolean[i10];
            }
        }

        public Boolean(boolean z10) {
            this.value = z10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return (other instanceof Boolean) && this.value == ((Boolean) other).value;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return java.lang.Boolean.hashCode(this.value);
        }

        public java.lang.String toString() {
            return "CustomVariableValue.Boolean(value=" + this.value + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeInt(this.value ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue$Companion;", "", "()V", "from", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "value", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CustomVariableValue from(Object value) {
            AbstractC5504s.h(value, "value");
            if (value instanceof java.lang.String) {
                return new String((java.lang.String) value);
            }
            if (value instanceof Integer) {
                return new Number(((java.lang.Number) value).intValue());
            }
            if (value instanceof Long) {
                return new Number(((java.lang.Number) value).longValue());
            }
            if (value instanceof Double) {
                return new Number(((java.lang.Number) value).doubleValue());
            }
            if (value instanceof Float) {
                return new Number(((java.lang.Number) value).floatValue());
            }
            if (value instanceof java.lang.Boolean) {
                return new Boolean(((java.lang.Boolean) value).booleanValue());
            }
            throw new IllegalArgumentException("Unsupported custom variable type: " + O.b(value.getClass()).v() + ". Supported types are: String, Int, Long, Double, Float, Boolean.");
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue$Number;", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "Landroid/os/Parcelable;", "", "value", "<init>", "(D)V", "", "(I)V", "", "(J)V", "", "(F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getValue", "()D", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Number extends CustomVariableValue implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Number> CREATOR = new Creator();
        private final double value;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Number> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Number createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new Number(parcel.readDouble());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Number[] newArray(int i10) {
                return new Number[i10];
            }
        }

        public Number(double d10) {
            this.value = d10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return (other instanceof Number) && this.value == ((Number) other).value;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }

        public java.lang.String toString() {
            return "CustomVariableValue.Number(value=" + this.value + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeDouble(this.value);
        }

        public Number(int i10) {
            this(i10);
        }

        public Number(long j10) {
            this(j10);
        }

        public Number(float f10) {
            this(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue$String;", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class String extends CustomVariableValue implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<String> CREATOR = new Creator();
        private final java.lang.String value;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<String> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final String createFromParcel(Parcel parcel) {
                AbstractC5504s.h(parcel, "parcel");
                return new String(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final String[] newArray(int i10) {
                return new String[i10];
            }
        }

        public String(java.lang.String value) {
            AbstractC5504s.h(value, "value");
            this.value = value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return (other instanceof String) && AbstractC5504s.c(this.value, ((String) other).value);
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "CustomVariableValue.String(value=" + this.value + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            AbstractC5504s.h(parcel, "out");
            parcel.writeString(this.value);
        }
    }

    public final java.lang.String getStringValue() {
        if (this instanceof String) {
            return ((String) this).getValue();
        }
        if (this instanceof Number) {
            Number number = (Number) this;
            return number.getValue() % 1.0d == 0.0d ? java.lang.String.valueOf((long) number.getValue()) : java.lang.String.valueOf(number.getValue());
        }
        if (this instanceof Boolean) {
            return java.lang.String.valueOf(((Boolean) this).getValue());
        }
        throw new IllegalStateException("Unknown CustomVariableValue type");
    }
}
