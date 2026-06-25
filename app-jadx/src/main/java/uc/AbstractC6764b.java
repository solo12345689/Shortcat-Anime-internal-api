package uc;

import Df.C1271d;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: uc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6764b {
    public static final byte[] a(UUID uuid) {
        AbstractC5504s.h(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        AbstractC5504s.g(bArrArray, "array(...)");
        return bArrArray;
    }

    public static final UUID b(UUID namespace, String name) throws NoSuchAlgorithmException {
        AbstractC5504s.h(namespace, "namespace");
        AbstractC5504s.h(name, "name");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(a(namespace));
        byte[] bytes = name.getBytes(C1271d.f3718b);
        AbstractC5504s.g(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[6] = (byte) ((bArrDigest[6] & 15) | 80);
        bArrDigest[8] = (byte) ((bArrDigest[8] & 63) | 128);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDigest);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }
}
