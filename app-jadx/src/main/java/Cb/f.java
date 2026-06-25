package Cb;

import expo.modules.filesystem.FileSystemPath;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2925a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileSystemPath f2926a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FileSystemPath path) {
            super(null);
            AbstractC5504s.h(path, "path");
            this.f2926a = path;
        }

        public final FileSystemPath a() {
            return this.f2926a;
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private f() {
    }
}
