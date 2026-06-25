.class public final LX/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LX/p;

.field private static final b:LX/c;

.field private static final c:F

.field private static final d:F

.field private static final e:LX/l;

.field private static final f:LX/c;

.field private static final g:LX/c;

.field private static final h:LX/u;

.field private static final i:LX/c;

.field private static final j:F

.field private static final k:LX/c;

.field private static final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LX/p;

    .line 2
    .line 3
    invoke-direct {v0}, LX/p;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX/p;->a:LX/p;

    .line 7
    .line 8
    sget-object v0, LX/c;->I:LX/c;

    .line 9
    .line 10
    sput-object v0, LX/p;->b:LX/c;

    .line 11
    .line 12
    sget-object v0, LX/e;->a:LX/e;

    .line 13
    .line 14
    invoke-virtual {v0}, LX/e;->a()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sput v0, LX/p;->c:F

    .line 19
    .line 20
    const-wide/high16 v0, 0x4063000000000000L    # 152.0

    .line 21
    .line 22
    double-to-float v0, v0

    .line 23
    invoke-static {v0}, Li1/h;->n(F)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sput v0, LX/p;->d:F

    .line 28
    .line 29
    sget-object v0, LX/l;->j:LX/l;

    .line 30
    .line 31
    sput-object v0, LX/p;->e:LX/l;

    .line 32
    .line 33
    sget-object v0, LX/c;->p0:LX/c;

    .line 34
    .line 35
    sput-object v0, LX/p;->f:LX/c;

    .line 36
    .line 37
    sget-object v0, LX/c;->r:LX/c;

    .line 38
    .line 39
    sput-object v0, LX/p;->g:LX/c;

    .line 40
    .line 41
    sget-object v1, LX/u;->h:LX/u;

    .line 42
    .line 43
    sput-object v1, LX/p;->h:LX/u;

    .line 44
    .line 45
    sput-object v0, LX/p;->i:LX/c;

    .line 46
    .line 47
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    .line 48
    .line 49
    double-to-float v0, v0

    .line 50
    invoke-static {v0}, Li1/h;->n(F)F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    sput v1, LX/p;->j:F

    .line 55
    .line 56
    sget-object v1, LX/c;->s:LX/c;

    .line 57
    .line 58
    sput-object v1, LX/p;->k:LX/c;

    .line 59
    .line 60
    invoke-static {v0}, Li1/h;->n(F)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sput v0, LX/p;->l:F

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
    sget-object v0, LX/p;->b:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()F
    .locals 1

    .line 1
    sget v0, LX/p;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public final c()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/p;->g:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LX/u;
    .locals 1

    .line 1
    sget-object v0, LX/p;->h:LX/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/p;->i:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/p;->k:LX/c;

    .line 2
    .line 3
    return-object v0
.end method
