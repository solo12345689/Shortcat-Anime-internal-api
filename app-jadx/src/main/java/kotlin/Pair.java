package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "()Ljava/lang/Object;", "b", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "c", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object first;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object second;

    public Pair(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getSecond() {
        return this.second;
    }

    public final Object c() {
        return this.first;
    }

    public final Object d() {
        return this.second;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) other;
        return AbstractC5504s.c(this.first, pair.first) && AbstractC5504s.c(this.second, pair.second);
    }

    public int hashCode() {
        Object obj = this.first;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.second;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
