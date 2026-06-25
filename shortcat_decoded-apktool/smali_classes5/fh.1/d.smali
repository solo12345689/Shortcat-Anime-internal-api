.class public Lfh/d;
.super Lfh/b;


# instance fields
.field final c:[B

.field final d:[B

.field final e:[B

.field final f:[B

.field final g:[B

.field final h:[B

.field private final i:[B

.field private final j:[B

.field private final k:I


# direct methods
.method public constructor <init>(Lfh/c;[BLfh/e;)V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Lfh/b;-><init>(ZLfh/c;)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v1}, Lfh/c;->a(Ljava/security/SecureRandom;)Lfh/a;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    array-length p1, p2

    .line 11
    const/4 v9, 0x2

    .line 12
    const/4 v10, 0x0

    .line 13
    const/16 v3, 0x20

    .line 14
    .line 15
    if-ne p1, v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2, p2}, Lfh/a;->c([B)[[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    aget-object p2, p1, v10

    .line 22
    .line 23
    iput-object p2, p0, Lfh/d;->c:[B

    .line 24
    .line 25
    aget-object p2, p1, v0

    .line 26
    .line 27
    iput-object p2, p0, Lfh/d;->d:[B

    .line 28
    .line 29
    aget-object p2, p1, v9

    .line 30
    .line 31
    iput-object p2, p0, Lfh/d;->e:[B

    .line 32
    .line 33
    const/4 p2, 0x3

    .line 34
    aget-object p2, p1, p2

    .line 35
    .line 36
    iput-object p2, p0, Lfh/d;->f:[B

    .line 37
    .line 38
    const/4 p2, 0x4

    .line 39
    aget-object p2, p1, p2

    .line 40
    .line 41
    iput-object p2, p0, Lfh/d;->g:[B

    .line 42
    .line 43
    const/4 p2, 0x5

    .line 44
    aget-object p2, p1, p2

    .line 45
    .line 46
    iput-object p2, p0, Lfh/d;->h:[B

    .line 47
    .line 48
    const/4 p2, 0x6

    .line 49
    aget-object p2, p1, p2

    .line 50
    .line 51
    iput-object p2, p0, Lfh/d;->i:[B

    .line 52
    .line 53
    const/4 p2, 0x7

    .line 54
    aget-object p1, p1, p2

    .line 55
    .line 56
    iput-object p1, p0, Lfh/d;->j:[B

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move p1, v3

    .line 60
    invoke-static {p2, v10, p1}, LOh/a;->m([BII)[B

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iput-object v3, p0, Lfh/d;->c:[B

    .line 65
    .line 66
    const/16 v0, 0x40

    .line 67
    .line 68
    invoke-static {p2, p1, v0}, LOh/a;->m([BII)[B

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iput-object v4, p0, Lfh/d;->d:[B

    .line 73
    .line 74
    const/16 p1, 0x80

    .line 75
    .line 76
    invoke-static {p2, v0, p1}, LOh/a;->m([BII)[B

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    iput-object v5, p0, Lfh/d;->e:[B

    .line 81
    .line 82
    invoke-virtual {v2}, Lfh/a;->g()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {v2}, Lfh/a;->h()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    mul-int/2addr v0, v6

    .line 91
    add-int/2addr v0, p1

    .line 92
    invoke-static {p2, p1, v0}, LOh/a;->m([BII)[B

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    iput-object v6, p0, Lfh/d;->f:[B

    .line 97
    .line 98
    invoke-virtual {v2}, Lfh/a;->f()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {v2}, Lfh/a;->h()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    mul-int/2addr p1, v7

    .line 107
    add-int/2addr p1, v0

    .line 108
    invoke-static {p2, v0, p1}, LOh/a;->m([BII)[B

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    iput-object v7, p0, Lfh/d;->g:[B

    .line 113
    .line 114
    invoke-virtual {v2}, Lfh/a;->f()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    mul-int/lit16 v0, v0, 0x1a0

    .line 119
    .line 120
    add-int/2addr v0, p1

    .line 121
    invoke-static {p2, p1, v0}, LOh/a;->m([BII)[B

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    iput-object v8, p0, Lfh/d;->h:[B

    .line 126
    .line 127
    invoke-virtual/range {v2 .. v8}, Lfh/a;->b([B[B[B[B[B[B)[B

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iput-object p1, p0, Lfh/d;->i:[B

    .line 132
    .line 133
    iput-object v1, p0, Lfh/d;->j:[B

    .line 134
    .line 135
    :goto_0
    if-eqz p3, :cond_2

    .line 136
    .line 137
    iget-object p1, p0, Lfh/d;->i:[B

    .line 138
    .line 139
    invoke-virtual {p3}, Lfh/e;->d()[B

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-static {p1, p2}, LOh/a;->k([B[B)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    const-string p2, "passed in public key does not match private values"

    .line 153
    .line 154
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :cond_2
    :goto_1
    iget-object p1, p0, Lfh/d;->j:[B

    .line 159
    .line 160
    if-eqz p1, :cond_3

    .line 161
    .line 162
    move v9, v10

    .line 163
    :cond_3
    iput v9, p0, Lfh/d;->k:I

    .line 164
    .line 165
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lfh/d;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public d()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/d;->j:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getEncoded()[B
    .locals 6

    .line 1
    iget-object v0, p0, Lfh/d;->c:[B

    .line 2
    .line 3
    iget-object v1, p0, Lfh/d;->d:[B

    .line 4
    .line 5
    iget-object v2, p0, Lfh/d;->e:[B

    .line 6
    .line 7
    iget-object v3, p0, Lfh/d;->f:[B

    .line 8
    .line 9
    iget-object v4, p0, Lfh/d;->g:[B

    .line 10
    .line 11
    iget-object v5, p0, Lfh/d;->h:[B

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, LOh/a;->j([[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
