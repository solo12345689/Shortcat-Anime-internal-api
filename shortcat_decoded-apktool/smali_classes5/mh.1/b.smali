.class Lmh/b;
.super Ljava/lang/Object;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:Lmh/h;

.field private final t:Lmh/a;

.field private final u:Z

.field protected final v:Z

.field protected final w:Lmh/g;


# direct methods
.method public constructor <init>(IIZZ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lmh/b;->p:I

    .line 5
    .line 6
    iput-boolean p3, p0, Lmh/b;->u:Z

    .line 7
    .line 8
    iput-boolean p4, p0, Lmh/b;->v:Z

    .line 9
    .line 10
    iput p1, p0, Lmh/b;->a:I

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    const/4 v0, 0x3

    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    const/16 p2, 0xa

    .line 19
    .line 20
    iput p2, p0, Lmh/b;->b:I

    .line 21
    .line 22
    iput v0, p0, Lmh/b;->c:I

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    iput v1, p0, Lmh/b;->b:I

    .line 28
    .line 29
    const/4 p2, 0x4

    .line 30
    :goto_0
    iput p2, p0, Lmh/b;->c:I

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 p2, 0x6

    .line 34
    iput p2, p0, Lmh/b;->b:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    if-eqz p3, :cond_2

    .line 38
    .line 39
    new-instance p2, Lmh/g$a;

    .line 40
    .line 41
    invoke-direct {p2}, Lmh/g$a;-><init>()V

    .line 42
    .line 43
    .line 44
    :goto_2
    iput-object p2, p0, Lmh/b;->w:Lmh/g;

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_2
    new-instance p2, Lmh/g$b;

    .line 48
    .line 49
    invoke-direct {p2}, Lmh/g$b;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :goto_3
    const/16 p2, 0x40

    .line 54
    .line 55
    if-eqz p4, :cond_3

    .line 56
    .line 57
    const/16 p3, 0xc

    .line 58
    .line 59
    iput p3, p0, Lmh/b;->e:I

    .line 60
    .line 61
    iput p2, p0, Lmh/b;->d:I

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_3
    const/16 p3, 0xd

    .line 65
    .line 66
    iput p3, p0, Lmh/b;->e:I

    .line 67
    .line 68
    iget p3, p0, Lmh/b;->b:I

    .line 69
    .line 70
    mul-int/lit16 p3, p3, 0x100

    .line 71
    .line 72
    div-int/2addr p3, v1

    .line 73
    iput p3, p0, Lmh/b;->d:I

    .line 74
    .line 75
    :goto_4
    iget p3, p0, Lmh/b;->e:I

    .line 76
    .line 77
    mul-int/lit16 p4, p3, 0x100

    .line 78
    .line 79
    div-int/2addr p4, v1

    .line 80
    iput p4, p0, Lmh/b;->f:I

    .line 81
    .line 82
    mul-int/2addr p4, p1

    .line 83
    iput p4, p0, Lmh/b;->g:I

    .line 84
    .line 85
    const/16 v0, 0x140

    .line 86
    .line 87
    iput v0, p0, Lmh/b;->h:I

    .line 88
    .line 89
    mul-int/2addr p1, v0

    .line 90
    iput p1, p0, Lmh/b;->i:I

    .line 91
    .line 92
    iget v0, p0, Lmh/b;->c:I

    .line 93
    .line 94
    mul-int/lit16 v2, v0, 0x100

    .line 95
    .line 96
    div-int/2addr v2, v1

    .line 97
    iput v2, p0, Lmh/b;->j:I

    .line 98
    .line 99
    add-int/lit8 v1, p1, 0x20

    .line 100
    .line 101
    iput v1, p0, Lmh/b;->k:I

    .line 102
    .line 103
    iput p4, p0, Lmh/b;->l:I

    .line 104
    .line 105
    iput v1, p0, Lmh/b;->m:I

    .line 106
    .line 107
    add-int/2addr p4, v1

    .line 108
    add-int/2addr p4, p2

    .line 109
    iput p4, p0, Lmh/b;->n:I

    .line 110
    .line 111
    add-int/2addr p1, v2

    .line 112
    iput p1, p0, Lmh/b;->o:I

    .line 113
    .line 114
    add-int/lit8 p1, p3, -0xb

    .line 115
    .line 116
    const/4 p2, 0x1

    .line 117
    shl-int p1, p2, p1

    .line 118
    .line 119
    iput p1, p0, Lmh/b;->q:I

    .line 120
    .line 121
    rsub-int/lit8 p1, v0, 0x9

    .line 122
    .line 123
    shl-int p1, p2, p1

    .line 124
    .line 125
    rsub-int p1, p1, 0x100

    .line 126
    .line 127
    add-int/lit8 p3, p3, -0xb

    .line 128
    .line 129
    shl-int/2addr p2, p3

    .line 130
    add-int/2addr p1, p2

    .line 131
    iput p1, p0, Lmh/b;->r:I

    .line 132
    .line 133
    new-instance p1, Lmh/h;

    .line 134
    .line 135
    invoke-direct {p1, p0}, Lmh/h;-><init>(Lmh/b;)V

    .line 136
    .line 137
    .line 138
    iput-object p1, p0, Lmh/b;->s:Lmh/h;

    .line 139
    .line 140
    new-instance p1, Lmh/a;

    .line 141
    .line 142
    invoke-direct {p1, p0}, Lmh/a;-><init>(Lmh/b;)V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Lmh/b;->t:Lmh/a;

    .line 146
    .line 147
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lmh/b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lmh/b;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lmh/b;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public g()Lmh/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lmh/b;->s:Lmh/h;

    .line 2
    .line 3
    return-object v0
.end method
