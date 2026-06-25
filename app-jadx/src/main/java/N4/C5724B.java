package n4;

import Td.L;
import android.net.Uri;
import android.os.Build;
import i4.EnumC5035a;
import i4.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: n4.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5724B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5724B f53901a = new C5724B();

    /* JADX INFO: renamed from: n4.B$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f53904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f53905d;

        static {
            int[] iArr = new int[i4.s.values().length];
            try {
                iArr[i4.s.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i4.s.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i4.s.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i4.s.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i4.s.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i4.s.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f53902a = iArr;
            int[] iArr2 = new int[EnumC5035a.values().length];
            try {
                iArr2[EnumC5035a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC5035a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f53903b = iArr2;
            int[] iArr3 = new int[i4.j.values().length];
            try {
                iArr3[i4.j.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[i4.j.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[i4.j.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[i4.j.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[i4.j.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f53904c = iArr3;
            int[] iArr4 = new int[i4.m.values().length];
            try {
                iArr4[i4.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[i4.m.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f53905d = iArr4;
        }
    }

    private C5724B() {
    }

    public static final int a(EnumC5035a backoffPolicy) {
        AbstractC5504s.h(backoffPolicy, "backoffPolicy");
        int i10 = a.f53903b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new Td.r();
    }

    public static final Set b(byte[] bytes) throws IOException {
        AbstractC5504s.h(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        AbstractC5504s.g(uri, "uri");
                        linkedHashSet.add(new b.C0772b(uri, z10));
                    }
                    L l10 = L.f17438a;
                    fe.c.a(objectInputStream, null);
                } finally {
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            L l11 = L.f17438a;
            fe.c.a(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    public static final EnumC5035a c(int i10) {
        if (i10 == 0) {
            return EnumC5035a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return EnumC5035a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static final i4.j d(int i10) {
        if (i10 == 0) {
            return i4.j.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return i4.j.CONNECTED;
        }
        if (i10 == 2) {
            return i4.j.UNMETERED;
        }
        if (i10 == 3) {
            return i4.j.NOT_ROAMING;
        }
        if (i10 == 4) {
            return i4.j.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return i4.j.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static final i4.m e(int i10) {
        if (i10 == 0) {
            return i4.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return i4.m.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static final i4.s f(int i10) {
        if (i10 == 0) {
            return i4.s.ENQUEUED;
        }
        if (i10 == 1) {
            return i4.s.RUNNING;
        }
        if (i10 == 2) {
            return i4.s.SUCCEEDED;
        }
        if (i10 == 3) {
            return i4.s.FAILED;
        }
        if (i10 == 4) {
            return i4.s.BLOCKED;
        }
        if (i10 == 5) {
            return i4.s.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static final int g(i4.j networkType) {
        AbstractC5504s.h(networkType, "networkType");
        int i10 = a.f53904c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == i4.j.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static final int h(i4.m policy) {
        AbstractC5504s.h(policy, "policy");
        int i10 = a.f53905d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new Td.r();
    }

    public static final byte[] i(Set triggers) throws IOException {
        AbstractC5504s.h(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    b.C0772b c0772b = (b.C0772b) it.next();
                    objectOutputStream.writeUTF(c0772b.a().toString());
                    objectOutputStream.writeBoolean(c0772b.b());
                }
                L l10 = L.f17438a;
                fe.c.a(objectOutputStream, null);
                fe.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC5504s.g(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int j(i4.s state) {
        AbstractC5504s.h(state, "state");
        switch (a.f53902a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new Td.r();
        }
    }
}
