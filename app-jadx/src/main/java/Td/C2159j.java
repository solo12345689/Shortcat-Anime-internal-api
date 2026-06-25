package Td;

import java.io.Serializable;
import kotlin.Lazy;

/* JADX INFO: renamed from: Td.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2159j implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17452a;

    public C2159j(Object obj) {
        this.f17452a = obj;
    }

    @Override // kotlin.Lazy
    public boolean e() {
        return true;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        return this.f17452a;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
