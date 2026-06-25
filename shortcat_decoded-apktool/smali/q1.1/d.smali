.class public Lq1/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final i:Ljava/lang/Object;

.field public static final j:Ljava/lang/Object;

.field public static final k:Ljava/lang/Object;

.field public static final l:Ljava/lang/Object;

.field public static final m:Ljava/lang/Object;

.field public static final n:Ljava/lang/Object;


# instance fields
.field private final a:I

.field b:I

.field c:I

.field d:F

.field e:I

.field f:Ljava/lang/String;

.field g:Ljava/lang/Object;

.field h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "FIXED_DIMENSION"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lq1/d;->i:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "WRAP_DIMENSION"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lq1/d;->j:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "SPREAD_DIMENSION"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lq1/d;->k:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/String;

    .line 29
    .line 30
    const-string v1, "PARENT_DIMENSION"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lq1/d;->l:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/String;

    .line 38
    .line 39
    const-string v1, "PERCENT_DIMENSION"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lq1/d;->m:Ljava/lang/Object;

    .line 45
    .line 46
    new-instance v0, Ljava/lang/String;

    .line 47
    .line 48
    const-string v1, "RATIO_DIMENSION"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lq1/d;->n:Ljava/lang/Object;

    .line 54
    .line 55
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    .line 2
    iput v0, p0, Lq1/d;->a:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lq1/d;->b:I

    const v1, 0x7fffffff

    .line 4
    iput v1, p0, Lq1/d;->c:I

    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    iput v1, p0, Lq1/d;->d:F

    .line 6
    iput v0, p0, Lq1/d;->e:I

    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lq1/d;->f:Ljava/lang/String;

    .line 8
    sget-object v1, Lq1/d;->j:Ljava/lang/Object;

    iput-object v1, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 9
    iput-boolean v0, p0, Lq1/d;->h:Z

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    .line 11
    iput v0, p0, Lq1/d;->a:I

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lq1/d;->b:I

    const v1, 0x7fffffff

    .line 13
    iput v1, p0, Lq1/d;->c:I

    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    iput v1, p0, Lq1/d;->d:F

    .line 15
    iput v0, p0, Lq1/d;->e:I

    const/4 v1, 0x0

    .line 16
    iput-object v1, p0, Lq1/d;->f:Ljava/lang/String;

    .line 17
    iput-boolean v0, p0, Lq1/d;->h:Z

    .line 18
    iput-object p1, p0, Lq1/d;->g:Ljava/lang/Object;

    return-void
.end method

