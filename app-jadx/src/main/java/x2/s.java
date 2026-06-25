package x2;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class s extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f63801g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f63802h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f63803i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private s(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static s k(File file, long j10, long j11, k kVar) {
        String strI;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = r(file, kVar);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = f63803i.matcher(name);
        if (!matcher.matches() || (strI = kVar.i(Integer.parseInt((String) AbstractC6614a.e(matcher.group(1))))) == null) {
            return null;
        }
        if (j10 == -1) {
            j10 = file2.length();
        }
        long j12 = j10;
        if (j12 == 0) {
            return null;
        }
        return new s(strI, Long.parseLong((String) AbstractC6614a.e(matcher.group(2))), j12, j11 == -9223372036854775807L ? Long.parseLong((String) AbstractC6614a.e(matcher.group(3))) : j11, file2);
    }

    public static s m(File file, long j10, k kVar) {
        return k(file, j10, -9223372036854775807L, kVar);
    }

    public static s n(String str, long j10, long j11) {
        return new s(str, j10, j11, -9223372036854775807L, null);
    }

    public static s p(String str, long j10) {
        return new s(str, j10, -1L, -9223372036854775807L, null);
    }

    public static File q(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + ".v3.exo");
    }

    private static File r(File file, k kVar) {
        String strE1;
        String name = file.getName();
        Matcher matcher = f63802h.matcher(name);
        if (matcher.matches()) {
            strE1 = a0.E1((String) AbstractC6614a.e(matcher.group(1)));
        } else {
            matcher = f63801g.matcher(name);
            strE1 = matcher.matches() ? (String) AbstractC6614a.e(matcher.group(1)) : null;
        }
        if (strE1 == null) {
            return null;
        }
        File fileQ = q((File) AbstractC6614a.i(file.getParentFile()), kVar.e(strE1), Long.parseLong((String) AbstractC6614a.e(matcher.group(2))), Long.parseLong((String) AbstractC6614a.e(matcher.group(3))));
        if (file.renameTo(fileQ)) {
            return fileQ;
        }
        return null;
    }

    public s h(File file, long j10) {
        AbstractC6614a.g(this.f63750d);
        return new s(this.f63747a, this.f63748b, this.f63749c, j10, file);
    }
}
