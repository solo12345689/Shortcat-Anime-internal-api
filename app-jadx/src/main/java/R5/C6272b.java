package r5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: r5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6272b implements InterfaceC6271a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f58609b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f58610a;

    /* JADX INFO: renamed from: r5.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6272b a(File file) {
            AbstractC5504s.h(file, "file");
            return new C6272b(file, null);
        }

        public final C6272b b(File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new C6272b(file, defaultConstructorMarker);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ C6272b(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public static final C6272b b(File file) {
        return f58609b.a(file);
    }

    public static final C6272b c(File file) {
        return f58609b.b(file);
    }

    @Override // r5.InterfaceC6271a
    public InputStream a() {
        return new FileInputStream(this.f58610a);
    }

    public final File d() {
        return this.f58610a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6272b)) {
            return false;
        }
        return AbstractC5504s.c(this.f58610a, ((C6272b) obj).f58610a);
    }

    public int hashCode() {
        return this.f58610a.hashCode();
    }

    @Override // r5.InterfaceC6271a
    public long size() {
        return this.f58610a.length();
    }

    private C6272b(File file) {
        this.f58610a = file;
    }
}
