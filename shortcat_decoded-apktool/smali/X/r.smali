.class public final LX/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LX/r;

.field private static final b:LX/c;

.field private static final c:F

.field private static final d:F

.field private static final e:LX/l;

.field private static final f:LX/c;

.field private static final g:LX/u;

.field private static final h:LX/c;

.field private static final i:F

.field private static final j:LX/c;

.field private static final k:F

.field private static final l:LX/c;

.field private static final m:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LX/r;

    .line 2
    .line 3
    invoke-direct {v0}, LX/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX/r;->a:LX/r;

    .line 7
    .line 8
    sget-object v0, LX/c;->I:LX/c;

    .line 9
    .line 10
    sput-object v0, LX/r;->b:LX/c;

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
    sput v1, LX/r;->c:F

    .line 19
    .line 20
    const-wide/high16 v1, 0x4050000000000000L    # 64.0

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
    sput v1, LX/r;->d:F

    .line 28
    .line 29
    sget-object v1, LX/l;->j:LX/l;

    .line 30
    .line 31
    sput-object v1, LX/r;->e:LX/l;

    .line 32
    .line 33
    sget-object v1, LX/c;->r:LX/c;

    .line 34
    .line 35
    sput-object v1, LX/r;->f:LX/c;

    .line 36
    .line 37
    sget-object v2, LX/u;->m:LX/u;

    .line 38
    .line 39
    sput-object v2, LX/r;->g:LX/u;

    .line 40
    .line 41
    sput-object v1, LX/r;->h:LX/c;

    .line 42
    .line 43
    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    .line 44
    .line 45
    double-to-float v1, v1

    .line 46
    invoke-static {v1}, Li1/h;->n(F)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    sput v2, LX/r;->i:F

    .line 51
    .line 52
    sget-object v2, LX/c;->Y:LX/c;

    .line 53
    .line 54
    sput-object v2, LX/r;->j:LX/c;

    .line 55
    .line 56
    invoke-virtual {v0}, LX/e;->c()F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sput v0, LX/r;->k:F

    .line 61
    .line 62
    sget-object v0, LX/c;->s:LX/c;

    .line 63
    .line 64
    sput-object v0, LX/r;->l:LX/c;

    .line 65
    .line 66
    invoke-static {v1}, Li1/h;->n(F)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    sput v0, LX/r;->m:F

    .line 71
    .line 72
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
    sget-object v0, LX/r;->b:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()F
    .locals 1

    .line 1
    sget v0, LX/r;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public final c()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/r;->f:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LX/u;
    .locals 1

    .line 1
    sget-object v0, LX/r;->g:LX/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/r;->h:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/r;->j:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/r;->l:LX/c;

    .line 2
    .line 3
    return-object v0
.end method
