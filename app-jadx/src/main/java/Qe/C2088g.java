package Qe;

import Qe.AbstractC2086e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Qe.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2088g extends AbstractC2086e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f14853c;

    public C2088g(Map memberAnnotations, Map propertyConstants, Map annotationParametersDefaultValues) {
        AbstractC5504s.h(memberAnnotations, "memberAnnotations");
        AbstractC5504s.h(propertyConstants, "propertyConstants");
        AbstractC5504s.h(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f14851a = memberAnnotations;
        this.f14852b = propertyConstants;
        this.f14853c = annotationParametersDefaultValues;
    }

    @Override // Qe.AbstractC2086e.a
    public Map a() {
        return this.f14851a;
    }

    public final Map b() {
        return this.f14853c;
    }

    public final Map c() {
        return this.f14852b;
    }
}
