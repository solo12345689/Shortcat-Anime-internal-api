.class public final Lfd/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lfd/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfd/a$a;
    }
.end annotation


# static fields
.field public static final a:Lfd/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfd/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lfd/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lfd/a;->a:Lfd/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    const-string p2, "keystoreAuthenticated"

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p2, "keystoreUnauthenticated"

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lfd/a;->b(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, ":"

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method public b(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lexpo/modules/securestore/SecureStoreOptions;->getKeychainService()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "AES/GCM/NoPadding:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public bridge synthetic c(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$Entry;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lfd/a;->g(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$SecretKeyEntry;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public d(Ljava/lang/String;Ljava/security/KeyStore$SecretKeyEntry;ZLjava/lang/String;Led/b;LZd/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p6, Lfd/a$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lfd/a$b;

    .line 7
    .line 8
    iget v1, v0, Lfd/a$b;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lfd/a$b;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfd/a$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lfd/a$b;-><init>(Lfd/a;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lfd/a$b;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lfd/a$b;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lfd/a$b;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljavax/crypto/spec/GCMParameterSpec;

    .line 41
    .line 42
    iget-object p2, v0, Lfd/a$b;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v4, p2

    .line 50
    move-object p2, p1

    .line 51
    move-object p1, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    const-string p6, "AES/GCM/NoPadding"

    .line 69
    .line 70
    invoke-static {p6}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 71
    .line 72
    .line 73
    move-result-object p6

    .line 74
    invoke-virtual {p6, v3, p2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p6}, Ljavax/crypto/Cipher;->getParameters()Ljava/security/AlgorithmParameters;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const-class v2, Ljavax/crypto/spec/GCMParameterSpec;

    .line 82
    .line 83
    invoke-virtual {p2, v2}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    check-cast p2, Ljavax/crypto/spec/GCMParameterSpec;

    .line 88
    .line 89
    invoke-static {p6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iput-object p1, v0, Lfd/a$b;->a:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v0, Lfd/a$b;->b:Ljava/lang/Object;

    .line 95
    .line 96
    iput v3, v0, Lfd/a$b;->e:I

    .line 97
    .line 98
    invoke-virtual {p5, p6, p3, p4, v0}, Led/b;->c(Ljavax/crypto/Cipher;ZLjava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p6

    .line 102
    if-ne p6, v1, :cond_3

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_3
    :goto_1
    check-cast p6, Ljavax/crypto/Cipher;

    .line 106
    .line 107
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1, p6, p2}, Lfd/a;->e(Ljava/lang/String;Ljavax/crypto/Cipher;Ljavax/crypto/spec/GCMParameterSpec;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1
.end method

.method public final e(Ljava/lang/String;Ljavax/crypto/Cipher;Ljavax/crypto/spec/GCMParameterSpec;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    const-string v0, "plaintextValue"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cipher"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "gcmSpec"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    const-string v1, "UTF_8"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "getBytes(...)"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 p2, 0x2

    .line 37
    invoke-static {p1, p2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p3}, Ljavax/crypto/spec/GCMParameterSpec;->getIV()[B

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0, p2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p3}, Ljavax/crypto/spec/GCMParameterSpec;->getTLen()I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    new-instance v0, Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v1, "ct"

    .line 59
    .line 60
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v0, "iv"

    .line 65
    .line 66
    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string p2, "tlen"

    .line 71
    .line 72
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string p2, "put(...)"

    .line 77
    .line 78
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object p1
.end method

.method public f(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$SecretKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Led/b;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p6, Lfd/a$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lfd/a$c;

    .line 7
    .line 8
    iget v1, v0, Lfd/a$c;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lfd/a$c;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfd/a$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lfd/a$c;-><init>(Lfd/a;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lfd/a$c;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lfd/a$c;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lfd/a$c;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, [B

    .line 41
    .line 42
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const-string p6, "ct"

    .line 58
    .line 59
    invoke-virtual {p2, p6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p6

    .line 63
    const-string v2, "iv"

    .line 64
    .line 65
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const-string v4, "tlen"

    .line 70
    .line 71
    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    const/4 v5, 0x0

    .line 76
    invoke-static {p6, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 77
    .line 78
    .line 79
    move-result-object p6

    .line 80
    invoke-static {v2, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    new-instance v5, Ljavax/crypto/spec/GCMParameterSpec;

    .line 85
    .line 86
    invoke-direct {v5, v4, v2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 87
    .line 88
    .line 89
    const-string v2, "AES/GCM/NoPadding"

    .line 90
    .line 91
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const-string v6, "requireAuthentication"

    .line 96
    .line 97
    invoke-virtual {p2, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    const/16 v6, 0x60

    .line 102
    .line 103
    if-lt v4, v6, :cond_4

    .line 104
    .line 105
    const/4 p1, 0x2

    .line 106
    invoke-virtual {p3}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    invoke-virtual {v2, p1, p3, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p4}, Lexpo/modules/securestore/SecureStoreOptions;->getAuthenticationPrompt()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iput-object p6, v0, Lfd/a$c;->a:Ljava/lang/Object;

    .line 121
    .line 122
    iput v3, v0, Lfd/a$c;->d:I

    .line 123
    .line 124
    invoke-virtual {p5, v2, p2, p1, v0}, Led/b;->c(Ljavax/crypto/Cipher;ZLjava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-ne p1, v1, :cond_3

    .line 129
    .line 130
    return-object v1

    .line 131
    :cond_3
    move-object v7, p6

    .line 132
    move-object p6, p1

    .line 133
    move-object p1, v7

    .line 134
    :goto_1
    check-cast p6, Ljavax/crypto/Cipher;

    .line 135
    .line 136
    invoke-virtual {p6, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const-string p2, "doFinal(...)"

    .line 141
    .line 142
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 146
    .line 147
    const-string p3, "UTF_8"

    .line 148
    .line 149
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    new-instance p3, Ljava/lang/String;

    .line 153
    .line 154
    invoke-direct {p3, p1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 155
    .line 156
    .line 157
    return-object p3

    .line 158
    :cond_4
    new-instance v0, Led/d;

    .line 159
    .line 160
    invoke-virtual {p4}, Lexpo/modules/securestore/SecureStoreOptions;->getKeychainService()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    const/16 v5, 0x8

    .line 165
    .line 166
    const/4 v6, 0x0

    .line 167
    const-string v1, "Authentication tag length must be at least 96 bits long"

    .line 168
    .line 169
    const/4 v4, 0x0

    .line 170
    move-object v2, p1

    .line 171
    invoke-direct/range {v0 .. v6}, Led/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 172
    .line 173
    .line 174
    throw v0
.end method

.method public g(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$SecretKeyEntry;
    .locals 3

    .line 1
    const-string v0, "keyStore"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lexpo/modules/securestore/SecureStoreOptions;->getRequireAuthentication()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0, p2, v0}, Lfd/a;->a(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-direct {v1, v0, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    const/16 v2, 0x100

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "GCM"

    .line 32
    .line 33
    filled-new-array {v2}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "NoPadding"

    .line 42
    .line 43
    filled-new-array {v2}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p2}, Lexpo/modules/securestore/SecureStoreOptions;->getRequireAuthentication()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {v1, p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const-string v1, "build(...)"

    .line 64
    .line 65
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v1, "AES"

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/security/KeyStore;->getProvider()Ljava/security/Provider;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v1, v2}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/KeyGenerator;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1, p2}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    .line 82
    .line 83
    .line 84
    const/4 p2, 0x0

    .line 85
    invoke-virtual {p1, v0, p2}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    instance-of v0, p1, Ljava/security/KeyStore$SecretKeyEntry;

    .line 90
    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    move-object p2, p1

    .line 94
    check-cast p2, Ljava/security/KeyStore$SecretKeyEntry;

    .line 95
    .line 96
    :cond_0
    if-eqz p2, :cond_1

    .line 97
    .line 98
    return-object p2

    .line 99
    :cond_1
    new-instance p1, Ljava/security/UnrecoverableEntryException;

    .line 100
    .line 101
    const-string p2, "Could not retrieve the newly generated secret key entry"

    .line 102
    .line 103
    invoke-direct {p1, p2}, Ljava/security/UnrecoverableEntryException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method
