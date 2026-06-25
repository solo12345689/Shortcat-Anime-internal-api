.class public LOg/c;
.super LIh/a;


# static fields
.field private static final c:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LOg/c;->c:Ljava/util/Set;

    .line 7
    .line 8
    sget-object v1, LBg/a;->X0:Lzg/t;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    sget-object v1, LBg/a;->Y0:Lzg/t;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    sget-object v1, LBg/a;->Z0:Lzg/t;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LOg/c;->c:Ljava/util/Set;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LIh/a;-><init>(Ljava/util/Set;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LCg/b;)Ljava/security/PrivateKey;
    .locals 1

    .line 1
    new-instance v0, LOg/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LOg/a;-><init>(LCg/b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b(LDg/b;)Ljava/security/PublicKey;
    .locals 1

    .line 1
    new-instance v0, LOg/b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LOg/b;-><init>(LDg/b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public engineGeneratePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    .locals 3

    .line 1
    instance-of v0, p1, LSg/b;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    check-cast p1, LSg/b;

    .line 6
    .line 7
    invoke-virtual {p1}, LSg/b;->a()LSg/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LSg/a;->b()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LOg/d;->a(Ljava/lang/String;)Lgh/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, LSg/b;->e()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Lgh/f;

    .line 26
    .line 27
    invoke-virtual {p1}, LSg/b;->d()[B

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v1, v0, p1}, Lgh/f;-><init>(Lgh/e;[B)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v1, Lgh/f;

    .line 36
    .line 37
    invoke-virtual {p1}, LSg/b;->b()[B

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-direct {v1, v0, v2}, Lgh/f;-><init>(Lgh/e;[B)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, LSg/b;->c()[B

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1}, Lgh/f;->d()[B

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p1, v0}, LOh/a;->k([B[B)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance p1, Ljava/security/spec/InvalidKeySpecException;

    .line 62
    .line 63
    const-string v0, "public key data does not match private key data"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    :goto_0
    new-instance p1, LOg/a;

    .line 70
    .line 71
    invoke-direct {p1, v1}, LOg/a;-><init>(Lgh/f;)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_3
    invoke-super {p0, p1}, LIh/a;->engineGeneratePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method public engineGeneratePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    .locals 3

    .line 1
    instance-of v0, p1, LSg/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LSg/c;

    .line 6
    .line 7
    new-instance v0, LOg/b;

    .line 8
    .line 9
    new-instance v1, Lgh/g;

    .line 10
    .line 11
    invoke-virtual {p1}, LSg/c;->a()LSg/a;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, LSg/a;->b()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, LOg/d;->a(Ljava/lang/String;)Lgh/e;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p1}, LSg/c;->b()[B

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v1, v2, p1}, Lgh/g;-><init>(Lgh/e;[B)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, LOg/b;-><init>(Lgh/g;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    invoke-super {p0, p1}, LIh/a;->engineGeneratePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final engineGetKeySpec(Ljava/security/Key;Ljava/lang/Class;)Ljava/security/spec/KeySpec;
    .locals 3

    .line 1
    instance-of v0, p1, LOg/a;

    .line 2
    .line 3
    const-string v1, "."

    .line 4
    .line 5
    const-class v2, LSg/c;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const-class v0, Ljava/security/spec/PKCS8EncodedKeySpec;

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p2, Ljava/security/spec/PKCS8EncodedKeySpec;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p2, p1}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    .line 24
    .line 25
    .line 26
    return-object p2

    .line 27
    :cond_0
    const-class v0, LSg/b;

    .line 28
    .line 29
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p1, LOg/a;

    .line 36
    .line 37
    invoke-virtual {p1}, LOg/a;->d()[B

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    new-instance v0, LSg/b;

    .line 44
    .line 45
    invoke-virtual {p1}, LOg/a;->a()LSg/a;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {v0, p1, p2}, LSg/b;-><init>(LSg/a;[B)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_1
    new-instance p2, LSg/b;

    .line 54
    .line 55
    invoke-virtual {p1}, LOg/a;->a()LSg/a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1}, LOg/a;->b()[B

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p1}, LOg/a;->c()LNg/a;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {p1}, LNg/a;->r()[B

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p2, v0, v1, p1}, LSg/b;-><init>(LSg/a;[B[B)V

    .line 72
    .line 73
    .line 74
    return-object p2

    .line 75
    :cond_2
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    check-cast p1, LOg/a;

    .line 82
    .line 83
    new-instance p2, LSg/c;

    .line 84
    .line 85
    invoke-virtual {p1}, LOg/a;->a()LSg/a;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1}, LOg/a;->c()LNg/a;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {p1}, LNg/a;->r()[B

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p2, v0, p1}, LSg/c;-><init>(LSg/a;[B)V

    .line 98
    .line 99
    .line 100
    return-object p2

    .line 101
    :cond_3
    instance-of v0, p1, LOg/b;

    .line 102
    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    const-class v0, Ljava/security/spec/X509EncodedKeySpec;

    .line 106
    .line 107
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    new-instance p2, Ljava/security/spec/X509EncodedKeySpec;

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {p2, p1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 120
    .line 121
    .line 122
    return-object p2

    .line 123
    :cond_4
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_5

    .line 128
    .line 129
    check-cast p1, LOg/b;

    .line 130
    .line 131
    new-instance p2, LSg/c;

    .line 132
    .line 133
    invoke-virtual {p1}, LOg/b;->a()LSg/a;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {p1}, LOg/b;->r()[B

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-direct {p2, v0, p1}, LSg/c;-><init>(LSg/a;[B)V

    .line 142
    .line 143
    .line 144
    return-object p2

    .line 145
    :cond_5
    new-instance p1, Ljava/security/spec/InvalidKeySpecException;

    .line 146
    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v2, "unknown key specification: "

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-direct {p1, p2}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :cond_6
    new-instance p2, Ljava/security/spec/InvalidKeySpecException;

    .line 172
    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v2, "Unsupported key type: "

    .line 179
    .line 180
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-direct {p2, p1}, Ljava/security/spec/InvalidKeySpecException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p2
.end method

.method public final engineTranslateKey(Ljava/security/Key;)Ljava/security/Key;
    .locals 1

    .line 1
    instance-of v0, p1, LOg/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p1, LOg/b;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    .line 11
    .line 12
    const-string v0, "unsupported key type"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    return-object p1
.end method
