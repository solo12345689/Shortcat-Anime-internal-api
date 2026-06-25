.class public final LX/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LX/h;

.field private static final b:F

.field private static final c:LX/l;

.field private static final d:LX/c;

.field private static final e:LX/c;

.field private static final f:LX/c;

.field private static final g:LX/c;

.field private static final h:LX/c;

.field private static final i:LX/c;

.field private static final j:LX/c;

.field private static final k:LX/u;

.field private static final l:LX/c;

.field private static final m:F

.field private static final n:LX/c;

.field private static final o:LX/c;

.field private static final p:LX/c;

.field private static final q:LX/c;

.field private static final r:LX/c;

.field private static final s:LX/c;

.field private static final t:F

.field private static final u:LX/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LX/h;

    .line 2
    .line 3
    invoke-direct {v0}, LX/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX/h;->a:LX/h;

    .line 7
    .line 8
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 9
    .line 10
    double-to-float v0, v0

    .line 11
    invoke-static {v0}, Li1/h;->n(F)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, LX/h;->b:F

    .line 16
    .line 17
    sget-object v0, LX/l;->e:LX/l;

    .line 18
    .line 19
    sput-object v0, LX/h;->c:LX/l;

    .line 20
    .line 21
    sget-object v0, LX/c;->r:LX/c;

    .line 22
    .line 23
    sput-object v0, LX/h;->d:LX/c;

    .line 24
    .line 25
    sput-object v0, LX/h;->e:LX/c;

    .line 26
    .line 27
    sget-object v1, LX/c;->z:LX/c;

    .line 28
    .line 29
    sput-object v1, LX/h;->f:LX/c;

    .line 30
    .line 31
    sput-object v1, LX/h;->g:LX/c;

    .line 32
    .line 33
    sput-object v1, LX/h;->h:LX/c;

    .line 34
    .line 35
    sget-object v2, LX/c;->x:LX/c;

    .line 36
    .line 37
    sput-object v2, LX/h;->i:LX/c;

    .line 38
    .line 39
    sput-object v1, LX/h;->j:LX/c;

    .line 40
    .line 41
    sget-object v3, LX/u;->j:LX/u;

    .line 42
    .line 43
    sput-object v3, LX/h;->k:LX/u;

    .line 44
    .line 45
    sput-object v2, LX/h;->l:LX/c;

    .line 46
    .line 47
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 48
    .line 49
    double-to-float v3, v3

    .line 50
    invoke-static {v3}, Li1/h;->n(F)F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    sput v3, LX/h;->m:F

    .line 55
    .line 56
    sput-object v1, LX/h;->n:LX/c;

    .line 57
    .line 58
    sput-object v2, LX/h;->o:LX/c;

    .line 59
    .line 60
    sput-object v0, LX/h;->p:LX/c;

    .line 61
    .line 62
    sput-object v1, LX/h;->q:LX/c;

    .line 63
    .line 64
    sput-object v1, LX/h;->r:LX/c;

    .line 65
    .line 66
    sput-object v1, LX/h;->s:LX/c;

    .line 67
    .line 68
    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    .line 69
    .line 70
    double-to-float v0, v2

    .line 71
    invoke-static {v0}, Li1/h;->n(F)F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    sput v0, LX/h;->t:F

    .line 76
    .line 77
    sput-object v1, LX/h;->u:LX/c;

    .line 78
    .line 79
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
.method public final a()LX/l;
    .locals 1

    .line 1
    sget-object v0, LX/h;->c:LX/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/h;->d:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/h;->j:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/h;->l:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()F
    .locals 1

    .line 1
    sget v0, LX/h;->m:F

    .line 2
    .line 3
    return v0
.end method
