.class public final LX/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LX/g;

.field private static final b:LX/c;

.field private static final c:F

.field private static final d:LX/c;

.field private static final e:LX/c;

.field private static final f:LX/c;

.field private static final g:LX/c;

.field private static final h:LX/l;

.field private static final i:F

.field private static final j:LX/c;

.field private static final k:LX/c;

.field private static final l:LX/c;

.field private static final m:LX/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LX/g;

    .line 2
    .line 3
    invoke-direct {v0}, LX/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX/g;->a:LX/g;

    .line 7
    .line 8
    sget-object v0, LX/c;->r:LX/c;

    .line 9
    .line 10
    sput-object v0, LX/g;->b:LX/c;

    .line 11
    .line 12
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    .line 13
    .line 14
    double-to-float v0, v0

    .line 15
    invoke-static {v0}, Li1/h;->n(F)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sput v0, LX/g;->c:F

    .line 20
    .line 21
    sget-object v0, LX/c;->z:LX/c;

    .line 22
    .line 23
    sput-object v0, LX/g;->d:LX/c;

    .line 24
    .line 25
    sput-object v0, LX/g;->e:LX/c;

    .line 26
    .line 27
    sput-object v0, LX/g;->f:LX/c;

    .line 28
    .line 29
    sput-object v0, LX/g;->g:LX/c;

    .line 30
    .line 31
    sget-object v0, LX/l;->e:LX/l;

    .line 32
    .line 33
    sput-object v0, LX/g;->h:LX/l;

    .line 34
    .line 35
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 36
    .line 37
    double-to-float v0, v0

    .line 38
    invoke-static {v0}, Li1/h;->n(F)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sput v0, LX/g;->i:F

    .line 43
    .line 44
    sget-object v0, LX/c;->s:LX/c;

    .line 45
    .line 46
    sput-object v0, LX/g;->j:LX/c;

    .line 47
    .line 48
    sput-object v0, LX/g;->k:LX/c;

    .line 49
    .line 50
    sput-object v0, LX/g;->l:LX/c;

    .line 51
    .line 52
    sput-object v0, LX/g;->m:LX/c;

    .line 53
    .line 54
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
    sget v0, LX/g;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public final b()LX/l;
    .locals 1

    .line 1
    sget-object v0, LX/g;->h:LX/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()F
    .locals 1

    .line 1
    sget v0, LX/g;->i:F

    .line 2
    .line 3
    return v0
.end method
