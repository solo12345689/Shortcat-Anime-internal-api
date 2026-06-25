package fe;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class h extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f47012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f47013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47014c;

    public /* synthetic */ h(File file, File file2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(File file, File file2, String str) {
        super(d.b(file, file2, str));
        AbstractC5504s.h(file, "file");
        this.f47012a = file;
        this.f47013b = file2;
        this.f47014c = str;
    }
}
