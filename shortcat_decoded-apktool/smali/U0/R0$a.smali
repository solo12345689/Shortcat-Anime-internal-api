.class public final LU0/R0$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU0/R0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LU0/R0$a;

.field private static final b:LU0/R0;

.field private static final c:LU0/R0;

.field private static final d:LU0/R0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LU0/R0$a;

    .line 2
    .line 3
    invoke-direct {v0}, LU0/R0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU0/R0$a;->a:LU0/R0$a;

    .line 7
    .line 8
    new-instance v0, LU0/O0;

    .line 9
    .line 10
    invoke-direct {v0}, LU0/O0;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LU0/R0$a;->b:LU0/R0;

    .line 14
    .line 15
    new-instance v0, LU0/P0;

    .line 16
    .line 17
    invoke-direct {v0}, LU0/P0;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, LU0/R0$a;->c:LU0/R0;

    .line 21
    .line 22
    new-instance v0, LU0/Q0;

    .line 23
    .line 24
    invoke-direct {v0}, LU0/Q0;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, LU0/R0$a;->d:LU0/R0;

    .line 28
    .line 29
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

.method public static synthetic a(Lr0/h;Lr0/h;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LU0/R0$a;->e(Lr0/h;Lr0/h;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Lr0/h;Lr0/h;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LU0/R0$a;->f(Lr0/h;Lr0/h;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Lr0/h;Lr0/h;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LU0/R0$a;->d(Lr0/h;Lr0/h;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final d(Lr0/h;Lr0/h;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr0/h;->r(Lr0/h;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final e(Lr0/h;Lr0/h;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lr0/h;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lr0/h;->i()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Lr0/h;->i()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    cmpl-float v0, v0, v1

    .line 16
    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lr0/h;->j()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Lr0/h;->j()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    cmpg-float v0, v0, v1

    .line 28
    .line 29
    if-gtz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lr0/h;->l()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1}, Lr0/h;->l()F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    cmpl-float v0, v0, v1

    .line 40
    .line 41
    if-ltz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Lr0/h;->e()F

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-virtual {p1}, Lr0/h;->e()F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    cmpg-float p0, p0, p1

    .line 52
    .line 53
    if-gtz p0, :cond_0

    .line 54
    .line 55
    const/4 p0, 0x1

    .line 56
    return p0

    .line 57
    :cond_0
    const/4 p0, 0x0

    .line 58
    return p0
.end method

.method private static final f(Lr0/h;Lr0/h;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr0/h;->g()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1, v0, v1}, Lr0/h;->b(J)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method


# virtual methods
.method public final g()LU0/R0;
    .locals 1

    .line 1
    sget-object v0, LU0/R0$a;->b:LU0/R0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LU0/R0;
    .locals 1

    .line 1
    sget-object v0, LU0/R0$a;->d:LU0/R0;

    .line 2
    .line 3
    return-object v0
.end method
