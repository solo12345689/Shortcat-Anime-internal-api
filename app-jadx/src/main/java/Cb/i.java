package Cb;

import Cb.f;
import Gf.C1627p;
import Gf.InterfaceC1623n;
import Td.u;
import Wb.c;
import ae.AbstractC2605b;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.webkit.URLUtil;
import app.notifee.core.event.LogEvent;
import dc.C4581b;
import dg.C;
import dg.C4618A;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import expo.modules.filesystem.CreateOptions;
import expo.modules.filesystem.DirectoryInfo;
import expo.modules.filesystem.DownloadOptions;
import expo.modules.filesystem.EncodingType;
import expo.modules.filesystem.FileInfo;
import expo.modules.filesystem.FileSystemDirectory;
import expo.modules.filesystem.FileSystemFile;
import expo.modules.filesystem.FileSystemFileHandle;
import expo.modules.filesystem.FileSystemPath;
import expo.modules.filesystem.InfoOptions;
import expo.modules.filesystem.PathInfo;
import expo.modules.filesystem.WriteOptions;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.types.Either;
import hc.C4931c;
import hc.C4940l;
import hc.C4941m;
import he.AbstractC4945a;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;
import pc.C5974d;
import pe.C6029s;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"LCb/i;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "Ljava/io/File;", "A", "()Ljava/io/File;", "filesDirectory", "z", "cacheDirectory", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A implements Function2 {
        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, Ub.u promise) throws n, IOException {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            ((FileSystemFile) promise).O1();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws n, IOException {
            a((Object[]) obj, (Ub.u) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final A0 f2927a = new A0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFileHandle.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class B implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final B f2928a = new B();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class B0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws IOException {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemFileHandle) objArr[0]).close();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemFile) objArr[0]).O1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((FileSystemFileHandle) it[0]).Y();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class D implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D f2929a = new D();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Uri.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class D0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((FileSystemFileHandle) it[0]).h0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class E implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return new FileSystemFile((Uri) objArr[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class E0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final E0 f2930a = new E0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Long.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class F implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final F f2931a = new F();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(WriteOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class F0 implements Function1 {
        public final void a(Object[] it) throws IOException {
            AbstractC5504s.h(it, "it");
            Object obj = it[0];
            Object obj2 = it[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            ((FileSystemFileHandle) obj).p0(Long.valueOf(((Long) obj2).longValue()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            a((Object[]) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class G implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws n, IOException, s {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            WriteOptions writeOptions = (WriteOptions) objArr[2];
            Either either = (Either) obj2;
            FileSystemFile fileSystemFile = (FileSystemFile) obj;
            boolean append = writeOptions != null ? writeOptions.getAppend() : false;
            if (either.e(kotlin.jvm.internal.O.b(String.class))) {
                String str = (String) either.b(kotlin.jvm.internal.O.b(String.class));
                if ((writeOptions != null ? writeOptions.getEncoding() : null) == EncodingType.BASE64) {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    AbstractC5504s.g(bArrDecode, "decode(...)");
                    fileSystemFile.i2(bArrDecode, append);
                } else {
                    fileSystemFile.g2(str, append);
                }
            }
            if (either.f(kotlin.jvm.internal.O.b(oc.j.class))) {
                fileSystemFile.h2((oc.j) either.c(kotlin.jvm.internal.O.b(oc.j.class)), append);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class G0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final G0 f2932a = new G0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Uri.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class H implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final H f2933a = new H();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class H0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return new FileSystemDirectory((Uri) objArr[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class I implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemFile) objArr[0]).e2();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class I0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemDirectory) objArr[0]).Z1((String) objArr[1]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class J implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final J f2934a = new J();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class J0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final J0 f2935a = new J0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class K implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemFile) objArr[0]).D1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class K0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final K0 f2936a = new K0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class L implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final L f2937a = new L();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class L0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final L0 f2938a = new L0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class M implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemFile) objArr[0]).O1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class M0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            return ((FileSystemDirectory) obj).a2((String) objArr[2], (String) objArr[1]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class N implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final N f2939a = new N();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class N0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final N0 f2940a = new N0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class O implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final O f2941a = new O();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(InfoOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class O0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemDirectory) objArr[0]).h2();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class P implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final P f2942a = new P();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class P0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final P0 f2943a = new P0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Q implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemFile) objArr[0]).d2((InfoOptions) objArr[1]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Q0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Q0 f2944a = new Q0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemPath.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class R implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final R f2945a = new R();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class R0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemDirectory) objArr[0]).O((FileSystemPath) objArr[1]);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class S implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final S f2946a = new S();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemPath.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class S0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final S0 f2947a = new S0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class T implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemFile) objArr[0]).O((FileSystemPath) objArr[1]);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class T0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final T0 f2948a = new T0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class U implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final U f2949a = new U();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class U0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final U0 f2950a = new U0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemPath.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class V implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final V f2951a = new V();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemPath.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class V0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws c, a {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemDirectory) objArr[0]).G0((FileSystemPath) objArr[1]);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class W implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws c, a {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemFile) objArr[0]).G0((FileSystemPath) objArr[1]);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class W0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final W0 f2952a = new W0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class X implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X f2953a = new X();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class X0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X0 f2954a = new X0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Y implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Y f2955a = new Y();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Y0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws IOException, s {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemDirectory) objArr[0]).M0((String) objArr[1]);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Z implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws IOException, s {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemFile) objArr[0]).M0((String) objArr[1]);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Z0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z0 f2956a = new Z0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1178a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f2959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f2960d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1178a(kotlin.jvm.internal.N n10, i iVar, Zd.e eVar) {
            super(2, eVar);
            this.f2959c = n10;
            this.f2960d = iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Wb.c cVar, Zd.e eVar) {
            return ((C1178a) create(cVar, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            C1178a c1178a = new C1178a(this.f2959c, this.f2960d, eVar);
            c1178a.f2958b = obj;
            return c1178a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.N n10;
            Object objF = AbstractC2605b.f();
            int i10 = this.f2957a;
            if (i10 == 0) {
                Td.v.b(obj);
                Wb.c cVar = (Wb.c) this.f2958b;
                kotlin.jvm.internal.N n11 = this.f2959c;
                d dVar = new d(this.f2960d);
                this.f2958b = n11;
                this.f2957a = 1;
                Object objB = c.a.b(cVar, dVar, null, this, 2, null);
                if (objB == objF) {
                    return objF;
                }
                n10 = n11;
                obj = objB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n10 = (kotlin.jvm.internal.N) this.f2958b;
                Td.v.b(obj);
            }
            n10.f52259a = obj;
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Cb.i$a0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1179a0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws t {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemFile) objArr[0]).S();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemDirectory) objArr[0]).e2();
        }
    }

    /* JADX INFO: renamed from: Cb.i$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1180b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1180b f2961a = new C1180b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$b0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1181b0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1181b0 f2962a = new C1181b0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemDirectory) objArr[0]).d2();
        }
    }

    /* JADX INFO: renamed from: Cb.i$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1182c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1182c f2963a = new C1182c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFileHandle.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$c0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1183c0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return new FileSystemFileHandle((FileSystemFile) objArr[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c1 f2964a = new c1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1184d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1184d f2965a = new C1184d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$d0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1185d0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1185d0 f2966a = new C1185d0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws t {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemDirectory) objArr[0]).S();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Cb.i$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1186e implements InterfaceC5082a {
        public C1186e() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Uri.fromFile(i.this.A()) + "/";
        }
    }

    /* JADX INFO: renamed from: Cb.i$e0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1187e0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemFile) objArr[0]).f2();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e1 f2968a = new e1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1188f implements InterfaceC5082a {
        public C1188f() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Uri.fromFile(i.this.z()) + "/";
        }
    }

    /* JADX INFO: renamed from: Cb.i$f0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1189f0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1189f0 f2970a = new C1189f0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f1 f2971a = new f1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(CreateOptions.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1190g implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return "asset://";
        }
    }

    /* JADX INFO: renamed from: Cb.i$g0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1191g0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1191g0 f2972a = new C1191g0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(CreateOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws s, o {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            CreateOptions createOptions = (CreateOptions) objArr[1];
            FileSystemDirectory fileSystemDirectory = (FileSystemDirectory) obj;
            if (createOptions == null) {
                createOptions = new CreateOptions(false, false, false, 7, null);
            }
            fileSystemDirectory.Y1(createOptions);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Cb.i$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1192h implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1192h f2973a = new C1192h();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(URI.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$h0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1193h0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws n, s {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            CreateOptions createOptions = (CreateOptions) objArr[1];
            FileSystemFile fileSystemFile = (FileSystemFile) obj;
            if (createOptions == null) {
                createOptions = new CreateOptions(false, false, false, 7, null);
            }
            fileSystemFile.S1(createOptions);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h1 f2974a = new h1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemDirectory.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0033i implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0033i f2975a = new C0033i();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemPath.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$i0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1194i0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1194i0 f2976a = new C1194i0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i1 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i1 f2977a = new i1();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$j, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1195j implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1195j f2978a = new C1195j();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(DownloadOptions.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$j0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1196j0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1196j0 f2979a = new C1196j0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return kotlin.jvm.internal.O.q(Either.class, aVar.d(kotlin.jvm.internal.O.o(String.class)), aVar.d(kotlin.jvm.internal.O.o(oc.j.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((FileSystemDirectory) it[0]).b2());
        }
    }

    /* JADX INFO: renamed from: Cb.i$k, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1197k extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f2982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f2985f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f2986g;

        public C1197k(Zd.e eVar) {
            super(3, eVar);
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, Zd.e eVar) {
            C1197k c1197k = new C1197k(eVar);
            c1197k.f2981b = objArr;
            return c1197k.invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws u, IOException, b {
            URI uri;
            FileSystemPath fileSystemPath;
            DownloadOptions downloadOptions;
            Map<String, String> headers;
            Object objF = AbstractC2605b.f();
            int i10 = this.f2980a;
            if (i10 == 0) {
                Td.v.b(obj);
                Object[] objArr = (Object[]) this.f2981b;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                DownloadOptions downloadOptions2 = (DownloadOptions) objArr[2];
                FileSystemPath fileSystemPath2 = (FileSystemPath) obj3;
                URI uri2 = (URI) obj2;
                fileSystemPath2.t1(FilePermissionService.a.f46180b);
                C.a aVar = new C.a();
                URL url = uri2.toURL();
                AbstractC5504s.g(url, "toURL(...)");
                C.a aVarN = aVar.n(url);
                if (downloadOptions2 != null && (headers = downloadOptions2.getHeaders()) != null) {
                    for (Map.Entry<String, String> entry : headers.entrySet()) {
                        aVarN.a(entry.getKey(), entry.getValue());
                    }
                }
                dg.C cB = aVarN.b();
                C4618A c4618a = new C4618A();
                this.f2981b = downloadOptions2;
                this.f2982c = fileSystemPath2;
                this.f2983d = uri2;
                this.f2984e = c4618a;
                this.f2985f = cB;
                this.f2986g = this;
                this.f2980a = 1;
                C1627p c1627p = new C1627p(AbstractC2605b.c(this), 1);
                c1627p.C();
                c4618a.a(cB).O1(new m1(c1627p));
                Object objV = c1627p.v();
                if (objV == AbstractC2605b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objV == objF) {
                    return objF;
                }
                uri = uri2;
                fileSystemPath = fileSystemPath2;
                downloadOptions = downloadOptions2;
                obj = objV;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uri = (URI) this.f2983d;
                fileSystemPath = (FileSystemPath) this.f2982c;
                downloadOptions = (DownloadOptions) this.f2981b;
                Td.v.b(obj);
            }
            dg.E e10 = (dg.E) obj;
            if (!e10.J()) {
                throw new u("response has status: " + e10.o());
            }
            File file = fileSystemPath instanceof FileSystemDirectory ? new File(fileSystemPath.k0(), URLUtil.guessFileName(uri.toString(), e10.E().d("content-disposition"), e10.E().d("content-type"))) : fileSystemPath.k0();
            if ((downloadOptions == null || !downloadOptions.getIdempotent()) && file.exists()) {
                throw new b();
            }
            dg.F fJ = e10.j();
            if (fJ == null) {
                throw new u("response body is null");
            }
            InputStream inputStreamA = fJ.a();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fe.b.b(inputStreamA, fileOutputStream, 0, 2, null);
                    fe.c.a(fileOutputStream, null);
                    fe.c.a(inputStreamA, null);
                    return file.toURI();
                } finally {
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: Cb.i$k0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1198k0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((FileSystemFile) it[0]).Z1());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((FileSystemDirectory) it[0]).S1();
        }
    }

    /* JADX INFO: renamed from: Cb.i$l, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1199l implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1199l f2987a = new C1199l();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Uri.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$l0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1200l0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((FileSystemFile) it[0]).p0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Long.valueOf(((FileSystemDirectory) it[0]).c2());
        }
    }

    /* JADX INFO: renamed from: Cb.i$m, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1201m extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f2990c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1201m(Zd.e eVar, kotlin.jvm.internal.N n10) {
            super(3, eVar);
            this.f2990c = n10;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, Zd.e eVar) {
            C1201m c1201m = new C1201m(eVar, this.f2990c);
            c1201m.f2989b = objArr;
            return c1201m.invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws q {
            Wb.f fVar;
            Object objF = AbstractC2605b.f();
            int i10 = this.f2988a;
            if (i10 == 0) {
                Td.v.b(obj);
                Uri uri = (Uri) ((Object[]) this.f2989b)[0];
                Object obj2 = this.f2990c.f52259a;
                if (obj2 == null) {
                    AbstractC5504s.u("filePickerLauncher");
                    fVar = null;
                } else {
                    fVar = (Wb.f) obj2;
                }
                e eVar = new e(uri, null, r.f3009b);
                this.f2988a = 1;
                obj = fVar.a(eVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            f fVar2 = (f) obj;
            if (fVar2 instanceof f.b) {
                FileSystemPath fileSystemPathA = ((f.b) fVar2).a();
                AbstractC5504s.f(fileSystemPathA, "null cannot be cast to non-null type expo.modules.filesystem.FileSystemDirectory");
                return (FileSystemDirectory) fileSystemPathA;
            }
            if (fVar2 instanceof f.a) {
                throw new q();
            }
            throw new Td.r();
        }
    }

    /* JADX INFO: renamed from: Cb.i$m0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1202m0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((FileSystemFile) it[0]).Y();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m1 implements InterfaceC4625f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f2991a;

        public m1(InterfaceC1623n interfaceC1623n) {
            this.f2991a = interfaceC1623n;
        }

        @Override // dg.InterfaceC4625f
        public void h(InterfaceC4624e call, dg.E response) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(response, "response");
            this.f2991a.resumeWith(Td.u.b(response));
        }

        @Override // dg.InterfaceC4625f
        public void j(InterfaceC4624e call, IOException e10) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(e10, "e");
            if (this.f2991a.isCancelled()) {
                return;
            }
            InterfaceC1623n interfaceC1623n = this.f2991a;
            u.a aVar = Td.u.f17466b;
            interfaceC1623n.resumeWith(Td.u.b(Td.v.a(e10)));
        }
    }

    /* JADX INFO: renamed from: Cb.i$n, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1203n implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1203n f2992a = new C1203n();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(Uri.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$n0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1204n0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((FileSystemFile) it[0]).A1();
        }
    }

    /* JADX INFO: renamed from: Cb.i$o, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1205o implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1205o f2993a = new C1205o();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$o0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1206o0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((FileSystemFile) it[0]).y1();
        }
    }

    /* JADX INFO: renamed from: Cb.i$p, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1207p extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f2996c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1207p(Zd.e eVar, kotlin.jvm.internal.N n10) {
            super(3, eVar);
            this.f2996c = n10;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, Zd.e eVar) {
            C1207p c1207p = new C1207p(eVar, this.f2996c);
            c1207p.f2995b = objArr;
            return c1207p.invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws q {
            Wb.f fVar;
            Object objF = AbstractC2605b.f();
            int i10 = this.f2994a;
            if (i10 == 0) {
                Td.v.b(obj);
                Object[] objArr = (Object[]) this.f2995b;
                Object obj2 = objArr[0];
                String str = (String) objArr[1];
                Uri uri = (Uri) obj2;
                Object obj3 = this.f2996c.f52259a;
                if (obj3 == null) {
                    AbstractC5504s.u("filePickerLauncher");
                    fVar = null;
                } else {
                    fVar = (Wb.f) obj3;
                }
                e eVar = new e(uri, str, r.f3008a);
                this.f2994a = 1;
                obj = fVar.a(eVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            f fVar2 = (f) obj;
            if (fVar2 instanceof f.b) {
                FileSystemPath fileSystemPathA = ((f.b) fVar2).a();
                AbstractC5504s.f(fileSystemPathA, "null cannot be cast to non-null type expo.modules.filesystem.FileSystemFile");
                return (FileSystemFile) fileSystemPathA;
            }
            if (fVar2 instanceof f.a) {
                throw new q();
            }
            throw new Td.r();
        }
    }

    /* JADX INFO: renamed from: Cb.i$p0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1208p0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            try {
                return ((FileSystemFile) it[0]).a2();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: Cb.i$q, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1209q implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1209q f2997a = new C1209q();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(URI.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$q0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1210q0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            try {
                return ((FileSystemFile) it[0]).b2();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: Cb.i$r, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1211r implements Function1 {
        public C1211r() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws cc.i {
            AbstractC5504s.h(objArr, "<destruct>");
            File file = new File((URI) objArr[0]);
            FilePermissionService filePermissionServiceS = i.this.i().s();
            Context contextB = i.this.i().B();
            if (contextB == null) {
                throw new cc.i();
            }
            String path = file.getPath();
            AbstractC5504s.g(path, "getPath(...)");
            return (filePermissionServiceS.d(contextB, path).contains(FilePermissionService.a.f46179a) && file.exists()) ? new PathInfo(file.exists(), Boolean.valueOf(file.isDirectory())) : new PathInfo(false, null);
        }
    }

    /* JADX INFO: renamed from: Cb.i$r0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1212r0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return ((FileSystemFile) it[0]).c2();
        }
    }

    /* JADX INFO: renamed from: Cb.i$s, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1213s implements Function1 {
        public C1213s() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Long.valueOf(i.this.A().getTotalSpace());
        }
    }

    /* JADX INFO: renamed from: Cb.i$s0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1214s0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1214s0 f3000a = new C1214s0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$t, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1215t implements Function1 {
        public C1215t() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Long.valueOf(i.this.A().getFreeSpace());
        }
    }

    /* JADX INFO: renamed from: Cb.i$t0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1216t0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return new FileSystemFileHandle((FileSystemFile) objArr[0]);
        }
    }

    /* JADX INFO: renamed from: Cb.i$u, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1217u implements Function2 {
        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, Ub.u promise) throws n, IOException {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            ((FileSystemFile) promise).e2();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws n, IOException {
            a((Object[]) obj, (Ub.u) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Cb.i$u0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1218u0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1218u0 f3002a = new C1218u0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFileHandle.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$v, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1219v implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1219v f3003a = new C1219v();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$v0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1220v0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1220v0 f3004a = new C1220v0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Long.TYPE);
        }
    }

    /* JADX INFO: renamed from: Cb.i$w, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1221w implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemFile) objArr[0]).e2();
        }
    }

    /* JADX INFO: renamed from: Cb.i$w0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1222w0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemFileHandle) objArr[0]).k0(((Number) objArr[1]).longValue());
        }
    }

    /* JADX INFO: renamed from: Cb.i$x, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1223x implements Function2 {
        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, Ub.u promise) throws n, IOException {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            ((FileSystemFile) promise).D1();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws n, IOException {
            a((Object[]) obj, (Ub.u) obj2);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Cb.i$x0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1224x0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1224x0 f3005a = new C1224x0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFileHandle.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$y, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1225y implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1225y f3006a = new C1225y();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(FileSystemFile.class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$y0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1226y0 implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1226y0 f3007a = new C1226y0();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(byte[].class);
        }
    }

    /* JADX INFO: renamed from: Cb.i$z, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1227z implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((FileSystemFile) objArr[0]).D1();
        }
    }

    /* JADX INFO: renamed from: Cb.i$z0, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1228z0 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws w, v {
            AbstractC5504s.h(objArr, "<destruct>");
            ((FileSystemFileHandle) objArr[0]).write((byte[]) objArr[1]);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File A() {
        return i().A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File z() {
        return i().p();
    }

    @Override // gc.c
    public gc.e n() {
        Class cls;
        String str;
        Class cls2;
        Class cls3;
        Class cls4;
        String str2;
        Class cls5;
        gc.d dVar;
        Class cls6;
        Object lVar;
        Object lVar2;
        Object lVar3;
        Yb.c cVar;
        Class cls7;
        Class cls8;
        Yb.c cVar2;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar2 = new gc.d(this);
            dVar2.s("FileSystem");
            C4931c c4931c = new C4931c("documentDirectory");
            c4931c.b(new C1186e());
            dVar2.l().put("documentDirectory", c4931c);
            C4931c c4931c2 = new C4931c("cacheDirectory");
            c4931c2.b(new C1188f());
            dVar2.l().put("cacheDirectory", c4931c2);
            C4931c c4931c3 = new C4931c("bundleDirectory");
            c4931c3.b(new C1190g());
            dVar2.l().put("bundleDirectory", c4931c3);
            C4940l c4940l = new C4940l("totalDiskSpace");
            C5972b[] c5972bArr = new C5972b[0];
            pc.V v10 = pc.V.f55908a;
            pc.U u10 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Long.class));
            if (u10 == null) {
                u10 = new pc.U(kotlin.jvm.internal.O.b(Long.class));
                cls = FileSystemFileHandle.class;
                v10.a().put(kotlin.jvm.internal.O.b(Long.class), u10);
            } else {
                cls = FileSystemFileHandle.class;
            }
            c4940l.b(new dc.r(com.amazon.a.a.o.b.au, c5972bArr, u10, new C1213s()));
            dVar2.o().put("totalDiskSpace", c4940l);
            C4940l c4940l2 = new C4940l("availableDiskSpace");
            C5972b[] c5972bArr2 = new C5972b[0];
            pc.U u11 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Long.class));
            if (u11 == null) {
                u11 = new pc.U(kotlin.jvm.internal.O.b(Long.class));
                v10.a().put(kotlin.jvm.internal.O.b(Long.class), u11);
            }
            c4940l2.b(new dc.r(com.amazon.a.a.o.b.au, c5972bArr2, u11, new C1215t()));
            dVar2.o().put("availableDiskSpace", c4940l2);
            C4581b c4581bB = dVar2.b("downloadFileAsync");
            String strC = c4581bB.c();
            pc.X xB = c4581bB.b();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = kotlin.jvm.internal.O.b(URI.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                C1192h c1192h = C1192h.f2973a;
                cls2 = FileSystemDirectory.class;
                cls3 = Long.class;
                InterfaceC6014d interfaceC6014dB2 = kotlin.jvm.internal.O.b(URI.class);
                str = com.amazon.a.a.o.b.au;
                c5972b = new C5972b(new pc.M(interfaceC6014dB2, false, c1192h), xB);
            } else {
                str = com.amazon.a.a.o.b.au;
                cls2 = FileSystemDirectory.class;
                cls3 = Long.class;
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(FileSystemPath.class), bool));
            if (c5972b2 == null) {
                cls4 = String.class;
                c5972b2 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(FileSystemPath.class), false, C0033i.f2975a), xB);
            } else {
                cls4 = String.class;
            }
            InterfaceC6014d interfaceC6014dB3 = kotlin.jvm.internal.O.b(DownloadOptions.class);
            Boolean bool2 = Boolean.TRUE;
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB3, bool2));
            if (c5972b3 == null) {
                C1195j c1195j = C1195j.f2978a;
                cls5 = FileSystemFile.class;
                InterfaceC6014d interfaceC6014dB4 = kotlin.jvm.internal.O.b(DownloadOptions.class);
                str2 = LogEvent.LEVEL_INFO;
                c5972b3 = new C5972b(new pc.M(interfaceC6014dB4, true, c1195j), xB);
            } else {
                str2 = LogEvent.LEVEL_INFO;
                cls5 = FileSystemFile.class;
            }
            c4581bB.d(new dc.p(strC, new C5972b[]{c5972b, c5972b2, c5972b3}, new C1197k(null)));
            kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
            dVar2.t(new C1178a(n10, this, null));
            C4581b c4581bB2 = dVar2.b("pickDirectoryAsync");
            String strC2 = c4581bB2.c();
            pc.X xB2 = c4581bB2.b();
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Uri.class), bool2));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Uri.class), true, C1199l.f2987a), xB2);
            }
            c4581bB2.d(new dc.p(strC2, new C5972b[]{c5972b4}, new C1201m(null, n10)));
            C4581b c4581bB3 = dVar2.b("pickFileAsync");
            String strC3 = c4581bB3.c();
            pc.X xB3 = c4581bB3.b();
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Uri.class), bool2));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Uri.class), true, C1203n.f2992a), xB3);
            }
            C5972b c5972b6 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls4), bool2));
            if (c5972b6 == null) {
                c5972b6 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls4), true, C1205o.f2993a), xB3);
            }
            c4581bB3.d(new dc.p(strC3, new C5972b[]{c5972b5, c5972b6}, new C1207p(null, n10)));
            pc.X xM = dVar2.m();
            C5972b c5972b7 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(URI.class), bool));
            if (c5972b7 == null) {
                c5972b7 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(URI.class), false, C1209q.f2997a), xM);
            }
            C5972b[] c5972bArr3 = {c5972b7};
            pc.U u12 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(PathInfo.class));
            if (u12 == null) {
                u12 = new pc.U(kotlin.jvm.internal.O.b(PathInfo.class));
                v10.a().put(kotlin.jvm.internal.O.b(PathInfo.class), u12);
            }
            String str3 = str2;
            dVar2.p().put(str3, new dc.r(str3, c5972bArr3, u12, new C1211r()));
            InterfaceC6014d interfaceC6014dB5 = kotlin.jvm.internal.O.b(cls5);
            gc.c cVarX = dVar2.x();
            if (cVarX == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Ub.d dVarI = cVarX.i();
            String simpleName = AbstractC4945a.b(interfaceC6014dB5).getSimpleName();
            AbstractC5504s.g(simpleName, "getSimpleName(...)");
            C5972b c5972b8 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool));
            Yb.c cVar3 = new Yb.c(dVarI, simpleName, interfaceC6014dB5, c5972b8 == null ? new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls5), false, C1180b.f2961a), null) : c5972b8, dVar2.m());
            pc.X xM2 = cVar3.m();
            C5972b c5972b9 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Uri.class), bool));
            if (c5972b9 == null) {
                c5972b9 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Uri.class), false, D.f2929a), xM2);
            }
            C5972b[] c5972bArr4 = {c5972b9};
            pc.U u13 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Object.class));
            if (u13 == null) {
                u13 = new pc.U(kotlin.jvm.internal.O.b(Object.class));
                v10.a().put(kotlin.jvm.internal.O.b(Object.class), u13);
            }
            cVar3.B(new dc.r("constructor", c5972bArr4, u13, new E()));
            pc.X xM3 = cVar3.m();
            C5972b c5972b10 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool));
            if (c5972b10 == null) {
                c5972b10 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls5), false, P.f2942a), xM3);
            }
            C5972b[] c5972bArr5 = {c5972b10};
            pc.U u14 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u14 == null) {
                u14 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u14);
            }
            cVar3.p().put("delete", new dc.r("delete", c5972bArr5, u14, new C1179a0()));
            pc.X xM4 = cVar3.m();
            C5972b c5972b11 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool));
            if (c5972b11 == null) {
                c5972b11 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls5), false, C1185d0.f2966a), xM4);
            }
            C5972b[] c5972bArr6 = {c5972b11};
            pc.U u15 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u15 == null) {
                u15 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u15);
            }
            cVar3.p().put("validatePath", new dc.r("validatePath", c5972bArr6, u15, new C1187e0()));
            pc.X xM5 = cVar3.m();
            C5972b c5972b12 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool));
            if (c5972b12 == null) {
                c5972b12 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls5), false, C1189f0.f2970a), xM5);
            }
            C5972b c5972b13 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(CreateOptions.class), bool2));
            if (c5972b13 == null) {
                c5972b13 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(CreateOptions.class), true, C1191g0.f2972a), xM5);
            }
            C5972b[] c5972bArr7 = {c5972b12, c5972b13};
            pc.U u16 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u16 == null) {
                u16 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u16);
            }
            cVar3.p().put("create", new dc.r("create", c5972bArr7, u16, new C1193h0()));
            pc.X xM6 = cVar3.m();
            C5972b c5972b14 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool));
            if (c5972b14 == null) {
                c5972b14 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls5), false, C1194i0.f2976a), xM6);
            }
            C5972b c5972b15 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Either.class), bool));
            if (c5972b15 == null) {
                c5972b15 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Either.class), false, C1196j0.f2979a), xM6);
            }
            C5972b c5972b16 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(WriteOptions.class), bool2));
            if (c5972b16 == null) {
                dVar = dVar2;
                c5972b16 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(WriteOptions.class), true, F.f2931a), xM6);
            } else {
                dVar = dVar2;
            }
            C5972b[] c5972bArr8 = {c5972b14, c5972b15, c5972b16};
            pc.U u17 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u17 == null) {
                u17 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u17);
            }
            cVar3.p().put("write", new dc.r("write", c5972bArr8, u17, new G()));
            Class cls9 = cls5;
            if (AbstractC5504s.c(cls9, Ub.u.class)) {
                cls6 = cls4;
                lVar = new dc.f("text", new C5972b[0], new C1217u());
            } else {
                pc.X xM7 = cVar3.m();
                C5972b c5972b17 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls9), bool));
                if (c5972b17 == null) {
                    c5972b17 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls9), false, C1219v.f3003a), xM7);
                }
                C5972b[] c5972bArr9 = {c5972b17};
                C1221w c1221w = new C1221w();
                cls6 = cls4;
                lVar = AbstractC5504s.c(cls6, Integer.TYPE) ? new dc.l("text", c5972bArr9, c1221w) : AbstractC5504s.c(cls6, Boolean.TYPE) ? new dc.h("text", c5972bArr9, c1221w) : AbstractC5504s.c(cls6, Double.TYPE) ? new dc.i("text", c5972bArr9, c1221w) : AbstractC5504s.c(cls6, Float.TYPE) ? new dc.j("text", c5972bArr9, c1221w) : AbstractC5504s.c(cls6, cls6) ? new dc.n("text", c5972bArr9, c1221w) : new dc.s("text", c5972bArr9, c1221w);
            }
            cVar3.k().put("text", lVar);
            pc.X xM8 = cVar3.m();
            C5972b c5972b18 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls9), bool));
            if (c5972b18 == null) {
                c5972b18 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls9), false, H.f2933a), xM8);
            }
            C5972b[] c5972bArr10 = {c5972b18};
            pc.U u18 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls6));
            if (u18 == null) {
                u18 = new pc.U(kotlin.jvm.internal.O.b(cls6));
                v10.a().put(kotlin.jvm.internal.O.b(cls6), u18);
            }
            cVar3.p().put("textSync", new dc.r("textSync", c5972bArr10, u18, new I()));
            if (AbstractC5504s.c(cls9, Ub.u.class)) {
                lVar2 = new dc.f("base64", new C5972b[0], new C1223x());
            } else {
                pc.X xM9 = cVar3.m();
                C5972b c5972b19 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls9), bool));
                if (c5972b19 == null) {
                    c5972b19 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls9), false, C1225y.f3006a), xM9);
                }
                C5972b[] c5972bArr11 = {c5972b19};
                C1227z c1227z = new C1227z();
                lVar2 = AbstractC5504s.c(cls6, Integer.TYPE) ? new dc.l("base64", c5972bArr11, c1227z) : AbstractC5504s.c(cls6, Boolean.TYPE) ? new dc.h("base64", c5972bArr11, c1227z) : AbstractC5504s.c(cls6, Double.TYPE) ? new dc.i("base64", c5972bArr11, c1227z) : AbstractC5504s.c(cls6, Float.TYPE) ? new dc.j("base64", c5972bArr11, c1227z) : AbstractC5504s.c(cls6, cls6) ? new dc.n("base64", c5972bArr11, c1227z) : new dc.s("base64", c5972bArr11, c1227z);
            }
            cVar3.k().put("base64", lVar2);
            pc.X xM10 = cVar3.m();
            C5972b c5972b20 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls9), bool));
            if (c5972b20 == null) {
                c5972b20 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls9), false, J.f2934a), xM10);
            }
            C5972b[] c5972bArr12 = {c5972b20};
            pc.U u19 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls6));
            if (u19 == null) {
                u19 = new pc.U(kotlin.jvm.internal.O.b(cls6));
                v10.a().put(kotlin.jvm.internal.O.b(cls6), u19);
            }
            cVar3.p().put("base64Sync", new dc.r("base64Sync", c5972bArr12, u19, new K()));
            if (AbstractC5504s.c(cls9, Ub.u.class)) {
                lVar3 = new dc.f("bytes", new C5972b[0], new A());
            } else {
                pc.X xM11 = cVar3.m();
                C5972b c5972b21 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls9), bool));
                if (c5972b21 == null) {
                    c5972b21 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls9), false, B.f2928a), xM11);
                }
                C5972b[] c5972bArr13 = {c5972b21};
                C c10 = new C();
                lVar3 = AbstractC5504s.c(byte[].class, Integer.TYPE) ? new dc.l("bytes", c5972bArr13, c10) : AbstractC5504s.c(byte[].class, Boolean.TYPE) ? new dc.h("bytes", c5972bArr13, c10) : AbstractC5504s.c(byte[].class, Double.TYPE) ? new dc.i("bytes", c5972bArr13, c10) : AbstractC5504s.c(byte[].class, Float.TYPE) ? new dc.j("bytes", c5972bArr13, c10) : AbstractC5504s.c(byte[].class, cls6) ? new dc.n("bytes", c5972bArr13, c10) : new dc.s("bytes", c5972bArr13, c10);
            }
            cVar3.k().put("bytes", lVar3);
            pc.X xM12 = cVar3.m();
            C5972b c5972b22 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls9), bool));
            if (c5972b22 == null) {
                cVar = cVar3;
                c5972b22 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls9), false, L.f2937a), xM12);
            } else {
                cVar = cVar3;
            }
            C5972b[] c5972bArr14 = {c5972b22};
            pc.U u20 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(byte[].class));
            if (u20 == null) {
                u20 = new pc.U(kotlin.jvm.internal.O.b(byte[].class));
                v10.a().put(kotlin.jvm.internal.O.b(byte[].class), u20);
            }
            cVar.p().put("bytesSync", new dc.r("bytesSync", c5972bArr14, u20, new M()));
            pc.X xM13 = cVar.m();
            C5972b c5972b23 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls9), bool));
            if (c5972b23 == null) {
                c5972b23 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls9), false, N.f2939a), xM13);
            }
            C5972b c5972b24 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(InfoOptions.class), bool2));
            if (c5972b24 == null) {
                c5972b24 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(InfoOptions.class), true, O.f2941a), xM13);
            }
            C5972b[] c5972bArr15 = {c5972b23, c5972b24};
            pc.U u21 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(FileInfo.class));
            if (u21 == null) {
                u21 = new pc.U(kotlin.jvm.internal.O.b(FileInfo.class));
                v10.a().put(kotlin.jvm.internal.O.b(FileInfo.class), u21);
            }
            cVar.p().put(str3, new dc.r(str3, c5972bArr15, u21, new Q()));
            C4941m c4941m = new C4941m(cVar.y().g(), "exists");
            int i10 = 2;
            C5972b[] c5972bArr16 = {new C5972b(c4941m.d(), null, i10, false ? 1 : 0)};
            pc.U u22 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Boolean.class));
            if (u22 == null) {
                u22 = new pc.U(kotlin.jvm.internal.O.b(Boolean.class));
                v10.a().put(kotlin.jvm.internal.O.b(Boolean.class), u22);
            }
            String str4 = str;
            dc.r rVar = new dc.r(str4, c5972bArr16, u22, new C1198k0());
            rVar.l(c4941m.d());
            rVar.k(true);
            c4941m.b(rVar);
            cVar.o().put("exists", c4941m);
            C4941m c4941m2 = new C4941m(cVar.y().g(), "modificationTime");
            C5972b[] c5972bArr17 = {new C5972b(c4941m2.d(), null, i10, false ? 1 : 0)};
            pc.U u23 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls3));
            if (u23 == null) {
                u23 = new pc.U(kotlin.jvm.internal.O.b(cls3));
                v10.a().put(kotlin.jvm.internal.O.b(cls3), u23);
            }
            dc.r rVar2 = new dc.r(str4, c5972bArr17, u23, new C1200l0());
            rVar2.l(c4941m2.d());
            rVar2.k(true);
            c4941m2.b(rVar2);
            cVar.o().put("modificationTime", c4941m2);
            C4941m c4941m3 = new C4941m(cVar.y().g(), "creationTime");
            C5972b[] c5972bArr18 = {new C5972b(c4941m3.d(), null, 2, false ? 1 : 0)};
            pc.U u24 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls3));
            if (u24 == null) {
                u24 = new pc.U(kotlin.jvm.internal.O.b(cls3));
                v10.a().put(kotlin.jvm.internal.O.b(cls3), u24);
            }
            dc.r rVar3 = new dc.r(str4, c5972bArr18, u24, new C1202m0());
            rVar3.l(c4941m3.d());
            rVar3.k(true);
            c4941m3.b(rVar3);
            cVar.o().put("creationTime", c4941m3);
            pc.X xM14 = cVar.m();
            C5972b c5972b25 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls9), bool));
            if (c5972b25 == null) {
                cls7 = cls9;
                c5972b25 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls9), false, R.f2945a), xM14);
            } else {
                cls7 = cls9;
            }
            C5972b c5972b26 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(FileSystemPath.class), bool));
            if (c5972b26 == null) {
                cls8 = byte[].class;
                c5972b26 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(FileSystemPath.class), false, S.f2946a), xM14);
            } else {
                cls8 = byte[].class;
            }
            C5972b[] c5972bArr19 = {c5972b25, c5972b26};
            pc.U u25 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u25 == null) {
                u25 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u25);
            }
            cVar.p().put("copy", new dc.r("copy", c5972bArr19, u25, new T()));
            pc.X xM15 = cVar.m();
            C5972b c5972b27 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (c5972b27 == null) {
                c5972b27 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls7), false, U.f2949a), xM15);
            }
            C5972b c5972b28 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(FileSystemPath.class), bool));
            if (c5972b28 == null) {
                c5972b28 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(FileSystemPath.class), false, V.f2951a), xM15);
            }
            C5972b[] c5972bArr20 = {c5972b27, c5972b28};
            pc.U u26 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u26 == null) {
                u26 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u26);
            }
            cVar.p().put("move", new dc.r("move", c5972bArr20, u26, new W()));
            pc.X xM16 = cVar.m();
            C5972b c5972b29 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (c5972b29 == null) {
                c5972b29 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls7), false, X.f2953a), xM16);
            }
            C5972b c5972b30 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls6), bool));
            if (c5972b30 == null) {
                c5972b30 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls6), false, Y.f2955a), xM16);
            }
            C5972b[] c5972bArr21 = {c5972b29, c5972b30};
            pc.U u27 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u27 == null) {
                u27 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u27);
            }
            cVar.p().put("rename", new dc.r("rename", c5972bArr21, u27, new Z()));
            C4941m c4941m4 = new C4941m(cVar.y().g(), "uri");
            C5972b[] c5972bArr22 = {new C5972b(c4941m4.d(), null, 2, false ? 1 : 0)};
            pc.U u28 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls6));
            if (u28 == null) {
                u28 = new pc.U(kotlin.jvm.internal.O.b(cls6));
                v10.a().put(kotlin.jvm.internal.O.b(cls6), u28);
            }
            dc.r rVar4 = new dc.r(str4, c5972bArr22, u28, new C1204n0());
            rVar4.l(c4941m4.d());
            rVar4.k(true);
            c4941m4.b(rVar4);
            cVar.o().put("uri", c4941m4);
            C4941m c4941m5 = new C4941m(cVar.y().g(), "contentUri");
            C5972b[] c5972bArr23 = {new C5972b(c4941m5.d(), null, 2, false ? 1 : 0)};
            pc.U u29 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Uri.class));
            if (u29 == null) {
                u29 = new pc.U(kotlin.jvm.internal.O.b(Uri.class));
                v10.a().put(kotlin.jvm.internal.O.b(Uri.class), u29);
            }
            dc.r rVar5 = new dc.r(str4, c5972bArr23, u29, new C1206o0());
            rVar5.l(c4941m5.d());
            rVar5.k(true);
            c4941m5.b(rVar5);
            cVar.o().put("contentUri", c4941m5);
            C4941m c4941m6 = new C4941m(cVar.y().g(), "md5");
            C5972b[] c5972bArr24 = {new C5972b(c4941m6.d(), null, 2, false ? 1 : 0)};
            pc.U u30 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls6));
            if (u30 == null) {
                u30 = new pc.U(kotlin.jvm.internal.O.b(cls6));
                v10.a().put(kotlin.jvm.internal.O.b(cls6), u30);
            }
            dc.r rVar6 = new dc.r(str4, c5972bArr24, u30, new C1208p0());
            rVar6.l(c4941m6.d());
            rVar6.k(true);
            c4941m6.b(rVar6);
            cVar.o().put("md5", c4941m6);
            C4941m c4941m7 = new C4941m(cVar.y().g(), "size");
            C5972b[] c5972bArr25 = {new C5972b(c4941m7.d(), null, 2, false ? 1 : 0)};
            pc.U u31 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls3));
            if (u31 == null) {
                u31 = new pc.U(kotlin.jvm.internal.O.b(cls3));
                v10.a().put(kotlin.jvm.internal.O.b(cls3), u31);
            }
            dc.r rVar7 = new dc.r(str4, c5972bArr25, u31, new C1210q0());
            rVar7.l(c4941m7.d());
            rVar7.k(true);
            c4941m7.b(rVar7);
            cVar.o().put("size", c4941m7);
            C4941m c4941m8 = new C4941m(cVar.y().g(), "type");
            C5972b[] c5972bArr26 = {new C5972b(c4941m8.d(), null, 2, false ? 1 : 0)};
            pc.U u32 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls6));
            if (u32 == null) {
                u32 = new pc.U(kotlin.jvm.internal.O.b(cls6));
                v10.a().put(kotlin.jvm.internal.O.b(cls6), u32);
            }
            dc.r rVar8 = new dc.r(str4, c5972bArr26, u32, new C1212r0());
            rVar8.l(c4941m8.d());
            rVar8.k(true);
            c4941m8.b(rVar8);
            cVar.o().put("type", c4941m8);
            pc.X xM17 = cVar.m();
            C5972b c5972b31 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (c5972b31 == null) {
                c5972b31 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls7), false, C1181b0.f2962a), xM17);
            }
            C5972b[] c5972bArr27 = {c5972b31};
            pc.U u33 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls));
            if (u33 == null) {
                u33 = new pc.U(kotlin.jvm.internal.O.b(cls));
                v10.a().put(kotlin.jvm.internal.O.b(cls), u33);
            }
            cVar.p().put("open", new dc.r("open", c5972bArr27, u33, new C1183c0()));
            dVar.v().add(cVar.v());
            InterfaceC6014d interfaceC6014dB6 = kotlin.jvm.internal.O.b(cls);
            gc.c cVarX2 = dVar.x();
            if (cVarX2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Ub.d dVarI2 = cVarX2.i();
            String simpleName2 = AbstractC4945a.b(interfaceC6014dB6).getSimpleName();
            AbstractC5504s.g(simpleName2, "getSimpleName(...)");
            C5972b c5972b32 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            Yb.c cVar4 = new Yb.c(dVarI2, simpleName2, interfaceC6014dB6, c5972b32 == null ? new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls), false, C1182c.f2963a), null) : c5972b32, dVar.m());
            pc.X xM18 = cVar4.m();
            C5972b c5972b33 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (c5972b33 == null) {
                c5972b33 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls7), false, C1214s0.f3000a), xM18);
            }
            C5972b[] c5972bArr28 = {c5972b33};
            pc.U u34 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Object.class));
            if (u34 == null) {
                u34 = new pc.U(kotlin.jvm.internal.O.b(Object.class));
                v10.a().put(kotlin.jvm.internal.O.b(Object.class), u34);
            }
            cVar4.B(new dc.r("constructor", c5972bArr28, u34, new C1216t0()));
            pc.X xM19 = cVar4.m();
            C5972b c5972b34 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            if (c5972b34 == null) {
                c5972b34 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls), false, C1218u0.f3002a), xM19);
            }
            C5972b c5972b35 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool));
            if (c5972b35 == null) {
                cVar2 = cVar4;
                c5972b35 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls3), false, C1220v0.f3004a), xM19);
            } else {
                cVar2 = cVar4;
            }
            C5972b[] c5972bArr29 = {c5972b34, c5972b35};
            pc.U u35 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls8));
            if (u35 == null) {
                u35 = new pc.U(kotlin.jvm.internal.O.b(cls8));
                v10.a().put(kotlin.jvm.internal.O.b(cls8), u35);
            }
            cVar2.p().put("readBytes", new dc.r("readBytes", c5972bArr29, u35, new C1222w0()));
            pc.X xM20 = cVar2.m();
            C5972b c5972b36 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            if (c5972b36 == null) {
                c5972b36 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls), false, C1224x0.f3005a), xM20);
            }
            C5972b c5972b37 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls8), bool));
            if (c5972b37 == null) {
                c5972b37 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls8), false, C1226y0.f3007a), xM20);
            }
            C5972b[] c5972bArr30 = {c5972b36, c5972b37};
            pc.U u36 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u36 == null) {
                u36 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u36);
            }
            cVar2.p().put("writeBytes", new dc.r("writeBytes", c5972bArr30, u36, new C1228z0()));
            pc.X xM21 = cVar2.m();
            C5972b c5972b38 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            if (c5972b38 == null) {
                c5972b38 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls), false, A0.f2927a), xM21);
            }
            C5972b[] c5972bArr31 = {c5972b38};
            pc.U u37 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u37 == null) {
                u37 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u37);
            }
            cVar2.p().put("close", new dc.r("close", c5972bArr31, u37, new B0()));
            C4941m c4941m9 = new C4941m(cVar2.y().g(), com.amazon.device.iap.internal.c.b.as);
            C5972b[] c5972bArr32 = {new C5972b(c4941m9.d(), null, 2, false ? 1 : 0)};
            pc.U u38 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls3));
            if (u38 == null) {
                u38 = new pc.U(kotlin.jvm.internal.O.b(cls3));
                v10.a().put(kotlin.jvm.internal.O.b(cls3), u38);
            }
            dc.r rVar9 = new dc.r(str4, c5972bArr32, u38, new C0());
            rVar9.l(c4941m9.d());
            rVar9.k(true);
            c4941m9.b(rVar9);
            cVar2.o().put(com.amazon.device.iap.internal.c.b.as, c4941m9);
            C5972b c5972b39 = new C5972b(c4941m9.d(), null, 2, false ? 1 : 0);
            C5972b c5972b40 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool));
            if (c5972b40 == null) {
                c5972b40 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls3), false, E0.f2930a), null);
            }
            C5972b[] c5972bArr33 = {c5972b39, c5972b40};
            pc.U u39 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u39 == null) {
                u39 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u39);
            }
            dc.r rVar10 = new dc.r("set", c5972bArr33, u39, new F0());
            rVar10.l(c4941m9.d());
            rVar10.k(true);
            c4941m9.c(rVar10);
            C4941m c4941m10 = new C4941m(cVar2.y().g(), "size");
            C5972b[] c5972bArr34 = {new C5972b(c4941m10.d(), null, 2, false ? 1 : 0)};
            pc.U u40 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls3));
            if (u40 == null) {
                u40 = new pc.U(kotlin.jvm.internal.O.b(cls3));
                v10.a().put(kotlin.jvm.internal.O.b(cls3), u40);
            }
            dc.r rVar11 = new dc.r(str4, c5972bArr34, u40, new D0());
            rVar11.l(c4941m10.d());
            rVar11.k(true);
            c4941m10.b(rVar11);
            cVar2.o().put("size", c4941m10);
            dVar.v().add(cVar2.v());
            InterfaceC6014d interfaceC6014dB7 = kotlin.jvm.internal.O.b(cls2);
            gc.c cVarX3 = dVar.x();
            if (cVarX3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Ub.d dVarI3 = cVarX3.i();
            String simpleName3 = AbstractC4945a.b(interfaceC6014dB7).getSimpleName();
            AbstractC5504s.g(simpleName3, "getSimpleName(...)");
            C5972b c5972b41 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            Yb.c cVar5 = new Yb.c(dVarI3, simpleName3, interfaceC6014dB7, c5972b41 == null ? new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, C1184d.f2965a), null) : c5972b41, dVar.m());
            pc.X xM22 = cVar5.m();
            C5972b c5972b42 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(Uri.class), bool));
            if (c5972b42 == null) {
                c5972b42 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(Uri.class), false, G0.f2932a), xM22);
            }
            C5972b[] c5972bArr35 = {c5972b42};
            pc.U u41 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Object.class));
            if (u41 == null) {
                u41 = new pc.U(kotlin.jvm.internal.O.b(Object.class));
                v10.a().put(kotlin.jvm.internal.O.b(Object.class), u41);
            }
            cVar5.B(new dc.r("constructor", c5972bArr35, u41, new H0()));
            pc.X xM23 = cVar5.m();
            C5972b c5972b43 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b43 == null) {
                c5972b43 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, S0.f2947a), xM23);
            }
            C5972b[] c5972bArr36 = {c5972b43};
            pc.U u42 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(DirectoryInfo.class));
            if (u42 == null) {
                u42 = new pc.U(kotlin.jvm.internal.O.b(DirectoryInfo.class));
                v10.a().put(kotlin.jvm.internal.O.b(DirectoryInfo.class), u42);
            }
            cVar5.p().put(str3, new dc.r(str3, c5972bArr36, u42, new b1()));
            pc.X xM24 = cVar5.m();
            C5972b c5972b44 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b44 == null) {
                c5972b44 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, c1.f2964a), xM24);
            }
            C5972b[] c5972bArr37 = {c5972b44};
            pc.U u43 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u43 == null) {
                u43 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u43);
            }
            cVar5.p().put("delete", new dc.r("delete", c5972bArr37, u43, new d1()));
            pc.X xM25 = cVar5.m();
            C5972b c5972b45 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b45 == null) {
                c5972b45 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, e1.f2968a), xM25);
            }
            C5972b c5972b46 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(CreateOptions.class), bool2));
            if (c5972b46 == null) {
                c5972b46 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(CreateOptions.class), true, f1.f2971a), xM25);
            }
            C5972b[] c5972bArr38 = {c5972b45, c5972b46};
            pc.U u44 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u44 == null) {
                u44 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u44);
            }
            cVar5.p().put("create", new dc.r("create", c5972bArr38, u44, new g1()));
            pc.X xM26 = cVar5.m();
            C5972b c5972b47 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b47 == null) {
                c5972b47 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, h1.f2974a), xM26);
            }
            C5972b c5972b48 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls6), bool));
            if (c5972b48 == null) {
                c5972b48 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls6), false, i1.f2977a), xM26);
            }
            C5972b[] c5972bArr39 = {c5972b47, c5972b48};
            pc.U u45 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls2));
            if (u45 == null) {
                u45 = new pc.U(kotlin.jvm.internal.O.b(cls2));
                v10.a().put(kotlin.jvm.internal.O.b(cls2), u45);
            }
            cVar5.p().put("createDirectory", new dc.r("createDirectory", c5972bArr39, u45, new I0()));
            pc.X xM27 = cVar5.m();
            C5972b c5972b49 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b49 == null) {
                c5972b49 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, J0.f2935a), xM27);
            }
            C5972b c5972b50 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls6), bool));
            if (c5972b50 == null) {
                c5972b50 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls6), false, K0.f2936a), xM27);
            }
            C5972b c5972b51 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls6), bool2));
            if (c5972b51 == null) {
                c5972b51 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls6), true, L0.f2938a), xM27);
            }
            C5972b[] c5972bArr40 = {c5972b49, c5972b50, c5972b51};
            pc.U u46 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls7));
            if (u46 == null) {
                u46 = new pc.U(kotlin.jvm.internal.O.b(cls7));
                v10.a().put(kotlin.jvm.internal.O.b(cls7), u46);
            }
            cVar5.p().put("createFile", new dc.r("createFile", c5972bArr40, u46, new M0()));
            C4941m c4941m11 = new C4941m(cVar5.y().g(), "exists");
            C5972b[] c5972bArr41 = {new C5972b(c4941m11.d(), null, 2, false ? 1 : 0)};
            pc.U u47 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Boolean.class));
            if (u47 == null) {
                u47 = new pc.U(kotlin.jvm.internal.O.b(Boolean.class));
                v10.a().put(kotlin.jvm.internal.O.b(Boolean.class), u47);
            }
            dc.r rVar12 = new dc.r(str4, c5972bArr41, u47, new j1());
            rVar12.l(c4941m11.d());
            rVar12.k(true);
            c4941m11.b(rVar12);
            cVar5.o().put("exists", c4941m11);
            pc.X xM28 = cVar5.m();
            C5972b c5972b52 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b52 == null) {
                c5972b52 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, N0.f2940a), xM28);
            }
            C5972b[] c5972bArr42 = {c5972b52};
            pc.U u48 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u48 == null) {
                u48 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u48);
            }
            cVar5.p().put("validatePath", new dc.r("validatePath", c5972bArr42, u48, new O0()));
            pc.X xM29 = cVar5.m();
            C5972b c5972b53 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b53 == null) {
                c5972b53 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, P0.f2943a), xM29);
            }
            C5972b c5972b54 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(FileSystemPath.class), bool));
            if (c5972b54 == null) {
                c5972b54 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(FileSystemPath.class), false, Q0.f2944a), xM29);
            }
            C5972b[] c5972bArr43 = {c5972b53, c5972b54};
            pc.U u49 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u49 == null) {
                u49 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u49);
            }
            cVar5.p().put("copy", new dc.r("copy", c5972bArr43, u49, new R0()));
            pc.X xM30 = cVar5.m();
            C5972b c5972b55 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b55 == null) {
                c5972b55 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, T0.f2948a), xM30);
            }
            C5972b c5972b56 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(FileSystemPath.class), bool));
            if (c5972b56 == null) {
                c5972b56 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(FileSystemPath.class), false, U0.f2950a), xM30);
            }
            C5972b[] c5972bArr44 = {c5972b55, c5972b56};
            pc.U u50 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u50 == null) {
                u50 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u50);
            }
            cVar5.p().put("move", new dc.r("move", c5972bArr44, u50, new V0()));
            pc.X xM31 = cVar5.m();
            C5972b c5972b57 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b57 == null) {
                c5972b57 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, W0.f2952a), xM31);
            }
            C5972b c5972b58 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls6), bool));
            if (c5972b58 == null) {
                c5972b58 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls6), false, X0.f2954a), xM31);
            }
            C5972b[] c5972bArr45 = {c5972b57, c5972b58};
            pc.U u51 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(Td.L.class));
            if (u51 == null) {
                u51 = new pc.U(kotlin.jvm.internal.O.b(Td.L.class));
                v10.a().put(kotlin.jvm.internal.O.b(Td.L.class), u51);
            }
            cVar5.p().put("rename", new dc.r("rename", c5972bArr45, u51, new Y0()));
            C4941m c4941m12 = new C4941m(cVar5.y().g(), "uri");
            C5972b[] c5972bArr46 = {new C5972b(c4941m12.d(), null, 2, false ? 1 : 0)};
            pc.U u52 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls6));
            if (u52 == null) {
                u52 = new pc.U(kotlin.jvm.internal.O.b(cls6));
                v10.a().put(kotlin.jvm.internal.O.b(cls6), u52);
            }
            dc.r rVar13 = new dc.r(str4, c5972bArr46, u52, new k1());
            rVar13.l(c4941m12.d());
            rVar13.k(true);
            c4941m12.b(rVar13);
            cVar5.o().put("uri", c4941m12);
            C4941m c4941m13 = new C4941m(cVar5.y().g(), "size");
            C5972b[] c5972bArr47 = {new C5972b(c4941m13.d(), null, 2, false ? 1 : 0)};
            pc.U u53 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(cls3));
            if (u53 == null) {
                u53 = new pc.U(kotlin.jvm.internal.O.b(cls3));
                v10.a().put(kotlin.jvm.internal.O.b(cls3), u53);
            }
            dc.r rVar14 = new dc.r(str4, c5972bArr47, u53, new l1());
            rVar14.l(c4941m13.d());
            rVar14.k(true);
            c4941m13.b(rVar14);
            cVar5.o().put("size", c4941m13);
            pc.X xM32 = cVar5.m();
            C5972b c5972b59 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b59 == null) {
                c5972b59 = new C5972b(new pc.M(kotlin.jvm.internal.O.b(cls2), false, Z0.f2956a), xM32);
            }
            C5972b[] c5972bArr48 = {c5972b59};
            pc.U u54 = (pc.U) v10.a().get(kotlin.jvm.internal.O.b(List.class));
            if (u54 == null) {
                u54 = new pc.U(kotlin.jvm.internal.O.b(List.class));
                v10.a().put(kotlin.jvm.internal.O.b(List.class), u54);
            }
            cVar5.p().put("listAsRecords", new dc.r("listAsRecords", c5972bArr48, u54, new a1()));
            dVar.v().add(cVar5.v());
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
