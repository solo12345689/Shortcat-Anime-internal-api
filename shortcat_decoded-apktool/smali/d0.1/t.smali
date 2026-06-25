.class public final Ld0/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld0/t$a;,
        Ld0/t$b;
    }
.end annotation


# static fields
.field public static final e:Ld0/t$a;

.field public static final f:I

.field private static final g:Ld0/t;


# instance fields
.field private a:I

.field private b:I

.field private final c:Lf0/e;

.field private d:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ld0/t$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ld0/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ld0/t;->e:Ld0/t$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Ld0/t;->f:I

    .line 12
    .line 13
    new-instance v0, Ld0/t;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    new-array v2, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v0, v1, v1, v2}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ld0/t;->g:Ld0/t;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(II[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    return-void
.end method

.method public constructor <init>(II[Ljava/lang/Object;Lf0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ld0/t;->a:I

    .line 3
    iput p2, p0, Ld0/t;->b:I

    .line 4
    iput-object p4, p0, Ld0/t;->c:Lf0/e;

    .line 5
    iput-object p3, p0, Ld0/t;->d:[Ljava/lang/Object;

    return-void
.end method

.method private final A(ILd0/f;)Ld0/t;
    .locals 2

    .line 1
    invoke-virtual {p2}, LUd/i;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ld0/f;->n(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p2, v0}, Ld0/f;->l(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 18
    .line 19
    array-length v0, v0

    .line 20
    const/4 v1, 0x2

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_0
    iget-object v0, p0, Ld0/t;->c:Lf0/e;

    .line 26
    .line 27
    invoke-virtual {p2}, Ld0/f;->j()Lf0/e;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    iget-object p2, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {p2, p1}, Ld0/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {v0, p1}, Ld0/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, Ld0/t;

    .line 49
    .line 50
    invoke-virtual {p2}, Ld0/f;->j()Lf0/e;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {v0, v1, v1, p1, p2}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method private final B(ILjava/lang/Object;Ljava/lang/Object;Lf0/e;)Ld0/t;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ld0/t;->n(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ld0/t;->c:Lf0/e;

    .line 6
    .line 7
    if-ne v1, p4, :cond_0

    .line 8
    .line 9
    iget-object p4, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p4, v0, p2, p3}, Ld0/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iput-object p2, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 16
    .line 17
    iget p2, p0, Ld0/t;->a:I

    .line 18
    .line 19
    or-int/2addr p1, p2

    .line 20
    iput p1, p0, Ld0/t;->a:I

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    iget-object v1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {v1, v0, p2, p3}, Ld0/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    new-instance p3, Ld0/t;

    .line 30
    .line 31
    iget v0, p0, Ld0/t;->a:I

    .line 32
    .line 33
    or-int/2addr p1, v0

    .line 34
    iget v0, p0, Ld0/t;->b:I

    .line 35
    .line 36
    invoke-direct {p3, p1, v0, p2, p4}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 37
    .line 38
    .line 39
    return-object p3
.end method

.method private final C(IIILjava/lang/Object;Ljava/lang/Object;ILf0/e;)Ld0/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/t;->c:Lf0/e;

    .line 2
    .line 3
    if-ne v0, p7, :cond_0

    .line 4
    .line 5
    invoke-direct/range {p0 .. p7}, Ld0/t;->d(IIILjava/lang/Object;Ljava/lang/Object;ILf0/e;)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    move p3, p2

    .line 10
    move-object p2, p0

    .line 11
    iput-object p1, p2, Ld0/t;->d:[Ljava/lang/Object;

    .line 12
    .line 13
    iget p1, p2, Ld0/t;->a:I

    .line 14
    .line 15
    xor-int/2addr p1, p3

    .line 16
    iput p1, p2, Ld0/t;->a:I

    .line 17
    .line 18
    iget p1, p2, Ld0/t;->b:I

    .line 19
    .line 20
    or-int/2addr p1, p3

    .line 21
    iput p1, p2, Ld0/t;->b:I

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    invoke-direct/range {p0 .. p7}, Ld0/t;->d(IIILjava/lang/Object;Ljava/lang/Object;ILf0/e;)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    move p3, p2

    .line 29
    move-object p2, p0

    .line 30
    new-instance p4, Ld0/t;

    .line 31
    .line 32
    iget p5, p2, Ld0/t;->a:I

    .line 33
    .line 34
    xor-int/2addr p5, p3

    .line 35
    iget p6, p2, Ld0/t;->b:I

    .line 36
    .line 37
    or-int/2addr p3, p6

    .line 38
    invoke-direct {p4, p5, p3, p1, p7}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 39
    .line 40
    .line 41
    return-object p4
.end method

.method private final F(Ld0/t;IILf0/b;Ld0/f;)Ld0/t;
    .locals 12

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ld0/t;->r(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0, p2}, Ld0/t;->O(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, v1}, Ld0/t;->N(I)Ld0/t;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct/range {p1 .. p2}, Ld0/t;->r(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual/range {p1 .. p2}, Ld0/t;->O(I)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-virtual {p1, p2}, Ld0/t;->N(I)Ld0/t;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    add-int/lit8 p2, p3, 0x5

    .line 33
    .line 34
    move-object/from16 v8, p5

    .line 35
    .line 36
    invoke-virtual {v3, p1, p2, v0, v8}, Ld0/t;->E(Ld0/t;ILf0/b;Ld0/f;)Ld0/t;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_0
    move-object/from16 v8, p5

    .line 42
    .line 43
    invoke-virtual/range {p1 .. p2}, Ld0/t;->q(I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual/range {p1 .. p2}, Ld0/t;->n(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-direct {p1, p2}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-direct {p1, p2}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v8}, LUd/i;->size()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    :cond_1
    move v4, v2

    .line 72
    add-int/lit8 v7, p3, 0x5

    .line 73
    .line 74
    invoke-virtual/range {v3 .. v8}, Ld0/t;->D(ILjava/lang/Object;Ljava/lang/Object;ILd0/f;)Ld0/t;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual/range {p5 .. p5}, LUd/i;->size()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-ne v1, p1, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0}, Lf0/b;->a()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    add-int/lit8 p1, p1, 0x1

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Lf0/b;->c(I)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-object p2

    .line 94
    :cond_3
    return-object v3

    .line 95
    :cond_4
    invoke-direct/range {p1 .. p2}, Ld0/t;->r(I)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_9

    .line 100
    .line 101
    invoke-virtual/range {p1 .. p2}, Ld0/t;->O(I)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-virtual {p1, v1}, Ld0/t;->N(I)Ld0/t;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {p0, p2}, Ld0/t;->q(I)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_8

    .line 114
    .line 115
    invoke-virtual {p0, p2}, Ld0/t;->n(I)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-direct {p0, p1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    if-eqz v6, :cond_5

    .line 124
    .line 125
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    goto :goto_0

    .line 130
    :cond_5
    move p2, v2

    .line 131
    :goto_0
    add-int/lit8 v8, p3, 0x5

    .line 132
    .line 133
    invoke-virtual {v4, p2, v6, v8}, Ld0/t;->k(ILjava/lang/Object;I)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_6

    .line 138
    .line 139
    invoke-virtual {v0}, Lf0/b;->a()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    add-int/lit8 p1, p1, 0x1

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lf0/b;->c(I)V

    .line 146
    .line 147
    .line 148
    return-object v4

    .line 149
    :cond_6
    invoke-direct {p0, p1}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    if-eqz v6, :cond_7

    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    :cond_7
    move-object/from16 v9, p5

    .line 160
    .line 161
    move v5, v2

    .line 162
    invoke-virtual/range {v4 .. v9}, Ld0/t;->D(ILjava/lang/Object;Ljava/lang/Object;ILd0/f;)Ld0/t;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :cond_8
    return-object v4

    .line 168
    :cond_9
    invoke-virtual {p0, p2}, Ld0/t;->n(I)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-direct {p0, v0}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-direct {p0, v0}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-virtual/range {p1 .. p2}, Ld0/t;->n(I)I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    invoke-direct {p1, p2}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    invoke-direct {p1, p2}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    if-eqz v5, :cond_a

    .line 193
    .line 194
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    move v4, p1

    .line 199
    goto :goto_1

    .line 200
    :cond_a
    move v4, v2

    .line 201
    :goto_1
    if-eqz v8, :cond_b

    .line 202
    .line 203
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    :cond_b
    move v7, v2

    .line 208
    add-int/lit8 v10, p3, 0x5

    .line 209
    .line 210
    invoke-virtual/range {p5 .. p5}, Ld0/f;->j()Lf0/e;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    move-object v3, p0

    .line 215
    invoke-direct/range {v3 .. v11}, Ld0/t;->u(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILf0/e;)Ld0/t;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    return-object p1
.end method

.method private final I(IILd0/f;)Ld0/t;
    .locals 2

    .line 1
    invoke-virtual {p3}, LUd/i;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    invoke-virtual {p3, v0}, Ld0/f;->n(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p3, v0}, Ld0/f;->l(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 18
    .line 19
    array-length v0, v0

    .line 20
    const/4 v1, 0x2

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_0
    iget-object v0, p0, Ld0/t;->c:Lf0/e;

    .line 26
    .line 27
    invoke-virtual {p3}, Ld0/f;->j()Lf0/e;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    iget-object p3, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {p3, p1}, Ld0/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 40
    .line 41
    iget p1, p0, Ld0/t;->a:I

    .line 42
    .line 43
    xor-int/2addr p1, p2

    .line 44
    iput p1, p0, Ld0/t;->a:I

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {v0, p1}, Ld0/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, Ld0/t;

    .line 54
    .line 55
    iget v1, p0, Ld0/t;->a:I

    .line 56
    .line 57
    xor-int/2addr p2, v1

    .line 58
    iget v1, p0, Ld0/t;->b:I

    .line 59
    .line 60
    invoke-virtual {p3}, Ld0/f;->j()Lf0/e;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-direct {v0, p2, v1, p1, p3}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 65
    .line 66
    .line 67
    return-object v0
.end method

.method private final J(IILf0/e;)Ld0/t;
    .locals 3

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v1, v2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    iget-object v1, p0, Ld0/t;->c:Lf0/e;

    .line 10
    .line 11
    if-ne v1, p3, :cond_1

    .line 12
    .line 13
    invoke-static {v0, p1}, Ld0/x;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 18
    .line 19
    iget p1, p0, Ld0/t;->b:I

    .line 20
    .line 21
    xor-int/2addr p1, p2

    .line 22
    iput p1, p0, Ld0/t;->b:I

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {v0, p1}, Ld0/x;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Ld0/t;

    .line 30
    .line 31
    iget v1, p0, Ld0/t;->a:I

    .line 32
    .line 33
    iget v2, p0, Ld0/t;->b:I

    .line 34
    .line 35
    xor-int/2addr p2, v2

    .line 36
    invoke-direct {v0, v1, p2, p1, p3}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method private final K(Ld0/t;Ld0/t;IILf0/e;)Ld0/t;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p3, p4, p5}, Ld0/t;->J(IILf0/e;)Ld0/t;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object p4, p0, Ld0/t;->c:Lf0/e;

    .line 9
    .line 10
    if-eq p4, p5, :cond_2

    .line 11
    .line 12
    if-eq p1, p2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return-object p0

    .line 16
    :cond_2
    :goto_0
    invoke-direct {p0, p3, p2, p5}, Ld0/t;->L(ILd0/t;Lf0/e;)Ld0/t;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method private final L(ILd0/t;Lf0/e;)Ld0/t;
    .locals 3

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v1, v2, :cond_0

    .line 6
    .line 7
    iget-object v1, p2, Ld0/t;->d:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v1, v1

    .line 10
    const/4 v2, 0x2

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget v1, p2, Ld0/t;->b:I

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget p1, p0, Ld0/t;->b:I

    .line 18
    .line 19
    iput p1, p2, Ld0/t;->a:I

    .line 20
    .line 21
    return-object p2

    .line 22
    :cond_0
    iget-object v1, p0, Ld0/t;->c:Lf0/e;

    .line 23
    .line 24
    if-ne v1, p3, :cond_1

    .line 25
    .line 26
    aput-object p2, v0, p1

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    array-length v1, v0

    .line 30
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "copyOf(...)"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    aput-object p2, v0, p1

    .line 40
    .line 41
    new-instance p1, Ld0/t;

    .line 42
    .line 43
    iget p2, p0, Ld0/t;->a:I

    .line 44
    .line 45
    iget v1, p0, Ld0/t;->b:I

    .line 46
    .line 47
    invoke-direct {p1, p2, v1, v0, p3}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 48
    .line 49
    .line 50
    return-object p1
.end method

.method private final M(ILjava/lang/Object;Ld0/f;)Ld0/t;
    .locals 2

    .line 1
    iget-object v0, p0, Ld0/t;->c:Lf0/e;

    .line 2
    .line 3
    invoke-virtual {p3}, Ld0/f;->j()Lf0/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object p3, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    aput-object p2, p3, p1

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p3}, Ld0/f;->g()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    invoke-virtual {p3, v0}, Ld0/f;->k(I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 26
    .line 27
    array-length v1, v0

    .line 28
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "copyOf(...)"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    aput-object p2, v0, p1

    .line 40
    .line 41
    new-instance p1, Ld0/t;

    .line 42
    .line 43
    iget p2, p0, Ld0/t;->a:I

    .line 44
    .line 45
    iget v1, p0, Ld0/t;->b:I

    .line 46
    .line 47
    invoke-virtual {p3}, Ld0/f;->j()Lf0/e;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-direct {p1, p2, v1, v0, p3}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 52
    .line 53
    .line 54
    return-object p1
.end method

.method private final R(II)Ld0/t;
    .locals 3

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-ne v1, v2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-static {v0, p1}, Ld0/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Ld0/t;

    .line 14
    .line 15
    iget v1, p0, Ld0/t;->a:I

    .line 16
    .line 17
    xor-int/2addr p2, v1

    .line 18
    iget v1, p0, Ld0/t;->b:I

    .line 19
    .line 20
    invoke-direct {v0, p2, v1, p1}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method private final S(II)Ld0/t;
    .locals 3

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v1, v2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-static {v0, p1}, Ld0/x;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Ld0/t;

    .line 14
    .line 15
    iget v1, p0, Ld0/t;->a:I

    .line 16
    .line 17
    iget v2, p0, Ld0/t;->b:I

    .line 18
    .line 19
    xor-int/2addr p2, v2

    .line 20
    invoke-direct {v0, v1, p2, p1}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method private final T(Ld0/t;Ld0/t;II)Ld0/t;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p3, p4}, Ld0/t;->S(II)Ld0/t;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    if-eq p1, p2, :cond_1

    .line 9
    .line 10
    invoke-direct {p0, p3, p4, p2}, Ld0/t;->U(IILd0/t;)Ld0/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_1
    return-object p0
.end method

.method private final U(IILd0/t;)Ld0/t;
    .locals 4

    .line 1
    iget-object v0, p3, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-ne v1, v2, :cond_1

    .line 6
    .line 7
    iget v1, p3, Ld0/t;->b:I

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    iget p1, p0, Ld0/t;->b:I

    .line 18
    .line 19
    iput p1, p3, Ld0/t;->a:I

    .line 20
    .line 21
    return-object p3

    .line 22
    :cond_0
    invoke-virtual {p0, p2}, Ld0/t;->n(I)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    iget-object v1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    aget-object v3, v0, v3

    .line 30
    .line 31
    aget-object v0, v0, v2

    .line 32
    .line 33
    invoke-static {v1, p1, p3, v3, v0}, Ld0/x;->e([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p3, Ld0/t;

    .line 38
    .line 39
    iget v0, p0, Ld0/t;->a:I

    .line 40
    .line 41
    xor-int/2addr v0, p2

    .line 42
    iget v1, p0, Ld0/t;->b:I

    .line 43
    .line 44
    xor-int/2addr p2, v1

    .line 45
    invoke-direct {p3, v0, p2, p1}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object p3

    .line 49
    :cond_1
    iget-object p2, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 50
    .line 51
    array-length v0, p2

    .line 52
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const-string v0, "copyOf(...)"

    .line 57
    .line 58
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    aput-object p3, p2, p1

    .line 62
    .line 63
    new-instance p1, Ld0/t;

    .line 64
    .line 65
    iget p3, p0, Ld0/t;->a:I

    .line 66
    .line 67
    iget v0, p0, Ld0/t;->b:I

    .line 68
    .line 69
    invoke-direct {p1, p3, v0, p2}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object p1
.end method

.method private final V(ILjava/lang/Object;)Ld0/t;
    .locals 2

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "copyOf(...)"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    aput-object p2, v0, p1

    .line 16
    .line 17
    new-instance p1, Ld0/t;

    .line 18
    .line 19
    iget p2, p0, Ld0/t;->a:I

    .line 20
    .line 21
    iget v1, p0, Ld0/t;->b:I

    .line 22
    .line 23
    invoke-direct {p1, p2, v1, v0}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method private final W(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    return-object p1
.end method

.method public static final synthetic a()Ld0/t;
    .locals 1

    .line 1
    sget-object v0, Ld0/t;->g:Ld0/t;

    .line 2
    .line 3
    return-object v0
.end method

.method private final b()Ld0/t$b;
    .locals 2

    .line 1
    new-instance v0, Ld0/t$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Ld0/t$b;-><init>(Ld0/t;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method private final c()Ld0/t$b;
    .locals 2

    .line 1
    new-instance v0, Ld0/t$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ld0/t$b;-><init>(Ld0/t;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method private final d(IIILjava/lang/Object;Ljava/lang/Object;ILf0/e;)[Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-direct/range {p0 .. p1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    move v1, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p0 .. p1}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    add-int/lit8 v7, p6, 0x5

    .line 20
    .line 21
    move-object v0, p0

    .line 22
    move v4, p3

    .line 23
    move-object v5, p4

    .line 24
    move-object v6, p5

    .line 25
    move-object/from16 v8, p7

    .line 26
    .line 27
    invoke-direct/range {v0 .. v8}, Ld0/t;->u(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILf0/e;)Ld0/t;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-virtual {p0, p2}, Ld0/t;->O(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    add-int/lit8 p2, p2, 0x1

    .line 36
    .line 37
    iget-object p4, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {p4, p1, p2, p3}, Ld0/x;->d([Ljava/lang/Object;IILd0/t;)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method private final e()I
    .locals 4

    .line 1
    iget v0, p0, Ld0/t;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    div-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    iget v0, p0, Ld0/t;->a:I

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    mul-int/lit8 v1, v0, 0x2

    .line 18
    .line 19
    iget-object v2, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 20
    .line 21
    array-length v2, v2

    .line 22
    :goto_0
    if-ge v1, v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ld0/t;->N(I)Ld0/t;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-direct {v3}, Ld0/t;->e()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    add-int/2addr v0, v3

    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v0
.end method

.method private final f(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Loe/j;->x(II)Loe/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {v0, v2}, Loe/j;->v(Loe/d;I)Loe/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Loe/d;->f()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0}, Loe/d;->i()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v0}, Loe/d;->l()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    if-le v2, v3, :cond_1

    .line 29
    .line 30
    :cond_0
    if-gez v0, :cond_3

    .line 31
    .line 32
    if-gt v3, v2, :cond_3

    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object v4, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 35
    .line 36
    aget-object v4, v4, v2

    .line 37
    .line 38
    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_2
    if-eq v2, v3, :cond_3

    .line 47
    .line 48
    add-int/2addr v2, v0

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    return v1
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Loe/j;->x(II)Loe/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v0, v1}, Loe/j;->v(Loe/d;I)Loe/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Loe/d;->f()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Loe/d;->i()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Loe/d;->l()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    if-le v1, v2, :cond_1

    .line 29
    .line 30
    :cond_0
    if-gez v0, :cond_3

    .line 31
    .line 32
    if-gt v2, v1, :cond_3

    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-direct {p0, v1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-direct {p0, v1}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_2
    if-eq v1, v2, :cond_3

    .line 50
    .line 51
    add-int/2addr v1, v0

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    const/4 p1, 0x0

    .line 54
    return-object p1
.end method

.method private final h(Ljava/lang/Object;Ljava/lang/Object;)Ld0/t$b;
    .locals 5

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Loe/j;->x(II)Loe/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {v0, v2}, Loe/j;->v(Loe/d;I)Loe/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Loe/d;->f()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0}, Loe/d;->i()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v0}, Loe/d;->l()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    if-le v2, v3, :cond_1

    .line 29
    .line 30
    :cond_0
    if-gez v0, :cond_4

    .line 31
    .line 32
    if-gt v3, v2, :cond_4

    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-direct {p0, v2}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    invoke-direct {p0, v2}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p2, p1, :cond_2

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return-object p1

    .line 52
    :cond_2
    iget-object p1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 53
    .line 54
    array-length v0, p1

    .line 55
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "copyOf(...)"

    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    aput-object p2, p1, v2

    .line 67
    .line 68
    new-instance p2, Ld0/t;

    .line 69
    .line 70
    invoke-direct {p2, v1, v1, p1}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p2}, Ld0/t;->c()Ld0/t$b;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :cond_3
    if-eq v2, v3, :cond_4

    .line 79
    .line 80
    add-int/2addr v2, v0

    .line 81
    goto :goto_0

    .line 82
    :cond_4
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static {v0, v1, p1, p2}, Ld0/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance p2, Ld0/t;

    .line 89
    .line 90
    invoke-direct {p2, v1, v1, p1}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p2}, Ld0/t;->b()Ld0/t$b;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1
.end method

.method private final i(Ljava/lang/Object;)Ld0/t;
    .locals 4

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Loe/j;->x(II)Loe/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v0, v1}, Loe/j;->v(Loe/d;I)Loe/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Loe/d;->f()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Loe/d;->i()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Loe/d;->l()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    if-le v1, v2, :cond_1

    .line 29
    .line 30
    :cond_0
    if-gez v0, :cond_3

    .line 31
    .line 32
    if-gt v2, v1, :cond_3

    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-direct {p0, v1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-direct {p0, v1}, Ld0/t;->j(I)Ld0/t;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_2
    if-eq v1, v2, :cond_3

    .line 50
    .line 51
    add-int/2addr v1, v0

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-object p0
.end method

.method private final j(I)Ld0/t;
    .locals 3

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-ne v1, v2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-static {v0, p1}, Ld0/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Ld0/t;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1, v1, p1}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method private final l(Ld0/t;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget v1, p0, Ld0/t;->b:I

    .line 6
    .line 7
    iget v2, p1, Ld0/t;->b:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    return v3

    .line 13
    :cond_1
    iget v1, p0, Ld0/t;->a:I

    .line 14
    .line 15
    iget v2, p1, Ld0/t;->a:I

    .line 16
    .line 17
    if-eq v1, v2, :cond_2

    .line 18
    .line 19
    return v3

    .line 20
    :cond_2
    iget-object v1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 21
    .line 22
    array-length v1, v1

    .line 23
    move v2, v3

    .line 24
    :goto_0
    if-ge v2, v1, :cond_4

    .line 25
    .line 26
    iget-object v4, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object v4, v4, v2

    .line 29
    .line 30
    iget-object v5, p1, Ld0/t;->d:[Ljava/lang/Object;

    .line 31
    .line 32
    aget-object v5, v5, v2

    .line 33
    .line 34
    if-eq v4, v5, :cond_3

    .line 35
    .line 36
    return v3

    .line 37
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    return v0
.end method

.method private final r(I)Z
    .locals 1

    .line 1
    iget v0, p0, Ld0/t;->b:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method private final s(ILjava/lang/Object;Ljava/lang/Object;)Ld0/t;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ld0/t;->n(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v1, v0, p2, p3}, Ld0/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    new-instance p3, Ld0/t;

    .line 12
    .line 13
    iget v0, p0, Ld0/t;->a:I

    .line 14
    .line 15
    or-int/2addr p1, v0

    .line 16
    iget v0, p0, Ld0/t;->b:I

    .line 17
    .line 18
    invoke-direct {p3, p1, v0, p2}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object p3
.end method

.method private final t(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method private final u(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILf0/e;)Ld0/t;
    .locals 12

    .line 1
    move-object/from16 v5, p5

    .line 2
    .line 3
    move-object/from16 v6, p6

    .line 4
    .line 5
    move/from16 v0, p7

    .line 6
    .line 7
    move-object/from16 v8, p8

    .line 8
    .line 9
    const/16 v1, 0x1e

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    new-instance p1, Ld0/t;

    .line 15
    .line 16
    filled-new-array {p2, p3, v5, v6}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-direct {p1, v9, v9, p2, v8}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-static {p1, v0}, Ld0/x;->f(II)I

    .line 25
    .line 26
    .line 27
    move-result v10

    .line 28
    move/from16 v4, p4

    .line 29
    .line 30
    invoke-static {v4, v0}, Ld0/x;->f(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v11, 0x1

    .line 35
    if-eq v10, v1, :cond_2

    .line 36
    .line 37
    const/4 p1, 0x3

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x4

    .line 40
    if-ge v10, v1, :cond_1

    .line 41
    .line 42
    new-array v2, v2, [Ljava/lang/Object;

    .line 43
    .line 44
    aput-object p2, v2, v9

    .line 45
    .line 46
    aput-object p3, v2, v11

    .line 47
    .line 48
    aput-object v5, v2, v0

    .line 49
    .line 50
    aput-object v6, v2, p1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 54
    .line 55
    aput-object v5, v2, v9

    .line 56
    .line 57
    aput-object v6, v2, v11

    .line 58
    .line 59
    aput-object p2, v2, v0

    .line 60
    .line 61
    aput-object p3, v2, p1

    .line 62
    .line 63
    :goto_0
    new-instance p1, Ld0/t;

    .line 64
    .line 65
    shl-int p2, v11, v10

    .line 66
    .line 67
    shl-int p3, v11, v1

    .line 68
    .line 69
    or-int/2addr p2, p3

    .line 70
    invoke-direct {p1, p2, v9, v2, v8}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_2
    add-int/lit8 v7, v0, 0x5

    .line 75
    .line 76
    move-object v0, p0

    .line 77
    move v1, p1

    .line 78
    move-object v2, p2

    .line 79
    move-object v3, p3

    .line 80
    invoke-direct/range {v0 .. v8}, Ld0/t;->u(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILf0/e;)Ld0/t;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance p2, Ld0/t;

    .line 85
    .line 86
    shl-int p3, v11, v10

    .line 87
    .line 88
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-direct {p2, v9, p3, p1, v8}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 93
    .line 94
    .line 95
    return-object p2
.end method

.method private final v(IIILjava/lang/Object;Ljava/lang/Object;I)Ld0/t;
    .locals 8

    .line 1
    const/4 v7, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    move v6, p6

    .line 9
    invoke-direct/range {v0 .. v7}, Ld0/t;->d(IIILjava/lang/Object;Ljava/lang/Object;ILf0/e;)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance p2, Ld0/t;

    .line 14
    .line 15
    iget p3, v0, Ld0/t;->a:I

    .line 16
    .line 17
    xor-int/2addr p3, v2

    .line 18
    iget p4, v0, Ld0/t;->b:I

    .line 19
    .line 20
    or-int/2addr p4, v2

    .line 21
    invoke-direct {p2, p3, p4, p1}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p2
.end method

.method private final w(Ljava/lang/Object;Ljava/lang/Object;Ld0/f;)Ld0/t;
    .locals 5

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Loe/j;->x(II)Loe/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {v0, v2}, Loe/j;->v(Loe/d;I)Loe/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Loe/d;->f()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0}, Loe/d;->i()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v0}, Loe/d;->l()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    if-le v2, v3, :cond_1

    .line 29
    .line 30
    :cond_0
    if-gez v0, :cond_4

    .line 31
    .line 32
    if-gt v3, v2, :cond_4

    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-direct {p0, v2}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    invoke-direct {p0, v2}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p3, p1}, Ld0/f;->l(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Ld0/t;->c:Lf0/e;

    .line 52
    .line 53
    invoke-virtual {p3}, Ld0/f;->j()Lf0/e;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-ne p1, v0, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    aput-object p2, p1, v2

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_2
    invoke-virtual {p3}, Ld0/f;->g()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    add-int/lit8 p1, p1, 0x1

    .line 71
    .line 72
    invoke-virtual {p3, p1}, Ld0/f;->k(I)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 76
    .line 77
    array-length v0, p1

    .line 78
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v0, "copyOf(...)"

    .line 83
    .line 84
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    aput-object p2, p1, v2

    .line 90
    .line 91
    new-instance p2, Ld0/t;

    .line 92
    .line 93
    invoke-virtual {p3}, Ld0/f;->j()Lf0/e;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    invoke-direct {p2, v1, v1, p1, p3}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 98
    .line 99
    .line 100
    return-object p2

    .line 101
    :cond_3
    if-eq v2, v3, :cond_4

    .line 102
    .line 103
    add-int/2addr v2, v0

    .line 104
    goto :goto_0

    .line 105
    :cond_4
    invoke-virtual {p3}, LUd/i;->size()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    add-int/lit8 v0, v0, 0x1

    .line 110
    .line 111
    invoke-virtual {p3, v0}, Ld0/f;->n(I)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 115
    .line 116
    invoke-static {v0, v1, p1, p2}, Ld0/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance p2, Ld0/t;

    .line 121
    .line 122
    invoke-virtual {p3}, Ld0/f;->j()Lf0/e;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    invoke-direct {p2, v1, v1, p1, p3}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 127
    .line 128
    .line 129
    return-object p2
.end method

.method private final x(Ld0/t;Lf0/b;Lf0/e;)Ld0/t;
    .locals 11

    .line 1
    iget v0, p0, Ld0/t;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    invoke-static {v0}, Lf0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Ld0/t;->a:I

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v0, v2

    .line 20
    :goto_1
    invoke-static {v0}, Lf0/a;->a(Z)V

    .line 21
    .line 22
    .line 23
    iget v0, p1, Ld0/t;->b:I

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move v0, v2

    .line 30
    :goto_2
    invoke-static {v0}, Lf0/a;->a(Z)V

    .line 31
    .line 32
    .line 33
    iget v0, p1, Ld0/t;->a:I

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    move v0, v1

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move v0, v2

    .line 40
    :goto_3
    invoke-static {v0}, Lf0/a;->a(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 44
    .line 45
    array-length v3, v0

    .line 46
    iget-object v4, p1, Ld0/t;->d:[Ljava/lang/Object;

    .line 47
    .line 48
    array-length v4, v4

    .line 49
    add-int/2addr v3, v4

    .line 50
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v3, "copyOf(...)"

    .line 55
    .line 56
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v4, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 60
    .line 61
    array-length v4, v4

    .line 62
    iget-object v5, p1, Ld0/t;->d:[Ljava/lang/Object;

    .line 63
    .line 64
    array-length v5, v5

    .line 65
    invoke-static {v2, v5}, Loe/j;->x(II)Loe/f;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const/4 v6, 0x2

    .line 70
    invoke-static {v5, v6}, Loe/j;->v(Loe/d;I)Loe/d;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v5}, Loe/d;->f()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-virtual {v5}, Loe/d;->i()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    invoke-virtual {v5}, Loe/d;->l()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-lez v5, :cond_4

    .line 87
    .line 88
    if-le v6, v7, :cond_5

    .line 89
    .line 90
    :cond_4
    if-gez v5, :cond_7

    .line 91
    .line 92
    if-gt v7, v6, :cond_7

    .line 93
    .line 94
    :cond_5
    :goto_4
    iget-object v8, p1, Ld0/t;->d:[Ljava/lang/Object;

    .line 95
    .line 96
    aget-object v8, v8, v6

    .line 97
    .line 98
    invoke-direct {p0, v8}, Ld0/t;->f(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-nez v8, :cond_6

    .line 103
    .line 104
    iget-object v8, p1, Ld0/t;->d:[Ljava/lang/Object;

    .line 105
    .line 106
    aget-object v9, v8, v6

    .line 107
    .line 108
    aput-object v9, v0, v4

    .line 109
    .line 110
    add-int/lit8 v9, v4, 0x1

    .line 111
    .line 112
    add-int/lit8 v10, v6, 0x1

    .line 113
    .line 114
    aget-object v8, v8, v10

    .line 115
    .line 116
    aput-object v8, v0, v9

    .line 117
    .line 118
    add-int/lit8 v4, v4, 0x2

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    invoke-virtual {p2}, Lf0/b;->a()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    add-int/2addr v8, v1

    .line 126
    invoke-virtual {p2, v8}, Lf0/b;->c(I)V

    .line 127
    .line 128
    .line 129
    :goto_5
    if-eq v6, v7, :cond_7

    .line 130
    .line 131
    add-int/2addr v6, v5

    .line 132
    goto :goto_4

    .line 133
    :cond_7
    iget-object p2, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 134
    .line 135
    array-length p2, p2

    .line 136
    if-ne v4, p2, :cond_8

    .line 137
    .line 138
    return-object p0

    .line 139
    :cond_8
    iget-object p2, p1, Ld0/t;->d:[Ljava/lang/Object;

    .line 140
    .line 141
    array-length p2, p2

    .line 142
    if-ne v4, p2, :cond_9

    .line 143
    .line 144
    return-object p1

    .line 145
    :cond_9
    array-length p1, v0

    .line 146
    if-ne v4, p1, :cond_a

    .line 147
    .line 148
    new-instance p1, Ld0/t;

    .line 149
    .line 150
    invoke-direct {p1, v2, v2, v0, p3}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 151
    .line 152
    .line 153
    return-object p1

    .line 154
    :cond_a
    new-instance p1, Ld0/t;

    .line 155
    .line 156
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-direct {p1, v2, v2, p2, p3}, Ld0/t;-><init>(II[Ljava/lang/Object;Lf0/e;)V

    .line 164
    .line 165
    .line 166
    return-object p1
.end method

.method private final y(Ljava/lang/Object;Ld0/f;)Ld0/t;
    .locals 4

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Loe/j;->x(II)Loe/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v0, v1}, Loe/j;->v(Loe/d;I)Loe/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Loe/d;->f()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Loe/d;->i()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Loe/d;->l()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    if-le v1, v2, :cond_1

    .line 29
    .line 30
    :cond_0
    if-gez v0, :cond_3

    .line 31
    .line 32
    if-gt v2, v1, :cond_3

    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-direct {p0, v1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-direct {p0, v1, p2}, Ld0/t;->A(ILd0/f;)Ld0/t;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_2
    if-eq v1, v2, :cond_3

    .line 50
    .line 51
    add-int/2addr v1, v0

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-object p0
.end method

.method private final z(Ljava/lang/Object;Ljava/lang/Object;Ld0/f;)Ld0/t;
    .locals 4

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Loe/j;->x(II)Loe/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v0, v1}, Loe/j;->v(Loe/d;I)Loe/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Loe/d;->f()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Loe/d;->i()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Loe/d;->l()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    if-le v1, v2, :cond_1

    .line 29
    .line 30
    :cond_0
    if-gez v0, :cond_3

    .line 31
    .line 32
    if-gt v2, v1, :cond_3

    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-direct {p0, v1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-direct {p0, v1}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    invoke-direct {p0, v1, p3}, Ld0/t;->A(ILd0/f;)Ld0/t;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :cond_2
    if-eq v1, v2, :cond_3

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    return-object p0
.end method


# virtual methods
.method public final D(ILjava/lang/Object;Ljava/lang/Object;ILd0/f;)Ld0/t;
    .locals 10

    .line 1
    invoke-static {p1, p4}, Ld0/x;->f(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    shl-int v4, v1, v0

    .line 7
    .line 8
    invoke-virtual {p0, v4}, Ld0/t;->q(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v4}, Ld0/t;->n(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-direct {p0, v3}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-direct {p0, v3}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p5, p1}, Ld0/f;->l(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v3}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, p3, :cond_0

    .line 40
    .line 41
    move-object v2, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-direct {p0, v3, p3, p5}, Ld0/t;->M(ILjava/lang/Object;Ld0/f;)Ld0/t;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_1
    invoke-virtual {p5}, LUd/i;->size()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/2addr v0, v1

    .line 53
    invoke-virtual {p5, v0}, Ld0/f;->n(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p5}, Ld0/f;->j()Lf0/e;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    move-object v2, p0

    .line 61
    move v5, p1

    .line 62
    move-object v6, p2

    .line 63
    move-object v7, p3

    .line 64
    move v8, p4

    .line 65
    invoke-direct/range {v2 .. v9}, Ld0/t;->C(IIILjava/lang/Object;Ljava/lang/Object;ILf0/e;)Ld0/t;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :cond_2
    move v2, v4

    .line 71
    move v4, p1

    .line 72
    move p1, v2

    .line 73
    move-object v2, p0

    .line 74
    move-object v5, p2

    .line 75
    move-object v6, p3

    .line 76
    move v8, p4

    .line 77
    invoke-direct {p0, p1}, Ld0/t;->r(I)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Ld0/t;->O(I)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {p0, p1}, Ld0/t;->N(I)Ld0/t;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    const/16 p2, 0x1e

    .line 92
    .line 93
    if-ne v8, p2, :cond_3

    .line 94
    .line 95
    invoke-direct {v3, v5, v6, p5}, Ld0/t;->w(Ljava/lang/Object;Ljava/lang/Object;Ld0/f;)Ld0/t;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    move-object v8, p5

    .line 100
    goto :goto_0

    .line 101
    :cond_3
    add-int/lit8 v7, v8, 0x5

    .line 102
    .line 103
    move-object v8, p5

    .line 104
    invoke-virtual/range {v3 .. v8}, Ld0/t;->D(ILjava/lang/Object;Ljava/lang/Object;ILd0/f;)Ld0/t;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    :goto_0
    if-ne v3, p2, :cond_4

    .line 109
    .line 110
    :goto_1
    return-object v2

    .line 111
    :cond_4
    invoke-virtual {v8}, Ld0/f;->j()Lf0/e;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-direct {p0, p1, p2, p3}, Ld0/t;->L(ILd0/t;Lf0/e;)Ld0/t;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :cond_5
    move-object v8, p5

    .line 121
    invoke-virtual {v8}, LUd/i;->size()I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    add-int/2addr p2, v1

    .line 126
    invoke-virtual {v8, p2}, Ld0/f;->n(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8}, Ld0/f;->j()Lf0/e;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-direct {p0, p1, v5, v6, p2}, Ld0/t;->B(ILjava/lang/Object;Ljava/lang/Object;Lf0/e;)Ld0/t;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1
.end method

.method public final E(Ld0/t;ILf0/b;Ld0/f;)Ld0/t;
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    if-ne p0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ld0/t;->e()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {v4, v0}, Lf0/b;->b(I)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/16 v0, 0x1e

    .line 16
    .line 17
    move/from16 v3, p2

    .line 18
    .line 19
    if-le v3, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual/range {p4 .. p4}, Ld0/f;->j()Lf0/e;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p0, v1, v4, v0}, Ld0/t;->x(Ld0/t;Lf0/b;Lf0/e;)Ld0/t;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_1
    iget v0, p0, Ld0/t;->b:I

    .line 31
    .line 32
    iget v2, v1, Ld0/t;->b:I

    .line 33
    .line 34
    or-int/2addr v0, v2

    .line 35
    iget v2, p0, Ld0/t;->a:I

    .line 36
    .line 37
    iget v5, v1, Ld0/t;->a:I

    .line 38
    .line 39
    xor-int v6, v2, v5

    .line 40
    .line 41
    not-int v7, v0

    .line 42
    and-int/2addr v6, v7

    .line 43
    and-int/2addr v2, v5

    .line 44
    :goto_0
    if-eqz v2, :cond_3

    .line 45
    .line 46
    invoke-static {v2}, Ljava/lang/Integer;->lowestOneBit(I)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {p0, v5}, Ld0/t;->n(I)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    invoke-direct {p0, v7}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v1, v5}, Ld0/t;->n(I)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    invoke-direct {v1, v8}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_2

    .line 71
    .line 72
    or-int/2addr v6, v5

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    or-int/2addr v0, v5

    .line 75
    :goto_1
    xor-int/2addr v2, v5

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    and-int v2, v0, v6

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x1

    .line 81
    if-nez v2, :cond_4

    .line 82
    .line 83
    move v2, v8

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    move v2, v7

    .line 86
    :goto_2
    if-nez v2, :cond_5

    .line 87
    .line 88
    const-string v2, "Check failed."

    .line 89
    .line 90
    invoke-static {v2}, LY/V0;->b(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    iget-object v2, p0, Ld0/t;->c:Lf0/e;

    .line 94
    .line 95
    invoke-virtual/range {p4 .. p4}, Ld0/f;->j()Lf0/e;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_6

    .line 104
    .line 105
    iget v2, p0, Ld0/t;->a:I

    .line 106
    .line 107
    if-ne v2, v6, :cond_6

    .line 108
    .line 109
    iget v2, p0, Ld0/t;->b:I

    .line 110
    .line 111
    if-ne v2, v0, :cond_6

    .line 112
    .line 113
    move-object v9, p0

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    mul-int/lit8 v2, v2, 0x2

    .line 120
    .line 121
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    add-int/2addr v2, v5

    .line 126
    new-array v2, v2, [Ljava/lang/Object;

    .line 127
    .line 128
    new-instance v5, Ld0/t;

    .line 129
    .line 130
    invoke-direct {v5, v6, v0, v2}, Ld0/t;-><init>(II[Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move-object v9, v5

    .line 134
    :goto_3
    move v10, v0

    .line 135
    move v11, v7

    .line 136
    :goto_4
    if-eqz v10, :cond_7

    .line 137
    .line 138
    invoke-static {v10}, Ljava/lang/Integer;->lowestOneBit(I)I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    iget-object v12, v9, Ld0/t;->d:[Ljava/lang/Object;

    .line 143
    .line 144
    array-length v0, v12

    .line 145
    sub-int/2addr v0, v8

    .line 146
    sub-int v13, v0, v11

    .line 147
    .line 148
    move-object v0, p0

    .line 149
    move-object/from16 v5, p4

    .line 150
    .line 151
    invoke-direct/range {v0 .. v5}, Ld0/t;->F(Ld0/t;IILf0/b;Ld0/f;)Ld0/t;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    aput-object v14, v12, v13

    .line 156
    .line 157
    add-int/2addr v11, v8

    .line 158
    xor-int/2addr v10, v2

    .line 159
    move/from16 v3, p2

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_7
    :goto_5
    if-eqz v6, :cond_a

    .line 163
    .line 164
    invoke-static {v6}, Ljava/lang/Integer;->lowestOneBit(I)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    mul-int/lit8 v3, v7, 0x2

    .line 169
    .line 170
    invoke-virtual {v1, v2}, Ld0/t;->q(I)Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-nez v5, :cond_8

    .line 175
    .line 176
    invoke-virtual {p0, v2}, Ld0/t;->n(I)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    iget-object v10, v9, Ld0/t;->d:[Ljava/lang/Object;

    .line 181
    .line 182
    invoke-direct {p0, v5}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    aput-object v11, v10, v3

    .line 187
    .line 188
    iget-object v10, v9, Ld0/t;->d:[Ljava/lang/Object;

    .line 189
    .line 190
    add-int/lit8 v3, v3, 0x1

    .line 191
    .line 192
    invoke-direct {p0, v5}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    aput-object v5, v10, v3

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_8
    invoke-virtual {v1, v2}, Ld0/t;->n(I)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    iget-object v10, v9, Ld0/t;->d:[Ljava/lang/Object;

    .line 204
    .line 205
    invoke-direct {v1, v5}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    aput-object v11, v10, v3

    .line 210
    .line 211
    iget-object v10, v9, Ld0/t;->d:[Ljava/lang/Object;

    .line 212
    .line 213
    add-int/lit8 v3, v3, 0x1

    .line 214
    .line 215
    invoke-direct {v1, v5}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    aput-object v5, v10, v3

    .line 220
    .line 221
    invoke-virtual {p0, v2}, Ld0/t;->q(I)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_9

    .line 226
    .line 227
    invoke-virtual {v4}, Lf0/b;->a()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    add-int/2addr v3, v8

    .line 232
    invoke-virtual {v4, v3}, Lf0/b;->c(I)V

    .line 233
    .line 234
    .line 235
    :cond_9
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 236
    .line 237
    xor-int/2addr v6, v2

    .line 238
    goto :goto_5

    .line 239
    :cond_a
    invoke-direct {p0, v9}, Ld0/t;->l(Ld0/t;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_b

    .line 244
    .line 245
    return-object p0

    .line 246
    :cond_b
    invoke-direct {v1, v9}, Ld0/t;->l(Ld0/t;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_c

    .line 251
    .line 252
    return-object v1

    .line 253
    :cond_c
    return-object v9
.end method

.method public final G(ILjava/lang/Object;ILd0/f;)Ld0/t;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, p3}, Ld0/x;->f(II)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    shl-int v6, v0, v1

    .line 7
    .line 8
    invoke-virtual {p0, v6}, Ld0/t;->q(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v6}, Ld0/t;->n(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-direct {p0, p1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-direct {p0, p1, v6, p4}, Ld0/t;->I(IILd0/f;)Ld0/t;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    move-object v2, p0

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    invoke-direct {p0, v6}, Ld0/t;->r(I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0, v6}, Ld0/t;->O(I)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-virtual {p0, v5}, Ld0/t;->N(I)Ld0/t;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const/16 v0, 0x1e

    .line 50
    .line 51
    if-ne p3, v0, :cond_2

    .line 52
    .line 53
    invoke-direct {v3, p2, p4}, Ld0/t;->y(Ljava/lang/Object;Ld0/f;)Ld0/t;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :goto_0
    move-object v4, p1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    add-int/lit8 p3, p3, 0x5

    .line 60
    .line 61
    invoke-virtual {v3, p1, p2, p3, p4}, Ld0/t;->G(ILjava/lang/Object;ILd0/f;)Ld0/t;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    goto :goto_0

    .line 66
    :goto_1
    invoke-virtual {p4}, Ld0/f;->j()Lf0/e;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    move-object v2, p0

    .line 71
    invoke-direct/range {v2 .. v7}, Ld0/t;->K(Ld0/t;Ld0/t;IILf0/e;)Ld0/t;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :goto_2
    return-object v2
.end method

.method public final H(ILjava/lang/Object;Ljava/lang/Object;ILd0/f;)Ld0/t;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, p4}, Ld0/x;->f(II)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    shl-int v6, v0, v1

    .line 7
    .line 8
    invoke-virtual {p0, v6}, Ld0/t;->q(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v6}, Ld0/t;->n(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-direct {p0, p1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, p1, v6, p5}, Ld0/t;->I(IILd0/f;)Ld0/t;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_0
    invoke-direct {p0, v6}, Ld0/t;->r(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, v6}, Ld0/t;->O(I)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual {p0, v7}, Ld0/t;->N(I)Ld0/t;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/16 v1, 0x1e

    .line 58
    .line 59
    if-ne p4, v1, :cond_1

    .line 60
    .line 61
    invoke-direct {v0, p2, p3, p5}, Ld0/t;->z(Ljava/lang/Object;Ljava/lang/Object;Ld0/f;)Ld0/t;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    move-object v4, p1

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    add-int/lit8 v4, p4, 0x5

    .line 68
    .line 69
    move v1, p1

    .line 70
    move-object v2, p2

    .line 71
    move-object v3, p3

    .line 72
    move-object v5, p5

    .line 73
    invoke-virtual/range {v0 .. v5}, Ld0/t;->H(ILjava/lang/Object;Ljava/lang/Object;ILd0/f;)Ld0/t;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    goto :goto_0

    .line 78
    :goto_1
    invoke-virtual {p5}, Ld0/f;->j()Lf0/e;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    move-object v2, p0

    .line 83
    move-object v3, v0

    .line 84
    move v5, v7

    .line 85
    move-object v7, p1

    .line 86
    invoke-direct/range {v2 .. v7}, Ld0/t;->K(Ld0/t;Ld0/t;IILf0/e;)Ld0/t;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :cond_2
    return-object p0
.end method

.method public final N(I)Ld0/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Ld0/t;

    .line 11
    .line 12
    return-object p1
.end method

.method public final O(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iget v1, p0, Ld0/t;->b:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, -0x1

    .line 9
    .line 10
    and-int/2addr p1, v1

    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    sub-int/2addr v0, p1

    .line 16
    return v0
.end method

.method public final P(ILjava/lang/Object;Ljava/lang/Object;I)Ld0/t$b;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, p4}, Ld0/x;->f(II)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    shl-int v4, v0, v1

    .line 7
    .line 8
    invoke-virtual {p0, v4}, Ld0/t;->q(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, v4}, Ld0/t;->n(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {p0, v3}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-direct {p0, v3}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-ne p1, p3, :cond_0

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_0
    invoke-direct {p0, v3, p3}, Ld0/t;->V(ILjava/lang/Object;)Ld0/t;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p1}, Ld0/t;->c()Ld0/t$b;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    move-object v2, p0

    .line 46
    move v5, p1

    .line 47
    move-object v6, p2

    .line 48
    move-object v7, p3

    .line 49
    move v8, p4

    .line 50
    invoke-direct/range {v2 .. v8}, Ld0/t;->v(IIILjava/lang/Object;Ljava/lang/Object;I)Ld0/t;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p1}, Ld0/t;->b()Ld0/t$b;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :cond_2
    move-object v2, p0

    .line 60
    move v5, p1

    .line 61
    move-object v6, p2

    .line 62
    move-object v7, p3

    .line 63
    move v8, p4

    .line 64
    invoke-direct {p0, v4}, Ld0/t;->r(I)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    invoke-virtual {p0, v4}, Ld0/t;->O(I)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p0, p1}, Ld0/t;->N(I)Ld0/t;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    const/16 p3, 0x1e

    .line 79
    .line 80
    if-ne v8, p3, :cond_3

    .line 81
    .line 82
    invoke-direct {p2, v6, v7}, Ld0/t;->h(Ljava/lang/Object;Ljava/lang/Object;)Ld0/t$b;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-nez p2, :cond_4

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_3
    add-int/lit8 p4, v8, 0x5

    .line 90
    .line 91
    invoke-virtual {p2, v5, v6, v7, p4}, Ld0/t;->P(ILjava/lang/Object;Ljava/lang/Object;I)Ld0/t$b;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-nez p2, :cond_4

    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_4
    invoke-virtual {p2}, Ld0/t$b;->a()Ld0/t;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    invoke-direct {p0, p1, v4, p3}, Ld0/t;->U(IILd0/t;)Ld0/t;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p2, p1}, Ld0/t$b;->c(Ld0/t;)V

    .line 107
    .line 108
    .line 109
    return-object p2

    .line 110
    :cond_5
    invoke-direct {p0, v4, v6, v7}, Ld0/t;->s(ILjava/lang/Object;Ljava/lang/Object;)Ld0/t;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {p1}, Ld0/t;->b()Ld0/t$b;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    return-object p1
.end method

.method public final Q(ILjava/lang/Object;I)Ld0/t;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, p3}, Ld0/x;->f(II)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    shl-int/2addr v0, v1

    .line 7
    invoke-virtual {p0, v0}, Ld0/t;->q(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ld0/t;->n(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-direct {p0, p1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    invoke-direct {p0, p1, v0}, Ld0/t;->R(II)Ld0/t;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    invoke-direct {p0, v0}, Ld0/t;->r(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ld0/t;->O(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0, v1}, Ld0/t;->N(I)Ld0/t;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/16 v3, 0x1e

    .line 47
    .line 48
    if-ne p3, v3, :cond_1

    .line 49
    .line 50
    invoke-direct {v2, p2}, Ld0/t;->i(Ljava/lang/Object;)Ld0/t;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    add-int/lit8 p3, p3, 0x5

    .line 56
    .line 57
    invoke-virtual {v2, p1, p2, p3}, Ld0/t;->Q(ILjava/lang/Object;I)Ld0/t;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_0
    invoke-direct {p0, v2, p1, v1, v0}, Ld0/t;->T(Ld0/t;Ld0/t;II)Ld0/t;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_2
    return-object p0
.end method

.method public final k(ILjava/lang/Object;I)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, p3}, Ld0/x;->f(II)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    shl-int/2addr v0, v1

    .line 7
    invoke-virtual {p0, v0}, Ld0/t;->q(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ld0/t;->n(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-direct {p0, p1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    invoke-direct {p0, v0}, Ld0/t;->r(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ld0/t;->O(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p0, v0}, Ld0/t;->N(I)Ld0/t;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/16 v1, 0x1e

    .line 41
    .line 42
    if-ne p3, v1, :cond_1

    .line 43
    .line 44
    invoke-direct {v0, p2}, Ld0/t;->f(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_1
    add-int/lit8 p3, p3, 0x5

    .line 50
    .line 51
    invoke-virtual {v0, p1, p2, p3}, Ld0/t;->k(ILjava/lang/Object;I)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1

    .line 56
    :cond_2
    const/4 p1, 0x0

    .line 57
    return p1
.end method

.method public final m()I
    .locals 1

    .line 1
    iget v0, p0, Ld0/t;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final n(I)I
    .locals 1

    .line 1
    iget v0, p0, Ld0/t;->a:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    and-int/2addr p1, v0

    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    mul-int/lit8 p1, p1, 0x2

    .line 11
    .line 12
    return p1
.end method

.method public final o(ILjava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, p3}, Ld0/x;->f(II)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    shl-int/2addr v0, v1

    .line 7
    invoke-virtual {p0, v0}, Ld0/t;->q(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ld0/t;->n(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-direct {p0, p1}, Ld0/t;->t(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ld0/t;->W(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    return-object v2

    .line 34
    :cond_1
    invoke-direct {p0, v0}, Ld0/t;->r(I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ld0/t;->O(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p0, v0}, Ld0/t;->N(I)Ld0/t;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/16 v1, 0x1e

    .line 49
    .line 50
    if-ne p3, v1, :cond_2

    .line 51
    .line 52
    invoke-direct {v0, p2}, Ld0/t;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_2
    add-int/lit8 p3, p3, 0x5

    .line 58
    .line 59
    invoke-virtual {v0, p1, p2, p3}, Ld0/t;->o(ILjava/lang/Object;I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_3
    return-object v2
.end method

.method public final p()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/t;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q(I)Z
    .locals 1

    .line 1
    iget v0, p0, Ld0/t;->a:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method
