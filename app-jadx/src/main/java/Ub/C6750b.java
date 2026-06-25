package ub;

import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ub.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6750b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6750b f61466a = new C6750b();

    private C6750b() {
    }

    public final AbstractC6749a a(String category) {
        AbstractC5504s.h(category, "category");
        return new C6755g(category);
    }

    public final AbstractC6749a b(File filesDirectory, String category) {
        AbstractC5504s.h(filesDirectory, "filesDirectory");
        AbstractC5504s.h(category, "category");
        return new C6761m(category, filesDirectory);
    }
}
