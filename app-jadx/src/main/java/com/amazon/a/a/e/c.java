package com.amazon.a.a.e;

import com.amazon.a.a.e.a;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T extends a<T>> extends a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34329b = new com.amazon.a.a.o.c("RelativeExpirable");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f34330c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f34331d = new Date();

    @Override // com.amazon.a.a.e.a
    public final Date a() {
        com.amazon.a.a.o.c cVar = f34329b;
        cVar.a("RelativeExpiration duration: " + h() + ", expirable: " + this);
        Date date = new Date(this.f34331d.getTime() + (h() * 1000));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expiration should occur at time: ");
        sb2.append(date);
        cVar.a(sb2.toString());
        return date;
    }

    protected abstract long h();
}
