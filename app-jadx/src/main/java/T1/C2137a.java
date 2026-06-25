package T1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: T1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2137a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2137a f16795a = new C2137a();

    private C2137a() {
    }

    public final boolean a(File srcFile, File dstFile) {
        AbstractC5504s.h(srcFile, "srcFile");
        AbstractC5504s.h(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
