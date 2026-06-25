package fe;

import Td.L;
import Ud.AbstractC2279u;
import Ud.F;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends o {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final a f47042a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Void invoke(File file, IOException exception) throws IOException {
            AbstractC5504s.h(file, "<unused var>");
            AbstractC5504s.h(exception, "exception");
            throw exception;
        }
    }

    public static String A(File file) {
        AbstractC5504s.h(file, "<this>");
        String name = file.getName();
        AbstractC5504s.g(name, "getName(...)");
        return Df.r.X0(name, com.amazon.a.a.o.c.a.b.f34706a, "");
    }

    public static String B(File file) {
        AbstractC5504s.h(file, "<this>");
        String name = file.getName();
        AbstractC5504s.g(name, "getName(...)");
        return Df.r.i1(name, ".", null, 2, null);
    }

    private static final g C(g gVar) {
        return new g(gVar.a(), D(gVar.b()));
    }

    private static final List D(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            if (!AbstractC5504s.c(name, ".")) {
                if (!AbstractC5504s.c(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || AbstractC5504s.c(((File) AbstractC2279u.y0(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    public static final File E(File file, File relative) {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(relative, "relative");
        if (l.b(relative)) {
            return relative;
        }
        String string = file.toString();
        AbstractC5504s.g(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!Df.r.Z(string, c10, false, 2, null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    public static File F(File file, String relative) {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(relative, "relative");
        return E(file, new File(relative));
    }

    public static boolean G(File file, File other) {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(other, "other");
        g gVarC = l.c(file);
        g gVarC2 = l.c(other);
        if (AbstractC5504s.c(gVarC.a(), gVarC2.a()) && gVarC.c() >= gVarC2.c()) {
            return gVarC.b().subList(0, gVarC2.c()).equals(gVarC2.b());
        }
        return false;
    }

    public static final String H(File file, File base) throws IOException {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(base, "base");
        String strI = I(file, base);
        if (strI != null) {
            return strI;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + com.amazon.a.a.o.c.a.b.f34706a);
    }

    private static final String I(File file, File file2) throws IOException {
        g gVarC = C(l.c(file));
        g gVarC2 = C(l.c(file2));
        if (!AbstractC5504s.c(gVarC.a(), gVarC2.a())) {
            return null;
        }
        int iC = gVarC2.c();
        int iC2 = gVarC.c();
        int iMin = Math.min(iC2, iC);
        int i10 = 0;
        while (i10 < iMin && AbstractC5504s.c(gVarC.b().get(i10), gVarC2.b().get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = iC - 1;
        if (i10 <= i11) {
            while (!AbstractC5504s.c(((File) gVarC2.b().get(i11)).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < iC2) {
            if (i10 < iC) {
                sb2.append(File.separatorChar);
            }
            List listG0 = AbstractC2279u.g0(gVarC.b(), i10);
            String separator = File.separator;
            AbstractC5504s.g(separator, "separator");
            F.t0(listG0, sb2, (124 & 2) != 0 ? ", " : separator, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        return sb2.toString();
    }

    public static final boolean u(File file, File target, boolean z10, final Function2 onError) {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(target, "target");
        AbstractC5504s.h(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new s(file, null, "The source file doesn't exist.", 2, null)) != t.f47048b;
        }
        try {
            for (File file2 : o.s(file).i(new Function2() { // from class: fe.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.w(onError, (File) obj, (IOException) obj2);
                }
            })) {
                if (file2.exists()) {
                    File file3 = new File(target, H(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (z10) {
                            if (file3.isDirectory()) {
                                if (!z(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (onError.invoke(file3, new f(file2, file3, "The destination file already exists.")) == t.f47048b) {
                            return false;
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        boolean z11 = z10;
                        if (y(file2, file3, z11, 0, 4, null).length() != file2.length() && onError.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == t.f47048b) {
                            return false;
                        }
                        z10 = z11;
                    }
                } else if (onError.invoke(file2, new s(file2, null, "The source file doesn't exist.", 2, null)) == t.f47048b) {
                    return false;
                }
            }
            return true;
        } catch (u unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean v(File file, File file2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function2 = a.f47042a;
        }
        return u(file, file2, z10, function2);
    }

    public static final L w(Function2 function2, File f10, IOException e10) throws u {
        AbstractC5504s.h(f10, "f");
        AbstractC5504s.h(e10, "e");
        if (function2.invoke(f10, e10) != t.f47048b) {
            return L.f17438a;
        }
        throw new u(f10);
    }

    public static final File x(File file, File target, boolean z10, int i10) throws IOException {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(target, "target");
        if (!file.exists()) {
            throw new s(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new f(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new f(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new h(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                b.a(fileInputStream, fileOutputStream, i10);
                c.a(fileOutputStream, null);
                c.a(fileInputStream, null);
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File y(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return x(file, file2, z10, i10);
    }

    public static boolean z(File file) {
        AbstractC5504s.h(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : o.r(file)) {
                if (!file2.delete() && file2.exists()) {
                    z10 = false;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = false;
                }
            }
            return z10;
        }
    }
}
