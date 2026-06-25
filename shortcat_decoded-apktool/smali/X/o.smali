.class public final LX/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LX/o;

.field private static final b:F

.field private static final c:LX/l;

.field private static final d:LX/c;

.field private static final e:LX/c;

.field private static final f:LX/c;

.field private static final g:LX/c;

.field private static final h:LX/u;

.field private static final i:LX/c;

.field private static final j:LX/c;

.field private static final k:LX/c;

.field private static final l:LX/c;

.field private static final m:LX/c;

.field private static final n:F

.field private static final o:LX/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LX/o;

    .line 2
    .line 3
    invoke-direct {v0}, LX/o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX/o;->a:LX/o;

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
    sput v0, LX/o;->b:F

    .line 16
    .line 17
    sget-object v0, LX/l;->e:LX/l;

    .line 18
    .line 19
    sput-object v0, LX/o;->c:LX/l;

    .line 20
    .line 21
    sget-object v0, LX/c;->r:LX/c;

    .line 22
    .line 23
    sput-object v0, LX/o;->d:LX/c;

    .line 24
    .line 25
    sget-object v1, LX/c;->z:LX/c;

    .line 26
    .line 27
    sput-object v1, LX/o;->e:LX/c;

    .line 28
    .line 29
    sput-object v1, LX/o;->f:LX/c;

    .line 30
    .line 31
    sput-object v1, LX/o;->g:LX/c;

    .line 32
    .line 33
    sget-object v2, LX/u;->j:LX/u;

    .line 34
    .line 35
    sput-object v2, LX/o;->h:LX/u;

    .line 36
    .line 37
    sput-object v1, LX/o;->i:LX/c;

    .line 38
    .line 39
    sput-object v0, LX/o;->j:LX/c;

    .line 40
    .line 41
    sput-object v1, LX/o;->k:LX/c;

    .line 42
    .line 43
    sput-object v1, LX/o;->l:LX/c;

    .line 44
    .line 45
    sput-object v1, LX/o;->m:LX/c;

    .line 46
    .line 47
    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    .line 48
    .line 49
    double-to-float v0, v2

    .line 50
    invoke-static {v0}, Li1/h;->n(F)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    sput v0, LX/o;->n:F

    .line 55
    .line 56
    sput-object v1, LX/o;->o:LX/c;

    .line 57
    .line 58
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
    sget-object v0, LX/o;->c:LX/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/o;->d:LX/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LX/c;
    .locals 1

    .line 1
    sget-object v0, LX/o;->g:LX/c;

    .line 2
    .line 3
    return-object v0
.end method
