.class public final LX/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LX/k;

.field private static final b:LX/c;

.field private static final c:LX/l;

.field private static final d:F

.field private static final e:F

.field private static final f:LX/c;

.field private static final g:F

.field private static final h:F

.field private static final i:LX/c;

.field private static final j:LX/l;

.field private static final k:F

.field private static final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LX/k;

    .line 2
    .line 3
    invoke-direct {v0}, LX/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX/k;->a:LX/k;

    .line 7
    .line 8
    sget-object v0, LX/c;->z:LX/c;

    .line 9
    .line 10
    sput-object v0, LX/k;->b:LX/c;

    .line 11
    .line 12
    sget-object v1, LX/l;->e:LX/l;

    .line 13
    .line 14
    sput-object v1, LX/k;->c:LX/l;

    .line 15
    .line 16
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    .line 17
    .line 18
    double-to-float v2, v2

    .line 19
    invoke-static {v2}, Li1/h;->n(F)F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sput v3, LX/k;->d:F

    .line 24
    .line 25
    invoke-static {v2}, Li1/h;->n(F)F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sput v3, LX/k;->e:F

    .line 30
    .line 31
    sput-object v0, LX/k;->f:LX/c;

    .line 32
    .line 33
    invoke-static {v2}, Li1/h;->n(F)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sput v0, LX/k;->g:F

    .line 38
    .line 39
    invoke-static {v2}, Li1/h;->n(F)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sput v0, LX/k;->h:F

    .line 44
    .line 45
    sget-object v0, LX/c;->F:LX/c;

    .line 46
    .line 47
    sput-object v0, LX/k;->i:LX/c;

    .line 48
    .line 49
    sput-object v1, LX/k;->j:LX/l;

    .line 50
    .line 51
    invoke-static {v2}, Li1/h;->n(F)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    sput v0, LX/k;->k:F

    .line 56
    .line 57
    const-wide/high16 v0, 0x4048000000000000L    # 48.0

    .line 58
    .line 59
    double-to-float v0, v0

    .line 60
    invoke-static {v0}, Li1/h;->n(F)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sput v0, LX/k;->l:F

    .line 65
    .line 66
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
    sget-object v0, LX/k;->b:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()F
    .locals 1

    .line 1
    sget v0, LX/k;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final c()F
    .locals 1

    .line 1
    sget v0, LX/k;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public final d()F
    .locals 1

    .line 1
    sget v0, LX/k;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()F
    .locals 1

    .line 1
    sget v0, LX/k;->k:F

    .line 2
    .line 3
    return v0
.end method
