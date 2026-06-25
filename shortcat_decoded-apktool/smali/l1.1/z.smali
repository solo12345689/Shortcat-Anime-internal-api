.class public Ll1/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lu1/b$b;
.implements Ll1/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/z$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Lt1/f;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;

.field private final e:Ljava/util/Map;

.field private final f:Ll1/C;

.field private final g:[I

.field private final h:[I

.field private i:F

.field private j:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Li1/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Ll1/z;->a:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Lt1/f;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1, v1}, Lt1/f;-><init>(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lt1/f;->S1(Lu1/b$b;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ll1/z;->b:Lt1/f;

    .line 18
    .line 19
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ll1/z;->c:Ljava/util/Map;

    .line 25
    .line 26
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Ll1/z;->d:Ljava/util/Map;

    .line 32
    .line 33
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Ll1/z;->e:Ljava/util/Map;

    .line 39
    .line 40
    new-instance v0, Ll1/C;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Ll1/C;-><init>(Li1/d;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Ll1/z;->f:Ll1/C;

    .line 46
    .line 47
    const/4 p1, 0x2

    .line 48
    new-array v0, p1, [I

    .line 49
    .line 50
    iput-object v0, p0, Ll1/z;->g:[I

    .line 51
    .line 52
    new-array p1, p1, [I

    .line 53
    .line 54
    iput-object p1, p0, Ll1/z;->h:[I

    .line 55
    .line 56
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 57
    .line 58
    iput p1, p0, Ll1/z;->i:F

    .line 59
    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Ll1/z;->j:Ljava/util/ArrayList;

    .line 66
    .line 67
    return-void
.end method

.method private final e([Ljava/lang/Integer;Lu1/b$a;)V
    .locals 2

    .line 1
    iget v0, p2, Lu1/b$a;->e:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    aput-object v0, p1, v1

    .line 9
    .line 10
    iget v0, p2, Lu1/b$a;->f:I

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    aput-object v0, p1, v1

    .line 18
    .line 19
    iget p2, p2, Lu1/b$a;->g:I

    .line 20
    .line 21
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v0, 0x2

    .line 26
    aput-object p2, p1, v0

    .line 27
    .line 28
    return-void
.end method

.method private final f(Lt1/e;J)J
    .locals 5

    .line 1
    invoke-virtual {p1}, Lt1/e;->s()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, Lt1/e;->o:Ljava/lang/String;

    .line 6
    .line 7
    instance-of v2, p1, Lt1/l;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_4

    .line 11
    .line 12
    invoke-static {p2, p3}, Li1/b;->j(J)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v1, -0x80000000

    .line 17
    .line 18
    const/high16 v2, 0x40000000    # 2.0f

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p2, p3}, Li1/b;->h(J)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    move v0, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v0, v3

    .line 33
    :goto_0
    invoke-static {p2, p3}, Li1/b;->i(J)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    move v3, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static {p2, p3}, Li1/b;->g(J)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    move v3, v1

    .line 48
    :cond_3
    :goto_1
    check-cast p1, Lt1/l;

    .line 49
    .line 50
    invoke-static {p2, p3}, Li1/b;->l(J)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {p2, p3}, Li1/b;->k(J)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {p1, v0, v1, v3, p2}, Lt1/l;->y1(IIII)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lt1/l;->t1()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-virtual {p1}, Lt1/l;->s1()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p2, p1}, Lt/l;->a(II)J

    .line 70
    .line 71
    .line 72
    move-result-wide p1

    .line 73
    return-wide p1

    .line 74
    :cond_4
    instance-of p1, v0, LI0/A;

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    move-object p1, v0

    .line 79
    check-cast p1, LI0/A;

    .line 80
    .line 81
    invoke-interface {p1, p2, p3}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p2, p0, Ll1/z;->c:Ljava/util/Map;

    .line 86
    .line 87
    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->W0()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->P0()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-static {p2, p1}, Lt/l;->a(II)J

    .line 99
    .line 100
    .line 101
    move-result-wide p1

    .line 102
    return-wide p1

    .line 103
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string p2, "Nothing to measure for widget: "

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string p2, "CCL"

    .line 121
    .line 122
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    invoke-static {v3, v3}, Lt/l;->a(II)J

    .line 126
    .line 127
    .line 128
    move-result-wide p1

    .line 129
    return-wide p1
.end method

.method private final g(Lt1/e$b;IIIZZI[I)Z
    .locals 4

    .line 1
    sget-object v0, Ll1/z$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_b

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_a

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    const/4 p2, 0x4

    .line 20
    if-ne v0, p2, :cond_0

    .line 21
    .line 22
    aput p7, p8, v1

    .line 23
    .line 24
    aput p7, p8, v2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    new-instance p3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, " is not supported"

    .line 38
    .line 39
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2

    .line 54
    :cond_1
    invoke-static {}, Ll1/j;->a()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const-string v0, "CCL"

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    new-instance p1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v3, "Measure strategy "

    .line 68
    .line 69
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v3, "DW "

    .line 88
    .line 89
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    new-instance p1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v3, "ODR "

    .line 108
    .line 109
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    new-instance p1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v3, "IRH "

    .line 128
    .line 129
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    :cond_2
    if-nez p6, :cond_5

    .line 143
    .line 144
    sget p1, Lu1/b$a;->l:I

    .line 145
    .line 146
    if-eq p4, p1, :cond_3

    .line 147
    .line 148
    sget p1, Lu1/b$a;->m:I

    .line 149
    .line 150
    if-ne p4, p1, :cond_4

    .line 151
    .line 152
    :cond_3
    sget p1, Lu1/b$a;->m:I

    .line 153
    .line 154
    if-eq p4, p1, :cond_5

    .line 155
    .line 156
    if-ne p3, v2, :cond_5

    .line 157
    .line 158
    if-eqz p5, :cond_4

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_4
    move p1, v1

    .line 162
    goto :goto_1

    .line 163
    :cond_5
    :goto_0
    move p1, v2

    .line 164
    :goto_1
    invoke-static {}, Ll1/j;->a()Z

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    if-eqz p3, :cond_6

    .line 169
    .line 170
    new-instance p3, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string p4, "UD "

    .line 176
    .line 177
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    invoke-static {v0, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    :cond_6
    if-eqz p1, :cond_7

    .line 191
    .line 192
    move p3, p2

    .line 193
    goto :goto_2

    .line 194
    :cond_7
    move p3, v1

    .line 195
    :goto_2
    aput p3, p8, v1

    .line 196
    .line 197
    if-eqz p1, :cond_8

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_8
    move p2, p7

    .line 201
    :goto_3
    aput p2, p8, v2

    .line 202
    .line 203
    if-nez p1, :cond_9

    .line 204
    .line 205
    return v2

    .line 206
    :cond_9
    return v1

    .line 207
    :cond_a
    aput v1, p8, v1

    .line 208
    .line 209
    aput p7, p8, v2

    .line 210
    .line 211
    return v2

    .line 212
    :cond_b
    aput p2, p8, v1

    .line 213
    .line 214
    aput p2, p8, v2

    .line 215
    .line 216
    return v1
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Lt1/e;Lu1/b$a;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    const/4 v11, 0x0

    .line 8
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v12

    .line 12
    iget-object v13, v9, Lt1/e;->o:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {}, Ll1/j;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-string v14, "Measuring "

    .line 19
    .line 20
    const-string v15, "CCL"

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, " with: "

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {v9}, Ll1/j;->b(Lt1/e;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const/16 v2, 0xa

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v15, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    :cond_0
    iget-object v1, v0, Ll1/z;->d:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    move-object/from16 v16, v1

    .line 66
    .line 67
    check-cast v16, [Ljava/lang/Integer;

    .line 68
    .line 69
    iget-object v1, v10, Lu1/b$a;->a:Lt1/e$b;

    .line 70
    .line 71
    iget v2, v10, Lu1/b$a;->c:I

    .line 72
    .line 73
    iget v3, v9, Lt1/e;->w:I

    .line 74
    .line 75
    iget v4, v10, Lu1/b$a;->j:I

    .line 76
    .line 77
    const/16 v17, 0x1

    .line 78
    .line 79
    if-eqz v16, :cond_1

    .line 80
    .line 81
    aget-object v5, v16, v17

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move v5, v11

    .line 89
    :goto_0
    invoke-virtual {v9}, Lt1/e;->x()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-ne v5, v6, :cond_2

    .line 94
    .line 95
    move/from16 v5, v17

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    move v5, v11

    .line 99
    :goto_1
    invoke-virtual {v9}, Lt1/e;->m0()Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    iget-object v7, v0, Ll1/z;->f:Ll1/C;

    .line 104
    .line 105
    invoke-virtual {v7}, Ll1/C;->F()J

    .line 106
    .line 107
    .line 108
    move-result-wide v7

    .line 109
    invoke-static {v7, v8}, Li1/b;->l(J)I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    iget-object v8, v0, Ll1/z;->g:[I

    .line 114
    .line 115
    invoke-direct/range {v0 .. v8}, Ll1/z;->g(Lt1/e$b;IIIZZI[I)Z

    .line 116
    .line 117
    .line 118
    iget-object v1, v10, Lu1/b$a;->b:Lt1/e$b;

    .line 119
    .line 120
    iget v2, v10, Lu1/b$a;->d:I

    .line 121
    .line 122
    iget v3, v9, Lt1/e;->x:I

    .line 123
    .line 124
    iget v4, v10, Lu1/b$a;->j:I

    .line 125
    .line 126
    if-eqz v16, :cond_3

    .line 127
    .line 128
    aget-object v5, v16, v11

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    goto :goto_2

    .line 135
    :cond_3
    move v5, v11

    .line 136
    :goto_2
    invoke-virtual {v9}, Lt1/e;->V()I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-ne v5, v6, :cond_4

    .line 141
    .line 142
    move/from16 v5, v17

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    move v5, v11

    .line 146
    :goto_3
    invoke-virtual {v9}, Lt1/e;->n0()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    iget-object v7, v0, Ll1/z;->f:Ll1/C;

    .line 151
    .line 152
    invoke-virtual {v7}, Ll1/C;->F()J

    .line 153
    .line 154
    .line 155
    move-result-wide v7

    .line 156
    invoke-static {v7, v8}, Li1/b;->k(J)I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    iget-object v8, v0, Ll1/z;->h:[I

    .line 161
    .line 162
    invoke-direct/range {v0 .. v8}, Ll1/z;->g(Lt1/e$b;IIIZZI[I)Z

    .line 163
    .line 164
    .line 165
    iget-object v1, v0, Ll1/z;->g:[I

    .line 166
    .line 167
    aget v2, v1, v11

    .line 168
    .line 169
    aget v1, v1, v17

    .line 170
    .line 171
    iget-object v3, v0, Ll1/z;->h:[I

    .line 172
    .line 173
    aget v4, v3, v11

    .line 174
    .line 175
    aget v3, v3, v17

    .line 176
    .line 177
    invoke-static {v2, v1, v4, v3}, Li1/c;->a(IIII)J

    .line 178
    .line 179
    .line 180
    move-result-wide v1

    .line 181
    iget v3, v10, Lu1/b$a;->j:I

    .line 182
    .line 183
    sget v4, Lu1/b$a;->l:I

    .line 184
    .line 185
    if-eq v3, v4, :cond_5

    .line 186
    .line 187
    sget v4, Lu1/b$a;->m:I

    .line 188
    .line 189
    if-eq v3, v4, :cond_5

    .line 190
    .line 191
    iget-object v3, v10, Lu1/b$a;->a:Lt1/e$b;

    .line 192
    .line 193
    sget-object v4, Lt1/e$b;->c:Lt1/e$b;

    .line 194
    .line 195
    if-ne v3, v4, :cond_5

    .line 196
    .line 197
    iget v3, v9, Lt1/e;->w:I

    .line 198
    .line 199
    if-nez v3, :cond_5

    .line 200
    .line 201
    iget-object v3, v10, Lu1/b$a;->b:Lt1/e$b;

    .line 202
    .line 203
    if-ne v3, v4, :cond_5

    .line 204
    .line 205
    iget v3, v9, Lt1/e;->x:I

    .line 206
    .line 207
    if-eqz v3, :cond_f

    .line 208
    .line 209
    :cond_5
    invoke-static {}, Ll1/j;->a()Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    const-string v4, " with "

    .line 214
    .line 215
    if-eqz v3, :cond_6

    .line 216
    .line 217
    new-instance v3, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-static {v1, v2}, Li1/b;->q(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-static {v15, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    :cond_6
    invoke-direct {v0, v9, v1, v2}, Ll1/z;->f(Lt1/e;J)J

    .line 246
    .line 247
    .line 248
    move-result-wide v5

    .line 249
    invoke-virtual {v9, v11}, Lt1/e;->U0(Z)V

    .line 250
    .line 251
    .line 252
    invoke-static {}, Ll1/j;->a()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_7

    .line 257
    .line 258
    new-instance v3, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v7, " is size "

    .line 267
    .line 268
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-static {v5, v6}, Lt/l;->c(J)I

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    const/16 v7, 0x20

    .line 279
    .line 280
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-static {v5, v6}, Lt/l;->d(J)I

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-static {v15, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 295
    .line 296
    .line 297
    :cond_7
    invoke-static {v5, v6}, Lt/l;->c(J)I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    iget v7, v9, Lt1/e;->z:I

    .line 306
    .line 307
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 312
    .line 313
    .line 314
    move-result v8

    .line 315
    if-lez v8, :cond_8

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_8
    const/4 v7, 0x0

    .line 319
    :goto_4
    iget v8, v9, Lt1/e;->A:I

    .line 320
    .line 321
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v16

    .line 329
    if-lez v16, :cond_9

    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_9
    const/4 v8, 0x0

    .line 333
    :goto_5
    invoke-static {v3, v7, v8}, Loe/j;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    check-cast v3, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    invoke-static {v5, v6}, Lt/l;->d(J)I

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    iget v8, v9, Lt1/e;->C:I

    .line 352
    .line 353
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v16

    .line 361
    if-lez v16, :cond_a

    .line 362
    .line 363
    goto :goto_6

    .line 364
    :cond_a
    const/4 v8, 0x0

    .line 365
    :goto_6
    iget v14, v9, Lt1/e;->D:I

    .line 366
    .line 367
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object v14

    .line 371
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v18

    .line 375
    if-lez v18, :cond_b

    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_b
    const/4 v14, 0x0

    .line 379
    :goto_7
    invoke-static {v7, v8, v14}, Loe/j;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    check-cast v7, Ljava/lang/Number;

    .line 384
    .line 385
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 386
    .line 387
    .line 388
    move-result v7

    .line 389
    invoke-static {v5, v6}, Lt/l;->c(J)I

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    if-eq v3, v8, :cond_c

    .line 394
    .line 395
    invoke-static {v1, v2}, Li1/b;->m(J)I

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    invoke-static {v1, v2}, Li1/b;->k(J)I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    invoke-static {v3, v3, v8, v1}, Li1/c;->a(IIII)J

    .line 404
    .line 405
    .line 406
    move-result-wide v1

    .line 407
    move/from16 v3, v17

    .line 408
    .line 409
    goto :goto_8

    .line 410
    :cond_c
    move v3, v11

    .line 411
    :goto_8
    invoke-static {v5, v6}, Lt/l;->d(J)I

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    if-eq v7, v5, :cond_d

    .line 416
    .line 417
    invoke-static {v1, v2}, Li1/b;->n(J)I

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    invoke-static {v1, v2}, Li1/b;->l(J)I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    invoke-static {v3, v1, v7, v7}, Li1/c;->a(IIII)J

    .line 426
    .line 427
    .line 428
    move-result-wide v1

    .line 429
    move/from16 v3, v17

    .line 430
    .line 431
    :cond_d
    if-eqz v3, :cond_f

    .line 432
    .line 433
    invoke-static {}, Ll1/j;->a()Z

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    if-eqz v3, :cond_e

    .line 438
    .line 439
    new-instance v3, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 442
    .line 443
    .line 444
    const-string v5, "Remeasuring coerced "

    .line 445
    .line 446
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-static {v1, v2}, Li1/b;->q(J)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    invoke-static {v15, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 467
    .line 468
    .line 469
    :cond_e
    invoke-direct {v0, v9, v1, v2}, Ll1/z;->f(Lt1/e;J)J

    .line 470
    .line 471
    .line 472
    invoke-virtual {v9, v11}, Lt1/e;->U0(Z)V

    .line 473
    .line 474
    .line 475
    :cond_f
    iget-object v1, v0, Ll1/z;->c:Ljava/util/Map;

    .line 476
    .line 477
    invoke-virtual {v9}, Lt1/e;->s()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    check-cast v1, Landroidx/compose/ui/layout/s;

    .line 486
    .line 487
    if-eqz v1, :cond_10

    .line 488
    .line 489
    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->W0()I

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    goto :goto_9

    .line 494
    :cond_10
    invoke-virtual {v9}, Lt1/e;->V()I

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    :goto_9
    iput v2, v10, Lu1/b$a;->e:I

    .line 499
    .line 500
    if-eqz v1, :cond_11

    .line 501
    .line 502
    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->P0()I

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    goto :goto_a

    .line 507
    :cond_11
    invoke-virtual {v9}, Lt1/e;->x()I

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    :goto_a
    iput v2, v10, Lu1/b$a;->f:I

    .line 512
    .line 513
    const/high16 v2, -0x80000000

    .line 514
    .line 515
    if-eqz v1, :cond_12

    .line 516
    .line 517
    iget-object v3, v0, Ll1/z;->f:Ll1/C;

    .line 518
    .line 519
    invoke-virtual {v3, v9}, Lq1/g;->q(Lt1/e;)Z

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    if-eqz v3, :cond_12

    .line 524
    .line 525
    invoke-static {}, LI0/b;->a()LI0/k;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-interface {v1, v3}, LI0/D;->N(LI0/a;)I

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    goto :goto_b

    .line 534
    :cond_12
    move v1, v2

    .line 535
    :goto_b
    if-eq v1, v2, :cond_13

    .line 536
    .line 537
    move/from16 v3, v17

    .line 538
    .line 539
    goto :goto_c

    .line 540
    :cond_13
    move v3, v11

    .line 541
    :goto_c
    iput-boolean v3, v10, Lu1/b$a;->h:Z

    .line 542
    .line 543
    iput v1, v10, Lu1/b$a;->g:I

    .line 544
    .line 545
    iget-object v1, v0, Ll1/z;->d:Ljava/util/Map;

    .line 546
    .line 547
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    if-nez v3, :cond_14

    .line 552
    .line 553
    const/4 v3, 0x3

    .line 554
    new-array v3, v3, [Ljava/lang/Integer;

    .line 555
    .line 556
    aput-object v12, v3, v11

    .line 557
    .line 558
    aput-object v12, v3, v17

    .line 559
    .line 560
    const/4 v4, 0x2

    .line 561
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    aput-object v2, v3, v4

    .line 566
    .line 567
    invoke-interface {v1, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    :cond_14
    check-cast v3, [Ljava/lang/Integer;

    .line 571
    .line 572
    invoke-direct {v0, v3, v10}, Ll1/z;->e([Ljava/lang/Integer;Lu1/b$a;)V

    .line 573
    .line 574
    .line 575
    iget v1, v10, Lu1/b$a;->e:I

    .line 576
    .line 577
    iget v2, v10, Lu1/b$a;->c:I

    .line 578
    .line 579
    if-ne v1, v2, :cond_15

    .line 580
    .line 581
    iget v1, v10, Lu1/b$a;->f:I

    .line 582
    .line 583
    iget v2, v10, Lu1/b$a;->d:I

    .line 584
    .line 585
    if-eq v1, v2, :cond_16

    .line 586
    .line 587
    :cond_15
    move/from16 v11, v17

    .line 588
    .line 589
    :cond_16
    iput-boolean v11, v10, Lu1/b$a;->i:Z

    .line 590
    .line 591
    return-void
.end method

.method protected final c(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll1/z;->b:Lt1/f;

    .line 2
    .line 3
    invoke-static {p1, p2}, Li1/b;->l(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Lt1/e;->g1(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ll1/z;->b:Lt1/f;

    .line 11
    .line 12
    invoke-static {p1, p2}, Li1/b;->k(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {v0, p1}, Lt1/e;->H0(I)V

    .line 17
    .line 18
    .line 19
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 20
    .line 21
    iput p1, p0, Ll1/z;->i:F

    .line 22
    .line 23
    return-void
.end method

.method public d()V
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "{ "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "  root: {"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "interpolated: { left:  0,"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, "  top:  0,"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "  right:   "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Ll1/z;->b:Lt1/f;

    .line 37
    .line 38
    invoke-virtual {v2}, Lt1/e;->V()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, " ,"

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v3, "  bottom:  "

    .line 63
    .line 64
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v3, p0, Ll1/z;->b:Lt1/f;

    .line 68
    .line 69
    invoke-virtual {v3}, Lt1/e;->x()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, " } }"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Ll1/z;->b:Lt1/f;

    .line 92
    .line 93
    invoke-virtual {v1}, Lt1/m;->o1()Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    const-string v3, " }"

    .line 106
    .line 107
    if-eqz v2, :cond_8

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Lt1/e;

    .line 114
    .line 115
    invoke-virtual {v2}, Lt1/e;->s()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    instance-of v5, v4, LI0/A;

    .line 120
    .line 121
    const-string v6, "}, "

    .line 122
    .line 123
    const-string v7, ": {"

    .line 124
    .line 125
    const/16 v8, 0x20

    .line 126
    .line 127
    if-nez v5, :cond_2

    .line 128
    .line 129
    instance-of v4, v2, Lt1/h;

    .line 130
    .line 131
    if-eqz v4, :cond_0

    .line 132
    .line 133
    new-instance v4, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    iget-object v5, v2, Lt1/e;->o:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    check-cast v2, Lt1/h;

    .line 157
    .line 158
    invoke-virtual {v2}, Lt1/h;->o1()I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-nez v4, :cond_1

    .line 163
    .line 164
    const-string v4, " type: \'hGuideline\', "

    .line 165
    .line 166
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_1
    const-string v4, " type: \'vGuideline\', "

    .line 171
    .line 172
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    :goto_1
    const-string v4, " interpolated: "

    .line 176
    .line 177
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    new-instance v4, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v5, " { left: "

    .line 186
    .line 187
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Lt1/e;->W()I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v5, ", top: "

    .line 198
    .line 199
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Lt1/e;->X()I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v5, ", right: "

    .line 210
    .line 211
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Lt1/e;->W()I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    invoke-virtual {v2}, Lt1/e;->V()I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    add-int/2addr v5, v7

    .line 223
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v5, ", bottom: "

    .line 227
    .line 228
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Lt1/e;->X()I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    invoke-virtual {v2}, Lt1/e;->x()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    add-int/2addr v5, v2

    .line 240
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_2
    iget-object v3, v2, Lt1/e;->o:Ljava/lang/String;

    .line 259
    .line 260
    const/4 v5, 0x0

    .line 261
    if-nez v3, :cond_5

    .line 262
    .line 263
    move-object v3, v4

    .line 264
    check-cast v3, LI0/A;

    .line 265
    .line 266
    invoke-static {v3}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    if-nez v9, :cond_3

    .line 271
    .line 272
    invoke-static {v3}, Ll1/m;->a(LI0/A;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v9

    .line 276
    :cond_3
    if-eqz v9, :cond_4

    .line 277
    .line 278
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    goto :goto_2

    .line 283
    :cond_4
    move-object v3, v5

    .line 284
    :goto_2
    iput-object v3, v2, Lt1/e;->o:Ljava/lang/String;

    .line 285
    .line 286
    :cond_5
    iget-object v3, p0, Ll1/z;->e:Ljava/util/Map;

    .line 287
    .line 288
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    check-cast v3, Lq1/h;

    .line 293
    .line 294
    if-eqz v3, :cond_6

    .line 295
    .line 296
    iget-object v3, v3, Lq1/h;->a:Lt1/e;

    .line 297
    .line 298
    if-eqz v3, :cond_6

    .line 299
    .line 300
    iget-object v5, v3, Lt1/e;->n:Lq1/h;

    .line 301
    .line 302
    :cond_6
    if-nez v5, :cond_7

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    iget-object v2, v2, Lt1/e;->o:Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string v2, " interpolated : "

    .line 330
    .line 331
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    const/4 v2, 0x1

    .line 335
    invoke-virtual {v5, v0, v2}, Lq1/h;->e(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    goto/16 :goto_0

    .line 342
    .line 343
    :cond_8
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    iput-object v0, p0, Ll1/z;->a:Ljava/lang/String;

    .line 351
    .line 352
    return-void
.end method

.method public final h(Landroidx/compose/ui/layout/s$a;Ljava/util/List;)V
    .locals 12

    .line 1
    iget-object v0, p0, Ll1/z;->e:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Ll1/z;->b:Lt1/f;

    .line 11
    .line 12
    invoke-virtual {v0}, Lt1/m;->o1()Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    move v3, v1

    .line 21
    :goto_0
    if-ge v3, v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lt1/e;

    .line 28
    .line 29
    invoke-virtual {v4}, Lt1/e;->s()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    instance-of v6, v5, LI0/A;

    .line 34
    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    new-instance v6, Lq1/h;

    .line 38
    .line 39
    iget-object v4, v4, Lt1/e;->n:Lq1/h;

    .line 40
    .line 41
    invoke-virtual {v4}, Lq1/h;->j()Lq1/h;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-direct {v6, v4}, Lq1/h;-><init>(Lq1/h;)V

    .line 46
    .line 47
    .line 48
    iget-object v4, p0, Ll1/z;->e:Ljava/util/Map;

    .line 49
    .line 50
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    :goto_1
    if-ge v1, v0, :cond_9

    .line 61
    .line 62
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, LI0/A;

    .line 67
    .line 68
    iget-object v3, p0, Ll1/z;->e:Ljava/util/Map;

    .line 69
    .line 70
    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_4

    .line 75
    .line 76
    iget-object v3, p0, Ll1/z;->e:Ljava/util/Map;

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Ljava/lang/Iterable;

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_3

    .line 93
    .line 94
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    move-object v5, v4

    .line 99
    check-cast v5, LI0/A;

    .line 100
    .line 101
    invoke-static {v5}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    if-eqz v6, :cond_2

    .line 106
    .line 107
    invoke-static {v5}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-static {v2}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_2

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    const/4 v4, 0x0

    .line 123
    :goto_2
    check-cast v4, LI0/A;

    .line 124
    .line 125
    if-nez v4, :cond_5

    .line 126
    .line 127
    move-object v5, p1

    .line 128
    goto :goto_3

    .line 129
    :cond_4
    move-object v4, v2

    .line 130
    :cond_5
    iget-object v3, p0, Ll1/z;->e:Ljava/util/Map;

    .line 131
    .line 132
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    move-object v7, v3

    .line 137
    check-cast v7, Lq1/h;

    .line 138
    .line 139
    if-nez v7, :cond_6

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    iget-object v3, p0, Ll1/z;->c:Ljava/util/Map;

    .line 143
    .line 144
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    move-object v6, v3

    .line 149
    check-cast v6, Landroidx/compose/ui/layout/s;

    .line 150
    .line 151
    if-nez v6, :cond_7

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_7
    iget-object v3, p0, Ll1/z;->e:Ljava/util/Map;

    .line 155
    .line 156
    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-nez v3, :cond_8

    .line 161
    .line 162
    sget-object v3, Li1/b;->b:Li1/b$a;

    .line 163
    .line 164
    invoke-virtual {v6}, Landroidx/compose/ui/layout/s;->W0()I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    invoke-virtual {v6}, Landroidx/compose/ui/layout/s;->P0()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    invoke-virtual {v3, v4, v5}, Li1/b$a;->c(II)J

    .line 173
    .line 174
    .line 175
    move-result-wide v3

    .line 176
    invoke-interface {v2, v3, v4}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    const/4 v10, 0x4

    .line 181
    const/4 v11, 0x0

    .line 182
    const-wide/16 v8, 0x0

    .line 183
    .line 184
    move-object v5, p1

    .line 185
    invoke-static/range {v5 .. v11}, Ll1/j;->f(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;Lq1/h;JILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_8
    move-object v5, p1

    .line 190
    const/4 v10, 0x4

    .line 191
    const/4 v11, 0x0

    .line 192
    const-wide/16 v8, 0x0

    .line 193
    .line 194
    invoke-static/range {v5 .. v11}, Ll1/j;->f(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;Lq1/h;JILjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 198
    .line 199
    move-object p1, v5

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :cond_9
    sget-object p1, Ll1/w;->b:Ll1/w;

    .line 203
    .line 204
    if-nez p1, :cond_a

    .line 205
    .line 206
    invoke-virtual {p0}, Ll1/z;->d()V

    .line 207
    .line 208
    .line 209
    :cond_a
    :goto_4
    return-void
.end method

.method public final i(JLi1/t;Ll1/n;Ljava/util/List;I)J
    .locals 11

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p1, p2}, Li1/b;->n(J)I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-static {p1, p2}, Li1/b;->m(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p3, p1}, Li1/s;->a(II)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    return-wide p1

    .line 22
    :cond_0
    iget-object v1, p0, Ll1/z;->f:Ll1/C;

    .line 23
    .line 24
    invoke-static {p1, p2}, Li1/b;->j(J)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-static {p1, p2}, Li1/b;->l(J)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v2}, Lq1/d;->b(I)Lq1/d;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {}, Lq1/d;->h()Lq1/d;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {p1, p2}, Li1/b;->n(J)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v2, v3}, Lq1/d;->n(I)Lq1/d;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :goto_0
    invoke-virtual {v1, v2}, Lq1/g;->C(Lq1/d;)Lq1/g;

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Ll1/z;->f:Ll1/C;

    .line 55
    .line 56
    invoke-static {p1, p2}, Li1/b;->i(J)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    invoke-static {p1, p2}, Li1/b;->k(J)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v2}, Lq1/d;->b(I)Lq1/d;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-static {}, Lq1/d;->h()Lq1/d;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {p1, p2}, Li1/b;->m(J)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-virtual {v2, v3}, Lq1/d;->n(I)Lq1/d;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :goto_1
    invoke-virtual {v1, v2}, Lq1/g;->m(Lq1/d;)Lq1/g;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Ll1/z;->f:Ll1/C;

    .line 87
    .line 88
    iget-object v1, v1, Lq1/g;->f:Lq1/a;

    .line 89
    .line 90
    invoke-virtual {v1}, Lq1/a;->E()Lq1/d;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v2, p0, Ll1/z;->f:Ll1/C;

    .line 95
    .line 96
    iget-object v3, p0, Ll1/z;->b:Lt1/f;

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    invoke-virtual {v1, v2, v3, v4}, Lq1/d;->a(Lq1/g;Lt1/e;I)V

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, Ll1/z;->f:Ll1/C;

    .line 103
    .line 104
    iget-object v1, v1, Lq1/g;->f:Lq1/a;

    .line 105
    .line 106
    invoke-virtual {v1}, Lq1/a;->C()Lq1/d;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iget-object v2, p0, Ll1/z;->f:Ll1/C;

    .line 111
    .line 112
    iget-object v3, p0, Ll1/z;->b:Lt1/f;

    .line 113
    .line 114
    const/4 v5, 0x1

    .line 115
    invoke-virtual {v1, v2, v3, v5}, Lq1/d;->a(Lq1/g;Lt1/e;I)V

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Ll1/z;->f:Ll1/C;

    .line 119
    .line 120
    invoke-virtual {v1, p1, p2}, Ll1/C;->G(J)V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Ll1/z;->f:Ll1/C;

    .line 124
    .line 125
    sget-object v2, Li1/t;->b:Li1/t;

    .line 126
    .line 127
    if-ne p3, v2, :cond_3

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    move v5, v4

    .line 131
    :goto_2
    invoke-virtual {v1, v5}, Lq1/g;->x(Z)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Ll1/z;->j()V

    .line 135
    .line 136
    .line 137
    invoke-interface/range {p4 .. p5}, Ll1/n;->a(Ljava/util/List;)Z

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    if-eqz p3, :cond_4

    .line 142
    .line 143
    iget-object p3, p0, Ll1/z;->f:Ll1/C;

    .line 144
    .line 145
    invoke-virtual {p3}, Lq1/g;->u()V

    .line 146
    .line 147
    .line 148
    iget-object p3, p0, Ll1/z;->f:Ll1/C;

    .line 149
    .line 150
    invoke-interface {p4, p3, v0}, Ll1/n;->b(Ll1/C;Ljava/util/List;)V

    .line 151
    .line 152
    .line 153
    iget-object p3, p0, Ll1/z;->f:Ll1/C;

    .line 154
    .line 155
    invoke-static {p3, v0}, Ll1/j;->c(Ll1/C;Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    iget-object p3, p0, Ll1/z;->f:Ll1/C;

    .line 159
    .line 160
    iget-object v0, p0, Ll1/z;->b:Lt1/f;

    .line 161
    .line 162
    invoke-virtual {p3, v0}, Lq1/g;->a(Lt1/f;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    iget-object p3, p0, Ll1/z;->f:Ll1/C;

    .line 167
    .line 168
    invoke-static {p3, v0}, Ll1/j;->c(Ll1/C;Ljava/util/List;)V

    .line 169
    .line 170
    .line 171
    :goto_3
    invoke-virtual/range {p0 .. p2}, Ll1/z;->c(J)V

    .line 172
    .line 173
    .line 174
    iget-object p3, p0, Ll1/z;->b:Lt1/f;

    .line 175
    .line 176
    invoke-virtual {p3}, Lt1/f;->X1()V

    .line 177
    .line 178
    .line 179
    invoke-static {}, Ll1/j;->a()Z

    .line 180
    .line 181
    .line 182
    move-result p3

    .line 183
    const-string v0, "CCL"

    .line 184
    .line 185
    if-eqz p3, :cond_9

    .line 186
    .line 187
    iget-object p3, p0, Ll1/z;->b:Lt1/f;

    .line 188
    .line 189
    const-string v1, "ConstraintLayout"

    .line 190
    .line 191
    invoke-virtual {p3, v1}, Lt1/e;->y0(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object p3, p0, Ll1/z;->b:Lt1/f;

    .line 195
    .line 196
    invoke-virtual {p3}, Lt1/m;->o1()Ljava/util/ArrayList;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    move v2, v4

    .line 205
    :goto_4
    if-ge v2, v1, :cond_8

    .line 206
    .line 207
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    check-cast v3, Lt1/e;

    .line 212
    .line 213
    invoke-virtual {v3}, Lt1/e;->s()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    instance-of v6, v5, LI0/A;

    .line 218
    .line 219
    if-eqz v6, :cond_5

    .line 220
    .line 221
    check-cast v5, LI0/A;

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_5
    const/4 v5, 0x0

    .line 225
    :goto_5
    if-eqz v5, :cond_6

    .line 226
    .line 227
    invoke-static {v5}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    if-eqz v5, :cond_6

    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    if-nez v5, :cond_7

    .line 238
    .line 239
    :cond_6
    const-string v5, "NOTAG"

    .line 240
    .line 241
    :cond_7
    invoke-virtual {v3, v5}, Lt1/e;->y0(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    add-int/lit8 v2, v2, 0x1

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_8
    new-instance p3, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    const-string v1, "ConstraintLayout is asked to measure with "

    .line 253
    .line 254
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-static {p1, p2}, Li1/b;->q(J)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 269
    .line 270
    .line 271
    iget-object p1, p0, Ll1/z;->b:Lt1/f;

    .line 272
    .line 273
    invoke-static {p1}, Ll1/j;->b(Lt1/e;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    iget-object p1, p0, Ll1/z;->b:Lt1/f;

    .line 281
    .line 282
    invoke-virtual {p1}, Lt1/m;->o1()Ljava/util/ArrayList;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 287
    .line 288
    .line 289
    move-result p2

    .line 290
    :goto_6
    if-ge v4, p2, :cond_9

    .line 291
    .line 292
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p3

    .line 296
    check-cast p3, Lt1/e;

    .line 297
    .line 298
    invoke-static {p3}, Ll1/j;->b(Lt1/e;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p3

    .line 302
    invoke-static {v0, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    add-int/lit8 v4, v4, 0x1

    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_9
    iget-object p1, p0, Ll1/z;->b:Lt1/f;

    .line 309
    .line 310
    move/from16 p2, p6

    .line 311
    .line 312
    invoke-virtual {p1, p2}, Lt1/f;->T1(I)V

    .line 313
    .line 314
    .line 315
    iget-object v1, p0, Ll1/z;->b:Lt1/f;

    .line 316
    .line 317
    invoke-virtual {v1}, Lt1/f;->G1()I

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    const/4 v9, 0x0

    .line 322
    const/4 v10, 0x0

    .line 323
    const/4 v3, 0x0

    .line 324
    const/4 v4, 0x0

    .line 325
    const/4 v5, 0x0

    .line 326
    const/4 v6, 0x0

    .line 327
    const/4 v7, 0x0

    .line 328
    const/4 v8, 0x0

    .line 329
    invoke-virtual/range {v1 .. v10}, Lt1/f;->O1(IIIIIIIII)J

    .line 330
    .line 331
    .line 332
    invoke-static {}, Ll1/j;->a()Z

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    if-eqz p1, :cond_a

    .line 337
    .line 338
    new-instance p1, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    const-string p2, "ConstraintLayout is at the end "

    .line 344
    .line 345
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    iget-object p2, p0, Ll1/z;->b:Lt1/f;

    .line 349
    .line 350
    invoke-virtual {p2}, Lt1/e;->V()I

    .line 351
    .line 352
    .line 353
    move-result p2

    .line 354
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    const/16 p2, 0x20

    .line 358
    .line 359
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    iget-object p2, p0, Ll1/z;->b:Lt1/f;

    .line 363
    .line 364
    invoke-virtual {p2}, Lt1/e;->x()I

    .line 365
    .line 366
    .line 367
    move-result p2

    .line 368
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 376
    .line 377
    .line 378
    :cond_a
    iget-object p1, p0, Ll1/z;->b:Lt1/f;

    .line 379
    .line 380
    invoke-virtual {p1}, Lt1/e;->V()I

    .line 381
    .line 382
    .line 383
    move-result p1

    .line 384
    iget-object p2, p0, Ll1/z;->b:Lt1/f;

    .line 385
    .line 386
    invoke-virtual {p2}, Lt1/e;->x()I

    .line 387
    .line 388
    .line 389
    move-result p2

    .line 390
    invoke-static {p1, p2}, Li1/s;->a(II)J

    .line 391
    .line 392
    .line 393
    move-result-wide p1

    .line 394
    return-wide p1
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/z;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll1/z;->d:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ll1/z;->e:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
