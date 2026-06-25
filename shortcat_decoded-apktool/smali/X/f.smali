.class public final LX/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LX/f;

.field private static final b:LX/c;

.field private static final c:F

.field private static final d:F

.field private static final e:LX/l;

.field private static final f:LX/c;

.field private static final g:F

.field private static final h:LX/c;

.field private static final i:F

.field private static final j:LX/c;

.field private static final k:F

.field private static final l:LX/c;

.field private static final m:LX/c;

.field private static final n:LX/u;

.field private static final o:F

.field private static final p:LX/c;

.field private static final q:LX/c;

.field private static final r:LX/c;

.field private static final s:LX/c;

.field private static final t:LX/c;

.field private static final u:F

.field private static final v:LX/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LX/f;

    .line 2
    .line 3
    invoke-direct {v0}, LX/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX/f;->a:LX/f;

    .line 7
    .line 8
    sget-object v0, LX/c;->z:LX/c;

    .line 9
    .line 10
    sput-object v0, LX/f;->b:LX/c;

    .line 11
    .line 12
    sget-object v0, LX/e;->a:LX/e;

    .line 13
    .line 14
    invoke-virtual {v0}, LX/e;->a()F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sput v1, LX/f;->c:F

    .line 19
    .line 20
    const-wide/high16 v1, 0x4044000000000000L    # 40.0

    .line 21
    .line 22
    double-to-float v1, v1

    .line 23
    invoke-static {v1}, Li1/h;->n(F)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    sput v1, LX/f;->d:F

    .line 28
    .line 29
    sget-object v1, LX/l;->e:LX/l;

    .line 30
    .line 31
    sput-object v1, LX/f;->e:LX/l;

    .line 32
    .line 33
    sget-object v1, LX/c;->r:LX/c;

    .line 34
    .line 35
    sput-object v1, LX/f;->f:LX/c;

    .line 36
    .line 37
    invoke-virtual {v0}, LX/e;->a()F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sput v2, LX/f;->g:F

    .line 42
    .line 43
    sput-object v1, LX/f;->h:LX/c;

    .line 44
    .line 45
    invoke-virtual {v0}, LX/e;->a()F

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    sput v2, LX/f;->i:F

    .line 50
    .line 51
    sget-object v2, LX/c;->j:LX/c;

    .line 52
    .line 53
    sput-object v2, LX/f;->j:LX/c;

    .line 54
    .line 55
    invoke-virtual {v0}, LX/e;->b()F

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    sput v3, LX/f;->k:F

    .line 60
    .line 61
    sput-object v2, LX/f;->l:LX/c;

    .line 62
    .line 63
    sput-object v2, LX/f;->m:LX/c;

    .line 64
    .line 65
    sget-object v3, LX/u;->j:LX/u;

    .line 66
    .line 67
    sput-object v3, LX/f;->n:LX/u;

    .line 68
    .line 69
    invoke-virtual {v0}, LX/e;->a()F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    sput v0, LX/f;->o:F

    .line 74
    .line 75
    sput-object v2, LX/f;->p:LX/c;

    .line 76
    .line 77
    sput-object v1, LX/f;->q:LX/c;

    .line 78
    .line 79
    sput-object v2, LX/f;->r:LX/c;

    .line 80
    .line 81
    sput-object v2, LX/f;->s:LX/c;

    .line 82
    .line 83
    sput-object v2, LX/f;->t:LX/c;

    .line 84
    .line 85
    const-wide/high16 v0, 0x4032000000000000L    # 18.0

    .line 86
    .line 87
    double-to-float v0, v0

    .line 88
    invoke-static {v0}, Li1/h;->n(F)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sput v0, LX/f;->u:F

    .line 93
    .line 94
    sput-object v2, LX/f;->v:LX/c;

    .line 95
    .line 96
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
.method public final a()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/f;->b:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()F
    .locals 1

    .line 1
    sget v0, LX/f;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public final c()LX/l;
    .locals 1

    .line 1
    sget-object v0, LX/f;->e:LX/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/f;->f:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()F
    .locals 1

    .line 1
    sget v0, LX/f;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public final f()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/f;->h:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()F
    .locals 1

    .line 1
    sget v0, LX/f;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public final h()F
    .locals 1

    .line 1
    sget v0, LX/f;->k:F

    .line 2
    .line 3
    return v0
.end method

.method public final i()F
    .locals 1

    .line 1
    sget v0, LX/f;->u:F

    .line 2
    .line 3
    return v0
.end method

.method public final j()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/f;->m:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()F
    .locals 1

    .line 1
    sget v0, LX/f;->o:F

    .line 2
    .line 3
    return v0
.end method
