package H7;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.C3303t;
import com.revenuecat.purchases.common.verification.SigningManager;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3303t f8058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3303t f8059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3303t f8060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3303t f8061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3303t f8062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3303t f8063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3303t f8064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C3303t f8065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C3303t f8066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C3303t f8067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C3303t f8068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C3303t f8069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C3303t f8070m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8071a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.f8043a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.f8044b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.f8045c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.f8047e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.f8046d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.f8048f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.f8049g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[i.f8050h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[i.f8051i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[i.f8055m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[i.f8054l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[i.f8053k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[i.f8052j.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f8071a = iArr;
        }
    }

    public j(C3303t c3303t, C3303t c3303t2, C3303t c3303t3, C3303t c3303t4, C3303t c3303t5, C3303t c3303t6, C3303t c3303t7, C3303t c3303t8, C3303t c3303t9, C3303t c3303t10, C3303t c3303t11, C3303t c3303t12, C3303t c3303t13) {
        this.f8058a = c3303t;
        this.f8059b = c3303t2;
        this.f8060c = c3303t3;
        this.f8061d = c3303t4;
        this.f8062e = c3303t5;
        this.f8063f = c3303t6;
        this.f8064g = c3303t7;
        this.f8065h = c3303t8;
        this.f8066i = c3303t9;
        this.f8067j = c3303t10;
        this.f8068k = c3303t11;
        this.f8069l = c3303t12;
        this.f8070m = c3303t13;
    }

    private final p a(q qVar, q qVar2, q qVar3, q qVar4, float f10, float f11) {
        float fB = qVar.b() + qVar3.b();
        float fA = qVar.a() + qVar2.a();
        float fB2 = qVar2.b() + qVar4.b();
        float fA2 = qVar3.a() + qVar4.a();
        float fMin = fB > 0.0f ? Math.min(f11 / fB, 1.0f) : 0.0f;
        float fMin2 = fA > 0.0f ? Math.min(f10 / fA, 1.0f) : 0.0f;
        float fMin3 = fB2 > 0.0f ? Math.min(f11 / fB2, 1.0f) : 0.0f;
        float fMin4 = fA2 > 0.0f ? Math.min(f10 / fA2, 1.0f) : 0.0f;
        return new p(new q(qVar.a() * Math.min(fMin2, fMin), qVar.b() * Math.min(fMin2, fMin)), new q(qVar2.a() * Math.min(fMin3, fMin2), qVar2.b() * Math.min(fMin3, fMin2)), new q(qVar3.a() * Math.min(fMin4, fMin), qVar3.b() * Math.min(fMin4, fMin)), new q(qVar4.a() * Math.min(fMin4, fMin3), qVar4.b() * Math.min(fMin4, fMin3)));
    }

    public final boolean b() {
        return (this.f8058a == null && this.f8059b == null && this.f8060c == null && this.f8061d == null && this.f8062e == null && this.f8063f == null && this.f8064g == null && this.f8065h == null && this.f8066i == null && this.f8067j == null && this.f8068k == null && this.f8069l == null && this.f8070m == null) ? false : true;
    }

    public final p c(int i10, Context context, float f10, float f11) {
        AbstractC5504s.h(context, "context");
        q qVar = new q(0.0f, 0.0f);
        if (i10 == 0) {
            C3303t c3303t = this.f8067j;
            if (c3303t == null && (c3303t = this.f8063f) == null && (c3303t = this.f8059b) == null) {
                c3303t = this.f8058a;
            }
            q qVar2 = c3303t != null ? new q(c3303t, f10, f11) : qVar;
            C3303t c3303t2 = this.f8069l;
            if (c3303t2 == null && (c3303t2 = this.f8064g) == null && (c3303t2 = this.f8060c) == null) {
                c3303t2 = this.f8058a;
            }
            q qVar3 = c3303t2 != null ? new q(c3303t2, f10, f11) : qVar;
            C3303t c3303t3 = this.f8068k;
            if (c3303t3 == null && (c3303t3 = this.f8065h) == null && (c3303t3 = this.f8061d) == null) {
                c3303t3 = this.f8058a;
            }
            q qVar4 = c3303t3 != null ? new q(c3303t3, f10, f11) : qVar;
            C3303t c3303t4 = this.f8070m;
            if (c3303t4 == null && (c3303t4 = this.f8066i) == null && (c3303t4 = this.f8062e) == null) {
                c3303t4 = this.f8058a;
            }
            if (c3303t4 != null) {
                qVar = new q(c3303t4, f10, f11);
            }
            return a(qVar2, qVar3, qVar4, qVar, f10, f11);
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Expected?.resolved layout direction");
        }
        if (com.facebook.react.modules.i18nmanager.a.f37029a.a().d(context)) {
            C3303t c3303t5 = this.f8069l;
            if (c3303t5 == null && (c3303t5 = this.f8064g) == null && (c3303t5 = this.f8060c) == null) {
                c3303t5 = this.f8058a;
            }
            q qVar5 = c3303t5 != null ? new q(c3303t5, f10, f11) : qVar;
            C3303t c3303t6 = this.f8067j;
            if (c3303t6 == null && (c3303t6 = this.f8063f) == null && (c3303t6 = this.f8059b) == null) {
                c3303t6 = this.f8058a;
            }
            q qVar6 = c3303t6 != null ? new q(c3303t6, f10, f11) : qVar;
            C3303t c3303t7 = this.f8070m;
            if (c3303t7 == null && (c3303t7 = this.f8066i) == null && (c3303t7 = this.f8062e) == null) {
                c3303t7 = this.f8058a;
            }
            q qVar7 = c3303t7 != null ? new q(c3303t7, f10, f11) : qVar;
            C3303t c3303t8 = this.f8068k;
            if (c3303t8 == null && (c3303t8 = this.f8065h) == null && (c3303t8 = this.f8061d) == null) {
                c3303t8 = this.f8058a;
            }
            if (c3303t8 != null) {
                qVar = new q(c3303t8, f10, f11);
            }
            return a(qVar5, qVar6, qVar7, qVar, f10, f11);
        }
        C3303t c3303t9 = this.f8069l;
        if (c3303t9 == null && (c3303t9 = this.f8064g) == null && (c3303t9 = this.f8059b) == null) {
            c3303t9 = this.f8058a;
        }
        q qVar8 = c3303t9 != null ? new q(c3303t9, f10, f11) : qVar;
        C3303t c3303t10 = this.f8067j;
        if (c3303t10 == null && (c3303t10 = this.f8063f) == null && (c3303t10 = this.f8060c) == null) {
            c3303t10 = this.f8058a;
        }
        q qVar9 = c3303t10 != null ? new q(c3303t10, f10, f11) : qVar;
        C3303t c3303t11 = this.f8070m;
        if (c3303t11 == null && (c3303t11 = this.f8065h) == null && (c3303t11 = this.f8061d) == null) {
            c3303t11 = this.f8058a;
        }
        q qVar10 = c3303t11 != null ? new q(c3303t11, f10, f11) : qVar;
        C3303t c3303t12 = this.f8068k;
        if (c3303t12 == null && (c3303t12 = this.f8066i) == null && (c3303t12 = this.f8062e) == null) {
            c3303t12 = this.f8058a;
        }
        if (c3303t12 != null) {
            qVar = new q(c3303t12, f10, f11);
        }
        return a(qVar8, qVar9, qVar10, qVar, f10, f11);
    }

    public final void d(i property, C3303t c3303t) {
        AbstractC5504s.h(property, "property");
        switch (a.f8071a[property.ordinal()]) {
            case 1:
                this.f8058a = c3303t;
                return;
            case 2:
                this.f8059b = c3303t;
                return;
            case 3:
                this.f8060c = c3303t;
                return;
            case 4:
                this.f8061d = c3303t;
                return;
            case 5:
                this.f8062e = c3303t;
                return;
            case 6:
                this.f8063f = c3303t;
                return;
            case 7:
                this.f8064g = c3303t;
                return;
            case 8:
                this.f8065h = c3303t;
                return;
            case 9:
                this.f8066i = c3303t;
                return;
            case 10:
                this.f8067j = c3303t;
                return;
            case 11:
                this.f8068k = c3303t;
                return;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                this.f8069l = c3303t;
                return;
            case 13:
                this.f8070m = c3303t;
                return;
            default:
                throw new Td.r();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC5504s.c(this.f8058a, jVar.f8058a) && AbstractC5504s.c(this.f8059b, jVar.f8059b) && AbstractC5504s.c(this.f8060c, jVar.f8060c) && AbstractC5504s.c(this.f8061d, jVar.f8061d) && AbstractC5504s.c(this.f8062e, jVar.f8062e) && AbstractC5504s.c(this.f8063f, jVar.f8063f) && AbstractC5504s.c(this.f8064g, jVar.f8064g) && AbstractC5504s.c(this.f8065h, jVar.f8065h) && AbstractC5504s.c(this.f8066i, jVar.f8066i) && AbstractC5504s.c(this.f8067j, jVar.f8067j) && AbstractC5504s.c(this.f8068k, jVar.f8068k) && AbstractC5504s.c(this.f8069l, jVar.f8069l) && AbstractC5504s.c(this.f8070m, jVar.f8070m);
    }

    public int hashCode() {
        C3303t c3303t = this.f8058a;
        int iHashCode = (c3303t == null ? 0 : c3303t.hashCode()) * 31;
        C3303t c3303t2 = this.f8059b;
        int iHashCode2 = (iHashCode + (c3303t2 == null ? 0 : c3303t2.hashCode())) * 31;
        C3303t c3303t3 = this.f8060c;
        int iHashCode3 = (iHashCode2 + (c3303t3 == null ? 0 : c3303t3.hashCode())) * 31;
        C3303t c3303t4 = this.f8061d;
        int iHashCode4 = (iHashCode3 + (c3303t4 == null ? 0 : c3303t4.hashCode())) * 31;
        C3303t c3303t5 = this.f8062e;
        int iHashCode5 = (iHashCode4 + (c3303t5 == null ? 0 : c3303t5.hashCode())) * 31;
        C3303t c3303t6 = this.f8063f;
        int iHashCode6 = (iHashCode5 + (c3303t6 == null ? 0 : c3303t6.hashCode())) * 31;
        C3303t c3303t7 = this.f8064g;
        int iHashCode7 = (iHashCode6 + (c3303t7 == null ? 0 : c3303t7.hashCode())) * 31;
        C3303t c3303t8 = this.f8065h;
        int iHashCode8 = (iHashCode7 + (c3303t8 == null ? 0 : c3303t8.hashCode())) * 31;
        C3303t c3303t9 = this.f8066i;
        int iHashCode9 = (iHashCode8 + (c3303t9 == null ? 0 : c3303t9.hashCode())) * 31;
        C3303t c3303t10 = this.f8067j;
        int iHashCode10 = (iHashCode9 + (c3303t10 == null ? 0 : c3303t10.hashCode())) * 31;
        C3303t c3303t11 = this.f8068k;
        int iHashCode11 = (iHashCode10 + (c3303t11 == null ? 0 : c3303t11.hashCode())) * 31;
        C3303t c3303t12 = this.f8069l;
        int iHashCode12 = (iHashCode11 + (c3303t12 == null ? 0 : c3303t12.hashCode())) * 31;
        C3303t c3303t13 = this.f8070m;
        return iHashCode12 + (c3303t13 != null ? c3303t13.hashCode() : 0);
    }

    public String toString() {
        return "BorderRadiusStyle(uniform=" + this.f8058a + ", topLeft=" + this.f8059b + ", topRight=" + this.f8060c + ", bottomLeft=" + this.f8061d + ", bottomRight=" + this.f8062e + ", topStart=" + this.f8063f + ", topEnd=" + this.f8064g + ", bottomStart=" + this.f8065h + ", bottomEnd=" + this.f8066i + ", startStart=" + this.f8067j + ", startEnd=" + this.f8068k + ", endStart=" + this.f8069l + ", endEnd=" + this.f8070m + ")";
    }

    public /* synthetic */ j(C3303t c3303t, C3303t c3303t2, C3303t c3303t3, C3303t c3303t4, C3303t c3303t5, C3303t c3303t6, C3303t c3303t7, C3303t c3303t8, C3303t c3303t9, C3303t c3303t10, C3303t c3303t11, C3303t c3303t12, C3303t c3303t13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : c3303t, (i10 & 2) != 0 ? null : c3303t2, (i10 & 4) != 0 ? null : c3303t3, (i10 & 8) != 0 ? null : c3303t4, (i10 & 16) != 0 ? null : c3303t5, (i10 & 32) != 0 ? null : c3303t6, (i10 & 64) != 0 ? null : c3303t7, (i10 & 128) != 0 ? null : c3303t8, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : c3303t9, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : c3303t10, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : c3303t11, (i10 & 2048) != 0 ? null : c3303t12, (i10 & 4096) != 0 ? null : c3303t13);
    }
}
