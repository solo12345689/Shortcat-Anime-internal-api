package io.sentry.android.replay;

import Df.C1271d;
import Td.AbstractC2163n;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ge.AbstractC4877a;
import ie.InterfaceC5082a;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5192e0;
import io.sentry.util.C5288a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.V;
import oe.AbstractC5874j;
import oe.C5871g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f50302l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f50303m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f50304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.x f50305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f50306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5288a f50307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5288a f50308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5288a f50309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private io.sentry.android.replay.video.c f50310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f50311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f50312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f50313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Lazy f50314k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: io.sentry.android.replay.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0792a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Xd.a.d(Long.valueOf(((j) obj).c()), Long.valueOf(((j) obj2).c()));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Xd.a.d(Long.valueOf(((io.sentry.rrweb.b) obj).e()), Long.valueOf(((io.sentry.rrweb.b) obj2).e()));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(i iVar, File file, String str) throws Exception {
            AbstractC5504s.e(str);
            if (Df.r.A(str, ".jpg", false, 2, null)) {
                File file2 = new File(file, str);
                Long lT = Df.r.t(fe.k.B(file2));
                if (lT != null) {
                    i.j(iVar, file2, lT.longValue(), null, 4, null);
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final io.sentry.android.replay.d c(io.sentry.C5322z3 r26, io.sentry.protocol.x r27, kotlin.jvm.functions.Function1 r28) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 578
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.i.a.c(io.sentry.z3, io.sentry.protocol.x, kotlin.jvm.functions.Function1):io.sentry.android.replay.d");
        }

        public final File d(C5322z3 options, io.sentry.protocol.x replayId) {
            AbstractC5504s.h(options, "options");
            AbstractC5504s.h(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(EnumC5215i3.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            AbstractC5504s.e(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final File invoke() throws IOException {
            if (i.this.D() == null) {
                return null;
            }
            File file = new File(i.this.D(), ".ongoing_segment");
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f50316a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            AbstractC5504s.h(entry, "<name for destructuring parameter 0>");
            return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {
        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final File invoke() {
            return i.f50302l.d(i.this.f50304a, i.this.f50305b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f50318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f50319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f50320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, i iVar, N n10) {
            super(1);
            this.f50318a = j10;
            this.f50319b = iVar;
            this.f50320c = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j it) {
            AbstractC5504s.h(it, "it");
            if (it.c() < this.f50318a) {
                this.f50319b.o(it.b());
                return Boolean.TRUE;
            }
            N n10 = this.f50320c;
            if (n10.f52259a == null) {
                n10.f52259a = it.a();
            }
            return Boolean.FALSE;
        }
    }

    public i(C5322z3 options, io.sentry.protocol.x replayId) {
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(replayId, "replayId");
        this.f50304a = options;
        this.f50305b = replayId;
        this.f50306c = new AtomicBoolean(false);
        this.f50307d = new C5288a();
        this.f50308e = new C5288a();
        this.f50309f = new C5288a();
        this.f50311h = AbstractC2163n.b(new d());
        this.f50312i = new ArrayList();
        this.f50313j = new LinkedHashMap();
        this.f50314k = AbstractC2163n.b(new b());
    }

    public static /* synthetic */ void j(i iVar, File file, long j10, String str, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            str = null;
        }
        iVar.h(file, j10, str);
    }

    public static /* synthetic */ io.sentry.android.replay.c m(i iVar, long j10, long j11, int i10, int i11, int i12, int i13, int i14, File file, int i15, Object obj) {
        int i16;
        File file2;
        if ((i15 & 128) != 0) {
            File fileD = iVar.D();
            StringBuilder sb2 = new StringBuilder();
            i16 = i10;
            sb2.append(i16);
            sb2.append(".mp4");
            file2 = new File(fileD, sb2.toString());
        } else {
            i16 = i10;
            file2 = file;
        }
        return iVar.l(j10, j11, i16, i11, i12, i13, i14, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.f50304a.getLogger().c(EnumC5215i3.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.f50304a.getLogger().a(EnumC5215i3.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean q(j jVar) {
        if (jVar == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(jVar.b().getAbsolutePath());
            InterfaceC5192e0 interfaceC5192e0A = this.f50307d.a();
            try {
                io.sentry.android.replay.video.c cVar = this.f50310g;
                if (cVar != null) {
                    AbstractC5504s.e(bitmapDecodeFile);
                    cVar.b(bitmapDecodeFile);
                    L l10 = L.f17438a;
                }
                AbstractC4877a.a(interfaceC5192e0A, null);
                bitmapDecodeFile.recycle();
                return true;
            } finally {
            }
        } catch (Throwable th2) {
            this.f50304a.getLogger().b(EnumC5215i3.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th2);
            return false;
        }
    }

    public final File C() {
        return (File) this.f50314k.getValue();
    }

    public final File D() {
        return (File) this.f50311h.getValue();
    }

    public final void E(String key, String str) throws Exception {
        File fileC;
        File fileC2;
        AbstractC5504s.h(key, "key");
        InterfaceC5192e0 interfaceC5192e0A = this.f50308e.a();
        try {
            if (this.f50306c.get()) {
                AbstractC4877a.a(interfaceC5192e0A, null);
                return;
            }
            File fileC3 = C();
            if ((fileC3 == null || !fileC3.exists()) && (fileC = C()) != null) {
                fileC.createNewFile();
            }
            if (this.f50313j.isEmpty() && (fileC2 = C()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileC2), C1271d.f3718b), 8192);
                try {
                    Cf.i iVarD = fe.v.d(bufferedReader);
                    LinkedHashMap linkedHashMap = this.f50313j;
                    Iterator it = iVarD.iterator();
                    while (it.hasNext()) {
                        List listN0 = Df.r.N0((String) it.next(), new String[]{com.amazon.a.a.o.b.f.f34695b}, false, 2, 2, null);
                        Pair pairA = z.a((String) listN0.get(0), (String) listN0.get(1));
                        linkedHashMap.put(pairA.c(), pairA.d());
                    }
                    fe.c.a(bufferedReader, null);
                } finally {
                }
            }
            if (str == null) {
                this.f50313j.remove(key);
            } else {
                this.f50313j.put(key, str);
            }
            File fileC4 = C();
            if (fileC4 != null) {
                Set setEntrySet = this.f50313j.entrySet();
                AbstractC5504s.g(setEntrySet, "<get-entries>(...)");
                fe.k.o(fileC4, AbstractC2279u.w0(setEntrySet, "\n", null, null, 0, null, c.f50316a, 30, null), null, 2, null);
                L l10 = L.f17438a;
            }
            AbstractC4877a.a(interfaceC5192e0A, null);
        } finally {
        }
    }

    public final String H(long j10) throws Exception {
        N n10 = new N();
        InterfaceC5192e0 interfaceC5192e0A = this.f50309f.a();
        try {
            AbstractC2279u.K(this.f50312i, new e(j10, this, n10));
            AbstractC4877a.a(interfaceC5192e0A, null);
            return (String) n10.f52259a;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        InterfaceC5192e0 interfaceC5192e0A = this.f50307d.a();
        try {
            io.sentry.android.replay.video.c cVar = this.f50310g;
            if (cVar != null) {
                cVar.i();
            }
            this.f50310g = null;
            L l10 = L.f17438a;
            AbstractC4877a.a(interfaceC5192e0A, null);
            this.f50306c.set(true);
        } finally {
        }
    }

    public final void h(File screenshot, long j10, String str) throws Exception {
        AbstractC5504s.h(screenshot, "screenshot");
        j jVar = new j(screenshot, j10, str);
        InterfaceC5192e0 interfaceC5192e0A = this.f50309f.a();
        try {
            this.f50312i.add(jVar);
            L l10 = L.f17438a;
            AbstractC4877a.a(interfaceC5192e0A, null);
        } finally {
        }
    }

    public final void k(Bitmap bitmap, long j10, String str) throws IOException {
        AbstractC5504s.h(bitmap, "bitmap");
        if (D() == null || bitmap.isRecycled()) {
            return;
        }
        File fileD = D();
        if (fileD != null) {
            fileD.mkdirs();
        }
        File file = new File(D(), j10 + ".jpg");
        file.createNewFile();
        synchronized (bitmap) {
            if (bitmap.isRecycled()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, this.f50304a.getSessionReplay().m().screenshotQuality, fileOutputStream);
                fileOutputStream.flush();
                L l10 = L.f17438a;
                fe.c.a(fileOutputStream, null);
                h(file, j10, str);
            } finally {
            }
        }
    }

    public final io.sentry.android.replay.c l(long j10, long j11, int i10, int i11, int i12, int i13, int i14, File videoFile) throws Exception {
        InterfaceC5192e0 interfaceC5192e0;
        int i15;
        AbstractC5504s.h(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f50309f.a();
        try {
            List arrayList = this.f50312i.isEmpty() ? new ArrayList() : AbstractC2279u.d1(this.f50312i);
            AbstractC4877a.a(interfaceC5192e0A, null);
            if (arrayList.isEmpty()) {
                this.f50304a.getLogger().c(EnumC5215i3.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                return null;
            }
            InterfaceC5192e0 interfaceC5192e0A2 = this.f50307d.a();
            try {
                interfaceC5192e0 = interfaceC5192e0A2;
                try {
                    io.sentry.android.replay.video.c cVar = new io.sentry.android.replay.video.c(this.f50304a, new io.sentry.android.replay.video.a(videoFile, i12, i11, i13, i14, null, 32, null), null, 4, null);
                    cVar.j();
                    AbstractC4877a.a(interfaceC5192e0, null);
                    this.f50310g = cVar;
                    long j12 = ((long) 1000) / ((long) i13);
                    Object objO0 = AbstractC2279u.o0(arrayList);
                    long j13 = j11 + j10;
                    C5871g c5871gW = AbstractC5874j.w(AbstractC5874j.y(j11, j13), j12);
                    long jF = c5871gW.f();
                    long jI = c5871gW.i();
                    long jL = c5871gW.l();
                    if ((jL <= 0 || jF > jI) && (jL >= 0 || jI > jF)) {
                        i15 = 0;
                    } else {
                        long j14 = jF;
                        int i16 = 0;
                        while (true) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                j jVar = (j) it.next();
                                long j15 = j14 + j12;
                                long jC = jVar.c();
                                if (j14 <= jC && jC <= j15) {
                                    objO0 = jVar;
                                    break;
                                }
                                if (jVar.c() > j15) {
                                    break;
                                }
                            }
                            if (q((j) objO0)) {
                                i16++;
                            } else if (objO0 != null) {
                                o(((j) objO0).b());
                                interfaceC5192e0A = this.f50309f.a();
                                try {
                                    V.a(this.f50312i).remove(objO0);
                                    AbstractC4877a.a(interfaceC5192e0A, null);
                                    arrayList.remove(objO0);
                                    objO0 = null;
                                } finally {
                                }
                            }
                            if (j14 == jI) {
                                break;
                            }
                            j14 += jL;
                        }
                        i15 = i16;
                    }
                    if (i15 == 0) {
                        this.f50304a.getLogger().c(EnumC5215i3.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                        o(videoFile);
                        return null;
                    }
                    interfaceC5192e0A = this.f50307d.a();
                    try {
                        io.sentry.android.replay.video.c cVar2 = this.f50310g;
                        if (cVar2 != null) {
                            cVar2.i();
                        }
                        io.sentry.android.replay.video.c cVar3 = this.f50310g;
                        long jC2 = cVar3 != null ? cVar3.c() : 0L;
                        this.f50310g = null;
                        L l10 = L.f17438a;
                        AbstractC4877a.a(interfaceC5192e0A, null);
                        H(j13);
                        return new io.sentry.android.replay.c(videoFile, i15, jC2);
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC4877a.a(interfaceC5192e0, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                interfaceC5192e0 = interfaceC5192e0A2;
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final Long w() throws Exception {
        InterfaceC5192e0 interfaceC5192e0A = this.f50309f.a();
        try {
            j jVar = (j) AbstractC2279u.o0(this.f50312i);
            Long lValueOf = jVar != null ? Long.valueOf(jVar.c()) : null;
            AbstractC4877a.a(interfaceC5192e0A, null);
            return lValueOf;
        } finally {
        }
    }

    public final List z() {
        return this.f50312i;
    }
}
