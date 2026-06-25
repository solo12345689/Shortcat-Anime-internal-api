package Yc;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final String a(Serializable serializable) throws IOException {
        AbstractC5504s.h(serializable, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                fe.c.a(objectOutputStream, null);
                fe.c.a(byteArrayOutputStream, null);
                AbstractC5504s.g(strEncodeToString, "use(...)");
                return strEncodeToString;
            } finally {
            }
        } finally {
        }
    }
}
