package com.facebook.imagepipeline.producers;

import K6.b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3200u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3200u f36302a = new C3200u();

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private C3200u() {
    }

    public static final x6.j a(K6.b imageRequest, x6.j jVar, x6.j jVar2, Map map) {
        String strF;
        AbstractC5504s.h(imageRequest, "imageRequest");
        if (imageRequest.c() == b.EnumC0172b.SMALL) {
            return jVar;
        }
        if (imageRequest.c() == b.EnumC0172b.DEFAULT) {
            return jVar2;
        }
        if (imageRequest.c() != b.EnumC0172b.DYNAMIC || map == null || (strF = imageRequest.f()) == null) {
            return null;
        }
        return (x6.j) map.get(strF);
    }
}
