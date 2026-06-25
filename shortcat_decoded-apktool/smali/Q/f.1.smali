.class final LQ/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LQ/f;

.field private static b:Ls0/b1;

.field private static c:Ls0/j0;

.field private static d:Lu0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LQ/f;

    .line 2
    .line 3
    invoke-direct {v0}, LQ/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ/f;->a:LQ/f;

    .line 7
    .line 8
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
.method public final a()Ls0/j0;
    .locals 1

    .line 1
    sget-object v0, LQ/f;->c:Ls0/j0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lu0/a;
    .locals 1

    .line 1
    sget-object v0, LQ/f;->d:Lu0/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ls0/b1;
    .locals 1

    .line 1
    sget-object v0, LQ/f;->b:Ls0/b1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Ls0/j0;)V
    .locals 0

    .line 1
    sput-object p1, LQ/f;->c:Ls0/j0;

    .line 2
    .line 3
    return-void
.end method

.method public final e(Lu0/a;)V
    .locals 0

    .line 1
    sput-object p1, LQ/f;->d:Lu0/a;

    .line 2
    .line 3
    return-void
.end method

.method public final f(Ls0/b1;)V
    .locals 0

    .line 1
    sput-object p1, LQ/f;->b:Ls0/b1;

    .line 2
    .line 3
    return-void
.end method
