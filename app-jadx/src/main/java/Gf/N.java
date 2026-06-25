package Gf;

import Zd.i;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class N extends Zd.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7525c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7526b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i.c {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public N(String str) {
        super(f7525c);
        this.f7526b = str;
    }

    public final String D1() {
        return this.f7526b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && AbstractC5504s.c(this.f7526b, ((N) obj).f7526b);
    }

    public int hashCode() {
        return this.f7526b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f7526b + ')';
    }
}
