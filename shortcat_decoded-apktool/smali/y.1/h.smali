.class public final Ly/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Ly/h;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:Ll0/e$c;

.field private static final h:I

.field private static final i:F

.field private static final j:F

.field private static final k:F

.field private static final l:J

.field private static final m:LY0/L;

.field private static final n:J

.field private static final o:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ly/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly/h;->a:Ly/h;

    .line 7
    .line 8
    const/16 v0, 0x70

    .line 9
    .line 10
    int-to-float v0, v0

    .line 11
    invoke-static {v0}, Li1/h;->n(F)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, Ly/h;->b:F

    .line 16
    .line 17
    const/16 v0, 0x118

    .line 18
    .line 19
    int-to-float v0, v0

    .line 20
    invoke-static {v0}, Li1/h;->n(F)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput v0, Ly/h;->c:F

    .line 25
    .line 26
    const/16 v0, 0x30

    .line 27
    .line 28
    int-to-float v0, v0

    .line 29
    invoke-static {v0}, Li1/h;->n(F)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sput v0, Ly/h;->d:F

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    int-to-float v0, v0

    .line 37
    invoke-static {v0}, Li1/h;->n(F)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    sput v0, Ly/h;->e:F

    .line 42
    .line 43
    const/4 v0, 0x4

    .line 44
    int-to-float v0, v0

    .line 45
    invoke-static {v0}, Li1/h;->n(F)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sput v0, Ly/h;->f:F

    .line 50
    .line 51
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 52
    .line 53
    invoke-virtual {v0}, Ll0/e$a;->i()Ll0/e$c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Ly/h;->g:Ll0/e$c;

    .line 58
    .line 59
    sget-object v0, Lg1/j;->b:Lg1/j$a;

    .line 60
    .line 61
    invoke-virtual {v0}, Lg1/j$a;->f()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    sput v0, Ly/h;->h:I

    .line 66
    .line 67
    const/16 v0, 0xc

    .line 68
    .line 69
    int-to-float v0, v0

    .line 70
    invoke-static {v0}, Li1/h;->n(F)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    sput v0, Ly/h;->i:F

    .line 75
    .line 76
    const/16 v0, 0x8

    .line 77
    .line 78
    int-to-float v0, v0

    .line 79
    invoke-static {v0}, Li1/h;->n(F)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    sput v0, Ly/h;->j:F

    .line 84
    .line 85
    const/16 v0, 0x18

    .line 86
    .line 87
    int-to-float v0, v0

    .line 88
    invoke-static {v0}, Li1/h;->n(F)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sput v0, Ly/h;->k:F

    .line 93
    .line 94
    const/16 v0, 0xe

    .line 95
    .line 96
    invoke-static {v0}, Li1/w;->f(I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    sput-wide v0, Ly/h;->l:J

    .line 101
    .line 102
    sget-object v0, LY0/L;->b:LY0/L$a;

    .line 103
    .line 104
    invoke-virtual {v0}, LY0/L$a;->f()LY0/L;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sput-object v0, Ly/h;->m:LY0/L;

    .line 109
    .line 110
    const/16 v0, 0x14

    .line 111
    .line 112
    invoke-static {v0}, Li1/w;->f(I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    sput-wide v0, Ly/h;->n:J

    .line 117
    .line 118
    const v0, 0x3dcccccd    # 0.1f

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Li1/w;->e(F)J

    .line 122
    .line 123
    .line 124
    move-result-wide v0

    .line 125
    sput-wide v0, Ly/h;->o:J

    .line 126
    .line 127
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    sget v0, Ly/h;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public final b()F
    .locals 1

    .line 1
    sget v0, Ly/h;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final c()F
    .locals 1

    .line 1
    sget v0, Ly/h;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public final d()F
    .locals 1

    .line 1
    sget v0, Ly/h;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()F
    .locals 1

    .line 1
    sget v0, Ly/h;->k:F

    .line 2
    .line 3
    return v0
.end method

.method public final f()Ll0/e$c;
    .locals 1

    .line 1
    sget-object v0, Ly/h;->g:Ll0/e$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()F
    .locals 1

    .line 1
    sget v0, Ly/h;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public final h()F
    .locals 1

    .line 1
    sget v0, Ly/h;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final i()F
    .locals 1

    .line 1
    sget v0, Ly/h;->j:F

    .line 2
    .line 3
    return v0
.end method

.method public final j(J)LU0/Y0;
    .locals 32

    .line 1
    sget v20, Ly/h;->h:I

    .line 2
    .line 3
    sget-wide v3, Ly/h;->l:J

    .line 4
    .line 5
    sget-object v5, Ly/h;->m:LY0/L;

    .line 6
    .line 7
    sget-wide v22, Ly/h;->n:J

    .line 8
    .line 9
    sget-wide v10, Ly/h;->o:J

    .line 10
    .line 11
    new-instance v0, LU0/Y0;

    .line 12
    .line 13
    const v30, 0xfd7f78

    .line 14
    .line 15
    .line 16
    const/16 v31, 0x0

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v12, 0x0

    .line 23
    const/4 v13, 0x0

    .line 24
    const/4 v14, 0x0

    .line 25
    const-wide/16 v15, 0x0

    .line 26
    .line 27
    const/16 v17, 0x0

    .line 28
    .line 29
    const/16 v18, 0x0

    .line 30
    .line 31
    const/16 v19, 0x0

    .line 32
    .line 33
    const/16 v21, 0x0

    .line 34
    .line 35
    const/16 v24, 0x0

    .line 36
    .line 37
    const/16 v25, 0x0

    .line 38
    .line 39
    const/16 v26, 0x0

    .line 40
    .line 41
    const/16 v27, 0x0

    .line 42
    .line 43
    const/16 v28, 0x0

    .line 44
    .line 45
    const/16 v29, 0x0

    .line 46
    .line 47
    move-wide/from16 v1, p1

    .line 48
    .line 49
    invoke-direct/range {v0 .. v31}, LU0/Y0;-><init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;LU0/G;Lg1/h;IILg1/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method
