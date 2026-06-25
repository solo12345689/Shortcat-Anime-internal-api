.class public final Lod/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lod/f$a;
    }
.end annotation


# static fields
.field public static final g:Lod/f$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/Map;

.field private final c:Z

.field private final d:Z

.field private final e:Lkotlin/Lazy;

.field private final f:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lod/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lod/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lod/f;->g:Lod/f$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;ZZ)V
    .locals 1

    .line 1
    const-string v0, "embeddedCertificateString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lod/f;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lod/f;->b:Ljava/util/Map;

    .line 12
    .line 13
    iput-boolean p3, p0, Lod/f;->c:Z

    .line 14
    .line 15
    iput-boolean p4, p0, Lod/f;->d:Z

    .line 16
    .line 17
    new-instance p1, Lod/d;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lod/d;-><init>(Lod/f;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lod/f;->e:Lkotlin/Lazy;

    .line 27
    .line 28
    new-instance p1, Lod/e;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lod/e;-><init>(Lod/f;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lod/f;->f:Lkotlin/Lazy;

    .line 38
    .line 39
    return-void
.end method

.method public static synthetic a(Lod/f;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lod/f;->g(Lod/f;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lod/f;)Lod/c;
    .locals 0

    .line 1
    invoke-static {p0}, Lod/f;->c(Lod/f;)Lod/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Lod/f;)Lod/c;
    .locals 2

    .line 1
    sget-object v0, Lod/c;->b:Lod/c$a;

    .line 2
    .line 3
    iget-object p0, p0, Lod/f;->b:Ljava/util/Map;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const-string v1, "alg"

    .line 8
    .line 9
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0, p0}, Lod/c$a;->a(Ljava/lang/String;)Lod/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final e()Lod/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/f;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lod/c;

    .line 8
    .line 9
    return-object v0
.end method

.method private final f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/f;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final g(Lod/f;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lod/f;->b:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    const-string v0, "keyid"

    .line 6
    .line 7
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object p0

    .line 17
    :cond_1
    :goto_0
    const-string p0, "root"

    .line 18
    .line 19
    return-object p0
.end method

.method private final i(Lod/h;[BLjava/lang/String;)Lod/i;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lod/f;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lod/b;

    .line 6
    .line 7
    sget-object v1, Lod/f;->g:Lod/f$a;

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    const-string p3, ""

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v1, p3}, Lod/f$a;->a(Ljava/lang/String;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iget-object v1, p0, Lod/f;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p3, v1}, LUd/u;->J0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-direct {v0, p3}, Lod/b;-><init>(Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p1}, Lod/h;->b()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-direct {p0}, Lod/f;->f()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    if-eqz p3, :cond_4

    .line 40
    .line 41
    invoke-virtual {p1}, Lod/h;->a()Lod/c;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    invoke-direct {p0}, Lod/f;->e()Lod/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eq p3, v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lod/h;->a()Lod/c;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v1, "Key with alg="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p3, " from signature does not match client configuration algorithm, continuing"

    .line 69
    .line 70
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    const-string v0, "CodeSigning"

    .line 78
    .line 79
    invoke-static {v0, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    :cond_2
    new-instance v0, Lod/b;

    .line 83
    .line 84
    iget-object p3, p0, Lod/f;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p3}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    invoke-direct {v0, p3}, Lod/b;-><init>(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    const-string p3, "SHA256withRSA"

    .line 94
    .line 95
    invoke-static {p3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {v0}, Lod/b;->c()Ljava/security/cert/X509Certificate;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {p3, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3, p2}, Ljava/security/Signature;->update([B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Lod/h;->c()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const/4 p2, 0x0

    .line 118
    invoke-static {p1, p2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p3, p1}, Ljava/security/Signature;->verify([B)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    new-instance p2, Lod/i;

    .line 127
    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    sget-object p1, Lod/j;->a:Lod/j;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    sget-object p1, Lod/j;->b:Lod/j;

    .line 134
    .line 135
    :goto_1
    sget-object p3, Lod/b;->c:Lod/b$a;

    .line 136
    .line 137
    invoke-virtual {v0}, Lod/b;->c()Ljava/security/cert/X509Certificate;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p3, v0}, Lod/b$a;->e(Ljava/security/cert/X509Certificate;)Lod/g;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    invoke-direct {p2, p1, p3}, Lod/i;-><init>(Lod/j;Lod/g;)V

    .line 146
    .line 147
    .line 148
    return-object p2

    .line 149
    :cond_4
    new-instance p2, Ljava/lang/Exception;

    .line 150
    .line 151
    invoke-virtual {p1}, Lod/h;->b()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    new-instance p3, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const-string v0, "Key with keyid="

    .line 161
    .line 162
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string p1, " from signature not found in client configuration"

    .line 169
    .line 170
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p2
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lid/a;->e(Z)Lid/a;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-string v1, "sig"

    .line 7
    .line 8
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0}, Lod/f;->f()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lid/o;->f(Ljava/lang/String;)Lid/o;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "keyid"

    .line 21
    .line 22
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {p0}, Lod/f;->e()Lod/c;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Lod/c;->b()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Lid/o;->f(Ljava/lang/String;)Lid/o;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "alg"

    .line 39
    .line 40
    invoke-static {v3, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Lid/d;->f(Ljava/util/Map;)Lid/d;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lid/d;->e()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "serialize(...)"

    .line 61
    .line 62
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method

.method public final h(Ljava/lang/String;[BLjava/lang/String;)Lod/i;
    .locals 1

    .line 1
    const-string v0, "bodyBytes"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    iget-boolean p1, p0, Lod/f;->d:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance p1, Lod/i;

    .line 13
    .line 14
    sget-object p2, Lod/j;->c:Lod/j;

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    invoke-direct {p1, p2, p3}, Lod/i;-><init>(Lod/j;Lod/g;)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 22
    .line 23
    const-string p2, "No expo-signature header specified"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    sget-object v0, Lod/h;->d:Lod/h$a;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lod/h$a;->a(Ljava/lang/String;)Lod/h;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lod/f;->i(Lod/h;[BLjava/lang/String;)Lod/i;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method
