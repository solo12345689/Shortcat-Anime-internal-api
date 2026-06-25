.class public final LX/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LX/t;

.field private static final b:LY0/P;

.field private static final c:LY0/P;

.field private static final d:LY0/L;

.field private static final e:LY0/L;

.field private static final f:LY0/L;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LX/t;

    .line 2
    .line 3
    invoke-direct {v0}, LX/t;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX/t;->a:LX/t;

    .line 7
    .line 8
    sget-object v0, LY0/u;->b:LY0/u$a;

    .line 9
    .line 10
    invoke-virtual {v0}, LY0/u$a;->d()LY0/P;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, LX/t;->b:LY0/P;

    .line 15
    .line 16
    invoke-virtual {v0}, LY0/u$a;->d()LY0/P;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, LX/t;->c:LY0/P;

    .line 21
    .line 22
    sget-object v0, LY0/L;->b:LY0/L$a;

    .line 23
    .line 24
    invoke-virtual {v0}, LY0/L$a;->b()LY0/L;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, LX/t;->d:LY0/L;

    .line 29
    .line 30
    invoke-virtual {v0}, LY0/L$a;->f()LY0/L;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sput-object v1, LX/t;->e:LY0/L;

    .line 35
    .line 36
    invoke-virtual {v0}, LY0/L$a;->g()LY0/L;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, LX/t;->f:LY0/L;

    .line 41
    .line 42
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
.method public final a()LY0/P;
    .locals 1

    .line 1
    sget-object v0, LX/t;->b:LY0/P;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LY0/P;
    .locals 1

    .line 1
    sget-object v0, LX/t;->c:LY0/P;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LY0/L;
    .locals 1

    .line 1
    sget-object v0, LX/t;->e:LY0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LY0/L;
    .locals 1

    .line 1
    sget-object v0, LX/t;->f:LY0/L;

    .line 2
    .line 3
    return-object v0
.end method
