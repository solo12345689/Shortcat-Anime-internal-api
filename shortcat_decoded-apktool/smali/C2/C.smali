.class public final LC2/C;
.super Lr2/q;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private i:[I

.field private j:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr2/q;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c(Ljava/nio/ByteBuffer;)V
    .locals 9

    .line 1
    iget-object v0, p0, LC2/C;->j:[I

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [I

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sub-int v3, v2, v1

    .line 18
    .line 19
    iget-object v4, p0, Lr2/q;->b:Lr2/o$a;

    .line 20
    .line 21
    iget v4, v4, Lr2/o$a;->d:I

    .line 22
    .line 23
    div-int/2addr v3, v4

    .line 24
    iget-object v4, p0, Lr2/q;->c:Lr2/o$a;

    .line 25
    .line 26
    iget v4, v4, Lr2/o$a;->d:I

    .line 27
    .line 28
    mul-int/2addr v3, v4

    .line 29
    invoke-virtual {p0, v3}, Lr2/q;->l(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :goto_0
    if-ge v1, v2, :cond_7

    .line 34
    .line 35
    array-length v4, v0

    .line 36
    const/4 v5, 0x0

    .line 37
    :goto_1
    if-ge v5, v4, :cond_6

    .line 38
    .line 39
    aget v6, v0, v5

    .line 40
    .line 41
    iget-object v7, p0, Lr2/q;->b:Lr2/o$a;

    .line 42
    .line 43
    iget v7, v7, Lr2/o$a;->c:I

    .line 44
    .line 45
    invoke-static {v7}, Lt2/a0;->S(I)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    mul-int/2addr v7, v6

    .line 50
    add-int/2addr v7, v1

    .line 51
    iget-object v6, p0, Lr2/q;->b:Lr2/o$a;

    .line 52
    .line 53
    iget v6, v6, Lr2/o$a;->c:I

    .line 54
    .line 55
    const/4 v8, 0x2

    .line 56
    if-eq v6, v8, :cond_5

    .line 57
    .line 58
    const/4 v8, 0x3

    .line 59
    if-eq v6, v8, :cond_4

    .line 60
    .line 61
    const/4 v8, 0x4

    .line 62
    if-eq v6, v8, :cond_3

    .line 63
    .line 64
    const/16 v8, 0x15

    .line 65
    .line 66
    if-eq v6, v8, :cond_2

    .line 67
    .line 68
    const/16 v8, 0x16

    .line 69
    .line 70
    if-eq v6, v8, :cond_1

    .line 71
    .line 72
    const/high16 v8, 0x10000000

    .line 73
    .line 74
    if-eq v6, v8, :cond_5

    .line 75
    .line 76
    const/high16 v8, 0x50000000

    .line 77
    .line 78
    if-eq v6, v8, :cond_2

    .line 79
    .line 80
    const/high16 v8, 0x60000000

    .line 81
    .line 82
    if-ne v6, v8, :cond_0

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v1, "Unexpected encoding: "

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lr2/q;->b:Lr2/o$a;

    .line 98
    .line 99
    iget v1, v1, Lr2/o$a;->c:I

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_1
    :goto_2
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_2
    invoke-static {p1, v7}, Lt2/a0;->g0(Ljava/nio/ByteBuffer;I)I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    invoke-static {v3, v6}, Lt2/a0;->i1(Ljava/nio/ByteBuffer;I)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_3
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getFloat(I)F

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_5
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    .line 151
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_6
    iget-object v4, p0, Lr2/q;->b:Lr2/o$a;

    .line 155
    .line 156
    iget v4, v4, Lr2/o$a;->d:I

    .line 157
    .line 158
    add-int/2addr v1, v4

    .line 159
    goto :goto_0

    .line 160
    :cond_7
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public h(Lr2/o$a;)Lr2/o$a;
    .locals 7

    .line 1
    iget-object v0, p0, LC2/C;->i:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lr2/o$a;->e:Lr2/o$a;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget v1, p1, Lr2/o$a;->c:I

    .line 9
    .line 10
    invoke-static {v1}, Lt2/a0;->L0(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    iget v1, p1, Lr2/o$a;->b:I

    .line 17
    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    move v1, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v1, v3

    .line 26
    :goto_0
    move v2, v3

    .line 27
    :goto_1
    array-length v5, v0

    .line 28
    if-ge v2, v5, :cond_4

    .line 29
    .line 30
    aget v5, v0, v2

    .line 31
    .line 32
    iget v6, p1, Lr2/o$a;->b:I

    .line 33
    .line 34
    if-ge v5, v6, :cond_3

    .line 35
    .line 36
    if-eq v5, v2, :cond_2

    .line 37
    .line 38
    move v5, v4

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v5, v3

    .line 41
    :goto_2
    or-int/2addr v1, v5

    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    new-instance v1, Lr2/o$b;

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v3, "Channel map ("

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ") trying to access non-existent input channel."

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {v1, v0, p1}, Lr2/o$b;-><init>(Ljava/lang/String;Lr2/o$a;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_4
    if-eqz v1, :cond_5

    .line 78
    .line 79
    new-instance v1, Lr2/o$a;

    .line 80
    .line 81
    iget v2, p1, Lr2/o$a;->a:I

    .line 82
    .line 83
    array-length v0, v0

    .line 84
    iget p1, p1, Lr2/o$a;->c:I

    .line 85
    .line 86
    invoke-direct {v1, v2, v0, p1}, Lr2/o$a;-><init>(III)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_5
    sget-object p1, Lr2/o$a;->e:Lr2/o$a;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_6
    new-instance v0, Lr2/o$b;

    .line 94
    .line 95
    invoke-direct {v0, p1}, Lr2/o$b;-><init>(Lr2/o$a;)V

    .line 96
    .line 97
    .line 98
    throw v0
.end method

.method protected i()V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/C;->i:[I

    .line 2
    .line 3
    iput-object v0, p0, LC2/C;->j:[I

    .line 4
    .line 5
    return-void
.end method

.method protected k()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LC2/C;->j:[I

    .line 3
    .line 4
    iput-object v0, p0, LC2/C;->i:[I

    .line 5
    .line 6
    return-void
.end method

.method public m([I)V
    .locals 0

    .line 1
    iput-object p1, p0, LC2/C;->i:[I

    .line 2
    .line 3
    return-void
.end method
