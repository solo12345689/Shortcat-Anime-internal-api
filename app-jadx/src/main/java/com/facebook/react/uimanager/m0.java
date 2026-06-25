package com.facebook.react.uimanager;

import java.util.Comparator;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37791c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Comparator f37792d = new Comparator() { // from class: com.facebook.react.uimanager.l0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m0.b((m0) obj, (m0) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37794b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        W6.b.a("ViewAtIndex", W6.a.f20778b);
    }

    public m0(int i10, int i11) {
        this.f37793a = i10;
        this.f37794b = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(m0 m0Var, m0 m0Var2) {
        return m0Var.f37794b - m0Var2.f37794b;
    }

    public boolean equals(Object obj) {
        if (obj != null && AbstractC5504s.c(obj.getClass(), m0.class)) {
            m0 m0Var = (m0) obj;
            if (this.f37794b == m0Var.f37794b && this.f37793a == m0Var.f37793a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f37793a), Integer.valueOf(this.f37794b));
    }

    public String toString() {
        return "[" + this.f37793a + ", " + this.f37794b + "]";
    }
}
