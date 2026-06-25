.class public final Lt0/l$b;
.super Lt0/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final h:Lt0/F;

.field private final i:Lt0/F;

.field private final j:[F


# direct methods
.method private constructor <init>(Lt0/F;Lt0/F;I)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    .line 2
    invoke-direct/range {v0 .. v7}, Lt0/l;-><init>(Lt0/c;Lt0/c;Lt0/c;Lt0/c;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object v1, v0, Lt0/l$b;->h:Lt0/F;

    .line 4
    iput-object v2, v0, Lt0/l$b;->i:Lt0/F;

    .line 5
    invoke-direct {p0, v1, v2, v5}, Lt0/l$b;->b(Lt0/F;Lt0/F;I)[F

    move-result-object p1

    iput-object p1, v0, Lt0/l$b;->j:[F

    return-void
.end method

.method public synthetic constructor <init>(Lt0/F;Lt0/F;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lt0/l$b;-><init>(Lt0/F;Lt0/F;I)V

    return-void
.end method

.method private final b(Lt0/F;Lt0/F;I)[F
    .locals 7

    .line 1
    invoke-virtual {p1}, Lt0/F;->F()Lt0/I;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lt0/F;->F()Lt0/I;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lt0/d;->f(Lt0/I;Lt0/I;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Lt0/F;->y()[F

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1}, Lt0/F;->E()[F

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p2, p1}, Lt0/d;->l([F[F)[F

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    invoke-virtual {p1}, Lt0/F;->E()[F

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p2}, Lt0/F;->y()[F

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lt0/F;->F()Lt0/I;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lt0/I;->c()[F

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p2}, Lt0/F;->F()Lt0/I;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Lt0/I;->c()[F

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p1}, Lt0/F;->F()Lt0/I;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    sget-object v5, Lt0/o;->a:Lt0/o;

    .line 57
    .line 58
    invoke-virtual {v5}, Lt0/o;->b()Lt0/I;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-static {v4, v6}, Lt0/d;->f(Lt0/I;Lt0/I;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_1

    .line 67
    .line 68
    sget-object v0, Lt0/a;->b:Lt0/a$d;

    .line 69
    .line 70
    invoke-virtual {v0}, Lt0/a$d;->a()Lt0/a;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lt0/a;->b()[F

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v5}, Lt0/o;->f()[F

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {v0, v2, v4}, Lt0/d;->e([F[F[F)[F

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1}, Lt0/F;->E()[F

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {v0, p1}, Lt0/d;->l([F[F)[F

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :cond_1
    invoke-virtual {p2}, Lt0/F;->F()Lt0/I;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v5}, Lt0/o;->b()Lt0/I;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {p1, v4}, Lt0/d;->f(Lt0/I;Lt0/I;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_2

    .line 107
    .line 108
    sget-object p1, Lt0/a;->b:Lt0/a$d;

    .line 109
    .line 110
    invoke-virtual {p1}, Lt0/a$d;->a()Lt0/a;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Lt0/a;->b()[F

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {v5}, Lt0/o;->f()[F

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {p1, v3, v1}, Lt0/d;->e([F[F[F)[F

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p2}, Lt0/F;->E()[F

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-static {p1, p2}, Lt0/d;->l([F[F)[F

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p1}, Lt0/d;->k([F)[F

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    :cond_2
    sget-object p1, Lt0/r;->a:Lt0/r$a;

    .line 139
    .line 140
    invoke-virtual {p1}, Lt0/r$a;->a()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    invoke-static {p3, p1}, Lt0/r;->e(II)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_3

    .line 149
    .line 150
    const/4 p1, 0x0

    .line 151
    aget p2, v2, p1

    .line 152
    .line 153
    aget p3, v3, p1

    .line 154
    .line 155
    div-float/2addr p2, p3

    .line 156
    const/4 p3, 0x1

    .line 157
    aget v4, v2, p3

    .line 158
    .line 159
    aget v5, v3, p3

    .line 160
    .line 161
    div-float/2addr v4, v5

    .line 162
    const/4 v5, 0x2

    .line 163
    aget v2, v2, v5

    .line 164
    .line 165
    aget v3, v3, v5

    .line 166
    .line 167
    div-float/2addr v2, v3

    .line 168
    const/4 v3, 0x3

    .line 169
    new-array v3, v3, [F

    .line 170
    .line 171
    aput p2, v3, p1

    .line 172
    .line 173
    aput v4, v3, p3

    .line 174
    .line 175
    aput v2, v3, v5

    .line 176
    .line 177
    invoke-static {v3, v0}, Lt0/d;->m([F[F)[F

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    :cond_3
    invoke-static {v1, v0}, Lt0/d;->l([F[F)[F

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1
.end method


# virtual methods
.method public a(J)J
    .locals 6

    .line 1
    invoke-static {p1, p2}, Ls0/r0;->x(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2}, Ls0/r0;->w(J)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1, p2}, Ls0/r0;->u(J)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p1, p2}, Ls0/r0;->t(J)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object p2, p0, Lt0/l$b;->h:Lt0/F;

    .line 18
    .line 19
    invoke-virtual {p2}, Lt0/F;->w()Lt0/n;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    float-to-double v3, v0

    .line 24
    invoke-interface {p2, v3, v4}, Lt0/n;->a(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    double-to-float p2, v3

    .line 29
    iget-object v0, p0, Lt0/l$b;->h:Lt0/F;

    .line 30
    .line 31
    invoke-virtual {v0}, Lt0/F;->w()Lt0/n;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    float-to-double v3, v1

    .line 36
    invoke-interface {v0, v3, v4}, Lt0/n;->a(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    double-to-float v0, v0

    .line 41
    iget-object v1, p0, Lt0/l$b;->h:Lt0/F;

    .line 42
    .line 43
    invoke-virtual {v1}, Lt0/F;->w()Lt0/n;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    float-to-double v2, v2

    .line 48
    invoke-interface {v1, v2, v3}, Lt0/n;->a(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    double-to-float v1, v1

    .line 53
    iget-object v2, p0, Lt0/l$b;->j:[F

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    aget v3, v2, v3

    .line 57
    .line 58
    mul-float/2addr v3, p2

    .line 59
    const/4 v4, 0x3

    .line 60
    aget v4, v2, v4

    .line 61
    .line 62
    mul-float/2addr v4, v0

    .line 63
    add-float/2addr v3, v4

    .line 64
    const/4 v4, 0x6

    .line 65
    aget v4, v2, v4

    .line 66
    .line 67
    mul-float/2addr v4, v1

    .line 68
    add-float/2addr v3, v4

    .line 69
    const/4 v4, 0x1

    .line 70
    aget v4, v2, v4

    .line 71
    .line 72
    mul-float/2addr v4, p2

    .line 73
    const/4 v5, 0x4

    .line 74
    aget v5, v2, v5

    .line 75
    .line 76
    mul-float/2addr v5, v0

    .line 77
    add-float/2addr v4, v5

    .line 78
    const/4 v5, 0x7

    .line 79
    aget v5, v2, v5

    .line 80
    .line 81
    mul-float/2addr v5, v1

    .line 82
    add-float/2addr v4, v5

    .line 83
    const/4 v5, 0x2

    .line 84
    aget v5, v2, v5

    .line 85
    .line 86
    mul-float/2addr v5, p2

    .line 87
    const/4 p2, 0x5

    .line 88
    aget p2, v2, p2

    .line 89
    .line 90
    mul-float/2addr p2, v0

    .line 91
    add-float/2addr v5, p2

    .line 92
    const/16 p2, 0x8

    .line 93
    .line 94
    aget p2, v2, p2

    .line 95
    .line 96
    mul-float/2addr p2, v1

    .line 97
    add-float/2addr v5, p2

    .line 98
    iget-object p2, p0, Lt0/l$b;->i:Lt0/F;

    .line 99
    .line 100
    invoke-virtual {p2}, Lt0/F;->A()Lt0/n;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    float-to-double v0, v3

    .line 105
    invoke-interface {p2, v0, v1}, Lt0/n;->a(D)D

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    double-to-float p2, v0

    .line 110
    iget-object v0, p0, Lt0/l$b;->i:Lt0/F;

    .line 111
    .line 112
    invoke-virtual {v0}, Lt0/F;->A()Lt0/n;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    float-to-double v1, v4

    .line 117
    invoke-interface {v0, v1, v2}, Lt0/n;->a(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    double-to-float v0, v0

    .line 122
    iget-object v1, p0, Lt0/l$b;->i:Lt0/F;

    .line 123
    .line 124
    invoke-virtual {v1}, Lt0/F;->A()Lt0/n;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    float-to-double v2, v5

    .line 129
    invoke-interface {v1, v2, v3}, Lt0/n;->a(D)D

    .line 130
    .line 131
    .line 132
    move-result-wide v1

    .line 133
    double-to-float v1, v1

    .line 134
    iget-object v2, p0, Lt0/l$b;->i:Lt0/F;

    .line 135
    .line 136
    invoke-static {p2, v0, v1, p1, v2}, Ls0/s0;->a(FFFFLt0/c;)J

    .line 137
    .line 138
    .line 139
    move-result-wide p1

    .line 140
    return-wide p1
.end method
