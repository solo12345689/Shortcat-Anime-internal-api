.class public abstract Ls0/A1;
.super Ls0/h0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private createdSize:J

.field private internalTransformShader:Ls0/M1;

.field private transform:[F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ls0/h0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    sget-object v0, Lr0/l;->b:Lr0/l$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lr0/l$a;->a()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Ls0/A1;->createdSize:J

    .line 12
    .line 13
    return-void
.end method

.method private final a()Ls0/M1;
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/A1;->internalTransformShader:Ls0/M1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ls0/M1;

    .line 6
    .line 7
    invoke-direct {v0}, Ls0/M1;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ls0/A1;->internalTransformShader:Ls0/M1;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final applyTo-Pq9zytI(JLs0/k1;F)V
    .locals 5

    .line 1
    iget-object v0, p0, Ls0/A1;->internalTransformShader:Ls0/M1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-wide v2, p0, Ls0/A1;->createdSize:J

    .line 7
    .line 8
    invoke-static {v2, v3, p1, p2}, Lr0/l;->f(JJ)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    :cond_0
    invoke-static {p1, p2}, Lr0/l;->k(J)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iput-object v1, p0, Ls0/A1;->internalTransformShader:Ls0/M1;

    .line 21
    .line 22
    sget-object p1, Lr0/l;->b:Lr0/l$a;

    .line 23
    .line 24
    invoke-virtual {p1}, Lr0/l$a;->a()J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    iput-wide p1, p0, Ls0/A1;->createdSize:J

    .line 29
    .line 30
    move-object v0, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-direct {p0}, Ls0/A1;->a()Ls0/M1;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v2, p0, Ls0/A1;->transform:[F

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ls0/M1;->d([F)V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0, p1, p2}, Ls0/A1;->createShader-uvyYCjk(J)Landroid/graphics/Shader;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v2}, Ls0/M1;->c(Landroid/graphics/Shader;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Ls0/A1;->internalTransformShader:Ls0/M1;

    .line 51
    .line 52
    iput-wide p1, p0, Ls0/A1;->createdSize:J

    .line 53
    .line 54
    :cond_3
    :goto_0
    invoke-interface {p3}, Ls0/k1;->b()J

    .line 55
    .line 56
    .line 57
    move-result-wide p1

    .line 58
    sget-object v2, Ls0/r0;->b:Ls0/r0$a;

    .line 59
    .line 60
    invoke-virtual {v2}, Ls0/r0$a;->a()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-static {p1, p2, v3, v4}, Ls0/r0;->s(JJ)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    invoke-virtual {v2}, Ls0/r0$a;->a()J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    invoke-interface {p3, p1, p2}, Ls0/k1;->p(J)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-interface {p3}, Ls0/k1;->w()Landroid/graphics/Shader;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0}, Ls0/M1;->a()Landroid/graphics/Shader;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    goto :goto_1

    .line 88
    :cond_5
    move-object p2, v1

    .line 89
    :goto_1
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_7

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    invoke-virtual {v0}, Ls0/M1;->a()Landroid/graphics/Shader;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_6
    invoke-interface {p3, v1}, Ls0/k1;->v(Landroid/graphics/Shader;)V

    .line 102
    .line 103
    .line 104
    :cond_7
    invoke-interface {p3}, Ls0/k1;->a()F

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    cmpg-float p1, p1, p4

    .line 109
    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    return-void

    .line 113
    :cond_8
    invoke-interface {p3, p4}, Ls0/k1;->e(F)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public abstract createShader-uvyYCjk(J)Landroid/graphics/Shader;
.end method

.method public final getTransform-3i98HWw()[F
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/A1;->transform:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final setTransform-Q8lPUPs([F)V
    .locals 1

    .line 1
    iput-object p1, p0, Ls0/A1;->transform:[F

    .line 2
    .line 3
    iget-object v0, p0, Ls0/A1;->internalTransformShader:Ls0/M1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ls0/M1;->d([F)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
