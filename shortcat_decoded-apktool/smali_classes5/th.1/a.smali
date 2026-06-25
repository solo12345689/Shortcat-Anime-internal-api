.class public Lth/a;
.super Ljava/security/Provider;


# static fields
.field private static a:Ljava/lang/String; = "BouncyCastle Post-Quantum Security Provider v1.81"

.field public static b:Ljava/lang/String; = "BCPQC"

.field private static final c:Ljava/util/Map;

.field private static final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lth/a;->c:Ljava/util/Map;

    .line 7
    .line 8
    const-string v18, "Mayo"

    .line 9
    .line 10
    const-string v19, "Snova"

    .line 11
    .line 12
    const-string v1, "SPHINCS"

    .line 13
    .line 14
    const-string v2, "LMS"

    .line 15
    .line 16
    const-string v3, "NH"

    .line 17
    .line 18
    const-string v4, "XMSS"

    .line 19
    .line 20
    const-string v5, "SPHINCSPlus"

    .line 21
    .line 22
    const-string v6, "CMCE"

    .line 23
    .line 24
    const-string v7, "Frodo"

    .line 25
    .line 26
    const-string v8, "SABER"

    .line 27
    .line 28
    const-string v9, "Picnic"

    .line 29
    .line 30
    const-string v10, "NTRU"

    .line 31
    .line 32
    const-string v11, "Falcon"

    .line 33
    .line 34
    const-string v12, "Kyber"

    .line 35
    .line 36
    const-string v13, "Dilithium"

    .line 37
    .line 38
    const-string v14, "NTRUPrime"

    .line 39
    .line 40
    const-string v15, "BIKE"

    .line 41
    .line 42
    const-string v16, "HQC"

    .line 43
    .line 44
    const-string v17, "Rainbow"

    .line 45
    .line 46
    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lth/a;->d:[Ljava/lang/String;

    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, Lth/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-wide v1, 0x3ffcf5c28f5c28f6L    # 1.81

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    sget-object v3, Lth/a;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p0, v0, v1, v2, v3}, Ljava/security/Provider;-><init>(Ljava/lang/String;DLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lth/a$a;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lth/a$a;-><init>(Lth/a;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method static synthetic a(Lth/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth/a;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private d(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p2

    .line 3
    if-eq v0, v1, :cond_1

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    aget-object v2, p2, v0

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, "$Mappings"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-class v2, Lth/a;

    .line 28
    .line 29
    invoke-static {v2, v1}, Lth/a;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    :catch_0
    move-exception v1

    .line 48
    new-instance v2, Ljava/lang/InternalError;

    .line 49
    .line 50
    new-instance v3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v4, "cannot create instance of "

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    aget-object p1, p2, v0

    .line 64
    .line 65
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p1, "$Mappings : "

    .line 69
    .line 70
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v2, p1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v2

    .line 84
    :cond_1
    return-void
.end method

.method static e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lth/a$b;

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lth/a$b;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :catch_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method private f()V
    .locals 2

    .line 1
    const-string v0, "org.bouncycastle.pqc.jcajce.provider."

    .line 2
    .line 3
    sget-object v1, Lth/a;->d:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lth/a;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