.method public static b(I)Lq1/d;
    .locals 2

    .line 1
    new-instance v0, Lq1/d;

    .line 2
    .line 3
    sget-object v1, Lq1/d;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq1/d;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lq1/d;->i(I)Lq1/d;

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static c(Ljava/lang/Object;)Lq1/d;
    .locals 2

    .line 1
    new-instance v0, Lq1/d;

    .line 2
    .line 3
    sget-object v1, Lq1/d;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq1/d;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lq1/d;->j(Ljava/lang/Object;)Lq1/d;

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static d()Lq1/d;
    .locals 2

    .line 1
    new-instance v0, Lq1/d;

    .line 2
    .line 3
    sget-object v1, Lq1/d;->l:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq1/d;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static e(Ljava/lang/Object;F)Lq1/d;
    .locals 2

    .line 1
    new-instance v0, Lq1/d;

    .line 2
    .line 3
    sget-object v1, Lq1/d;->m:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq1/d;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, Lq1/d;->p(Ljava/lang/Object;F)Lq1/d;

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static f(Ljava/lang/String;)Lq1/d;
    .locals 2

    .line 1
    new-instance v0, Lq1/d;

    .line 2
    .line 3
    sget-object v1, Lq1/d;->n:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq1/d;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lq1/d;->q(Ljava/lang/String;)Lq1/d;

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static g(Ljava/lang/Object;)Lq1/d;
    .locals 1

    .line 1
    new-instance v0, Lq1/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lq1/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lq1/d;->s(Ljava/lang/Object;)Lq1/d;

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static h()Lq1/d;
    .locals 2

    .line 1
    new-instance v0, Lq1/d;

    .line 2
    .line 3
    sget-object v1, Lq1/d;->j:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq1/d;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public a(Lq1/g;Lt1/e;I)V
    .locals 3

    .line 1
    iget-object p1, p0, Lq1/d;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lt1/e;->z0(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const p1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez p3, :cond_8

    .line 15
    .line 16
    iget-boolean p3, p0, Lq1/d;->h:Z

    .line 17
    .line 18
    if-eqz p3, :cond_3

    .line 19
    .line 20
    sget-object p1, Lt1/e$b;->c:Lt1/e$b;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lt1/e;->L0(Lt1/e$b;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p3, Lq1/d;->j:Ljava/lang/Object;

    .line 28
    .line 29
    if-ne p1, p3, :cond_1

    .line 30
    .line 31
    move v0, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sget-object p3, Lq1/d;->m:Ljava/lang/Object;

    .line 34
    .line 35
    if-ne p1, p3, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v0, v2

    .line 39
    :goto_0
    iget p1, p0, Lq1/d;->b:I

    .line 40
    .line 41
    iget p3, p0, Lq1/d;->c:I

    .line 42
    .line 43
    iget v1, p0, Lq1/d;->d:F

    .line 44
    .line 45
    invoke-virtual {p2, v0, p1, p3, v1}, Lt1/e;->M0(IIIF)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    iget p3, p0, Lq1/d;->b:I

    .line 50
    .line 51
    if-lez p3, :cond_4

    .line 52
    .line 53
    invoke-virtual {p2, p3}, Lt1/e;->W0(I)V

    .line 54
    .line 55
    .line 56
    :cond_4
    iget p3, p0, Lq1/d;->c:I

    .line 57
    .line 58
    if-ge p3, p1, :cond_5

    .line 59
    .line 60
    invoke-virtual {p2, p3}, Lt1/e;->T0(I)V

    .line 61
    .line 62
    .line 63
    :cond_5
    iget-object p1, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object p3, Lq1/d;->j:Ljava/lang/Object;

    .line 66
    .line 67
    if-ne p1, p3, :cond_6

    .line 68
    .line 69
    sget-object p1, Lt1/e$b;->b:Lt1/e$b;

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Lt1/e;->L0(Lt1/e$b;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_6
    sget-object p3, Lq1/d;->l:Ljava/lang/Object;

    .line 76
    .line 77
    if-ne p1, p3, :cond_7

    .line 78
    .line 79
    sget-object p1, Lt1/e$b;->d:Lt1/e$b;

    .line 80
    .line 81
    invoke-virtual {p2, p1}, Lt1/e;->L0(Lt1/e$b;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_7
    if-nez p1, :cond_10

    .line 86
    .line 87
    sget-object p1, Lt1/e$b;->a:Lt1/e$b;

    .line 88
    .line 89
    invoke-virtual {p2, p1}, Lt1/e;->L0(Lt1/e$b;)V

    .line 90
    .line 91
    .line 92
    iget p1, p0, Lq1/d;->e:I

    .line 93
    .line 94
    invoke-virtual {p2, p1}, Lt1/e;->g1(I)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_8
    iget-boolean p3, p0, Lq1/d;->h:Z

    .line 99
    .line 100
    if-eqz p3, :cond_b

    .line 101
    .line 102
    sget-object p1, Lt1/e$b;->c:Lt1/e$b;

    .line 103
    .line 104
    invoke-virtual {p2, p1}, Lt1/e;->c1(Lt1/e$b;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 108
    .line 109
    sget-object p3, Lq1/d;->j:Ljava/lang/Object;

    .line 110
    .line 111
    if-ne p1, p3, :cond_9

    .line 112
    .line 113
    move v0, v1

    .line 114
    goto :goto_1

    .line 115
    :cond_9
    sget-object p3, Lq1/d;->m:Ljava/lang/Object;

    .line 116
    .line 117
    if-ne p1, p3, :cond_a

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_a
    move v0, v2

    .line 121
    :goto_1
    iget p1, p0, Lq1/d;->b:I

    .line 122
    .line 123
    iget p3, p0, Lq1/d;->c:I

    .line 124
    .line 125
    iget v1, p0, Lq1/d;->d:F

    .line 126
    .line 127
    invoke-virtual {p2, v0, p1, p3, v1}, Lt1/e;->d1(IIIF)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_b
    iget p3, p0, Lq1/d;->b:I

    .line 132
    .line 133
    if-lez p3, :cond_c

    .line 134
    .line 135
    invoke-virtual {p2, p3}, Lt1/e;->V0(I)V

    .line 136
    .line 137
    .line 138
    :cond_c
    iget p3, p0, Lq1/d;->c:I

    .line 139
    .line 140
    if-ge p3, p1, :cond_d

    .line 141
    .line 142
    invoke-virtual {p2, p3}, Lt1/e;->S0(I)V

    .line 143
    .line 144
    .line 145
    :cond_d
    iget-object p1, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 146
    .line 147
    sget-object p3, Lq1/d;->j:Ljava/lang/Object;

    .line 148
    .line 149
    if-ne p1, p3, :cond_e

    .line 150
    .line 151
    sget-object p1, Lt1/e$b;->b:Lt1/e$b;

    .line 152
    .line 153
    invoke-virtual {p2, p1}, Lt1/e;->c1(Lt1/e$b;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_e
    sget-object p3, Lq1/d;->l:Ljava/lang/Object;

    .line 158
    .line 159
    if-ne p1, p3, :cond_f

    .line 160
    .line 161
    sget-object p1, Lt1/e$b;->d:Lt1/e$b;

    .line 162
    .line 163
    invoke-virtual {p2, p1}, Lt1/e;->c1(Lt1/e$b;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_f
    if-nez p1, :cond_10

    .line 168
    .line 169
    sget-object p1, Lt1/e$b;->a:Lt1/e$b;

    .line 170
    .line 171
    invoke-virtual {p2, p1}, Lt1/e;->c1(Lt1/e$b;)V

    .line 172
    .line 173
    .line 174
    iget p1, p0, Lq1/d;->e:I

    .line 175
    .line 176
    invoke-virtual {p2, p1}, Lt1/e;->H0(I)V

    .line 177
    .line 178
    .line 179
    :cond_10
    return-void
.end method

.method public i(I)Lq1/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 3
    .line 4
    iput p1, p0, Lq1/d;->e:I

    .line 5
    .line 6
    return-object p0
.end method

.method public j(Ljava/lang/Object;)Lq1/d;
    .locals 1

    .line 1
    iput-object p1, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p1, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Lq1/d;->e:I

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    return-object p0
.end method

.method k()I
    .locals 1

    .line 1
    iget v0, p0, Lq1/d;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public l(I)Lq1/d;
    .locals 1

    .line 1
    iget v0, p0, Lq1/d;->c:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lq1/d;->c:I

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method

.method public m(Ljava/lang/Object;)Lq1/d;
    .locals 1

    .line 1
    sget-object v0, Lq1/d;->j:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, Lq1/d;->h:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 10
    .line 11
    const p1, 0x7fffffff

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lq1/d;->c:I

    .line 15
    .line 16
    :cond_0
    return-object p0
.end method

.method public n(I)Lq1/d;
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lq1/d;->b:I

    .line 4
    .line 5
    :cond_0
    return-object p0
.end method

.method public o(Ljava/lang/Object;)Lq1/d;
    .locals 1

    .line 1
    sget-object v0, Lq1/d;->j:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x2

    .line 6
    iput p1, p0, Lq1/d;->b:I

    .line 7
    .line 8
    :cond_0
    return-object p0
.end method

.method public p(Ljava/lang/Object;F)Lq1/d;
    .locals 0

    .line 1
    iput p2, p0, Lq1/d;->d:F

    .line 2
    .line 3
    return-object p0
.end method

.method public q(Ljava/lang/String;)Lq1/d;
    .locals 0

    .line 1
    iput-object p1, p0, Lq1/d;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public r(I)Lq1/d;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq1/d;->h:Z

    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lq1/d;->c:I

    .line 7
    .line 8
    :cond_0
    return-object p0
.end method

.method public s(Ljava/lang/Object;)Lq1/d;
    .locals 0

    .line 1
    iput-object p1, p0, Lq1/d;->g:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lq1/d;->h:Z

    .line 5
    .line 6
    return-object p0
.end method
