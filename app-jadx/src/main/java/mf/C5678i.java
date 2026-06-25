package mf;

import kotlin.jvm.internal.AbstractC5504s;
import ye.h0;

/* JADX INFO: renamed from: mf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5678i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ue.d f53422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Se.c f53423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ue.a f53424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f53425d;

    public C5678i(Ue.d nameResolver, Se.c classProto, Ue.a metadataVersion, h0 sourceElement) {
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(classProto, "classProto");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        AbstractC5504s.h(sourceElement, "sourceElement");
        this.f53422a = nameResolver;
        this.f53423b = classProto;
        this.f53424c = metadataVersion;
        this.f53425d = sourceElement;
    }

    public final Ue.d a() {
        return this.f53422a;
    }

    public final Se.c b() {
        return this.f53423b;
    }

    public final Ue.a c() {
        return this.f53424c;
    }

    public final h0 d() {
        return this.f53425d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5678i)) {
            return false;
        }
        C5678i c5678i = (C5678i) obj;
        return AbstractC5504s.c(this.f53422a, c5678i.f53422a) && AbstractC5504s.c(this.f53423b, c5678i.f53423b) && AbstractC5504s.c(this.f53424c, c5678i.f53424c) && AbstractC5504s.c(this.f53425d, c5678i.f53425d);
    }

    public int hashCode() {
        return (((((this.f53422a.hashCode() * 31) + this.f53423b.hashCode()) * 31) + this.f53424c.hashCode()) * 31) + this.f53425d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f53422a + ", classProto=" + this.f53423b + ", metadataVersion=" + this.f53424c + ", sourceElement=" + this.f53425d + ')';
    }
}
